package typings.reactDashHelmet.reactDashHelmetMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetDatum extends js.Object {
  def toComponent(): Component[_, js.Object, _]
}

object HelmetDatum {
  @scala.inline
  def apply(toComponent: () => Component[_, js.Object, _]): HelmetDatum = {
    val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent))
  
    __obj.asInstanceOf[HelmetDatum]
  }
}

