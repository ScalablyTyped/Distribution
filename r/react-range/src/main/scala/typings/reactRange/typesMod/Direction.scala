package typings.reactRange.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSImport("react-range/lib/types", "Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait Down extends Direction
  
  @js.native
  sealed trait Left extends Direction
  
  @js.native
  sealed trait Right extends Direction
  
  @js.native
  sealed trait Up extends Direction
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Direction with String] = js.native
  /* "to bottom" */ @js.native
  object Down extends TopLevel[Down with String]
  
  /* "to left" */ @js.native
  object Left extends TopLevel[Left with String]
  
  /* "to right" */ @js.native
  object Right extends TopLevel[Right with String]
  
  /* "to top" */ @js.native
  object Up extends TopLevel[Up with String]
  
}

