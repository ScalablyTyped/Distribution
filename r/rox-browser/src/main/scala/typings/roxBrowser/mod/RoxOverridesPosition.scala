package typings.roxBrowser.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RoxOverridesPosition extends js.Object
@JSImport("rox-browser", "RoxOverridesPosition")
@js.native
object RoxOverridesPosition extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RoxOverridesPosition with String] = js.native
  
  @js.native
  sealed trait BottomLeft extends RoxOverridesPosition
  /* "bottom left" */ @js.native
  object BottomLeft extends TopLevel[BottomLeft with String]
  
  @js.native
  sealed trait BottomRight extends RoxOverridesPosition
  /* "bottom right" */ @js.native
  object BottomRight extends TopLevel[BottomRight with String]
  
  @js.native
  sealed trait TopLeft extends RoxOverridesPosition
  /* "top left" */ @js.native
  object TopLeft extends TopLevel[TopLeft with String]
  
  @js.native
  sealed trait TopRight extends RoxOverridesPosition
  /* "top right" */ @js.native
  object TopRight extends TopLevel[TopRight with String]
}
