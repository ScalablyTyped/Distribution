package typings.reactBootstrapTableNext.mod

import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.left
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.right
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandRowProps[T, K] extends js.Object {
  
  var className: js.UndefOr[
    String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String])
  ] = js.native
  
  var expandByColumnOnly: js.UndefOr[Boolean] = js.native
  
  var expandColumnPosition: js.UndefOr[left | right] = js.native
  
  var expandColumnRenderer: js.UndefOr[js.Function1[/* props */ ExpandColumnRendererProps, Element]] = js.native
  
  var expandHeaderColumnRenderer: js.UndefOr[js.Function1[/* props */ ExpandHeaderColumnRenderer, Element]] = js.native
  
  var expanded: js.UndefOr[js.Array[K]] = js.native
  
  var nonExpandable: js.UndefOr[js.Array[K]] = js.native
  
  var onExpand: js.UndefOr[
    js.Function4[
      /* row */ T, 
      /* isExpand */ Boolean, 
      /* rowIndex */ Double, 
      /* e */ SyntheticEvent[typings.std.Element, Event], 
      Unit
    ]
  ] = js.native
  
  var onExpandAll: js.UndefOr[
    js.Function3[
      /* isExpandAll */ Boolean, 
      /* results */ js.Array[T], 
      /* e */ SyntheticEvent[typings.std.Element, Event], 
      Unit
    ]
  ] = js.native
  
  var onlyOneExpanding: js.UndefOr[Boolean] = js.native
  
  def renderer(row: T, rowIndex: Double): Element = js.native
  
  var showExpandColumn: js.UndefOr[Boolean] = js.native
}
object ExpandRowProps {
  
  @scala.inline
  def apply[T, K](renderer: (T, Double) => Element): ExpandRowProps[T, K] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction2(renderer))
    __obj.asInstanceOf[ExpandRowProps[T, K]]
  }
  
  @scala.inline
  implicit class ExpandRowPropsOps[Self <: ExpandRowProps[_, _], T, K] (val x: Self with (ExpandRowProps[T, K])) extends AnyVal {
    
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
    def setRenderer(value: (T, Double) => Element): Self = this.set("renderer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClassNameFunction3(value: (/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double) => String): Self = this.set("className", js.Any.fromFunction3(value))
    
    @scala.inline
    def setClassName(value: String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String])): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setExpandByColumnOnly(value: Boolean): Self = this.set("expandByColumnOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandByColumnOnly: Self = this.set("expandByColumnOnly", js.undefined)
    
    @scala.inline
    def setExpandColumnPosition(value: left | right): Self = this.set("expandColumnPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandColumnPosition: Self = this.set("expandColumnPosition", js.undefined)
    
    @scala.inline
    def setExpandColumnRenderer(value: /* props */ ExpandColumnRendererProps => Element): Self = this.set("expandColumnRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpandColumnRenderer: Self = this.set("expandColumnRenderer", js.undefined)
    
    @scala.inline
    def setExpandHeaderColumnRenderer(value: /* props */ ExpandHeaderColumnRenderer => Element): Self = this.set("expandHeaderColumnRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpandHeaderColumnRenderer: Self = this.set("expandHeaderColumnRenderer", js.undefined)
    
    @scala.inline
    def setExpandedVarargs(value: K*): Self = this.set("expanded", js.Array(value :_*))
    
    @scala.inline
    def setExpanded(value: js.Array[K]): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setNonExpandableVarargs(value: K*): Self = this.set("nonExpandable", js.Array(value :_*))
    
    @scala.inline
    def setNonExpandable(value: js.Array[K]): Self = this.set("nonExpandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonExpandable: Self = this.set("nonExpandable", js.undefined)
    
    @scala.inline
    def setOnExpand(
      value: (/* row */ T, /* isExpand */ Boolean, /* rowIndex */ Double, /* e */ SyntheticEvent[typings.std.Element, Event]) => Unit
    ): Self = this.set("onExpand", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnExpand: Self = this.set("onExpand", js.undefined)
    
    @scala.inline
    def setOnExpandAll(
      value: (/* isExpandAll */ Boolean, /* results */ js.Array[T], /* e */ SyntheticEvent[typings.std.Element, Event]) => Unit
    ): Self = this.set("onExpandAll", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnExpandAll: Self = this.set("onExpandAll", js.undefined)
    
    @scala.inline
    def setOnlyOneExpanding(value: Boolean): Self = this.set("onlyOneExpanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyOneExpanding: Self = this.set("onlyOneExpanding", js.undefined)
    
    @scala.inline
    def setShowExpandColumn(value: Boolean): Self = this.set("showExpandColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowExpandColumn: Self = this.set("showExpandColumn", js.undefined)
  }
}
