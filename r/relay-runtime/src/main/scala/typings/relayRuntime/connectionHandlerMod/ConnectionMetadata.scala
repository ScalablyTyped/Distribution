package typings.relayRuntime.connectionHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionMetadata extends js.Object {
  var count: js.UndefOr[String | Null] = js.native
   // 'forward' | 'backward' | 'bidirectional' | null | undefined;
  var cursor: js.UndefOr[String | Null] = js.native
  var direction: js.UndefOr[String | Null] = js.native
  var path: js.UndefOr[js.Array[String] | Null] = js.native
}

object ConnectionMetadata {
  @scala.inline
  def apply(): ConnectionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionMetadata]
  }
  @scala.inline
  implicit class ConnectionMetadataOps[Self <: ConnectionMetadata] (val x: Self) extends AnyVal {
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setCountNull: Self = this.set("count", null)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setCursorNull: Self = this.set("cursor", null)
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDirectionNull: Self = this.set("direction", null)
    @scala.inline
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPathNull: Self = this.set("path", null)
  }
  
}

