package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxDerivedFieldsData...
  */
trait INxDerivedFieldsData extends StObject {
  
  /**
    * Name of the derived definition.
    */
  var qDerivedDefinitionName: String
  
  /**
    * List of the derived fields.
    */
  var qFieldDefs: js.Array[INxDerivedField]
  
  /**
    * List of the derived groups.
    */
  var qGroupDefs: js.Array[INxDerivedGroup]
  
  /**
    * List of tags on the derived fields.
    */
  var qTags: js.Array[String]
}
object INxDerivedFieldsData {
  
  inline def apply(
    qDerivedDefinitionName: String,
    qFieldDefs: js.Array[INxDerivedField],
    qGroupDefs: js.Array[INxDerivedGroup],
    qTags: js.Array[String]
  ): INxDerivedFieldsData = {
    val __obj = js.Dynamic.literal(qDerivedDefinitionName = qDerivedDefinitionName.asInstanceOf[js.Any], qFieldDefs = qFieldDefs.asInstanceOf[js.Any], qGroupDefs = qGroupDefs.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDerivedFieldsData]
  }
  
  extension [Self <: INxDerivedFieldsData](x: Self) {
    
    inline def setQDerivedDefinitionName(value: String): Self = StObject.set(x, "qDerivedDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setQFieldDefs(value: js.Array[INxDerivedField]): Self = StObject.set(x, "qFieldDefs", value.asInstanceOf[js.Any])
    
    inline def setQFieldDefsVarargs(value: INxDerivedField*): Self = StObject.set(x, "qFieldDefs", js.Array(value*))
    
    inline def setQGroupDefs(value: js.Array[INxDerivedGroup]): Self = StObject.set(x, "qGroupDefs", value.asInstanceOf[js.Any])
    
    inline def setQGroupDefsVarargs(value: INxDerivedGroup*): Self = StObject.set(x, "qGroupDefs", js.Array(value*))
    
    inline def setQTags(value: js.Array[String]): Self = StObject.set(x, "qTags", value.asInstanceOf[js.Any])
    
    inline def setQTagsVarargs(value: String*): Self = StObject.set(x, "qTags", js.Array(value*))
  }
}
