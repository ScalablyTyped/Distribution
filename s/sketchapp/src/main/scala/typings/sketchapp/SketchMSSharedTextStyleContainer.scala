package typings.sketchapp

import typings.sketchapp.sketchappStrings.sharedTextStyleContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSSharedTextStyleContainer extends js.Object {
  
  var _class: sharedTextStyleContainer = js.native
  
  var objects: js.Array[_] = js.native
}
object SketchMSSharedTextStyleContainer {
  
  @scala.inline
  def apply(_class: sharedTextStyleContainer, objects: js.Array[_]): SketchMSSharedTextStyleContainer = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSSharedTextStyleContainer]
  }
  
  @scala.inline
  implicit class SketchMSSharedTextStyleContainerOps[Self <: SketchMSSharedTextStyleContainer] (val x: Self) extends AnyVal {
    
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
    def set_class(value: sharedTextStyleContainer): Self = this.set("_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsVarargs(value: js.Any*): Self = this.set("objects", js.Array(value :_*))
    
    @scala.inline
    def setObjects(value: js.Array[_]): Self = this.set("objects", value.asInstanceOf[js.Any])
  }
}
