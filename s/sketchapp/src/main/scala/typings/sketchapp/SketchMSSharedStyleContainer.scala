package typings.sketchapp

import typings.sketchapp.sketchappStrings.sharedStyleContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSSharedStyleContainer extends StObject {
  
  var _class: sharedStyleContainer
  
  var objects: js.Array[SketchMSSharedStyle]
}
object SketchMSSharedStyleContainer {
  
  @scala.inline
  def apply(objects: js.Array[SketchMSSharedStyle]): SketchMSSharedStyleContainer = {
    val __obj = js.Dynamic.literal(_class = "sharedStyleContainer", objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSSharedStyleContainer]
  }
  
  @scala.inline
  implicit class SketchMSSharedStyleContainerMutableBuilder[Self <: SketchMSSharedStyleContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjects(value: js.Array[SketchMSSharedStyle]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsVarargs(value: SketchMSSharedStyle*): Self = StObject.set(x, "objects", js.Array(value :_*))
    
    @scala.inline
    def set_class(value: sharedStyleContainer): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
