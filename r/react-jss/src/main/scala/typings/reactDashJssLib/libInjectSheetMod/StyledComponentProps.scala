package typings
package reactDashJssLib.libInjectSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledComponentProps[ClassKey /* <: java.lang.String */] extends js.Object {
  var classes: js.UndefOr[stdLib.Partial[ClassNameMap[ClassKey]]] = js.undefined
  var innerRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_]] = js.undefined
}

object StyledComponentProps {
  @scala.inline
  def apply[ClassKey /* <: java.lang.String */](
    classes: stdLib.Partial[ClassNameMap[ClassKey]] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null
  ): StyledComponentProps[ClassKey] = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledComponentProps[ClassKey]]
  }
}

