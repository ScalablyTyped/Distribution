package typings.rcTree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoExpandParent extends js.Object {
  
  var autoExpandParent: Boolean = js.native
  
  var checkStrictly: Boolean = js.native
  
  var checkable: Boolean = js.native
  
  var defaultCheckedKeys: js.Array[_] = js.native
  
  var defaultExpandAll: Boolean = js.native
  
  var defaultExpandParent: Boolean = js.native
  
  var defaultExpandedKeys: js.Array[_] = js.native
  
  var defaultSelectedKeys: js.Array[_] = js.native
  
  var disabled: Boolean = js.native
  
  var draggable: Boolean = js.native
  
  var multiple: Boolean = js.native
  
  var prefixCls: String = js.native
  
  var selectable: Boolean = js.native
  
  var showIcon: Boolean = js.native
  
  var showLine: Boolean = js.native
}
object AutoExpandParent {
  
  @scala.inline
  def apply(
    autoExpandParent: Boolean,
    checkStrictly: Boolean,
    checkable: Boolean,
    defaultCheckedKeys: js.Array[_],
    defaultExpandAll: Boolean,
    defaultExpandParent: Boolean,
    defaultExpandedKeys: js.Array[_],
    defaultSelectedKeys: js.Array[_],
    disabled: Boolean,
    draggable: Boolean,
    multiple: Boolean,
    prefixCls: String,
    selectable: Boolean,
    showIcon: Boolean,
    showLine: Boolean
  ): AutoExpandParent = {
    val __obj = js.Dynamic.literal(autoExpandParent = autoExpandParent.asInstanceOf[js.Any], checkStrictly = checkStrictly.asInstanceOf[js.Any], checkable = checkable.asInstanceOf[js.Any], defaultCheckedKeys = defaultCheckedKeys.asInstanceOf[js.Any], defaultExpandAll = defaultExpandAll.asInstanceOf[js.Any], defaultExpandParent = defaultExpandParent.asInstanceOf[js.Any], defaultExpandedKeys = defaultExpandedKeys.asInstanceOf[js.Any], defaultSelectedKeys = defaultSelectedKeys.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], showIcon = showIcon.asInstanceOf[js.Any], showLine = showLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoExpandParent]
  }
  
  @scala.inline
  implicit class AutoExpandParentOps[Self <: AutoExpandParent] (val x: Self) extends AnyVal {
    
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
    def setAutoExpandParent(value: Boolean): Self = this.set("autoExpandParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckStrictly(value: Boolean): Self = this.set("checkStrictly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckable(value: Boolean): Self = this.set("checkable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCheckedKeysVarargs(value: js.Any*): Self = this.set("defaultCheckedKeys", js.Array(value :_*))
    
    @scala.inline
    def setDefaultCheckedKeys(value: js.Array[_]): Self = this.set("defaultCheckedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultExpandAll(value: Boolean): Self = this.set("defaultExpandAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultExpandParent(value: Boolean): Self = this.set("defaultExpandParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultExpandedKeysVarargs(value: js.Any*): Self = this.set("defaultExpandedKeys", js.Array(value :_*))
    
    @scala.inline
    def setDefaultExpandedKeys(value: js.Array[_]): Self = this.set("defaultExpandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSelectedKeysVarargs(value: js.Any*): Self = this.set("defaultSelectedKeys", js.Array(value :_*))
    
    @scala.inline
    def setDefaultSelectedKeys(value: js.Array[_]): Self = this.set("defaultSelectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIcon(value: Boolean): Self = this.set("showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLine(value: Boolean): Self = this.set("showLine", value.asInstanceOf[js.Any])
  }
}
