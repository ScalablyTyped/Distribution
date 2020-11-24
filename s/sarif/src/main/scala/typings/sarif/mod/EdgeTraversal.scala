package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeTraversal extends js.Object {
  
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
  implicit class EdgeTraversalOps[Self <: EdgeTraversal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEdgeId(value: String): Self = this.set("edgeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalState(value: StringDictionary[MultiformatMessageString]): Self = this.set("finalState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalState: Self = this.set("finalState", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setStepOverEdgeCount(value: Double): Self = this.set("stepOverEdgeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepOverEdgeCount: Self = this.set("stepOverEdgeCount", js.undefined)
  }
}
