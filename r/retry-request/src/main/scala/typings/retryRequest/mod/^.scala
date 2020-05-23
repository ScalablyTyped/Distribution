package typings.retryRequest.mod

import typings.request.mod.RequestCallback
import typings.retryRequest.anon.Abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("retry-request", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(requestOpts: typings.request.mod.Options): Abort = js.native
  def apply(requestOpts: typings.request.mod.Options, callback: RequestCallback): Abort = js.native
  def apply(requestOpts: typings.request.mod.Options, opts: Options): Abort = js.native
  def apply(requestOpts: typings.request.mod.Options, opts: Options, callback: RequestCallback): Abort = js.native
}

