package typings.reactWindow.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonProps extends StObject {
  
  /**
    * Optional CSS class to attach to outermost <div> element.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Tag name passed to document.createElement to create the inner container element. This is an advanced property; in most cases, the default ("div") should be used.
    */
  var innerElementType: js.UndefOr[ReactElementType] = js.native
  
  /**
    * Ref to attach to the inner container element. This is an advanced property.
    */
  var innerRef: js.UndefOr[Ref[_]] = js.native
  
  /**
    * Tag name passed to document.createElement to create the inner container element. This is an advanced property; in most cases, the default ("div") should be used.
    *
    * @deprecated since 1.4.0
    */
  var innerTagName: js.UndefOr[String] = js.native
  
  /**
    * Contextual data to be passed to the item renderer as a data prop. This is a light-weight alternative to React's built-in context API.
    *
    * Item data is useful for item renderers that are class components.
    */
  var itemData: js.UndefOr[js.Any] = js.native
  
  /**
    * Tag name passed to document.createElement to create the outer container element. This is an advanced property; in most cases, the default ("div") should be used.
    */
  var outerElementType: js.UndefOr[ReactElementType] = js.native
  
  /**
    * Ref to attach to the outer container element. This is an advanced property.
    */
  var outerRef: js.UndefOr[Ref[_]] = js.native
  
  /**
    * Tag name passed to document.createElement to create the outer container element. This is an advanced property; in most cases, the default ("div") should be used.
    *
    * @deprecated since 1.4.0
    */
  var outerTagName: js.UndefOr[String] = js.native
  
  /**
    * Optional inline style to attach to outermost <div> element.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Adds an additional isScrolling parameter to the children render function. This parameter can be used to show a placeholder row or column while the list is being scrolled.
    *
    * Note that using this parameter will result in an additional render call after scrolling has stopped (when isScrolling changes from true to false).
    */
  var useIsScrolling: js.UndefOr[Boolean] = js.native
}
object CommonProps {
  
  @scala.inline
  def apply(): CommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonProps]
  }
  
  @scala.inline
  implicit class CommonPropsMutableBuilder[Self <: CommonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setInnerElementType(value: ReactElementType): Self = StObject.set(x, "innerElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerElementTypeUndefined: Self = StObject.set(x, "innerElementType", js.undefined)
    
    @scala.inline
    def setInnerRef(value: Ref[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    @scala.inline
    def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    @scala.inline
    def setInnerTagName(value: String): Self = StObject.set(x, "innerTagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerTagNameUndefined: Self = StObject.set(x, "innerTagName", js.undefined)
    
    @scala.inline
    def setItemData(value: js.Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    @scala.inline
    def setOuterElementType(value: ReactElementType): Self = StObject.set(x, "outerElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterElementTypeUndefined: Self = StObject.set(x, "outerElementType", js.undefined)
    
    @scala.inline
    def setOuterRef(value: Ref[_]): Self = StObject.set(x, "outerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "outerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOuterRefNull: Self = StObject.set(x, "outerRef", null)
    
    @scala.inline
    def setOuterRefUndefined: Self = StObject.set(x, "outerRef", js.undefined)
    
    @scala.inline
    def setOuterTagName(value: String): Self = StObject.set(x, "outerTagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterTagNameUndefined: Self = StObject.set(x, "outerTagName", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setUseIsScrolling(value: Boolean): Self = StObject.set(x, "useIsScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseIsScrollingUndefined: Self = StObject.set(x, "useIsScrolling", js.undefined)
  }
}
