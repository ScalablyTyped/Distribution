package typings.simpleUrlCache.mod

import typings.simpleUrlCache.mod.privateN.CacheCategory
import typings.simpleUrlCache.mod.privateN.CacheStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simple-url-cache", "FileStorage")
@js.native
class FileStorage protected ()
  extends CacheCategory
     with CacheStorage {
  def this(_url: String, _storageConfig: FileStorageConfig, _regexRules: CacheRules) = this()
}

