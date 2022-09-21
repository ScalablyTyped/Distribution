package typings.reactSketchapp.anon

import typings.reactSketchapp.libTypesMod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssStyle extends StObject {
  
  var cssStyle: TextStyle
  
  var name: String
  
  var sharedObjectID: String
  
  var sketchStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_v1-types.Style */ Any
}
object CssStyle {
  
  inline def apply(
    cssStyle: TextStyle,
    name: String,
    sharedObjectID: String,
    sketchStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_v1-types.Style */ Any
  ): CssStyle = {
    val __obj = js.Dynamic.literal(cssStyle = cssStyle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sharedObjectID = sharedObjectID.asInstanceOf[js.Any], sketchStyle = sketchStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssStyle]
  }
  
  extension [Self <: CssStyle](x: Self) {
    
    inline def setCssStyle(value: TextStyle): Self = StObject.set(x, "cssStyle", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSharedObjectID(value: String): Self = StObject.set(x, "sharedObjectID", value.asInstanceOf[js.Any])
    
    inline def setSketchStyle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_v1-types.Style */ Any
    ): Self = StObject.set(x, "sketchStyle", value.asInstanceOf[js.Any])
  }
}
