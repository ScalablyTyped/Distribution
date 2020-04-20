package typings.remarkable.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserInline extends js.Object {
  def parse(str: String, options: Options, env: Env, tokens: js.Array[Token]): Unit
  def skipToken(state: StateInline): Unit
  def tokenize(state: StateInline): Unit
  def validateLink(url: String): Boolean
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
}

