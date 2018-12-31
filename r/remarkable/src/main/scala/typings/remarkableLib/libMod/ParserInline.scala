package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserInline extends js.Object {
  def parse(
    str: java.lang.String,
    options: remarkableLib.libMod.RemarkableNs.Options,
    env: remarkableLib.libMod.RemarkableNs.Env,
    tokens: js.Array[remarkableLib.libMod.RemarkableNs.Token]
  ): scala.Unit
  def skipToken(state: remarkableLib.libMod.RemarkableNs.StateInline): scala.Unit
  def tokenize(state: remarkableLib.libMod.RemarkableNs.StateInline): scala.Unit
  def validateLink(url: java.lang.String): scala.Boolean
}

