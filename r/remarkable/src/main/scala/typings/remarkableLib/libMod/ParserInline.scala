package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserInline extends js.Object {
  def parse(str: java.lang.String, options: Options, env: Env, tokens: js.Array[Token]): scala.Unit
  def skipToken(state: StateInline): scala.Unit
  def tokenize(state: StateInline): scala.Unit
  def validateLink(url: java.lang.String): scala.Boolean
}

object ParserInline {
  @scala.inline
  def apply(
    parse: (java.lang.String, Options, Env, js.Array[Token]) => scala.Unit,
    skipToken: StateInline => scala.Unit,
    tokenize: StateInline => scala.Unit,
    validateLink: java.lang.String => scala.Boolean
  ): ParserInline = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction4(parse), skipToken = js.Any.fromFunction1(skipToken), tokenize = js.Any.fromFunction1(tokenize), validateLink = js.Any.fromFunction1(validateLink))
  
    __obj.asInstanceOf[ParserInline]
  }
}

