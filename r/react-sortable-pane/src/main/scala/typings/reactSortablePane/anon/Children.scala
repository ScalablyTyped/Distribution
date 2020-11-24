package typings.reactSortablePane.anon

import typings.reactMotion.mod.SpringHelperConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends js.Object {
  
  var children: js.Array[scala.Nothing] = js.native
  
  var className: String = js.native
  
  var direction: String = js.native
  
  var disableEffect: Boolean = js.native
  
  var isSortable: Boolean = js.native
  
  var margin: Double = js.native
  
  def onClick(): Null = js.native
  
  def onDragStart(): Null = js.native
  
  def onDragStop(): Null = js.native
  
  def onOrderChange(): Null = js.native
  
  def onResize(): Null = js.native
  
  def onResizeStart(): Null = js.native
  
  def onResizeStop(): Null = js.native
  
  def onTouchStart(): Null = js.native
  
  var springConfig: SpringHelperConfig = js.native
}
object Children {
  
  @scala.inline
  def apply(
    children: js.Array[scala.Nothing],
    className: String,
    direction: String,
    disableEffect: Boolean,
    isSortable: Boolean,
    margin: Double,
    onClick: () => Null,
    onDragStart: () => Null,
    onDragStop: () => Null,
    onOrderChange: () => Null,
    onResize: () => Null,
    onResizeStart: () => Null,
    onResizeStop: () => Null,
    onTouchStart: () => Null,
    springConfig: SpringHelperConfig
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disableEffect = disableEffect.asInstanceOf[js.Any], isSortable = isSortable.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), onDragStart = js.Any.fromFunction0(onDragStart), onDragStop = js.Any.fromFunction0(onDragStop), onOrderChange = js.Any.fromFunction0(onOrderChange), onResize = js.Any.fromFunction0(onResize), onResizeStart = js.Any.fromFunction0(onResizeStart), onResizeStop = js.Any.fromFunction0(onResizeStop), onTouchStart = js.Any.fromFunction0(onTouchStart), springConfig = springConfig.asInstanceOf[js.Any])
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
    def setChildrenVarargs(value: scala.Nothing*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[scala.Nothing]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableEffect(value: Boolean): Self = this.set("disableEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSortable(value: Boolean): Self = this.set("isSortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: () => Null): Self = this.set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDragStart(value: () => Null): Self = this.set("onDragStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDragStop(value: () => Null): Self = this.set("onDragStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOrderChange(value: () => Null): Self = this.set("onOrderChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnResize(value: () => Null): Self = this.set("onResize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnResizeStart(value: () => Null): Self = this.set("onResizeStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnResizeStop(value: () => Null): Self = this.set("onResizeStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTouchStart(value: () => Null): Self = this.set("onTouchStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSpringConfig(value: SpringHelperConfig): Self = this.set("springConfig", value.asInstanceOf[js.Any])
  }
}
