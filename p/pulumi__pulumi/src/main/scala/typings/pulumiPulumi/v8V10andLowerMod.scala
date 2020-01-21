package typings.pulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/closure/v8_v10andLower", JSImport.Namespace)
@js.native
object v8V10andLowerMod extends js.Object {
  def getFunctionLocationAsync(func: js.Function): js.Promise[AnonColumnFile] = js.native
  def lookupCapturedVariableValueAsync(func: js.Function, freeVariable: String, throwOnFailure: Boolean): js.Promise[_] = js.native
}

