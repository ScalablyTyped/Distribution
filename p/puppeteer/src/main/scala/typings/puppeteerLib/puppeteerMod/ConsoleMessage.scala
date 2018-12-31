package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleMessage extends js.Object {
  /** The message arguments. */
  def args(): js.Array[JSHandle]
  /** The message text. */
  def text(): java.lang.String
  def `type`(): ConsoleMessageType
}

