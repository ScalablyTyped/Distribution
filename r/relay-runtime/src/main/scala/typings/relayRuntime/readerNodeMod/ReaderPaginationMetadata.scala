package typings.relayRuntime.readerNodeMod

import typings.relayRuntime.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaderPaginationMetadata extends js.Object {
  val backward: Count | Null = js.native
  val forward: Count | Null = js.native
  val path: js.Array[String] = js.native
}

object ReaderPaginationMetadata {
  @scala.inline
  def apply(path: js.Array[String]): ReaderPaginationMetadata = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderPaginationMetadata]
  }
  @scala.inline
  implicit class ReaderPaginationMetadataOps[Self <: ReaderPaginationMetadata] (val x: Self) extends AnyVal {
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
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackward(value: Count): Self = this.set("backward", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackwardNull: Self = this.set("backward", null)
    @scala.inline
    def setForward(value: Count): Self = this.set("forward", value.asInstanceOf[js.Any])
    @scala.inline
    def setForwardNull: Self = this.set("forward", null)
  }
  
}

