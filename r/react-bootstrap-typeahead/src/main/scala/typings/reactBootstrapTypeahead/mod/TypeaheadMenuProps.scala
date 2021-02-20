package typings.reactBootstrapTypeahead.mod

import typings.react.mod.CSSProperties
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent react-bootstrap-typeahead.react-bootstrap-typeahead.MenuProps */
/* Inlined parent std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.AllTypeaheadOwnAndInjectedProps<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadMenuPropsPick> */
@js.native
trait TypeaheadMenuProps[T /* <: TypeaheadModel */] extends StObject {
  
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
  def apply[T /* <: TypeaheadModel */](id: String, options: js.Array[T]): TypeaheadMenuProps[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadMenuProps[T]]
  }
  
  @scala.inline
  implicit class TypeaheadMenuPropsMutableBuilder[Self <: TypeaheadMenuProps[_], T /* <: TypeaheadModel */] (val x: Self with TypeaheadMenuProps[T]) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setEmptyLabel(value: String): Self = StObject.set(x, "emptyLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyLabelUndefined: Self = StObject.set(x, "emptyLabel", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRef(value: LegacyRef[HTMLUListElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ HTMLUListElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    @scala.inline
    def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    @scala.inline
    def setLabelKey(value: TypeaheadLabelKey[T]): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelKeyFunction1(value: T => String): Self = StObject.set(x, "labelKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setNewSelectionPrefix(value: String): Self = StObject.set(x, "newSelectionPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewSelectionPrefixUndefined: Self = StObject.set(x, "newSelectionPrefix", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setRenderMenuItemChildren(
      value: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => ReactNode
    ): Self = StObject.set(x, "renderMenuItemChildren", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderMenuItemChildrenUndefined: Self = StObject.set(x, "renderMenuItemChildren", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
