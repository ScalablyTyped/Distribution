package typings
package stripeDashV3Lib.stripeNs.elementsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  def blur(): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  // HTMLElement keeps giving this error for some reason:
  // Cannot find name 'HTMLElement'
  def mount(domElement: js.Any): scala.Unit = js.native
  def on(event: eventTypes, handler: handler): scala.Unit = js.native
  @JSName("on")
  def on_click(
    event: stripeDashV3Lib.stripeDashV3LibStrings.click,
    handler: js.Function1[/* response */ stripeDashV3Lib.Anon_PreventDefault, scala.Unit]
  ): scala.Unit = js.native
  def unmount(): scala.Unit = js.native
  def update(options: ElementsOptions): scala.Unit = js.native
}

