package typings.reactAce.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorProps
  extends /* index */ StringDictionary[js.Any] {
  
  @JSName("$blockScrolling")
  var $blockScrolling: js.UndefOr[Double | Boolean] = js.native
  
  @JSName("$blockSelectEnabled")
  var $blockSelectEnabled: js.UndefOr[Boolean] = js.native
  
  @JSName("$enableBlockSelect")
  var $enableBlockSelect: js.UndefOr[Boolean] = js.native
  
  @JSName("$enableMultiselect")
  var $enableMultiselect: js.UndefOr[Boolean] = js.native
  
  @JSName("$highlightPending")
  var $highlightPending: js.UndefOr[Boolean] = js.native
  
  @JSName("$highlightTagPending")
  var $highlightTagPending: js.UndefOr[Boolean] = js.native
  
  @JSName("$multiselectOnSessionChange")
  var $multiselectOnSessionChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onAddRange")
  var $onAddRange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onChangeAnnotation")
  var $onChangeAnnotation: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onChangeBackMarker")
  var $onChangeBackMarker: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onChangeBreakpoint")
  var $onChangeBreakpoint: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onChangeFold")
  var $onChangeFold: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onChangeFrontMarker")
  var $onChangeFrontMarker: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onChangeMode")
  var $onChangeMode: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onChangeTabSize")
  var $onChangeTabSize: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onChangeWrapLimit")
  var $onChangeWrapLimit: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onChangeWrapMode")
  var $onChangeWrapMode: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onCursorChange")
  var $onCursorChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onDocumentChange")
  var $onDocumentChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onMultiSelect")
  var $onMultiSelect: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onRemoveRange")
  var $onRemoveRange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onScrollLeftChange")
  var $onScrollLeftChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onScrollTopChange")
  var $onScrollTopChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onSelectionChange")
  var $onSelectionChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onSingleSelect")
  var $onSingleSelect: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  @JSName("$onTokenizerUpdate")
  var $onTokenizerUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}
object IEditorProps {
  
  @scala.inline
  def apply(): IEditorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorProps]
  }
  
  @scala.inline
  implicit class IEditorPropsOps[Self <: IEditorProps] (val x: Self) extends AnyVal {
    
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
    def set$blockScrolling(value: Double | Boolean): Self = this.set("$blockScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$blockScrolling: Self = this.set("$blockScrolling", js.undefined)
    
    @scala.inline
    def set$blockSelectEnabled(value: Boolean): Self = this.set("$blockSelectEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$blockSelectEnabled: Self = this.set("$blockSelectEnabled", js.undefined)
    
    @scala.inline
    def set$enableBlockSelect(value: Boolean): Self = this.set("$enableBlockSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$enableBlockSelect: Self = this.set("$enableBlockSelect", js.undefined)
    
    @scala.inline
    def set$enableMultiselect(value: Boolean): Self = this.set("$enableMultiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$enableMultiselect: Self = this.set("$enableMultiselect", js.undefined)
    
    @scala.inline
    def set$highlightPending(value: Boolean): Self = this.set("$highlightPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$highlightPending: Self = this.set("$highlightPending", js.undefined)
    
    @scala.inline
    def set$highlightTagPending(value: Boolean): Self = this.set("$highlightTagPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$highlightTagPending: Self = this.set("$highlightTagPending", js.undefined)
    
    @scala.inline
    def set$multiselectOnSessionChange(value: /* repeated */ js.Any => _): Self = this.set("$multiselectOnSessionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$multiselectOnSessionChange: Self = this.set("$multiselectOnSessionChange", js.undefined)
    
    @scala.inline
    def set$onAddRange(value: /* repeated */ js.Any => _): Self = this.set("$onAddRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onAddRange: Self = this.set("$onAddRange", js.undefined)
    
    @scala.inline
    def set$onChangeAnnotation(value: /* repeated */ js.Any => _): Self = this.set("$onChangeAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onChangeAnnotation: Self = this.set("$onChangeAnnotation", js.undefined)
    
    @scala.inline
    def set$onChangeBackMarker(value: /* repeated */ js.Any => _): Self = this.set("$onChangeBackMarker", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onChangeBackMarker: Self = this.set("$onChangeBackMarker", js.undefined)
    
    @scala.inline
    def set$onChangeBreakpoint(value: /* repeated */ js.Any => _): Self = this.set("$onChangeBreakpoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onChangeBreakpoint: Self = this.set("$onChangeBreakpoint", js.undefined)
    
    @scala.inline
    def set$onChangeFold(value: /* repeated */ js.Any => _): Self = this.set("$onChangeFold", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onChangeFold: Self = this.set("$onChangeFold", js.undefined)
    
    @scala.inline
    def set$onChangeFrontMarker(value: /* repeated */ js.Any => _): Self = this.set("$onChangeFrontMarker", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onChangeFrontMarker: Self = this.set("$onChangeFrontMarker", js.undefined)
    
    @scala.inline
    def set$onChangeMode(value: /* repeated */ js.Any => _): Self = this.set("$onChangeMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onChangeMode: Self = this.set("$onChangeMode", js.undefined)
    
    @scala.inline
    def set$onChangeTabSize(value: /* repeated */ js.Any => _): Self = this.set("$onChangeTabSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onChangeTabSize: Self = this.set("$onChangeTabSize", js.undefined)
    
    @scala.inline
    def set$onChangeWrapLimit(value: /* repeated */ js.Any => _): Self = this.set("$onChangeWrapLimit", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onChangeWrapLimit: Self = this.set("$onChangeWrapLimit", js.undefined)
    
    @scala.inline
    def set$onChangeWrapMode(value: /* repeated */ js.Any => _): Self = this.set("$onChangeWrapMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onChangeWrapMode: Self = this.set("$onChangeWrapMode", js.undefined)
    
    @scala.inline
    def set$onCursorChange(value: /* repeated */ js.Any => _): Self = this.set("$onCursorChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onCursorChange: Self = this.set("$onCursorChange", js.undefined)
    
    @scala.inline
    def set$onDocumentChange(value: /* repeated */ js.Any => _): Self = this.set("$onDocumentChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onDocumentChange: Self = this.set("$onDocumentChange", js.undefined)
    
    @scala.inline
    def set$onMultiSelect(value: /* repeated */ js.Any => _): Self = this.set("$onMultiSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onMultiSelect: Self = this.set("$onMultiSelect", js.undefined)
    
    @scala.inline
    def set$onRemoveRange(value: /* repeated */ js.Any => _): Self = this.set("$onRemoveRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onRemoveRange: Self = this.set("$onRemoveRange", js.undefined)
    
    @scala.inline
    def set$onScrollLeftChange(value: /* repeated */ js.Any => _): Self = this.set("$onScrollLeftChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onScrollLeftChange: Self = this.set("$onScrollLeftChange", js.undefined)
    
    @scala.inline
    def set$onScrollTopChange(value: /* repeated */ js.Any => _): Self = this.set("$onScrollTopChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onScrollTopChange: Self = this.set("$onScrollTopChange", js.undefined)
    
    @scala.inline
    def set$onSelectionChange(value: /* repeated */ js.Any => _): Self = this.set("$onSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onSelectionChange: Self = this.set("$onSelectionChange", js.undefined)
    
    @scala.inline
    def set$onSingleSelect(value: /* repeated */ js.Any => _): Self = this.set("$onSingleSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onSingleSelect: Self = this.set("$onSingleSelect", js.undefined)
    
    @scala.inline
    def set$onTokenizerUpdate(value: /* repeated */ js.Any => _): Self = this.set("$onTokenizerUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onTokenizerUpdate: Self = this.set("$onTokenizerUpdate", js.undefined)
  }
}
