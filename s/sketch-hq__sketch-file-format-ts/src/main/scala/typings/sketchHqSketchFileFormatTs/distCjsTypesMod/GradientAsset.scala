package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImmutableGradientAsset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradientAsset
  extends StObject
     with AnyObject {
  
  var _class: MSImmutableGradientAsset
  
  var do_objectID: Uuid
  
  var gradient: Gradient
  
  var name: String
}
object GradientAsset {
  
  inline def apply(do_objectID: Uuid, gradient: Gradient, name: String): GradientAsset = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableGradientAsset", do_objectID = do_objectID.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientAsset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GradientAsset] (val x: Self) extends AnyVal {
    
    inline def setDo_objectID(value: Uuid): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setGradient(value: Gradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def set_class(value: MSImmutableGradientAsset): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
