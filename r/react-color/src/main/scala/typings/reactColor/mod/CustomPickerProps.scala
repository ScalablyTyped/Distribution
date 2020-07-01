package typings.reactColor.mod

import typings.react.mod.ChangeEvent
import typings.react.mod.ClassAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import typings.reactColor.anon.PartialClassesany
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPickerProps[A] extends ClassAttributes[A] {
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var onChange: ColorChangeHandler
  var pointer: js.UndefOr[ReactNode] = js.undefined
  var styles: js.UndefOr[PartialClassesany] = js.undefined
}

object CustomPickerProps {
  @scala.inline
  def apply[A](
    onChange: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit,
    className: String = null,
    color: Color = null,
    key: Key = null,
    pointer: ReactNode = null,
    ref: js.UndefOr[Null | LegacyRef[A]] = js.undefined,
    styles: PartialClassesany = null
  ): CustomPickerProps[A] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPickerProps[A]]
  }
}

