package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeTraversal extends StObject {
  
  /**
    * Identifies the edge being traversed.
    */
  var edgeId: String = js.native
  
  /**
    * The values of relevant expressions after the edge has been traversed.
    */
  var finalState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.native
  
  /**
    * A message to display to the user as the edge is traversed.
    */
  var message: js.UndefOr[Message] = js.native
  
  /**
    * Key/value pairs that provide additional information about the edge traversal.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * The number of edge traversals necessary to return from a nested graph.
    */
  var stepOverEdgeCount: js.UndefOr[Double] = js.native
}
object EdgeTraversal {
  
  @scala.inline
  def apply(edgeId: String): EdgeTraversal = {
    val __obj = js.Dynamic.literal(edgeId = edgeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeTraversal]
  }
  
  @scala.inline
  implicit class EdgeTraversalMutableBuilder[Self <: EdgeTraversal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdgeId(value: String): Self = StObject.set(x, "edgeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalState(value: StringDictionary[MultiformatMessageString]): Self = StObject.set(x, "finalState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalStateUndefined: Self = StObject.set(x, "finalState", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setStepOverEdgeCount(value: Double): Self = StObject.set(x, "stepOverEdgeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepOverEdgeCountUndefined: Self = StObject.set(x, "stepOverEdgeCount", js.undefined)
  }
}
