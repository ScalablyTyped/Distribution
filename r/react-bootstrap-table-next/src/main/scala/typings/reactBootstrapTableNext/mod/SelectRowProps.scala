package typings.reactBootstrapTableNext.mod

import typings.react.mod.CSSProperties
import typings.react.mod.SyntheticEvent
import typings.reactBootstrapTableNext.anon.Checked
import typings.reactBootstrapTableNext.anon.Disabled
import typings.reactBootstrapTableNext.anon.Indeterminate
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.left
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.right
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectRowProps[T] extends js.Object {
  var bgColor: js.UndefOr[String] = js.native
  var classes: js.UndefOr[(js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[String]]) | String] = js.native
  var clickToEdit: js.UndefOr[Boolean] = js.native
  var clickToExpand: js.UndefOr[Boolean] = js.native
  var clickToSelect: js.UndefOr[Boolean] = js.native
  var headerColumnStyle: js.UndefOr[
    (js.Function1[/* status */ TableCheckboxStatus, js.UndefOr[CSSProperties]]) | CSSProperties
  ] = js.native
  var hideSelectAll: js.UndefOr[Boolean] = js.native
  var hideSelectColumn: js.UndefOr[Boolean] = js.native
  var mode: RowSelectionType = js.native
  var nonSelectable: js.UndefOr[js.Array[Double]] = js.native
  var nonSelectableClasses: js.UndefOr[(js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[String]]) | String] = js.native
  var nonSelectableStyle: js.UndefOr[
    (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[CSSProperties]]) | CSSProperties
  ] = js.native
  var onSelect: js.UndefOr[
    js.Function4[
      /* row */ T, 
      /* isSelected */ Boolean, 
      /* rowIndex */ Double, 
      /* e */ SyntheticEvent[Element, Event], 
      Unit | Boolean
    ]
  ] = js.native
  /**
    * This callback function will be called when select/unselect all and it only work when you configure selectRow.mode as checkbox.
    */
  var onSelectAll: js.UndefOr[
    js.Function3[
      /* isSelect */ Boolean, 
      /* rows */ js.Array[T], 
      /* e */ SyntheticEvent[Element, Event], 
      Unit | js.Array[Double]
    ]
  ] = js.native
  var selectColumnPosition: js.UndefOr[left | right] = js.native
  var selectColumnStyle: js.UndefOr[(js.Function1[/* props */ Disabled, js.UndefOr[CSSProperties]]) | CSSProperties] = js.native
  var selected: js.UndefOr[js.Array[Double | String]] = js.native
  var selectionHeaderRenderer: js.UndefOr[js.Function1[/* options */ Indeterminate, typings.react.mod.global.JSX.Element]] = js.native
  var selectionRenderer: js.UndefOr[js.Function1[/* options */ Checked, typings.react.mod.global.JSX.Element]] = js.native
  var style: js.UndefOr[
    (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[CSSProperties]]) | CSSProperties
  ] = js.native
}

object SelectRowProps {
  @scala.inline
  def apply[T](mode: RowSelectionType): SelectRowProps[T] = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectRowProps[T]]
  }
  @scala.inline
  implicit class SelectRowPropsOps[Self <: SelectRowProps[_], T] (val x: Self with SelectRowProps[T]) extends AnyVal {
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
    def setMode(value: RowSelectionType): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgColor(value: String): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    @scala.inline
    def setClassesFunction2(value: (/* row */ T, /* rowIndex */ Double) => js.UndefOr[String]): Self = this.set("classes", js.Any.fromFunction2(value))
    @scala.inline
    def setClasses(value: (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[String]]) | String): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setClickToEdit(value: Boolean): Self = this.set("clickToEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickToEdit: Self = this.set("clickToEdit", js.undefined)
    @scala.inline
    def setClickToExpand(value: Boolean): Self = this.set("clickToExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickToExpand: Self = this.set("clickToExpand", js.undefined)
    @scala.inline
    def setClickToSelect(value: Boolean): Self = this.set("clickToSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickToSelect: Self = this.set("clickToSelect", js.undefined)
    @scala.inline
    def setHeaderColumnStyleFunction1(value: /* status */ TableCheckboxStatus => js.UndefOr[CSSProperties]): Self = this.set("headerColumnStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setHeaderColumnStyle(value: (js.Function1[/* status */ TableCheckboxStatus, js.UndefOr[CSSProperties]]) | CSSProperties): Self = this.set("headerColumnStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderColumnStyle: Self = this.set("headerColumnStyle", js.undefined)
    @scala.inline
    def setHideSelectAll(value: Boolean): Self = this.set("hideSelectAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideSelectAll: Self = this.set("hideSelectAll", js.undefined)
    @scala.inline
    def setHideSelectColumn(value: Boolean): Self = this.set("hideSelectColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideSelectColumn: Self = this.set("hideSelectColumn", js.undefined)
    @scala.inline
    def setNonSelectableVarargs(value: Double*): Self = this.set("nonSelectable", js.Array(value :_*))
    @scala.inline
    def setNonSelectable(value: js.Array[Double]): Self = this.set("nonSelectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonSelectable: Self = this.set("nonSelectable", js.undefined)
    @scala.inline
    def setNonSelectableClassesFunction2(value: (/* row */ T, /* rowIndex */ Double) => js.UndefOr[String]): Self = this.set("nonSelectableClasses", js.Any.fromFunction2(value))
    @scala.inline
    def setNonSelectableClasses(value: (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[String]]) | String): Self = this.set("nonSelectableClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonSelectableClasses: Self = this.set("nonSelectableClasses", js.undefined)
    @scala.inline
    def setNonSelectableStyleFunction2(value: (/* row */ T, /* rowIndex */ Double) => js.UndefOr[CSSProperties]): Self = this.set("nonSelectableStyle", js.Any.fromFunction2(value))
    @scala.inline
    def setNonSelectableStyle(
      value: (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[CSSProperties]]) | CSSProperties
    ): Self = this.set("nonSelectableStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonSelectableStyle: Self = this.set("nonSelectableStyle", js.undefined)
    @scala.inline
    def setOnSelect(
      value: (/* row */ T, /* isSelected */ Boolean, /* rowIndex */ Double, /* e */ SyntheticEvent[Element, Event]) => Unit | Boolean
    ): Self = this.set("onSelect", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnSelectAll(
      value: (/* isSelect */ Boolean, /* rows */ js.Array[T], /* e */ SyntheticEvent[Element, Event]) => Unit | js.Array[Double]
    ): Self = this.set("onSelectAll", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnSelectAll: Self = this.set("onSelectAll", js.undefined)
    @scala.inline
    def setSelectColumnPosition(value: left | right): Self = this.set("selectColumnPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectColumnPosition: Self = this.set("selectColumnPosition", js.undefined)
    @scala.inline
    def setSelectColumnStyleFunction1(value: /* props */ Disabled => js.UndefOr[CSSProperties]): Self = this.set("selectColumnStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectColumnStyle(value: (js.Function1[/* props */ Disabled, js.UndefOr[CSSProperties]]) | CSSProperties): Self = this.set("selectColumnStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectColumnStyle: Self = this.set("selectColumnStyle", js.undefined)
    @scala.inline
    def setSelectedVarargs(value: (Double | String)*): Self = this.set("selected", js.Array(value :_*))
    @scala.inline
    def setSelected(value: js.Array[Double | String]): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSelectionHeaderRenderer(value: /* options */ Indeterminate => typings.react.mod.global.JSX.Element): Self = this.set("selectionHeaderRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelectionHeaderRenderer: Self = this.set("selectionHeaderRenderer", js.undefined)
    @scala.inline
    def setSelectionRenderer(value: /* options */ Checked => typings.react.mod.global.JSX.Element): Self = this.set("selectionRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelectionRenderer: Self = this.set("selectionRenderer", js.undefined)
    @scala.inline
    def setStyleFunction2(value: (/* row */ T, /* rowIndex */ Double) => js.UndefOr[CSSProperties]): Self = this.set("style", js.Any.fromFunction2(value))
    @scala.inline
    def setStyle(
      value: (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[CSSProperties]]) | CSSProperties
    ): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

