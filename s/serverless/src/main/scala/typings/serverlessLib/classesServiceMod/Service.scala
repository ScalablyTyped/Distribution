package typings
package serverlessLib.classesServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var custom: serverlessLib.classesServiceMod.ServiceNs.Custom
  var provider: serverlessLib.Anon_CompiledCloudFormationTemplate
  def getAllEventsInFunction(functionName: java.lang.String): js.Array[serverlessLib.serverlessMod.ServerlessNs.Event]
  def getAllFunctions(): js.Array[java.lang.String]
  def getAllFunctionsNames(): js.Array[java.lang.String]
  def getEventInFunction(eventName: java.lang.String, functionName: java.lang.String): serverlessLib.serverlessMod.ServerlessNs.Event
  def getFunction(functionName: java.lang.String): serverlessLib.serverlessMod.ServerlessNs.FunctionDefinition
  def getServiceName(): java.lang.String
  def load(rawOptions: js.Object): js.Promise[_]
  def mergeResourceArrays(): scala.Unit
  def setFunctionNames(rawOptions: js.Object): scala.Unit
  def update(data: js.Object): js.Object
  def validate(): Service
}

object Service {
  @scala.inline
  def apply(
    custom: serverlessLib.classesServiceMod.ServiceNs.Custom,
    getAllEventsInFunction: java.lang.String => js.Array[serverlessLib.serverlessMod.ServerlessNs.Event],
    getAllFunctions: () => js.Array[java.lang.String],
    getAllFunctionsNames: () => js.Array[java.lang.String],
    getEventInFunction: (java.lang.String, java.lang.String) => serverlessLib.serverlessMod.ServerlessNs.Event,
    getFunction: java.lang.String => serverlessLib.serverlessMod.ServerlessNs.FunctionDefinition,
    getServiceName: () => java.lang.String,
    load: js.Object => js.Promise[_],
    mergeResourceArrays: () => scala.Unit,
    provider: serverlessLib.Anon_CompiledCloudFormationTemplate,
    setFunctionNames: js.Object => scala.Unit,
    update: js.Object => js.Object,
    validate: () => Service
  ): Service = {
    val __obj = js.Dynamic.literal(custom = custom, getAllEventsInFunction = js.Any.fromFunction1(getAllEventsInFunction), getAllFunctions = js.Any.fromFunction0(getAllFunctions), getAllFunctionsNames = js.Any.fromFunction0(getAllFunctionsNames), getEventInFunction = js.Any.fromFunction2(getEventInFunction), getFunction = js.Any.fromFunction1(getFunction), getServiceName = js.Any.fromFunction0(getServiceName), load = js.Any.fromFunction1(load), mergeResourceArrays = js.Any.fromFunction0(mergeResourceArrays), provider = provider, setFunctionNames = js.Any.fromFunction1(setFunctionNames), update = js.Any.fromFunction1(update), validate = js.Any.fromFunction0(validate))
  
    __obj.asInstanceOf[Service]
  }
}

