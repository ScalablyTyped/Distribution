package typings.reactInstantsearchDom.mod

import typings.react.mod.ComponentType
import typings.reactInstantsearchDom.AnonHit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HitsProps[T] extends js.Object {
  var hitComponent: js.UndefOr[ComponentType[AnonHit[T]]] = js.undefined
}

object HitsProps {
  @scala.inline
  def apply[T](hitComponent: ComponentType[AnonHit[T]] = null): HitsProps[T] = {
    val __obj = js.Dynamic.literal()
    if (hitComponent != null) __obj.updateDynamic("hitComponent")(hitComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitsProps[T]]
  }
}

