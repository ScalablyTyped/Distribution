package typings.sketchapp

import typings.sketchapp.sketchappStrings.symbolContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSSymbolContainers extends StObject {
  
  var _class: symbolContainer
  
  var objects: js.Array[js.Any]
}
object SketchMSSymbolContainers {
  
  @scala.inline
  def apply(objects: js.Array[js.Any]): SketchMSSymbolContainers = {
    val __obj = js.Dynamic.literal(_class = "symbolContainer", objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSSymbolContainers]
  }
  
  @scala.inline
  implicit class SketchMSSymbolContainersMutableBuilder[Self <: SketchMSSymbolContainers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjects(value: js.Array[js.Any]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsVarargs(value: js.Any*): Self = StObject.set(x, "objects", js.Array(value :_*))
    
    @scala.inline
    def set_class(value: symbolContainer): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
