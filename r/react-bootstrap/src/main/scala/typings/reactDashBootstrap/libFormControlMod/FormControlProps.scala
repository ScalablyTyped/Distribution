package typings.reactDashBootstrap.libFormControlMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormControlProps
  extends AllHTMLAttributes[FormControl]
     with ClassAttributes[FormControl] {
  var bsClass: js.UndefOr[String] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
  var inputRef: js.UndefOr[js.Function1[/* instance */ HTMLInputElement, Unit]] = js.undefined
}

object FormControlProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[FormControl] = null,
    ClassAttributes: ClassAttributes[FormControl] = null,
    bsClass: String = null,
    bsSize: Sizes = null,
    componentClass: ReactType[_] = null,
    id: String = null,
    inputRef: /* instance */ HTMLInputElement => Unit = null,
    `type`: String = null
  ): FormControlProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FormControlProps]
  }
}

