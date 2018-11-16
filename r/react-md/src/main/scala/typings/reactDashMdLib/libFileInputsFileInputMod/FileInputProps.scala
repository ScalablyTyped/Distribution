package typings
package reactDashMdLib.libFileInputsFileInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileInputProps
  extends reactDashMdLib.libMod.Props {
  var accept: js.UndefOr[java.lang.String] = js.native
  var allowDuplicates: js.UndefOr[scala.Boolean] = js.native
  var capture: js.UndefOr[
    reactDashMdLib.reactDashMdLibStrings.user | reactDashMdLib.reactDashMdLibStrings.environment
  ] = js.native
  var disabled: js.UndefOr[scala.Boolean] = js.native
  var flat: js.UndefOr[scala.Boolean] = js.native
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.native
  var iconBefore: js.UndefOr[scala.Boolean] = js.native
  /**
     * @deprecated
     */
  var iconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.native
  /**
     * @deprecated
     */
  var iconClassName: js.UndefOr[java.lang.String] = js.native
  var id: reactDashMdLib.libMod.IdPropType = js.native
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.native
  var labelClassName: js.UndefOr[java.lang.String] = js.native
  var labelStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.native
  var multiple: js.UndefOr[scala.Boolean] = js.native
  var name: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.native
  var primary: js.UndefOr[scala.Boolean] = js.native
  var secondary: js.UndefOr[scala.Boolean] = js.native
  var swapTheming: js.UndefOr[scala.Boolean] = js.native
  def onChange(): scala.Unit = js.native
  def onChange(files: js.Array[stdLib.File]): scala.Unit = js.native
  def onChange(files: stdLib.File): scala.Unit = js.native
}

