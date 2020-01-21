package typings.streamMock.chunkMod

import typings.node.Buffer
import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChunk extends js.Object {
  var chunk: Buffer | String
  var encoding: BufferEncoding
}

object IChunk {
  @scala.inline
  def apply(chunk: Buffer | String, encoding: BufferEncoding): IChunk = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IChunk]
  }
}

