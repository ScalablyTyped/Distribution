package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericObjectProperties width extend GenericProperties
  */
trait IGenericObjectProperties
  extends StObject
     with IGenericProperties {
  
  var qExtendsId: js.UndefOr[String] = js.undefined
}
object IGenericObjectProperties {
  
  inline def apply(qInfo: INxInfo): IGenericObjectProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericObjectProperties]
  }
  
  extension [Self <: IGenericObjectProperties](x: Self) {
    
    inline def setQExtendsId(value: String): Self = StObject.set(x, "qExtendsId", value.asInstanceOf[js.Any])
    
    inline def setQExtendsIdUndefined: Self = StObject.set(x, "qExtendsId", js.undefined)
  }
}
