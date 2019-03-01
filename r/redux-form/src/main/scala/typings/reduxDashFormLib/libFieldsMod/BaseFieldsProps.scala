package typings
package reduxDashFormLib.libFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseFieldsProps[P] extends js.Object {
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[_]] = js.undefined
  var format: js.UndefOr[reduxDashFormLib.libFieldMod.Formatter | scala.Null] = js.undefined
  var names: js.Array[java.lang.String]
  var parse: js.UndefOr[reduxDashFormLib.libFieldMod.Parser] = js.undefined
  var props: js.UndefOr[P] = js.undefined
  var withRef: js.UndefOr[scala.Boolean] = js.undefined
}

object BaseFieldsProps {
  @scala.inline
  def apply[P](
    names: js.Array[java.lang.String],
    component: reactLib.reactMod.ReactNs.ComponentType[_] = null,
    format: reduxDashFormLib.libFieldMod.Formatter = null,
    parse: reduxDashFormLib.libFieldMod.Parser = null,
    props: P = null,
    withRef: js.UndefOr[scala.Boolean] = js.undefined
  ): BaseFieldsProps[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("names")(names)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef)
    __obj.asInstanceOf[BaseFieldsProps[P]]
  }
}

