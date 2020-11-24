package typings.reactJsonschemaForm.anon

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends js.Object {
  
  var children: ReactElement = js.native
  
  var className: String = js.native
  
  var disabled: Boolean = js.native
  
  var hasMoveDown: Boolean = js.native
  
  var hasMoveUp: Boolean = js.native
  
  var hasRemove: Boolean = js.native
  
  var hasToolbar: Boolean = js.native
  
  var index: Double = js.native
  
  var key: String = js.native
  
  def onDropIndexClick(index: Double): js.Function1[/* event */ js.Any, Unit] = js.native
  
  def onReorderClick(index: Double, newIndex: Double): js.Function1[/* event */ js.Any, Unit] = js.native
  
  var readonly: Boolean = js.native
}
object Children {
  
  @scala.inline
  def apply(
    children: ReactElement,
    className: String,
    disabled: Boolean,
    hasMoveDown: Boolean,
    hasMoveUp: Boolean,
    hasRemove: Boolean,
    hasToolbar: Boolean,
    index: Double,
    key: String,
    onDropIndexClick: Double => js.Function1[/* event */ js.Any, Unit],
    onReorderClick: (Double, Double) => js.Function1[/* event */ js.Any, Unit],
    readonly: Boolean
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hasMoveDown = hasMoveDown.asInstanceOf[js.Any], hasMoveUp = hasMoveUp.asInstanceOf[js.Any], hasRemove = hasRemove.asInstanceOf[js.Any], hasToolbar = hasToolbar.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onDropIndexClick = js.Any.fromFunction1(onDropIndexClick), onReorderClick = js.Any.fromFunction2(onReorderClick), readonly = readonly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMoveDown(value: Boolean): Self = this.set("hasMoveDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMoveUp(value: Boolean): Self = this.set("hasMoveUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasRemove(value: Boolean): Self = this.set("hasRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasToolbar(value: Boolean): Self = this.set("hasToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDropIndexClick(value: Double => js.Function1[/* event */ js.Any, Unit]): Self = this.set("onDropIndexClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnReorderClick(value: (Double, Double) => js.Function1[/* event */ js.Any, Unit]): Self = this.set("onReorderClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
  }
}
