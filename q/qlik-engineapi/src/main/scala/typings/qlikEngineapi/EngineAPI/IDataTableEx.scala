package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DataTableEx...
  */
@js.native
trait IDataTableEx extends StObject {
  
  /**
    * List of the fields in the table.
    */
  var qFields: js.Array[IDataField] = js.native
  
  /**
    * List of format specification items, within brackets.
    * Examples of specification items:
    *
    *    - file type
    *    - embedded labels, no labels
    *    - table is <table name>
    */
  var qFormatSpec: String = js.native
  
  /**
    * Name of the table.
    */
  var qName: String = js.native
}
object IDataTableEx {
  
  @scala.inline
  def apply(qFields: js.Array[IDataField], qFormatSpec: String, qName: String): IDataTableEx = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qFormatSpec = qFormatSpec.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataTableEx]
  }
  
  @scala.inline
  implicit class IDataTableExMutableBuilder[Self <: IDataTableEx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQFields(value: js.Array[IDataField]): Self = StObject.set(x, "qFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFieldsVarargs(value: IDataField*): Self = StObject.set(x, "qFields", js.Array(value :_*))
    
    @scala.inline
    def setQFormatSpec(value: String): Self = StObject.set(x, "qFormatSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
  }
}
