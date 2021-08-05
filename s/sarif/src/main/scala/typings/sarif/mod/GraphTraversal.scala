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
  
  inline def apply(): GraphTraversal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphTraversal]
  }
  
  extension [Self <: GraphTraversal](x: Self) {
    
    inline def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEdgeTraversals(value: js.Array[EdgeTraversal]): Self = StObject.set(x, "edgeTraversals", value.asInstanceOf[js.Any])
    
    inline def setEdgeTraversalsUndefined: Self = StObject.set(x, "edgeTraversals", js.undefined)
    
    inline def setEdgeTraversalsVarargs(value: EdgeTraversal*): Self = StObject.set(x, "edgeTraversals", js.Array(value :_*))
    
    inline def setImmutableState(value: StringDictionary[MultiformatMessageString]): Self = StObject.set(x, "immutableState", value.asInstanceOf[js.Any])
    
    inline def setImmutableStateUndefined: Self = StObject.set(x, "immutableState", js.undefined)
    
    inline def setInitialState(value: StringDictionary[MultiformatMessageString]): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setResultGraphIndex(value: Double): Self = StObject.set(x, "resultGraphIndex", value.asInstanceOf[js.Any])
    
    inline def setResultGraphIndexUndefined: Self = StObject.set(x, "resultGraphIndex", js.undefined)
    
    inline def setRunGraphIndex(value: Double): Self = StObject.set(x, "runGraphIndex", value.asInstanceOf[js.Any])
    
    inline def setRunGraphIndexUndefined: Self = StObject.set(x, "runGraphIndex", js.undefined)
  }
}
