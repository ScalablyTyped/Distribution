package typings.simpleDashUrlDashCache.simpleDashUrlDashCacheMod

import typings.simpleDashUrlDashCache.simpleDashUrlDashCacheMod.privateN.StorageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileStorageConfig extends StorageConfig {
  var dir: String
}

object FileStorageConfig {
  @scala.inline
  def apply(dir: String, `type`: String): FileStorageConfig = {
    val __obj = js.Dynamic.literal(dir = dir)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FileStorageConfig]
  }
}

