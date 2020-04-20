package typings.rcTable.tableContextMod

import typings.rcTable.interfaceMod.CustomizeComponent
import typings.rcTable.interfaceMod.GetComponent
import typings.rcTable.rcTableStrings.ltr
import typings.rcTable.rcTableStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableContextProps extends js.Object {
  var direction: ltr | rtl
  var getComponent: GetComponent
  var prefixCls: String
  var scrollbarSize: Double
}

object TableContextProps {
  @scala.inline
  def apply(
    direction: ltr | rtl,
    getComponent: (/* path */ js.Array[String], /* defaultComponent */ js.UndefOr[CustomizeComponent]) => CustomizeComponent,
    prefixCls: String,
    scrollbarSize: Double
  ): TableContextProps = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], getComponent = js.Any.fromFunction2(getComponent), prefixCls = prefixCls.asInstanceOf[js.Any], scrollbarSize = scrollbarSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableContextProps]
  }
}

