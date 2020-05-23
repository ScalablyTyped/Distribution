package typings.rollup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetReferenceId extends js.Object {
  var assetReferenceId: String | Null
  var chunkId: String
  var chunkReferenceId: String | Null
  var fileName: String
  var format: String
  var moduleId: String
  var referenceId: String
  var relativePath: String
}

object AssetReferenceId {
  @scala.inline
  def apply(
    chunkId: String,
    fileName: String,
    format: String,
    moduleId: String,
    referenceId: String,
    relativePath: String,
    assetReferenceId: String = null,
    chunkReferenceId: String = null
  ): AssetReferenceId = {
    val __obj = js.Dynamic.literal(chunkId = chunkId.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], referenceId = referenceId.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any], assetReferenceId = assetReferenceId.asInstanceOf[js.Any], chunkReferenceId = chunkReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetReferenceId]
  }
}

