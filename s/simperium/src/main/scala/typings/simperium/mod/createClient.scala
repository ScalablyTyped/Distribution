package typings.simperium.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simperium", "createClient")
@js.native
object createClient extends js.Object {
  def apply[Buckets](appID: String, token: String): Client[Buckets] = js.native
  def apply[Buckets](appID: String, token: String, clientConfig: Partial[ClientConfig[Buckets]]): Client[Buckets] = js.native
}

