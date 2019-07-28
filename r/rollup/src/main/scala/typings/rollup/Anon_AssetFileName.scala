package typings.rollup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssetFileName extends js.Object {
  var assetFileName: String
  var chunkId: String
  var format: String
  var moduleId: String
  var relativeAssetPath: String
}

object Anon_AssetFileName {
  @scala.inline
  def apply(
    assetFileName: String,
    chunkId: String,
    format: String,
    moduleId: String,
    relativeAssetPath: String
  ): Anon_AssetFileName = {
    val __obj = js.Dynamic.literal(assetFileName = assetFileName, chunkId = chunkId, format = format, moduleId = moduleId, relativeAssetPath = relativeAssetPath)
  
    __obj.asInstanceOf[Anon_AssetFileName]
  }
}

