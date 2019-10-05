package typings.reactDashDataDashGrid.AdazzleReactDataGrid

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
  
  /* "downwards" */ val DOWN: typings.reactDashDataDashGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.DOWN with String = js.native
  /* "left" */ val LEFT: typings.reactDashDataDashGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.LEFT with String = js.native
  /* "none" */ val NONE: typings.reactDashDataDashGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.NONE with String = js.native
  /* "right" */ val RIGHT: typings.reactDashDataDashGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.RIGHT with String = js.native
  /* "upwards" */ val UP: typings.reactDashDataDashGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.UP with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SCROLL_DIRECTION with String] = js.native
}

