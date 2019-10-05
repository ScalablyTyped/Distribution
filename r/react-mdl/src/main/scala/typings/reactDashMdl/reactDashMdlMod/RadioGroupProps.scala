package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.FormEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioGroupProps
  extends MDLHTMLAttributes
     with DOMAttributes[RadioGroup] {
  var childContainer: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var name: String
  var value: String | Double
}

object RadioGroupProps {
  @scala.inline
  def apply(
    name: String,
    value: String | Double,
    DOMAttributes: DOMAttributes[RadioGroup] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    childContainer: String = null,
    container: String = null,
    label: String = null,
    onChange: FormEvent[RadioGroup] => Unit = null
  ): RadioGroupProps = {
    val __obj = js.Dynamic.literal(name = name, value = value.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    if (childContainer != null) __obj.updateDynamic("childContainer")(childContainer)
    if (container != null) __obj.updateDynamic("container")(container)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[RadioGroupProps]
  }
}

