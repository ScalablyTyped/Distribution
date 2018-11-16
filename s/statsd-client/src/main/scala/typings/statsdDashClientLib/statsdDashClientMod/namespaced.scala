package typings
package statsdDashClientLib.statsdDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("statsd-client", JSImport.Namespace)
@js.native
class namespaced protected () extends StatsdClient {
  def this(options: HttpOptions) = this()
  def this(options: TcpOptions) = this()
  def this(options: UdpOptions) = this()
}

