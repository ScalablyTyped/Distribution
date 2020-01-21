package typings.reactCopyWrite.mod

import typings.react.mod._Global_.JSX.Element
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactCopyWrite.mod.ConsumerPropsExplicitRender[T]
  - typings.reactCopyWrite.mod.ConsumerPropsImplicitRender[T]
*/
trait ConsumerProps[T] extends js.Object

object ConsumerProps {
  @scala.inline
  def ConsumerPropsExplicitRender[T](
    render: /* repeated */ ReturnType[SelectorFn[T]] => Element | js.Array[Element] | Null = null,
    select: js.Array[SelectorFn[T]] = null
  ): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerProps[T]]
  }
  @scala.inline
  def ConsumerPropsImplicitRender[T](
    children: /* repeated */ ReturnType[SelectorFn[T]] => Element | js.Array[Element] | Null = null,
    select: js.Array[SelectorFn[T]] = null
  ): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerProps[T]]
  }
}

