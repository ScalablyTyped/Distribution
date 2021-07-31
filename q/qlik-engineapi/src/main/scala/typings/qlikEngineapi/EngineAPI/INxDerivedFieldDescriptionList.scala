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
  
  @scala.inline
  def apply(qDerivedFieldLists: js.Array[INxDerivedFieldsData]): INxDerivedFieldDescriptionList = {
    val __obj = js.Dynamic.literal(qDerivedFieldLists = qDerivedFieldLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDerivedFieldDescriptionList]
  }
  
  @scala.inline
  implicit class INxDerivedFieldDescriptionListMutableBuilder[Self <: INxDerivedFieldDescriptionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDerivedFieldLists(value: js.Array[INxDerivedFieldsData]): Self = StObject.set(x, "qDerivedFieldLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDerivedFieldListsVarargs(value: INxDerivedFieldsData*): Self = StObject.set(x, "qDerivedFieldLists", js.Array(value :_*))
  }
}
