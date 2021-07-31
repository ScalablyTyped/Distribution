package typings.pulumiPulumi

import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiQuery.interfacesMod.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeInvokeMod {
  
  @JSImport("@pulumi/pulumi/runtime/invoke", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/pulumi/runtime/invoke", "StreamInvokeResponse")
  @js.native
  class StreamInvokeResponse[T] protected ()
    extends StObject
       with AsyncIterable[T] {
    def this(source: AsyncIterable[T], cancelSource: js.Function0[Unit]) = this()
    
    def cancel(): Unit = js.native
    
    var cancelSource: js.Any = js.native
    
    var source: js.Any = js.native
  }
  
  @scala.inline
  def invoke(tok: String, props: Inputs): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def invoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def streamInvoke(tok: String, props: Inputs): js.Promise[StreamInvokeResponse[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamInvoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StreamInvokeResponse[js.Any]]]
  @scala.inline
  def streamInvoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[StreamInvokeResponse[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamInvoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StreamInvokeResponse[js.Any]]]
}
