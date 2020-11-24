package typings.serverless.serviceMod

import typings.serverless.anon.CompiledCloudFormationTemplate
import typings.serverless.mod.Event
import typings.serverless.mod.FunctionDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service extends js.Object {
  
  var custom: Custom = js.native
  
  def getAllEventsInFunction(functionName: String): js.Array[Event] = js.native
  
  def getAllFunctions(): js.Array[String] = js.native
  
  def getAllFunctionsNames(): js.Array[String] = js.native
  
  def getEventInFunction(eventName: String, functionName: String): Event = js.native
  
  def getFunction(functionName: String): FunctionDefinition = js.native
  
  def getServiceName(): String = js.native
  
  def load(rawOptions: js.Object): js.Promise[_] = js.native
  
  def mergeResourceArrays(): Unit = js.native
  
  var provider: CompiledCloudFormationTemplate = js.native
  
  def setFunctionNames(rawOptions: js.Object): Unit = js.native
  
  def update(data: js.Object): js.Object = js.native
  
  def validate(): Service = js.native
}
object Service {
  
  @scala.inline
  def apply(
    custom: Custom,
    getAllEventsInFunction: String => js.Array[Event],
    getAllFunctions: () => js.Array[String],
    getAllFunctionsNames: () => js.Array[String],
    getEventInFunction: (String, String) => Event,
    getFunction: String => FunctionDefinition,
    getServiceName: () => String,
    load: js.Object => js.Promise[_],
    mergeResourceArrays: () => Unit,
    provider: CompiledCloudFormationTemplate,
    setFunctionNames: js.Object => Unit,
    update: js.Object => js.Object,
    validate: () => Service
  ): Service = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], getAllEventsInFunction = js.Any.fromFunction1(getAllEventsInFunction), getAllFunctions = js.Any.fromFunction0(getAllFunctions), getAllFunctionsNames = js.Any.fromFunction0(getAllFunctionsNames), getEventInFunction = js.Any.fromFunction2(getEventInFunction), getFunction = js.Any.fromFunction1(getFunction), getServiceName = js.Any.fromFunction0(getServiceName), load = js.Any.fromFunction1(load), mergeResourceArrays = js.Any.fromFunction0(mergeResourceArrays), provider = provider.asInstanceOf[js.Any], setFunctionNames = js.Any.fromFunction1(setFunctionNames), update = js.Any.fromFunction1(update), validate = js.Any.fromFunction0(validate))
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    
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
    def setCustom(value: Custom): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllEventsInFunction(value: String => js.Array[Event]): Self = this.set("getAllEventsInFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAllFunctions(value: () => js.Array[String]): Self = this.set("getAllFunctions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllFunctionsNames(value: () => js.Array[String]): Self = this.set("getAllFunctionsNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEventInFunction(value: (String, String) => Event): Self = this.set("getEventInFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetFunction(value: String => FunctionDefinition): Self = this.set("getFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetServiceName(value: () => String): Self = this.set("getServiceName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoad(value: js.Object => js.Promise[_]): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMergeResourceArrays(value: () => Unit): Self = this.set("mergeResourceArrays", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProvider(value: CompiledCloudFormationTemplate): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFunctionNames(value: js.Object => Unit): Self = this.set("setFunctionNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: js.Object => js.Object): Self = this.set("update", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidate(value: () => Service): Self = this.set("validate", js.Any.fromFunction0(value))
  }
}
