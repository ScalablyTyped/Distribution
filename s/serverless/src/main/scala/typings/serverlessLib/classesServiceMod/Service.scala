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

