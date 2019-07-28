package typings.serverless.classesServiceMod

import typings.serverless.Anon_CompiledCloudFormationTemplate
import typings.serverless.serverlessMod.Event
import typings.serverless.serverlessMod.FunctionDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var custom: Custom
  var provider: Anon_CompiledCloudFormationTemplate
  def getAllEventsInFunction(functionName: String): js.Array[Event]
  def getAllFunctions(): js.Array[String]
  def getAllFunctionsNames(): js.Array[String]
  def getEventInFunction(eventName: String, functionName: String): Event
  def getFunction(functionName: String): FunctionDefinition
  def getServiceName(): String
  def load(rawOptions: js.Object): js.Promise[_]
  def mergeResourceArrays(): Unit
  def setFunctionNames(rawOptions: js.Object): Unit
  def update(data: js.Object): js.Object
  def validate(): Service
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
    provider: Anon_CompiledCloudFormationTemplate,
    setFunctionNames: js.Object => Unit,
    update: js.Object => js.Object,
    validate: () => Service
  ): Service = {
    val __obj = js.Dynamic.literal(custom = custom, getAllEventsInFunction = js.Any.fromFunction1(getAllEventsInFunction), getAllFunctions = js.Any.fromFunction0(getAllFunctions), getAllFunctionsNames = js.Any.fromFunction0(getAllFunctionsNames), getEventInFunction = js.Any.fromFunction2(getEventInFunction), getFunction = js.Any.fromFunction1(getFunction), getServiceName = js.Any.fromFunction0(getServiceName), load = js.Any.fromFunction1(load), mergeResourceArrays = js.Any.fromFunction0(mergeResourceArrays), provider = provider, setFunctionNames = js.Any.fromFunction1(setFunctionNames), update = js.Any.fromFunction1(update), validate = js.Any.fromFunction0(validate))
  
    __obj.asInstanceOf[Service]
  }
}

