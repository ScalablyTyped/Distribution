package typings.sharepoint.Srch

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.Srch.MessageLevel.error
import typings.sharepoint.Srch.MessageLevel.information
import typings.sharepoint.Srch.MessageLevel.warning
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageLevel with Double] = js.native
  /* 2 */ @js.native
  object error extends TopLevel[error with Double]
  
  /* 0 */ @js.native
  object information extends TopLevel[information with Double]
  
  /* 1 */ @js.native
  object warning extends TopLevel[warning with Double]
  
}

