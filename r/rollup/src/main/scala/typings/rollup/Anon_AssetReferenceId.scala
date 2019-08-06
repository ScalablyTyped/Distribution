package typings.rollup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssetReferenceId extends js.Object {
  var assetReferenceId: String | Null
  var chunkId: String
  var chunkReferenceId: String | Null
  var fileName: String
  var format: String
  var moduleId: String
  var referenceId: String
  var relativePath: String
}

object Anon_AssetReferenceId {
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
  ): Anon_AssetReferenceId = {
    val __obj = js.Dynamic.literal(chunkId = chunkId, fileName = fileName, format = format, moduleId = moduleId, referenceId = referenceId, relativePath = relativePath)
    if (assetReferenceId != null) __obj.updateDynamic("assetReferenceId")(assetReferenceId)
    if (chunkReferenceId != null) __obj.updateDynamic("chunkReferenceId")(chunkReferenceId)
    __obj.asInstanceOf[Anon_AssetReferenceId]
  }
}

