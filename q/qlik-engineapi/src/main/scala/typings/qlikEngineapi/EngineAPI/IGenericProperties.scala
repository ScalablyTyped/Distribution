package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericProperties
  */
trait IGenericProperties
  extends StObject
     with // ?Dynamic properties?
/* qMetaDef */ StringDictionary[Any] {
  
  /**
    * Identifier and type of the object.
    * >> This parameter is mandatory.
    */
  var qInfo: INxInfo
}
object IGenericProperties {
  
  inline def apply(qInfo: INxInfo): IGenericProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericProperties]
  }
  
  extension [Self <: IGenericProperties](x: Self) {
    
    inline def setQInfo(value: INxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
  }
}
