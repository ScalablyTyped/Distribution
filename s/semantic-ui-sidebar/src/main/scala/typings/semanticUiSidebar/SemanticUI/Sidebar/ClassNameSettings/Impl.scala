package typings.semanticUiSidebar.SemanticUI.Sidebar.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * @default 'active'
    */
  var active: String = js.native
  
  /**
    * @default 'animating'
    */
  var animating: String = js.native
  
  /**
    * @default 'bottom'
    */
  var bottom: String = js.native
  
  /**
    * @default 'dimmed'
    */
  var dimmed: String = js.native
  
  /**
    * @default 'ios'
    */
  var ios: String = js.native
  
  /**
    * @default 'left'
    */
  var left: String = js.native
  
  /**
    * @default 'pushable'
    */
  var pushable: String = js.native
  
  /**
    * @default 'pushed'
    */
  var pushed: String = js.native
  
  /**
    * @default 'right'
    */
  var right: String = js.native
  
  /**
    * @default 'top'
    */
  var top: String = js.native
  
  /**
    * @default 'visible'
    */
  var visible: String = js.native
}
object Impl {
  
  @scala.inline
  def apply(
    active: String,
    animating: String,
    bottom: String,
    dimmed: String,
    ios: String,
    left: String,
    pushable: String,
    pushed: String,
    right: String,
    top: String,
    visible: String
  ): Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], dimmed = dimmed.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pushable = pushable.asInstanceOf[js.Any], pushed = pushed.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimating(value: String): Self = this.set("animating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottom(value: String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimmed(value: String): Self = this.set("dimmed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIos(value: String): Self = this.set("ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushable(value: String): Self = this.set("pushable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushed(value: String): Self = this.set("pushed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: String): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
}
