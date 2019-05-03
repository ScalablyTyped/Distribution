package typings
package rollupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssetReferenceId extends js.Object {
  var assetReferenceId: java.lang.String | scala.Null
  var chunkId: java.lang.String
  var chunkReferenceId: java.lang.String | scala.Null
  var fileName: java.lang.String
  var format: java.lang.String
  var moduleId: java.lang.String
  var relativePath: java.lang.String
}

object Anon_AssetReferenceId {
  @scala.inline
  def apply(
    chunkId: java.lang.String,
    fileName: java.lang.String,
    format: java.lang.String,
    moduleId: java.lang.String,
    relativePath: java.lang.String,
    assetReferenceId: java.lang.String = null,
    chunkReferenceId: java.lang.String = null
  ): Anon_AssetReferenceId = {
    val __obj = js.Dynamic.literal(chunkId = chunkId, fileName = fileName, format = format, moduleId = moduleId, relativePath = relativePath)
    if (assetReferenceId != null) __obj.updateDynamic("assetReferenceId")(assetReferenceId)
    if (chunkReferenceId != null) __obj.updateDynamic("chunkReferenceId")(chunkReferenceId)
    __obj.asInstanceOf[Anon_AssetReferenceId]
  }
}

