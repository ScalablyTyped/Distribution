package typings.reactNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlobOptions extends StObject {
  
  var lastModified: Double
  
  var `type`: String
}
object BlobOptions {
  
  inline def apply(lastModified: Double, `type`: String): BlobOptions = {
    val __obj = js.Dynamic.literal(lastModified = lastModified.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlobOptions] (val x: Self) extends AnyVal {
    
    inline def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
