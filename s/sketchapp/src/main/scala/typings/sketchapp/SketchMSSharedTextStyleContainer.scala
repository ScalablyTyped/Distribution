package typings.sketchapp

import typings.sketchapp.sketchappStrings.sharedTextStyleContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSSharedTextStyleContainer extends StObject {
  
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
  implicit class SketchMSSharedTextStyleContainerMutableBuilder[Self <: SketchMSSharedTextStyleContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjects(value: js.Array[_]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsVarargs(value: js.Any*): Self = StObject.set(x, "objects", js.Array(value :_*))
    
    @scala.inline
    def set_class(value: sharedTextStyleContainer): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
