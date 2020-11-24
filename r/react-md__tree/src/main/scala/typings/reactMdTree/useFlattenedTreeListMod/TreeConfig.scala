package typings.reactMdTree.useFlattenedTreeListMod

import typings.reactMdTree.typesMod.UnknownTreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<@react-md/tree.@react-md/tree/types/types.TreeProps<@react-md/tree.@react-md/tree/types/types.UnknownTreeItem>, 'valueKey' | 'getItemValue'>> */
@js.native
trait TreeConfig extends js.Object {
  
  var getItemValue: js.Function2[/* item */ UnknownTreeItem, /* valueKey */ String, String] = js.native
  
  var valueKey: String = js.native
}
object TreeConfig {
  
  @scala.inline
  def apply(getItemValue: (/* item */ UnknownTreeItem, /* valueKey */ String) => String, valueKey: String): TreeConfig = {
    val __obj = js.Dynamic.literal(getItemValue = js.Any.fromFunction2(getItemValue), valueKey = valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeConfig]
  }
  
  @scala.inline
  implicit class TreeConfigOps[Self <: TreeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetItemValue(value: (/* item */ UnknownTreeItem, /* valueKey */ String) => String): Self = this.set("getItemValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
  }
}
