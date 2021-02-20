package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreadFlow extends StObject {
  
  /**
    * An string that uniquely identifies the threadFlow within the codeFlow in which it occurs.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Values of relevant expressions at the start of the thread flow that remain constant.
    */
  var immutableState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.native
  
  /**
    * Values of relevant expressions at the start of the thread flow that may change during thread flow execution.
    */
  var initialState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.native
  
  /**
    * A temporally ordered array of 'threadFlowLocation' objects, each of which describes a location visited by the
    * tool while producing the result.
    */
  var locations: js.Array[ThreadFlowLocation] = js.native
  
  /**
    * A message relevant to the thread flow.
    */
  var message: js.UndefOr[Message] = js.native
  
  /**
    * Key/value pairs that provide additional information about the thread flow.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}
object ThreadFlow {
  
  @scala.inline
  def apply(locations: js.Array[ThreadFlowLocation]): ThreadFlow = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadFlow]
  }
  
  @scala.inline
  implicit class ThreadFlowMutableBuilder[Self <: ThreadFlow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImmutableState(value: StringDictionary[MultiformatMessageString]): Self = StObject.set(x, "immutableState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmutableStateUndefined: Self = StObject.set(x, "immutableState", js.undefined)
    
    @scala.inline
    def setInitialState(value: StringDictionary[MultiformatMessageString]): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setLocations(value: js.Array[ThreadFlowLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsVarargs(value: ThreadFlowLocation*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
