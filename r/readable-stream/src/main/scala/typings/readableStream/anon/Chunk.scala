package typings.readableStream.anon

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chunk extends js.Object {
  var chunk: js.Any = js.native
  var encoding: BufferEncoding | String = js.native
}

object Chunk {
  @scala.inline
  def apply(chunk: js.Any, encoding: BufferEncoding | String): Chunk = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunk]
  }
  @scala.inline
  implicit class ChunkOps[Self <: Chunk] (val x: Self) extends AnyVal {
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
    def setChunk(value: js.Any): Self = this.set("chunk", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: BufferEncoding | String): Self = this.set("encoding", value.asInstanceOf[js.Any])
  }
  
}

