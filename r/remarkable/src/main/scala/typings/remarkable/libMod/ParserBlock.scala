package typings.remarkable.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserBlock extends StObject {
  
  def parse(str: String, options: Options, env: Env, tokens: js.Array[Token]): Unit
  
  def tokenize(state: StateBlock, startLine: Double, endLine: Double): Unit
}
object ParserBlock {
  
  @scala.inline
  def apply(
    parse: (String, Options, Env, js.Array[Token]) => Unit,
    tokenize: (StateBlock, Double, Double) => Unit
  ): ParserBlock = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction4(parse), tokenize = js.Any.fromFunction3(tokenize))
    __obj.asInstanceOf[ParserBlock]
  }
  
  @scala.inline
  implicit class ParserBlockMutableBuilder[Self <: ParserBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParse(value: (String, Options, Env, js.Array[Token]) => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction4(value))
    
    @scala.inline
    def setTokenize(value: (StateBlock, Double, Double) => Unit): Self = StObject.set(x, "tokenize", js.Any.fromFunction3(value))
  }
}
