package typings.signalfx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("signalfx", "SignalFlow")
@js.native
open class SignalFlow protected () extends StObject {
  def this(apiToken: String) = this()
  def this(apiToken: String, options: SignalFlowOptions) = this()
  
  def disconnect(): Unit = js.native
  
  def execute(opts: ExecuteOptions): SignalfxHandle = js.native
  
  def explain(opts: ExplainOptions): SignalfxHandle = js.native
  
  def livetail(opts: LiveTailOpts): LiveTail = js.native
  
  def preflight(opts: RequestOptions): SignalfxHandle = js.native
}
