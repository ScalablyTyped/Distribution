package typings
package reactDashI18nextLib.reactDashI18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]:? any[P]} */ trait TransProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var components: js.UndefOr[js.Array[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var defaults: js.UndefOr[java.lang.String] = js.undefined
  var i18n: js.UndefOr[i18nextLib.i18nextMod.i18nextNs.i18n] = js.undefined
  var i18nKey: js.UndefOr[java.lang.String] = js.undefined
  var ns: js.UndefOr[Namespace] = js.undefined
  var parent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var tOptions: js.UndefOr[js.Object] = js.undefined
  var values: js.UndefOr[js.Object] = js.undefined
}

object TransProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    components: js.Array[reactLib.reactMod.ReactNs.ReactNode] = null,
    count: scala.Int | scala.Double = null,
    defaults: java.lang.String = null,
    i18n: i18nextLib.i18nextMod.i18nextNs.i18n = null,
    i18nKey: java.lang.String = null,
    ns: Namespace = null,
    parent: reactLib.reactMod.ReactNs.ReactNode = null,
    tOptions: js.Object = null,
    values: js.Object = null
  ): TransProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    if (i18nKey != null) __obj.updateDynamic("i18nKey")(i18nKey)
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (tOptions != null) __obj.updateDynamic("tOptions")(tOptions)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[TransProps]
  }
}

