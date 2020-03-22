package typings.rcTable.tableContextMod

import typings.rcTable.interfaceMod.CustomizeComponent
import typings.rcTable.interfaceMod.GetComponent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableContextProps extends js.Object {
  var getComponent: GetComponent
  var prefixCls: String
  var scrollbarSize: Double
}

object TableContextProps {
  @scala.inline
  def apply(
    getComponent: (/* path */ js.Array[String], /* defaultComponent */ js.UndefOr[CustomizeComponent[HTMLAttributes[HTMLElement]]]) => CustomizeComponent[HTMLAttributes[HTMLElement]],
    prefixCls: String,
    scrollbarSize: Double
  ): TableContextProps = {
    val __obj = js.Dynamic.literal(getComponent = js.Any.fromFunction2(getComponent), prefixCls = prefixCls.asInstanceOf[js.Any], scrollbarSize = scrollbarSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableContextProps]
  }
}

