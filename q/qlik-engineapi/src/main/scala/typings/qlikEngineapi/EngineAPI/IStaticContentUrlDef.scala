package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StaticContentUrlDef...
  *
  * Note: In addition, this structure can contain dynamic properties.
  */
trait IStaticContentUrlDef extends StObject {
  
  /**
    * Relative path of the thumbnail.
    */
  var qUrl: String
}
object IStaticContentUrlDef {
  
  inline def apply(qUrl: String): IStaticContentUrlDef = {
    val __obj = js.Dynamic.literal(qUrl = qUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticContentUrlDef]
  }
  
  extension [Self <: IStaticContentUrlDef](x: Self) {
    
    inline def setQUrl(value: String): Self = StObject.set(x, "qUrl", value.asInstanceOf[js.Any])
  }
}
