package typings
package serverlessLib.classesServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless/classes/Service", JSImport.Namespace)
@js.native
class ^ protected () extends Service {
  def this(serverless: serverlessLib.serverlessMod.^, data: js.Object) = this()
  /* CompleteClass */
  override var custom: Custom = js.native
  /* CompleteClass */
  override var provider: serverlessLib.Anon_CompiledCloudFormationTemplate = js.native
  /* CompleteClass */
  override def getAllEventsInFunction(functionName: java.lang.String): js.Array[serverlessLib.serverlessMod.Event] = js.native
  /* CompleteClass */
  override def getAllFunctions(): js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override def getAllFunctionsNames(): js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override def getEventInFunction(eventName: java.lang.String, functionName: java.lang.String): serverlessLib.serverlessMod.Event = js.native
  /* CompleteClass */
  override def getFunction(functionName: java.lang.String): serverlessLib.serverlessMod.FunctionDefinition = js.native
  /* CompleteClass */
  override def getServiceName(): java.lang.String = js.native
  /* CompleteClass */
  override def load(rawOptions: js.Object): js.Promise[_] = js.native
  /* CompleteClass */
  override def mergeResourceArrays(): scala.Unit = js.native
  /* CompleteClass */
  override def setFunctionNames(rawOptions: js.Object): scala.Unit = js.native
  /* CompleteClass */
  override def update(data: js.Object): js.Object = js.native
  /* CompleteClass */
  override def validate(): Service = js.native
}

