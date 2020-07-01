package typings.reactBootstrapTypeahead.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadContext<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.HintedInputContextKeys> */
trait HintedInputContext[T /* <: TypeaheadModel */] extends js.Object {
  var hintText: js.UndefOr[String] = js.undefined
  var initialItem: js.UndefOr[T] = js.undefined
  var onAdd: js.UndefOr[js.Function1[/* option */ T, Unit]] = js.undefined
  var selectHintOnEnter: js.UndefOr[Boolean] = js.undefined
}

object HintedInputContext {
  @scala.inline
  def apply[/* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */ T](
    hintText: String = null,
    initialItem: T = null,
    onAdd: /* option */ T => Unit = null,
    selectHintOnEnter: js.UndefOr[Boolean] = js.undefined
  ): HintedInputContext[T] = {
    val __obj = js.Dynamic.literal()
    if (hintText != null) __obj.updateDynamic("hintText")(hintText.asInstanceOf[js.Any])
    if (initialItem != null) __obj.updateDynamic("initialItem")(initialItem.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1(onAdd))
    if (!js.isUndefined(selectHintOnEnter)) __obj.updateDynamic("selectHintOnEnter")(selectHintOnEnter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HintedInputContext[T]]
  }
}

