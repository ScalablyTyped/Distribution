package typings
package slideoutLib.slideoutMod.SlideoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to customize a new instance of Slideout.
  */
trait Options extends js.Object {
  /**
    * The time (milliseconds) to open/close the slideout.
    * Default: 300.
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * The CSS effect to use when animating the opening and closing of the slideout.
    * Default: ease.
    */
  var fx: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The DOM element that contains your menu application (.slideout-menu).
    */
  var menu: stdLib.HTMLElement
  /**
    *   Default: 256.
    */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /**
    * The DOM element that contains all your application content (.slideout-panel).
    */
  var panel: stdLib.HTMLElement
  /**
    * The side to open the slideout.
    * Default: left.
    */
  var side: js.UndefOr[slideoutLib.slideoutLibStrings.left | slideoutLib.slideoutLibStrings.right] = js.undefined
  /**
    * The number of px needed for the menu can be opened completely, otherwise it closes.
    * Default: 70.
    */
  var tolerance: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set this option to false to disable Slideout touch events.
    * Default: true.
    */
  var touch: js.UndefOr[scala.Boolean] = js.undefined
}

