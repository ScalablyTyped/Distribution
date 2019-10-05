package typings.spinDotJs

import typings.spinDotJs.spinnerOptionsMod.SpinnerOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spin.js", JSImport.Namespace)
@js.native
object spinDotJsMod extends js.Object {
  @js.native
  class Spinner () extends js.Object {
    def this(opts: SpinnerOptions) = this()
    var animateId: js.Any = js.native
    /**
      * The Spinner's HTML element - can be used to manually insert the spinner into the DOM
      */
    var el: js.UndefOr[HTMLElement] = js.native
    var opts: js.Any = js.native
    /**
      * Adds the spinner to the given target element. If this instance is already
      * spinning, it is automatically removed from its previous target by calling
      * stop() internally.
      */
    def spin(): this.type = js.native
    def spin(target: HTMLElement): this.type = js.native
    /**
      * Stops and removes the Spinner.
      * Stopped spinners may be reused by calling spin() again.
      */
    def stop(): this.type = js.native
  }
  
}

