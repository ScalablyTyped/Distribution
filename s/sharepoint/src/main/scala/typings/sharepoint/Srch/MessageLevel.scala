package typings.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageLevel extends js.Object

@JSGlobal("Srch.MessageLevel")
@js.native
object MessageLevel extends js.Object {
  @js.native
  sealed trait error extends MessageLevel
  
  @js.native
  sealed trait information extends MessageLevel
  
  @js.native
  sealed trait warning extends MessageLevel
  
}

