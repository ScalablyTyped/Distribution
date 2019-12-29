package typings.roxDashBrowser.roxDashBrowserMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoxOverridesPosition extends js.Object

@JSImport("rox-browser", "RoxOverridesPosition")
@js.native
object RoxOverridesPosition extends js.Object {
  @js.native
  sealed trait BottomLeft extends RoxOverridesPosition
  
  @js.native
  sealed trait BottomRight extends RoxOverridesPosition
  
  @js.native
  sealed trait TopLeft extends RoxOverridesPosition
  
  @js.native
  sealed trait TopRight extends RoxOverridesPosition
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RoxOverridesPosition with String] = js.native
  /* "bottom left" */ @js.native
  object BottomLeft extends TopLevel[BottomLeft with String]
  
  /* "bottom right" */ @js.native
  object BottomRight extends TopLevel[BottomRight with String]
  
  /* "top left" */ @js.native
  object TopLeft extends TopLevel[TopLeft with String]
  
  /* "top right" */ @js.native
  object TopRight extends TopLevel[TopRight with String]
  
}

