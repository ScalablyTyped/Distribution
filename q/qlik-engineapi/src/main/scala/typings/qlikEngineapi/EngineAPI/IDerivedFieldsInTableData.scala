package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DerivedFieldsInTableData...
  */
trait IDerivedFieldsInTableData extends StObject {
  
  /**
    * Is set to true is the derived field is in use.
    */
  var qActive: Boolean
  
  /**
    * Name of the derived definition.
    */
  var qDefinitionName: String
  
  /**
    * List of tags.
    */
  var qTags: js.Array[String]
}
object IDerivedFieldsInTableData {
  
  inline def apply(qActive: Boolean, qDefinitionName: String, qTags: js.Array[String]): IDerivedFieldsInTableData = {
    val __obj = js.Dynamic.literal(qActive = qActive.asInstanceOf[js.Any], qDefinitionName = qDefinitionName.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDerivedFieldsInTableData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDerivedFieldsInTableData] (val x: Self) extends AnyVal {
    
    inline def setQActive(value: Boolean): Self = StObject.set(x, "qActive", value.asInstanceOf[js.Any])
    
    inline def setQDefinitionName(value: String): Self = StObject.set(x, "qDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setQTags(value: js.Array[String]): Self = StObject.set(x, "qTags", value.asInstanceOf[js.Any])
    
    inline def setQTagsVarargs(value: String*): Self = StObject.set(x, "qTags", js.Array(value*))
  }
}
