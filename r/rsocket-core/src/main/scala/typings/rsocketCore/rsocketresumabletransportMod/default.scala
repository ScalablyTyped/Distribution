package typings.rsocketCore.rsocketresumabletransportMod

import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-core/RSocketResumableTransport", JSImport.Default)
@js.native
class default protected () extends RSocketResumableTransport {
  def this(source: js.Function0[DuplexConnection], options: Options) = this()
  def this(source: js.Function0[DuplexConnection], options: Options, encoders: Encoders[_]) = this()
}
