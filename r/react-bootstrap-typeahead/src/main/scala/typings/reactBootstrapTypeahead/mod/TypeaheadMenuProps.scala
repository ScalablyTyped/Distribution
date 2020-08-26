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
@js.native
trait TypeaheadMenuProps[T /* <: TypeaheadModel */] extends js.Object {
  var className: js.UndefOr[String] = js.native
  var emptyLabel: js.UndefOr[String] = js.native
  var id: String = js.native
  var innerRef: js.UndefOr[LegacyRef[HTMLUListElement]] = js.native
  var labelKey: js.UndefOr[TypeaheadLabelKey[T]] = js.native
  var maxHeight: js.UndefOr[String] = js.native
  var newSelectionPrefix: js.UndefOr[String] = js.native
  var options: js.Array[T] = js.native
  var renderMenuItemChildren: js.UndefOr[
    js.Function3[
      /* option */ TypeaheadResult[T], 
      /* props */ TypeaheadMenuProps[T], 
      /* index */ Double, 
      ReactNode
    ]
  ] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var text: js.UndefOr[String] = js.native
}

object TypeaheadMenuProps {
  @scala.inline
  def apply[/* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */ T](id: String, options: js.Array[T]): TypeaheadMenuProps[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadMenuProps[T]]
  }
  @scala.inline
  implicit class TypeaheadMenuPropsOps[Self <: TypeaheadMenuProps[_], /* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */ T] (val x: Self with TypeaheadMenuProps[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsVarargs(value: T*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[T]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setEmptyLabel(value: String): Self = this.set("emptyLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyLabel: Self = this.set("emptyLabel", js.undefined)
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ HTMLUListElement | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRef(value: LegacyRef[HTMLUListElement]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    @scala.inline
    def setLabelKeyFunction1(value: T => String): Self = this.set("labelKey", js.Any.fromFunction1(value))
    @scala.inline
    def setLabelKey(value: TypeaheadLabelKey[T]): Self = this.set("labelKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelKey: Self = this.set("labelKey", js.undefined)
    @scala.inline
    def setMaxHeight(value: String): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setNewSelectionPrefix(value: String): Self = this.set("newSelectionPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewSelectionPrefix: Self = this.set("newSelectionPrefix", js.undefined)
    @scala.inline
    def setRenderMenuItemChildren(
      value: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => ReactNode
    ): Self = this.set("renderMenuItemChildren", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRenderMenuItemChildren: Self = this.set("renderMenuItemChildren", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

