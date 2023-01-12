package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericVariableListProperties width extend GenericProperties
  */
trait IGenericVariableListProperties
  extends StObject
     with IGenericProperties {
  
  var qVariableListDef: IVariableListDef
}
object IGenericVariableListProperties {
  
  inline def apply(qInfo: INxInfo, qVariableListDef: IVariableListDef): IGenericVariableListProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qVariableListDef = qVariableListDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericVariableListProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGenericVariableListProperties] (val x: Self) extends AnyVal {
    
    inline def setQVariableListDef(value: IVariableListDef): Self = StObject.set(x, "qVariableListDef", value.asInstanceOf[js.Any])
  }
}
