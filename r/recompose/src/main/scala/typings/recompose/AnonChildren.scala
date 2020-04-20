package typings.recompose

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren[TInner] extends js.Object {
  def children(props: TInner): ReactElement
}

object AnonChildren {
  @scala.inline
  def apply[TInner](children: TInner => ReactElement): AnonChildren[TInner] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[AnonChildren[TInner]]
  }
}

