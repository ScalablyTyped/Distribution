package typings.reactWindow.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonProps extends StObject {
  
  /**
    * Optional CSS class to attach to outermost <div> element.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Tag name passed to document.createElement to create the inner container element. This is an advanced property; in most cases, the default ("div") should be used.
    */
  var innerElementType: js.UndefOr[ReactElementType] = js.undefined
  
  /**
    * Ref to attach to the inner container element. This is an advanced property.
    */
  var innerRef: js.UndefOr[Ref[js.Any]] = js.undefined
  
  /**
    * Tag name passed to document.createElement to create the inner container element. This is an advanced property; in most cases, the default ("div") should be used.
    *
    * @deprecated since 1.4.0
    */
  var innerTagName: js.UndefOr[String] = js.undefined
  
  /**
    * Contextual data to be passed to the item renderer as a data prop. This is a light-weight alternative to React's built-in context API.
    *
    * Item data is useful for item renderers that are class components.
    */
  var itemData: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Tag name passed to document.createElement to create the outer container element. This is an advanced property; in most cases, the default ("div") should be used.
    */
  var outerElementType: js.UndefOr[ReactElementType] = js.undefined
  
  /**
    * Ref to attach to the outer container element. This is an advanced property.
    */
  var outerRef: js.UndefOr[Ref[js.Any]] = js.undefined
  
  /**
    * Tag name passed to document.createElement to create the outer container element. This is an advanced property; in most cases, the default ("div") should be used.
    *
    * @deprecated since 1.4.0
    */
  var outerTagName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional inline style to attach to outermost <div> element.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * Adds an additional isScrolling parameter to the children render function. This parameter can be used to show a placeholder row or column while the list is being scrolled.
    *
    * Note that using this parameter will result in an additional render call after scrolling has stopped (when isScrolling changes from true to false).
    */
  var useIsScrolling: js.UndefOr[Boolean] = js.undefined
}
object CommonProps {
  
  inline def apply(): CommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonProps]
  }
  
  extension [Self <: CommonProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setInnerElementType(value: ReactElementType): Self = StObject.set(x, "innerElementType", value.asInstanceOf[js.Any])
    
    inline def setInnerElementTypeUndefined: Self = StObject.set(x, "innerElementType", js.undefined)
    
    inline def setInnerRef(value: Ref[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    inline def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
    
    inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    inline def setInnerTagName(value: String): Self = StObject.set(x, "innerTagName", value.asInstanceOf[js.Any])
    
    inline def setInnerTagNameUndefined: Self = StObject.set(x, "innerTagName", js.undefined)
    
    inline def setItemData(value: js.Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    inline def setOuterElementType(value: ReactElementType): Self = StObject.set(x, "outerElementType", value.asInstanceOf[js.Any])
    
    inline def setOuterElementTypeUndefined: Self = StObject.set(x, "outerElementType", js.undefined)
    
    inline def setOuterRef(value: Ref[js.Any]): Self = StObject.set(x, "outerRef", value.asInstanceOf[js.Any])
    
    inline def setOuterRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "outerRef", js.Any.fromFunction1(value))
    
    inline def setOuterRefNull: Self = StObject.set(x, "outerRef", null)
    
    inline def setOuterRefUndefined: Self = StObject.set(x, "outerRef", js.undefined)
    
    inline def setOuterTagName(value: String): Self = StObject.set(x, "outerTagName", value.asInstanceOf[js.Any])
    
    inline def setOuterTagNameUndefined: Self = StObject.set(x, "outerTagName", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUseIsScrolling(value: Boolean): Self = StObject.set(x, "useIsScrolling", value.asInstanceOf[js.Any])
    
    inline def setUseIsScrollingUndefined: Self = StObject.set(x, "useIsScrolling", js.undefined)
  }
}
