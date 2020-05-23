package typings.recompose.anon

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children[TInner] extends js.Object {
  def children(props: TInner): ReactElement
}

object Children {
  @scala.inline
  def apply[TInner](children: TInner => ReactElement): Children[TInner] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[Children[TInner]]
  }
}

