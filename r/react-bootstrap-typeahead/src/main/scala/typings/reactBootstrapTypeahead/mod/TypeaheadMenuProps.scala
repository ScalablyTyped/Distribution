package typings.reactBootstrapTypeahead.mod

import typings.react.mod.CSSProperties
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-bootstrap-typeahead.react-bootstrap-typeahead.MenuProps */
/* Inlined parent std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.AllTypeaheadOwnAndInjectedProps<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadMenuPropsPick> */
trait TypeaheadMenuProps[T /* <: TypeaheadModel */] extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var emptyLabel: js.UndefOr[String] = js.undefined
  var id: String
  var innerRef: js.UndefOr[LegacyRef[HTMLUListElement]] = js.undefined
  var labelKey: js.UndefOr[TypeaheadLabelKey[T]] = js.undefined
  var maxHeight: js.UndefOr[String] = js.undefined
  var newSelectionPrefix: js.UndefOr[String] = js.undefined
  var options: js.Array[T]
  var renderMenuItemChildren: js.UndefOr[
    js.Function3[
      /* option */ TypeaheadResult[T], 
      /* props */ TypeaheadMenuProps[T], 
      /* index */ Double, 
      ReactNode
    ]
  ] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object TypeaheadMenuProps {
  @scala.inline
  def apply[/* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */ T](
    id: String,
    options: js.Array[T],
    className: String = null,
    emptyLabel: String = null,
    innerRef: js.UndefOr[Null | LegacyRef[HTMLUListElement]] = js.undefined,
    labelKey: TypeaheadLabelKey[T] = null,
    maxHeight: String = null,
    newSelectionPrefix: String = null,
    renderMenuItemChildren: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => ReactNode = null,
    style: CSSProperties = null,
    text: String = null
  ): TypeaheadMenuProps[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (emptyLabel != null) __obj.updateDynamic("emptyLabel")(emptyLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRef)) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (newSelectionPrefix != null) __obj.updateDynamic("newSelectionPrefix")(newSelectionPrefix.asInstanceOf[js.Any])
    if (renderMenuItemChildren != null) __obj.updateDynamic("renderMenuItemChildren")(js.Any.fromFunction3(renderMenuItemChildren))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadMenuProps[T]]
  }
}

