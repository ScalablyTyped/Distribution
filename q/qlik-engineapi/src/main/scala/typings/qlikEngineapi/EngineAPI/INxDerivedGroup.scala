package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxDerivedGroup...
  */
trait INxDerivedGroup extends StObject {
  
  /**
    * List of the derived fields in the group.
    */
  var qFieldDefs: js.Array[String]
  
  /**
    * Grouping type.
    * The grouping should be either H or C (Grouping is mandatory for derived definitions).
    * >> Is mandatory.
    */
  var qGrouping: NxGrpType
  
  /**
    * Identifier of the group.
    */
  var qId: String
  
  /**
    * Name of the derived group.
    */
  var qName: String
}
object INxDerivedGroup {
  
  inline def apply(qFieldDefs: js.Array[String], qGrouping: NxGrpType, qId: String, qName: String): INxDerivedGroup = {
    val __obj = js.Dynamic.literal(qFieldDefs = qFieldDefs.asInstanceOf[js.Any], qGrouping = qGrouping.asInstanceOf[js.Any], qId = qId.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDerivedGroup]
  }
  
  extension [Self <: INxDerivedGroup](x: Self) {
    
    inline def setQFieldDefs(value: js.Array[String]): Self = StObject.set(x, "qFieldDefs", value.asInstanceOf[js.Any])
    
    inline def setQFieldDefsVarargs(value: String*): Self = StObject.set(x, "qFieldDefs", js.Array(value :_*))
    
    inline def setQGrouping(value: NxGrpType): Self = StObject.set(x, "qGrouping", value.asInstanceOf[js.Any])
    
    inline def setQId(value: String): Self = StObject.set(x, "qId", value.asInstanceOf[js.Any])
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
  }
}
