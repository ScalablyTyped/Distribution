package typings.relayRuntime.anon

import typings.relayRuntime.connectionHandlerMod.ConnectionMetadata
import typings.relayRuntime.readerNodeMod.ReaderRefetchMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Refetch extends js.Object {
  val connection: js.UndefOr[js.Array[ConnectionMetadata]] = js.native
  val refetch: ReaderRefetchMetadata = js.native
}

object Refetch {
  @scala.inline
  def apply(refetch: ReaderRefetchMetadata): Refetch = {
    val __obj = js.Dynamic.literal(refetch = refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refetch]
  }
  @scala.inline
  implicit class RefetchOps[Self <: Refetch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRefetch(value: ReaderRefetchMetadata): Self = this.set("refetch", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionVarargs(value: ConnectionMetadata*): Self = this.set("connection", js.Array(value :_*))
    @scala.inline
    def setConnection(value: js.Array[ConnectionMetadata]): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
  }
  
}

