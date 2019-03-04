package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserBlock extends js.Object {
  def parse(
    str: java.lang.String,
    options: remarkableLib.libMod.RemarkableNs.Options,
    env: remarkableLib.libMod.RemarkableNs.Env,
    tokens: js.Array[remarkableLib.libMod.RemarkableNs.Token]
  ): scala.Unit
  def tokenize(
    state: remarkableLib.libMod.RemarkableNs.StateBlock,
    startLine: scala.Double,
    endLine: scala.Double
  ): scala.Unit
}

object ParserBlock {
  @scala.inline
  def apply(
    parse: js.Function4[
      java.lang.String, 
      remarkableLib.libMod.RemarkableNs.Options, 
      remarkableLib.libMod.RemarkableNs.Env, 
      js.Array[remarkableLib.libMod.RemarkableNs.Token], 
      scala.Unit
    ],
    tokenize: js.Function3[remarkableLib.libMod.RemarkableNs.StateBlock, scala.Double, scala.Double, scala.Unit]
  ): ParserBlock = {
    val __obj = js.Dynamic.literal(parse = parse, tokenize = tokenize)
  
    __obj.asInstanceOf[ParserBlock]
  }
}

