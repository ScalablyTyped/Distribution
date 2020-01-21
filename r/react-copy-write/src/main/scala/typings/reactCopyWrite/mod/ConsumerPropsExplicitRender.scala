package typings.reactCopyWrite.mod

import typings.react.mod._Global_.JSX.Element
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerPropsExplicitRender[T]
  extends ConsumerPropsBase[T]
     with ConsumerProps[T] {
  var render: js.UndefOr[RenderFn[T]] = js.undefined
}

object ConsumerPropsExplicitRender {
  @scala.inline
  def apply[T](
    render: /* repeated */ ReturnType[SelectorFn[T]] => Element | js.Array[Element] | Null = null,
    select: js.Array[SelectorFn[T]] = null
  ): ConsumerPropsExplicitRender[T] = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerPropsExplicitRender[T]]
  }
}

