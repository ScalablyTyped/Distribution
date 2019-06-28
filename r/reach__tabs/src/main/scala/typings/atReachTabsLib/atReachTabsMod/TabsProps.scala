package typings
package atReachTabsLib.atReachTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLDivElement>, 'onChange'> ]: react.react.HTMLProps<std.HTMLDivElement>[P]} */ trait TabsProps extends js.Object {
  var as: js.UndefOr[java.lang.String] = js.undefined
  var children: reactLib.reactMod.ReactNode
  var defaultIndex: js.UndefOr[scala.Double] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* index */ scala.Double, scala.Unit]] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    as: java.lang.String = null,
    defaultIndex: scala.Int | scala.Double = null,
    index: scala.Int | scala.Double = null,
    onChange: /* index */ scala.Double => scala.Unit = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): TabsProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (defaultIndex != null) __obj.updateDynamic("defaultIndex")(defaultIndex.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    __obj.asInstanceOf[TabsProps]
  }
}

