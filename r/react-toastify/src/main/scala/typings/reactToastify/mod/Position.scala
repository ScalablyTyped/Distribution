package typings.reactToastify.mod

import typings.reactToastify.reactToastifyStrings.`bottom-center`
import typings.reactToastify.reactToastifyStrings.`bottom-left`
import typings.reactToastify.reactToastifyStrings.`bottom-right`
import typings.reactToastify.reactToastifyStrings.`top-center`
import typings.reactToastify.reactToastifyStrings.`top-left`
import typings.reactToastify.reactToastifyStrings.`top-right`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  /**
    * Set the position to `'bottom-center'`
    */
  var BOTTOM_CENTER: `bottom-center`
  /**
    * Set the position to `'bottom-left'`
    */
  var BOTTOM_LEFT: `bottom-left`
  /**
    * Set the position to `'bottom-right'`
    */
  var BOTTOM_RIGHT: `bottom-right`
  /**
    * Set the position to `'top-center'`
    */
  var TOP_CENTER: `top-center`
  /**
    * Set the position to `'top-left'`
    */
  var TOP_LEFT: `top-left`
  /**
    * Set the position to `'top-right'`
    */
  var TOP_RIGHT: `top-right`
}

object Position {
  @scala.inline
  def apply(
    BOTTOM_CENTER: `bottom-center`,
    BOTTOM_LEFT: `bottom-left`,
    BOTTOM_RIGHT: `bottom-right`,
    TOP_CENTER: `top-center`,
    TOP_LEFT: `top-left`,
    TOP_RIGHT: `top-right`
  ): Position = {
    val __obj = js.Dynamic.literal(BOTTOM_CENTER = BOTTOM_CENTER.asInstanceOf[js.Any], BOTTOM_LEFT = BOTTOM_LEFT.asInstanceOf[js.Any], BOTTOM_RIGHT = BOTTOM_RIGHT.asInstanceOf[js.Any], TOP_CENTER = TOP_CENTER.asInstanceOf[js.Any], TOP_LEFT = TOP_LEFT.asInstanceOf[js.Any], TOP_RIGHT = TOP_RIGHT.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

