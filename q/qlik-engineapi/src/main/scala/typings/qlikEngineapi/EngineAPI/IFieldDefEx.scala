package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FieldDefEx...
  */
trait IFieldDefEx extends StObject {
  
  /**
    * Name of the field
    */
  var qName: String
  
  /**
    * Type of data entity
    *
    * One of:
    * - 0 for NOT_PRESENT: the field does not exist
    * - 1 for PRESENT: plain field
    * - 2 for IS_EXPR: calculated dimension
    */
  var qType: FieldDefExType
}
object IFieldDefEx {
  
  @scala.inline
  def apply(qName: String, qType: FieldDefExType): IFieldDefEx = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldDefEx]
  }
  
  @scala.inline
  implicit class IFieldDefExMutableBuilder[Self <: IFieldDefEx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: FieldDefExType): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
