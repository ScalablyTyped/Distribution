package typings.remarkable.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserInline extends StObject {
  
  def parse(str: String, options: Options, env: Env, tokens: js.Array[Token]): Unit
  
  def skipToken(state: StateInline): Unit
  
  def tokenize(state: StateInline): Unit
  
  def validateLink(url: String): Boolean
}
object ParserInline {
  
  inline def apply(
    parse: (String, Options, Env, js.Array[Token]) => Unit,
    skipToken: StateInline => Unit,
    tokenize: StateInline => Unit,
    validateLink: String => Boolean
  ): ParserInline = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction4(parse), skipToken = js.Any.fromFunction1(skipToken), tokenize = js.Any.fromFunction1(tokenize), validateLink = js.Any.fromFunction1(validateLink))
    __obj.asInstanceOf[ParserInline]
  }
  
  extension [Self <: ParserInline](x: Self) {
    
    inline def setParse(value: (String, Options, Env, js.Array[Token]) => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction4(value))
    
    inline def setSkipToken(value: StateInline => Unit): Self = StObject.set(x, "skipToken", js.Any.fromFunction1(value))
    
    inline def setTokenize(value: StateInline => Unit): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
    
    inline def setValidateLink(value: String => Boolean): Self = StObject.set(x, "validateLink", js.Any.fromFunction1(value))
  }
}
