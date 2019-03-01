package typings
package reactDashNativeDashFlipDashCardLib.reactDashNativeDashFlipDashCardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackProps extends js.Object {
  var chilren: js.Array[reactLib.reactMod.Global.JSXNs.Element]
  var flipHorizontal: scala.Boolean
  var flipVertical: scala.Boolean
  var perspective: scala.Double
}

object BackProps {
  @scala.inline
  def apply(
    chilren: js.Array[reactLib.reactMod.Global.JSXNs.Element],
    flipHorizontal: scala.Boolean,
    flipVertical: scala.Boolean,
    perspective: scala.Double
  ): BackProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chilren")(chilren)
    __obj.updateDynamic("flipHorizontal")(flipHorizontal)
    __obj.updateDynamic("flipVertical")(flipVertical)
    __obj.updateDynamic("perspective")(perspective)
    __obj.asInstanceOf[BackProps]
  }
}

