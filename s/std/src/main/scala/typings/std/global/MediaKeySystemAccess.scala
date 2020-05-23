package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import typings.std.MediaKeySystemConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaKeySystemAccess")
@js.native
class MediaKeySystemAccess ()
  extends typings.std.MediaKeySystemAccess {
  /* CompleteClass */
  override val keySystem: java.lang.String = js.native
  /* CompleteClass */
  override def createMediaKeys(): js.Promise[typings.std.MediaKeys] = js.native
  /* CompleteClass */
  override def getConfiguration(): MediaKeySystemConfiguration = js.native
}

@JSGlobal("MediaKeySystemAccess")
@js.native
object MediaKeySystemAccess
  extends Instantiable0[typings.std.MediaKeySystemAccess]

