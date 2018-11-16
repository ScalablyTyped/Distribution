package typings
package spinDotJsLib.spinDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spin.js", "Spinner")
@js.native
class Spinner () extends js.Object {
  def this(opts: spinDotJsLib.spinneroptionsMod.SpinnerOptions) = this()
  var animateId: js.Any = js.native
  /**
       * The Spinner's HTML element - can be used to manually insert the spinner into the DOM
       */
  var el: js.UndefOr[stdLib.HTMLElement] = js.native
  var opts: js.Any = js.native
  /**
       * Adds the spinner to the given target element. If this instance is already
       * spinning, it is automatically removed from its previous target by calling
       * stop() internally.
       */
  def spin(): this.type = js.native
  /**
       * Adds the spinner to the given target element. If this instance is already
       * spinning, it is automatically removed from its previous target by calling
       * stop() internally.
       */
  def spin(target: stdLib.HTMLElement): this.type = js.native
  /**
       * Stops and removes the Spinner.
       * Stopped spinners may be reused by calling spin() again.
       */
  def stop(): this.type = js.native
}

