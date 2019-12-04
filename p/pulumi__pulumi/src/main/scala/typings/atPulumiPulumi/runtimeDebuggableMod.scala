package typings.atPulumiPulumi

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/debuggable", JSImport.Namespace)
@js.native
object runtimeDebuggableMod extends js.Object {
  def debuggablePromise[T](p: js.Promise[T], ctx: js.Any): js.Promise[T] = js.native
  def errorString(err: Error): String = js.native
}

