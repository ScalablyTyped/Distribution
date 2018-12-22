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

