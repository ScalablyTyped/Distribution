package typings
package reactDashBootstrapLib.libRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps
  extends reactLib.reactMod.HTMLProps[Row] {
  var componentClass: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[Row] = null,
    componentClass: reactLib.reactMod.ReactType[_] = null
  ): RowProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
}

