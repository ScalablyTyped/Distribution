package typings.reactSketchapp.anon

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uri extends StObject {
  
  var height: Requireable[Double]
  
  var uri: Validator[String]
  
  var width: Requireable[Double]
}
object Uri {
  
  inline def apply(height: Requireable[Double], uri: Validator[String], width: Requireable[Double]): Uri = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uri]
  }
  
  extension [Self <: Uri](x: Self) {
    
    inline def setHeight(value: Requireable[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Validator[String]): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Requireable[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
