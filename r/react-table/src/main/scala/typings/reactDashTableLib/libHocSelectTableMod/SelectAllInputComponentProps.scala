package typings
package reactDashTableLib.libHocSelectTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectAllInputComponentProps extends js.Object {
  var checked: scala.Boolean
  var selectType: SelectType
  def onClick(): js.Any
}

object SelectAllInputComponentProps {
  @scala.inline
  def apply(checked: scala.Boolean, onClick: js.Function0[js.Any], selectType: SelectType): SelectAllInputComponentProps = {
    val __obj = js.Dynamic.literal(checked = checked, onClick = onClick, selectType = selectType)
  
    __obj.asInstanceOf[SelectAllInputComponentProps]
  }
}

