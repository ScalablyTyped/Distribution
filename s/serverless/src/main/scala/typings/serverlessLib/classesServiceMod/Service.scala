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
    getAllEventsInFunction: js.Function1[java.lang.String, js.Array[serverlessLib.serverlessMod.ServerlessNs.Event]],
    getAllFunctions: js.Function0[js.Array[java.lang.String]],
    getAllFunctionsNames: js.Function0[js.Array[java.lang.String]],
    getEventInFunction: js.Function2[java.lang.String, java.lang.String, serverlessLib.serverlessMod.ServerlessNs.Event],
    getFunction: js.Function1[java.lang.String, serverlessLib.serverlessMod.ServerlessNs.FunctionDefinition],
    getServiceName: js.Function0[java.lang.String],
    load: js.Function1[js.Object, js.Promise[_]],
    mergeResourceArrays: js.Function0[scala.Unit],
    provider: serverlessLib.Anon_CompiledCloudFormationTemplate,
    setFunctionNames: js.Function1[js.Object, scala.Unit],
    update: js.Function1[js.Object, js.Object],
    validate: js.Function0[Service]
  ): Service = {
    val __obj = js.Dynamic.literal(custom = custom, getAllEventsInFunction = getAllEventsInFunction, getAllFunctions = getAllFunctions, getAllFunctionsNames = getAllFunctionsNames, getEventInFunction = getEventInFunction, getFunction = getFunction, getServiceName = getServiceName, load = load, mergeResourceArrays = mergeResourceArrays, provider = provider, setFunctionNames = setFunctionNames, update = update, validate = validate)
  
    __obj.asInstanceOf[Service]
  }
}

