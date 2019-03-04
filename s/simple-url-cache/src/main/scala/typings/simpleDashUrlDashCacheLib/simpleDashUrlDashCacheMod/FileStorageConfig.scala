package typings
package simpleDashUrlDashCacheLib.simpleDashUrlDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileStorageConfig
  extends simpleDashUrlDashCacheLib.simpleDashUrlDashCacheMod.privateNNs.StorageConfig {
  var dir: java.lang.String
}

object FileStorageConfig {
  @scala.inline
  def apply(dir: java.lang.String, `type`: java.lang.String): FileStorageConfig = {
    val __obj = js.Dynamic.literal(dir = dir)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FileStorageConfig]
  }
}

