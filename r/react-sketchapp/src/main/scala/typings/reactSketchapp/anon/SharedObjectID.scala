package typings.reactSketchapp.anon

import typings.reactSketchapp.moduleTypesMod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedObjectID extends StObject {
  
  var cssStyle: TextStyle
  
  var name: String
  
  var sharedObjectID: String
  
  var sketchStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_v1-types.Style */ Any
}
object SharedObjectID {
  
  inline def apply(
    cssStyle: TextStyle,
    name: String,
    sharedObjectID: String,
    sketchStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_v1-types.Style */ Any
  ): SharedObjectID = {
    val __obj = js.Dynamic.literal(cssStyle = cssStyle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sharedObjectID = sharedObjectID.asInstanceOf[js.Any], sketchStyle = sketchStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedObjectID]
  }
  
  extension [Self <: SharedObjectID](x: Self) {
    
    inline def setCssStyle(value: TextStyle): Self = StObject.set(x, "cssStyle", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSharedObjectID(value: String): Self = StObject.set(x, "sharedObjectID", value.asInstanceOf[js.Any])
    
    inline def setSketchStyle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_v1-types.Style */ Any
    ): Self = StObject.set(x, "sketchStyle", value.asInstanceOf[js.Any])
  }
}
