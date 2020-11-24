package typings.reactSketchapp.mod

import typings.react.mod.ReactNode
import typings.reactSketchapp.typesMod.ResizeConstraints
import typings.reactSketchapp.typesMod.SketchShadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewProps extends js.Object {
  
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var resizingConstraint: js.UndefOr[ResizeConstraints] = js.native
  
  var shadows: js.UndefOr[js.Array[SketchShadow]] = js.native
  
  var style: js.UndefOr[Style | StyleReference] = js.native
}
object ViewProps {
  
  @scala.inline
  def apply(): ViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewProps]
  }
  
  @scala.inline
  implicit class ViewPropsOps[Self <: ViewProps] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: ReactNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ReactNode] | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResizingConstraint(value: ResizeConstraints): Self = this.set("resizingConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizingConstraint: Self = this.set("resizingConstraint", js.undefined)
    
    @scala.inline
    def setShadowsVarargs(value: SketchShadow*): Self = this.set("shadows", js.Array(value :_*))
    
    @scala.inline
    def setShadows(value: js.Array[SketchShadow]): Self = this.set("shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadows: Self = this.set("shadows", js.undefined)
    
    @scala.inline
    def setStyle(value: Style | StyleReference): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
