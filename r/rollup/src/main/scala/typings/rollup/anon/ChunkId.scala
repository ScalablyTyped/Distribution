package typings.rollup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkId extends js.Object {
  var chunkId: String
  var format: String
  var moduleId: String
}

object ChunkId {
  @scala.inline
  def apply(chunkId: String, format: String, moduleId: String): ChunkId = {
    val __obj = js.Dynamic.literal(chunkId = chunkId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkId]
  }
}

