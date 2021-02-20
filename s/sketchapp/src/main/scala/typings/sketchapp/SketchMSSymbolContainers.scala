package typings.sketchapp

import typings.sketchapp.sketchappStrings.symbolContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSSymbolContainers extends StObject {
  
  var _class: symbolContainer = js.native
  
  var objects: js.Array[_] = js.native
}
object SketchMSSymbolContainers {
  
  @scala.inline
  def apply(_class: symbolContainer, objects: js.Array[_]): SketchMSSymbolContainers = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSSymbolContainers]
  }
  
  @scala.inline
  implicit class SketchMSSymbolContainersMutableBuilder[Self <: SketchMSSymbolContainers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjects(value: js.Array[_]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsVarargs(value: js.Any*): Self = StObject.set(x, "objects", js.Array(value :_*))
    
    @scala.inline
    def set_class(value: symbolContainer): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
