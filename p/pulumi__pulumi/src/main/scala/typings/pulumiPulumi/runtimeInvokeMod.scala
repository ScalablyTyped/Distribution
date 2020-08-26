package typings.pulumiPulumi

import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiQuery.interfacesMod.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/invoke", JSImport.Namespace)
@js.native
object runtimeInvokeMod extends js.Object {
  @js.native
  class StreamInvokeResponse[T] protected () extends AsyncIterable[T] {
    def this(source: AsyncIterable[T], cancelSource: js.Function0[Unit]) = this()
    var cancelSource: js.Any = js.native
    var source: js.Any = js.native
    def cancel(): Unit = js.native
  }
  
  def invoke(tok: String, props: Inputs): js.Promise[_] = js.native
  def invoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[_] = js.native
  def streamInvoke(tok: String, props: Inputs): js.Promise[StreamInvokeResponse[_]] = js.native
  def streamInvoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[StreamInvokeResponse[_]] = js.native
}

