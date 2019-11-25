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
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStorageConfig]
  }
}

