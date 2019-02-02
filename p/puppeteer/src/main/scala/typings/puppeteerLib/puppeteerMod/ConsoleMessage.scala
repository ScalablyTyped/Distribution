package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleMessage extends js.Object {
  /** The message arguments. */
  def args(): js.Array[JSHandle]
  /** The location the message originated from */
  def location(): ConsoleMessageLocation
  /** The message text. */
  def text(): java.lang.String
  def `type`(): ConsoleMessageType
}

