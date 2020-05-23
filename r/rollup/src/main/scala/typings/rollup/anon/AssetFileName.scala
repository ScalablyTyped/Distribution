package typings.rollup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetFileName extends js.Object {
  var assetFileName: String
  var chunkId: String
  var format: String
  var moduleId: String
  var relativeAssetPath: String
}

object AssetFileName {
  @scala.inline
  def apply(
    assetFileName: String,
    chunkId: String,
    format: String,
    moduleId: String,
    relativeAssetPath: String
  ): AssetFileName = {
    val __obj = js.Dynamic.literal(assetFileName = assetFileName.asInstanceOf[js.Any], chunkId = chunkId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], relativeAssetPath = relativeAssetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetFileName]
  }
}

