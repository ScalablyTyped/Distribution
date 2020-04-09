package typings.signale.mod

import typings.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandType extends js.Object {
  /** The icon corresponding to the logger. */
  var badge: String
  /**
    * The color of the label, can be any of the foreground colors supported by
    * [chalk](https://github.com/chalk/chalk#colors).
    */
  var color: String
  /** The label used to identify the type of the logger. */
  var label: String
  var logLevel: js.UndefOr[String] = js.undefined
  var stream: js.UndefOr[WriteStream | js.Array[WriteStream]] = js.undefined
}

object CommandType {
  @scala.inline
  def apply(
    badge: String,
    color: String,
    label: String,
    logLevel: String = null,
    stream: WriteStream | js.Array[WriteStream] = null
  ): CommandType = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandType]
  }
}

