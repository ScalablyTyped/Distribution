package typings.signalfx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("signalfx", "IngestJson")
@js.native
open class IngestJson protected ()
  extends StObject
     with SignalClient {
  def this(token: String) = this()
  def this(token: String, options: IngestOptions) = this()
  
  /* CompleteClass */
  override def send(report: SignalReport): js.Promise[Unit] = js.native
  
  /* CompleteClass */
  override def sendEvent(event: SignalEvent): js.Promise[Unit] = js.native
}
