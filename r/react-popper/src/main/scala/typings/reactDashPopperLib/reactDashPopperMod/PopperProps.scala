package typings
package reactDashPopperLib.reactDashPopperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperProps extends js.Object {
  var eventsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var innerRef: js.UndefOr[reactDashPopperLib.RefHandler] = js.undefined
  var modifiers: js.UndefOr[popperDotJsLib.popperDotJsMod.Modifiers] = js.undefined
  var placement: js.UndefOr[popperDotJsLib.popperDotJsMod.Placement] = js.undefined
  var positionFixed: js.UndefOr[scala.Boolean] = js.undefined
  var referenceElement: js.UndefOr[popperDotJsLib.popperDotJsMod.ReferenceObject] = js.undefined
  def children(props: PopperChildrenProps): reactLib.reactMod.ReactNs.ReactNode
}

