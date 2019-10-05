package typings.std

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceUIFrameContext extends js.Object {
  def getCachedFrameMessage(key: java.lang.String): java.lang.String
  def postFrameMessage(key: java.lang.String, data: java.lang.String): Unit
}

@JSGlobal("ServiceUIFrameContext")
@js.native
object ServiceUIFrameContext extends TopLevel[ServiceUIFrameContext]

