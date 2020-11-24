package typings.remarkable.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserInline extends js.Object {
  
  def parse(str: String, options: Options, env: Env, tokens: js.Array[Token]): Unit = js.native
  
  def skipToken(state: StateInline): Unit = js.native
  
  def tokenize(state: StateInline): Unit = js.native
  
  def validateLink(url: String): Boolean = js.native
}
object ParserInline {
  
  @scala.inline
  def apply(
    parse: (String, Options, Env, js.Array[Token]) => Unit,
    skipToken: StateInline => Unit,
    tokenize: StateInline => Unit,
    validateLink: String => Boolean
  ): ParserInline = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction4(parse), skipToken = js.Any.fromFunction1(skipToken), tokenize = js.Any.fromFunction1(tokenize), validateLink = js.Any.fromFunction1(validateLink))
    __obj.asInstanceOf[ParserInline]
  }
  
  @scala.inline
  implicit class ParserInlineOps[Self <: ParserInline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParse(value: (String, Options, Env, js.Array[Token]) => Unit): Self = this.set("parse", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSkipToken(value: StateInline => Unit): Self = this.set("skipToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTokenize(value: StateInline => Unit): Self = this.set("tokenize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateLink(value: String => Boolean): Self = this.set("validateLink", js.Any.fromFunction1(value))
  }
}
