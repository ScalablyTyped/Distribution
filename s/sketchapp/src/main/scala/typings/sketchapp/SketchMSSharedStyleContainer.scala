package typings.sketchapp

import typings.sketchapp.sketchappStrings.sharedStyleContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSSharedStyleContainer extends js.Object {
  
  var _class: sharedStyleContainer = js.native
  
  var objects: js.Array[SketchMSSharedStyle] = js.native
}
object SketchMSSharedStyleContainer {
  
  @scala.inline
  def apply(_class: sharedStyleContainer, objects: js.Array[SketchMSSharedStyle]): SketchMSSharedStyleContainer = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSSharedStyleContainer]
  }
  
  @scala.inline
  implicit class SketchMSSharedStyleContainerOps[Self <: SketchMSSharedStyleContainer] (val x: Self) extends AnyVal {
    
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
    def set_class(value: sharedStyleContainer): Self = this.set("_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsVarargs(value: SketchMSSharedStyle*): Self = this.set("objects", js.Array(value :_*))
    
    @scala.inline
    def setObjects(value: js.Array[SketchMSSharedStyle]): Self = this.set("objects", value.asInstanceOf[js.Any])
  }
}
