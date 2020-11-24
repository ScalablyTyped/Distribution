package typings.reactRange.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Direction extends js.Object
@JSImport("react-range/lib/types", "Direction")
@js.native
object Direction extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Direction with String] = js.native
  
  @js.native
  sealed trait Down extends Direction
  /* "to bottom" */ @js.native
  object Down extends TopLevel[Down with String]
  
  @js.native
  sealed trait Left extends Direction
  /* "to left" */ @js.native
  object Left extends TopLevel[Left with String]
  
  @js.native
  sealed trait Right extends Direction
  /* "to right" */ @js.native
  object Right extends TopLevel[Right with String]
  
  @js.native
  sealed trait Up extends Direction
  /* "to top" */ @js.native
  object Up extends TopLevel[Up with String]
}
