package typings.reactDashTable.libHocSelectTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectAllInputComponentProps extends js.Object {
  var checked: Boolean
  var selectType: SelectType
  def onClick(): js.Any
}

object SelectAllInputComponentProps {
  @scala.inline
  def apply(checked: Boolean, onClick: () => js.Any, selectType: SelectType): SelectAllInputComponentProps = {
    val __obj = js.Dynamic.literal(checked = checked, onClick = js.Any.fromFunction0(onClick), selectType = selectType)
  
    __obj.asInstanceOf[SelectAllInputComponentProps]
  }
}

