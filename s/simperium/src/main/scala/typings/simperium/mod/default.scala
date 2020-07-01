package typings.simperium.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simperium", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[Buckets](appID: String, token: String): Client[Buckets] = js.native
  def apply[Buckets](appID: String, token: String, clientConfig: Partial[ClientConfig[Buckets]]): Client[Buckets] = js.native
}

