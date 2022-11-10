package typings.reactBootstrapTypeahead.mod

import typings.react.mod.CSSProperties
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent react-bootstrap-typeahead.react-bootstrap-typeahead.MenuProps */
/* Inlined parent std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.AllTypeaheadOwnAndInjectedProps<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadMenuPropsPick> */
trait TypeaheadMenuProps[T /* <: TypeaheadModel */] extends StObject {
  
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var emptyLabel: js.UndefOr[ReactNode] = js.undefined
  
  var id: String
  
  var innerRef: js.UndefOr[LegacyRef[HTMLUListElement]] = js.undefined
  
  var inputHeight: js.UndefOr[Double] = js.undefined
  
  var labelKey: js.UndefOr[TypeaheadLabelKey[T]] = js.undefined
  
  var maxHeight: js.UndefOr[String] = js.undefined
  
  var newSelectionPrefix: js.UndefOr[ReactNode] = js.undefined
  
  var options: js.Array[T]
  
  var paginationText: js.UndefOr[String] = js.undefined
  
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
  
  inline def apply[T /* <: TypeaheadModel */](id: String, options: js.Array[T]): TypeaheadMenuProps[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadMenuProps[T]]
  }
  
  extension [Self <: TypeaheadMenuProps[?], T /* <: TypeaheadModel */](x: Self & TypeaheadMenuProps[T]) {
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setEmptyLabel(value: ReactNode): Self = StObject.set(x, "emptyLabel", value.asInstanceOf[js.Any])
    
    inline def setEmptyLabelUndefined: Self = StObject.set(x, "emptyLabel", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInnerRef(value: LegacyRef[HTMLUListElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    inline def setInnerRefFunction1(value: /* instance */ HTMLUListElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
    
    inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    inline def setInputHeight(value: Double): Self = StObject.set(x, "inputHeight", value.asInstanceOf[js.Any])
    
    inline def setInputHeightUndefined: Self = StObject.set(x, "inputHeight", js.undefined)
    
    inline def setLabelKey(value: TypeaheadLabelKey[T]): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    inline def setLabelKeyFunction1(value: T => String): Self = StObject.set(x, "labelKey", js.Any.fromFunction1(value))
    
    inline def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
    
    inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setNewSelectionPrefix(value: ReactNode): Self = StObject.set(x, "newSelectionPrefix", value.asInstanceOf[js.Any])
    
    inline def setNewSelectionPrefixUndefined: Self = StObject.set(x, "newSelectionPrefix", js.undefined)
    
    inline def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPaginationText(value: String): Self = StObject.set(x, "paginationText", value.asInstanceOf[js.Any])
    
    inline def setPaginationTextUndefined: Self = StObject.set(x, "paginationText", js.undefined)
    
    inline def setRenderMenuItemChildren(
      value: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => ReactNode
    ): Self = StObject.set(x, "renderMenuItemChildren", js.Any.fromFunction3(value))
    
    inline def setRenderMenuItemChildrenUndefined: Self = StObject.set(x, "renderMenuItemChildren", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
