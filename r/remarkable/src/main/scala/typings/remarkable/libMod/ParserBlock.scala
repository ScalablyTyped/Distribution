package typings.remarkable.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserBlock extends js.Object {
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
}

