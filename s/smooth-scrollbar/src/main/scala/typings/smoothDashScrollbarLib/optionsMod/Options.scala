package typings
package smoothDashScrollbarLib.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/options", "Options")
@js.native
class Options () extends js.Object {
  def this(config: stdLib.Partial[smoothDashScrollbarLib.interfacesScrollbarMod.ScrollbarOptions]) = this()
  /**
    * Keep scrollbar tracks visible
    */
  var alwaysShowTracks: scala.Boolean = js.native
  /**
    * Set to `true` to allow outer scrollbars continue scrolling
    * when current scrollbar reaches edge.
    */
  var continuousScrolling: scala.Boolean = js.native
  /**
    * Momentum reduction damping factor, a float value between `(0, 1)`.
    * The lower the value is, the more smooth the scrolling will be
    * (also the more paint frames).
    */
  var damping: scala.Double = js.native
  /**
    * Delegate wheel events and touch events to the given element.
    * By default, the container element is used.
    * This option will be useful for dealing with fixed elements.
    */
  var delegateTo: stdLib.EventTarget | scala.Null = js.native
  /**
    * Options for plugins. Syntax:
    *   plugins[pluginName] = pluginOptions: any
    */
  val plugins: js.Any = js.native
  /**
    * Render every frame in integer pixel values
    * set to `true` to improve scrolling performance.
    */
  var renderByPixels: scala.Boolean = js.native
  /**
    * Minimal size for scrollbar thumbs.
    */
  var thumbMinSize: scala.Double = js.native
  var wheelEventTarget: stdLib.EventTarget | scala.Null = js.native
}

