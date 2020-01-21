package typings.pulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/closure/v8", JSImport.Namespace)
@js.native
object v8Mod extends js.Object {
  val getFunctionLocationAsync: js.Function1[/* func */ js.Function, js.Promise[AnonColumn]] = js.native
  val lookupCapturedVariableValueAsync: js.Function3[
    /* func */ js.Function, 
    /* freeVariable */ String, 
    /* throwOnFailure */ Boolean, 
    js.Promise[js.Any]
  ] = js.native
}

