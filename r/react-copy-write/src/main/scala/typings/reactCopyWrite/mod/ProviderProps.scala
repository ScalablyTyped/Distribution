package typings.reactCopyWrite.mod

import typings.react.mod._Global_.JSX.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps[T] extends js.Object {
  var children: Element | js.Array[Element]
  var initialState: js.UndefOr[Partial[T]] = js.undefined
}

object ProviderProps {
  @scala.inline
  def apply[T](children: Element | js.Array[Element], initialState: Partial[T] = null): ProviderProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps[T]]
  }
}

