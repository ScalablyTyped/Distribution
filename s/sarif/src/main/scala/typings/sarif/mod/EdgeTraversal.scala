package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeTraversal extends StObject {
  
  /**
    * Identifies the edge being traversed.
    */
  var edgeId: String
  
  /**
    * The values of relevant expressions after the edge has been traversed.
    */
  var finalState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.undefined
  
  /**
    * A message to display to the user as the edge is traversed.
    */
  var message: js.UndefOr[Message] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the edge traversal.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * The number of edge traversals necessary to return from a nested graph.
    */
  var stepOverEdgeCount: js.UndefOr[Double] = js.undefined
}
object EdgeTraversal {
  
  inline def apply(edgeId: String): EdgeTraversal = {
    val __obj = js.Dynamic.literal(edgeId = edgeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeTraversal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EdgeTraversal] (val x: Self) extends AnyVal {
    
    inline def setEdgeId(value: String): Self = StObject.set(x, "edgeId", value.asInstanceOf[js.Any])
    
    inline def setFinalState(value: StringDictionary[MultiformatMessageString]): Self = StObject.set(x, "finalState", value.asInstanceOf[js.Any])
    
    inline def setFinalStateUndefined: Self = StObject.set(x, "finalState", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setStepOverEdgeCount(value: Double): Self = StObject.set(x, "stepOverEdgeCount", value.asInstanceOf[js.Any])
    
    inline def setStepOverEdgeCountUndefined: Self = StObject.set(x, "stepOverEdgeCount", js.undefined)
  }
}
