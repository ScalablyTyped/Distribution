package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StaticContentUrl...
  *
  * Note: In addition, this structure can return dynamic properties.
  */
trait IStaticContentUrl extends StObject {
  
  /**
    * Relative path of the thumbnail.
    */
  var qUrl: String
}
object IStaticContentUrl {
  
  inline def apply(qUrl: String): IStaticContentUrl = {
    val __obj = js.Dynamic.literal(qUrl = qUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticContentUrl]
  }
  
  extension [Self <: IStaticContentUrl](x: Self) {
    
    inline def setQUrl(value: String): Self = StObject.set(x, "qUrl", value.asInstanceOf[js.Any])
  }
}
