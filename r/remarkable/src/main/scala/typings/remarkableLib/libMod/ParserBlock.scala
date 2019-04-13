package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserBlock extends js.Object {
  def parse(str: java.lang.String, options: Options, env: Env, tokens: js.Array[Token]): scala.Unit
  def tokenize(state: StateBlock, startLine: scala.Double, endLine: scala.Double): scala.Unit
}

object ParserBlock {
  @scala.inline
  def apply(
    parse: (java.lang.String, Options, Env, js.Array[Token]) => scala.Unit,
    tokenize: (StateBlock, scala.Double, scala.Double) => scala.Unit
  ): ParserBlock = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction4(parse), tokenize = js.Any.fromFunction3(tokenize))
  
    __obj.asInstanceOf[ParserBlock]
  }
}

