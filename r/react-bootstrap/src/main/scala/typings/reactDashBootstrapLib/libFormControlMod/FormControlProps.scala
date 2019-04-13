package typings
package reactDashBootstrapLib.libFormControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormControlProps
  extends reactLib.reactMod.HTMLProps[FormControl] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var bsSize: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.Sizes] = js.undefined
  var componentClass: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var inputRef: js.UndefOr[js.Function1[/* instance */ stdLib.HTMLInputElement, scala.Unit]] = js.undefined
}

object FormControlProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[FormControl] = null,
    bsClass: java.lang.String = null,
    bsSize: reactDashBootstrapLib.reactDashBootstrapMod.Sizes = null,
    componentClass: reactLib.reactMod.ReactType[_] = null,
    id: java.lang.String = null,
    inputRef: /* instance */ stdLib.HTMLInputElement => scala.Unit = null,
    `type`: java.lang.String = null
  ): FormControlProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FormControlProps]
  }
}

