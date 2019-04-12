package typings
package rollupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssetFileName extends js.Object {
  var assetFileName: java.lang.String
  var chunkId: java.lang.String
  var format: java.lang.String
  var moduleId: java.lang.String
  var relativeAssetPath: java.lang.String
}

object Anon_AssetFileName {
  @scala.inline
  def apply(
    assetFileName: java.lang.String,
    chunkId: java.lang.String,
    format: java.lang.String,
    moduleId: java.lang.String,
    relativeAssetPath: java.lang.String
  ): Anon_AssetFileName = {
    val __obj = js.Dynamic.literal(assetFileName = assetFileName, chunkId = chunkId, format = format, moduleId = moduleId, relativeAssetPath = relativeAssetPath)
  
    __obj.asInstanceOf[Anon_AssetFileName]
  }
}

