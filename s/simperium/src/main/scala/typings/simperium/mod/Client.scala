package typings.simperium.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client[Buckets] extends CustomEventEmitter[ClientEvent] {
  var buckets: js.Array[Bucket[Buckets, Null, scala.Nothing]] = js.native
  var heartbeat: Heartbeat = js.native
  def bucket[Name /* <: /* keyof Buckets */ String */](name: Name): Bucket[
    Name, 
    /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
    scala.Nothing
  ] = js.native
}

@JSImport("simperium", "Client")
@js.native
object Client extends js.Object {
  def apply[Buckets](appID: String, token: String): Client[Buckets] = js.native
  def apply[Buckets](appID: String, token: String, clientConfig: Partial[ClientConfig[Buckets]]): Client[Buckets] = js.native
}

