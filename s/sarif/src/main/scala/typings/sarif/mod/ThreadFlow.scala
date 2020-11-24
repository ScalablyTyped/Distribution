package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreadFlow extends js.Object {
  
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
  implicit class ThreadFlowOps[Self <: ThreadFlow] (val x: Self) extends AnyVal {
    
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
    def setLocationsVarargs(value: ThreadFlowLocation*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[ThreadFlowLocation]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImmutableState(value: StringDictionary[MultiformatMessageString]): Self = this.set("immutableState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmutableState: Self = this.set("immutableState", js.undefined)
    
    @scala.inline
    def setInitialState(value: StringDictionary[MultiformatMessageString]): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
