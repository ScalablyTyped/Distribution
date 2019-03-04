package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioGroupProps
  extends MDLHTMLAttributes
     with reactLib.reactMod.ReactNs.DOMAttributes[RadioGroup] {
  var childContainer: js.UndefOr[java.lang.String] = js.undefined
  var container: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var value: java.lang.String | scala.Double
}

object RadioGroupProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    value: java.lang.String | scala.Double,
    DOMAttributes: reactLib.reactMod.ReactNs.DOMAttributes[RadioGroup] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    childContainer: java.lang.String = null,
    container: java.lang.String = null,
    label: java.lang.String = null,
    onChange: reactLib.reactMod.ReactNs.FormEventHandler[RadioGroup] = null
  ): RadioGroupProps = {
    val __obj = js.Dynamic.literal(name = name, value = value.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    if (childContainer != null) __obj.updateDynamic("childContainer")(childContainer)
    if (container != null) __obj.updateDynamic("container")(container)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    __obj.asInstanceOf[RadioGroupProps]
  }
}

