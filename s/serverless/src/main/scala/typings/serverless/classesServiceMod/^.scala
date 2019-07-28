package typings.serverless.classesServiceMod

import typings.serverless.Anon_CompiledCloudFormationTemplate
import typings.serverless.serverlessMod.Event
import typings.serverless.serverlessMod.FunctionDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless/classes/Service", JSImport.Namespace)
@js.native
class ^ protected () extends Service {
  def this(serverless: typings.serverless.serverlessMod.^, data: js.Object) = this()
  /* CompleteClass */
  override var custom: Custom = js.native
  /* CompleteClass */
  override var provider: Anon_CompiledCloudFormationTemplate = js.native
  /* CompleteClass */
  override def getAllEventsInFunction(functionName: String): js.Array[Event] = js.native
  /* CompleteClass */
  override def getAllFunctions(): js.Array[String] = js.native
  /* CompleteClass */
  override def getAllFunctionsNames(): js.Array[String] = js.native
  /* CompleteClass */
  override def getEventInFunction(eventName: String, functionName: String): Event = js.native
  /* CompleteClass */
  override def getFunction(functionName: String): FunctionDefinition = js.native
  /* CompleteClass */
  override def getServiceName(): String = js.native
  /* CompleteClass */
  override def load(rawOptions: js.Object): js.Promise[_] = js.native
  /* CompleteClass */
  override def mergeResourceArrays(): Unit = js.native
  /* CompleteClass */
  override def setFunctionNames(rawOptions: js.Object): Unit = js.native
  /* CompleteClass */
  override def update(data: js.Object): js.Object = js.native
  /* CompleteClass */
  override def validate(): Service = js.native
}

