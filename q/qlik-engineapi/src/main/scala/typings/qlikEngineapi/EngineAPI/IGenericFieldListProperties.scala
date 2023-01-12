package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericFieldListProperties width extend GenericProperties
  */
trait IGenericFieldListProperties
  extends StObject
     with IGenericProperties {
  
  /**
    * FieldListDef...
    */
  var qFieldListDef: IFieldListDef
}
object IGenericFieldListProperties {
  
  inline def apply(qFieldListDef: IFieldListDef, qInfo: INxInfo): IGenericFieldListProperties = {
    val __obj = js.Dynamic.literal(qFieldListDef = qFieldListDef.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericFieldListProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGenericFieldListProperties] (val x: Self) extends AnyVal {
    
    inline def setQFieldListDef(value: IFieldListDef): Self = StObject.set(x, "qFieldListDef", value.asInstanceOf[js.Any])
  }
}
