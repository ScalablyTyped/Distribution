package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphTraversal extends StObject {
  
  /**
    * A description of this graph traversal.
    */
  var description: js.UndefOr[Message] = js.undefined
  
  /**
    * The sequences of edges traversed by this graph traversal.
    */
  var edgeTraversals: js.UndefOr[js.Array[EdgeTraversal]] = js.undefined
  
  /**
    * Values of relevant expressions at the start of the graph traversal that remain constant for the graph traversal.
    */
  var immutableState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.undefined
  
  /**
    * Values of relevant expressions at the start of the graph traversal that may change during graph traversal.
    */
  var initialState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the graph traversal.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * The index within the result.graphs to be associated with the result.
    */
  var resultGraphIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The index within the run.graphs to be associated with the result.
    */
  var runGraphIndex: js.UndefOr[Double] = js.undefined
}
object GraphTraversal {
  
  @scala.inline
  def apply(): GraphTraversal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphTraversal]
  }
  
  @scala.inline
  implicit class GraphTraversalMutableBuilder[Self <: GraphTraversal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEdgeTraversals(value: js.Array[EdgeTraversal]): Self = StObject.set(x, "edgeTraversals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeTraversalsUndefined: Self = StObject.set(x, "edgeTraversals", js.undefined)
    
    @scala.inline
    def setEdgeTraversalsVarargs(value: EdgeTraversal*): Self = StObject.set(x, "edgeTraversals", js.Array(value :_*))
    
    @scala.inline
    def setImmutableState(value: StringDictionary[MultiformatMessageString]): Self = StObject.set(x, "immutableState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmutableStateUndefined: Self = StObject.set(x, "immutableState", js.undefined)
    
    @scala.inline
    def setInitialState(value: StringDictionary[MultiformatMessageString]): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setResultGraphIndex(value: Double): Self = StObject.set(x, "resultGraphIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultGraphIndexUndefined: Self = StObject.set(x, "resultGraphIndex", js.undefined)
    
    @scala.inline
    def setRunGraphIndex(value: Double): Self = StObject.set(x, "runGraphIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunGraphIndexUndefined: Self = StObject.set(x, "runGraphIndex", js.undefined)
  }
}
