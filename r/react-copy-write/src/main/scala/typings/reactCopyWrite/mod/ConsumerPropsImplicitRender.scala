package typings.reactCopyWrite.mod

import typings.react.mod._Global_.JSX.Element
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerPropsImplicitRender[T]
  extends ConsumerPropsBase[T]
     with ConsumerProps[T] {
  var children: js.UndefOr[RenderFn[T]] = js.undefined
}

object ConsumerPropsImplicitRender {
  @scala.inline
  def apply[T](
    children: /* repeated */ ReturnType[SelectorFn[T]] => Element | js.Array[Element] | Null = null,
    select: js.Array[SelectorFn[T]] = null
  ): ConsumerPropsImplicitRender[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerPropsImplicitRender[T]]
  }
}

