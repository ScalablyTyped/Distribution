package typings.snykSnykCocoapodsPlugin.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/snyk-cocoapods-plugin", "OutOfSyncError")
@js.native
class OutOfSyncError protected () extends Error {
  def this(manifestFileName: String, lockfileName: String) = this()
  var code: Double = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

