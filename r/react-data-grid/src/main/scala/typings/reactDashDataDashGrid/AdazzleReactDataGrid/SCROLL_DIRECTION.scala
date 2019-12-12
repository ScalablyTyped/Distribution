package typings.reactDashDataDashGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.TopLevel
import typings.reactDashDataDashGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.DOWN
import typings.reactDashDataDashGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.LEFT
import typings.reactDashDataDashGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.NONE
import typings.reactDashDataDashGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.RIGHT
import typings.reactDashDataDashGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.UP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SCROLL_DIRECTION extends js.Object

@JSGlobal("AdazzleReactDataGrid.SCROLL_DIRECTION")
@js.native
object SCROLL_DIRECTION extends js.Object {
  @js.native
  sealed trait DOWN extends SCROLL_DIRECTION
  
  @js.native
  sealed trait LEFT extends SCROLL_DIRECTION
  
  @js.native
  sealed trait NONE extends SCROLL_DIRECTION
  
  @js.native
  sealed trait RIGHT extends SCROLL_DIRECTION
  
  @js.native
  sealed trait UP extends SCROLL_DIRECTION
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SCROLL_DIRECTION with String] = js.native
  /* "downwards" */ @js.native
  object DOWN extends TopLevel[DOWN with String]
  
  /* "left" */ @js.native
  object LEFT extends TopLevel[LEFT with String]
  
  /* "none" */ @js.native
  object NONE extends TopLevel[NONE with String]
  
  /* "right" */ @js.native
  object RIGHT extends TopLevel[RIGHT with String]
  
  /* "upwards" */ @js.native
  object UP extends TopLevel[UP with String]
  
}

