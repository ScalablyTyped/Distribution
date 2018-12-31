package typings
package reactDashNativeDashDialogLib.reactDashNativeDashDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * default:
    *      ios     #007ff9
    *      android #169689
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * default: false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var label: java.lang.String
  def onPress(): scala.Unit
}

