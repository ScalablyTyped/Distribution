package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaKeySystemAccess")
@js.native
class MediaKeySystemAccessCls () extends MediaKeySystemAccess {
  /* CompleteClass */
  override val keySystem: java.lang.String = js.native
  /* CompleteClass */
  override def createMediaKeys(): js.Promise[MediaKeys] = js.native
  /* CompleteClass */
  override def getConfiguration(): MediaKeySystemConfiguration = js.native
}

