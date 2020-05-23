package typings.readableStream.anon

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chunk extends js.Object {
  var chunk: js.Any
  var encoding: BufferEncoding
}

object Chunk {
  @scala.inline
  def apply(chunk: js.Any, encoding: BufferEncoding): Chunk = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunk]
  }
}

