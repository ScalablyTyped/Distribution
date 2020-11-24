package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphTraversal extends js.Object {
  
  /**
    * A description of this graph traversal.
    */
  var description: js.UndefOr[Message] = js.native
  
  /**
    * The sequences of edges traversed by this graph traversal.
    */
  var edgeTraversals: js.UndefOr[js.Array[EdgeTraversal]] = js.native
  
  /**
    * Values of relevant expressions at the start of the graph traversal that remain constant for the graph traversal.
    */
  var immutableState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.native
  
  /**
    * Values of relevant expressions at the start of the graph traversal that may change during graph traversal.
    */
  var initialState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.native
  
  /**
    * Key/value pairs that provide additional information about the graph traversal.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * The index within the result.graphs to be associated with the result.
    */
  var resultGraphIndex: js.UndefOr[Double] = js.native
  
  /**
    * The index within the run.graphs to be associated with the result.
    */
  var runGraphIndex: js.UndefOr[Double] = js.native
}
object GraphTraversal {
  
  @scala.inline
  def apply(): GraphTraversal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphTraversal]
  }
  
  @scala.inline
  implicit class GraphTraversalOps[Self <: GraphTraversal] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Message): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEdgeTraversalsVarargs(value: EdgeTraversal*): Self = this.set("edgeTraversals", js.Array(value :_*))
    
    @scala.inline
    def setEdgeTraversals(value: js.Array[EdgeTraversal]): Self = this.set("edgeTraversals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeTraversals: Self = this.set("edgeTraversals", js.undefined)
    
    @scala.inline
    def setImmutableState(value: StringDictionary[MultiformatMessageString]): Self = this.set("immutableState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmutableState: Self = this.set("immutableState", js.undefined)
    
    @scala.inline
    def setInitialState(value: StringDictionary[MultiformatMessageString]): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setResultGraphIndex(value: Double): Self = this.set("resultGraphIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultGraphIndex: Self = this.set("resultGraphIndex", js.undefined)
    
    @scala.inline
    def setRunGraphIndex(value: Double): Self = this.set("runGraphIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunGraphIndex: Self = this.set("runGraphIndex", js.undefined)
  }
}
