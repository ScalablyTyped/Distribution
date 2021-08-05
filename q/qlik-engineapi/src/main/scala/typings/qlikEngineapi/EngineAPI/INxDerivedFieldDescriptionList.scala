package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxDerivedFieldDescriptionList
  */
trait INxDerivedFieldDescriptionList extends StObject {
  
  /**
    * Information about the derived fields.
    */
  var qDerivedFieldLists: js.Array[INxDerivedFieldsData]
}
object INxDerivedFieldDescriptionList {
  
  inline def apply(qDerivedFieldLists: js.Array[INxDerivedFieldsData]): INxDerivedFieldDescriptionList = {
    val __obj = js.Dynamic.literal(qDerivedFieldLists = qDerivedFieldLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDerivedFieldDescriptionList]
  }
  
  extension [Self <: INxDerivedFieldDescriptionList](x: Self) {
    
    inline def setQDerivedFieldLists(value: js.Array[INxDerivedFieldsData]): Self = StObject.set(x, "qDerivedFieldLists", value.asInstanceOf[js.Any])
    
    inline def setQDerivedFieldListsVarargs(value: INxDerivedFieldsData*): Self = StObject.set(x, "qDerivedFieldLists", js.Array(value :_*))
  }
}
