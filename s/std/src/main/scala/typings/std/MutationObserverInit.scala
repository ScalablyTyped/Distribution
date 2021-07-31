package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutationObserverInit extends StObject {
  
  /**
    * Set to a list of attribute local names (without namespace) if not all attribute mutations need to be observed and attributes is true or omitted.
    */
  var attributeFilter: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  /**
    * Set to true if attributes is true or omitted and target's attribute value before the mutation needs to be recorded.
    */
  var attributeOldValue: js.UndefOr[scala.Boolean] = js.undefined
  
  /**
    * Set to true if mutations to target's attributes are to be observed. Can be omitted if attributeOldValue or attributeFilter is specified.
    */
  var attributes: js.UndefOr[scala.Boolean] = js.undefined
  
  /**
    * Set to true if mutations to target's data are to be observed. Can be omitted if characterDataOldValue is specified.
    */
  var characterData: js.UndefOr[scala.Boolean] = js.undefined
  
  /**
    * Set to true if characterData is set to true or omitted and target's data before the mutation needs to be recorded.
    */
  var characterDataOldValue: js.UndefOr[scala.Boolean] = js.undefined
  
  /**
    * Set to true if mutations to target's children are to be observed.
    */
  var childList: js.UndefOr[scala.Boolean] = js.undefined
  
  /**
    * Set to true if mutations to not just target, but also target's descendants are to be observed.
    */
  var subtree: js.UndefOr[scala.Boolean] = js.undefined
}
object MutationObserverInit {
  
  @scala.inline
  def apply(): MutationObserverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationObserverInit]
  }
  
  @scala.inline
  implicit class MutationObserverInitMutableBuilder[Self <: MutationObserverInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeFilter(value: js.Array[java.lang.String]): Self = StObject.set(x, "attributeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeFilterUndefined: Self = StObject.set(x, "attributeFilter", js.undefined)
    
    @scala.inline
    def setAttributeFilterVarargs(value: java.lang.String*): Self = StObject.set(x, "attributeFilter", js.Array(value :_*))
    
    @scala.inline
    def setAttributeOldValue(value: scala.Boolean): Self = StObject.set(x, "attributeOldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeOldValueUndefined: Self = StObject.set(x, "attributeOldValue", js.undefined)
    
    @scala.inline
    def setAttributes(value: scala.Boolean): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setCharacterData(value: scala.Boolean): Self = StObject.set(x, "characterData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterDataOldValue(value: scala.Boolean): Self = StObject.set(x, "characterDataOldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterDataOldValueUndefined: Self = StObject.set(x, "characterDataOldValue", js.undefined)
    
    @scala.inline
    def setCharacterDataUndefined: Self = StObject.set(x, "characterData", js.undefined)
    
    @scala.inline
    def setChildList(value: scala.Boolean): Self = StObject.set(x, "childList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildListUndefined: Self = StObject.set(x, "childList", js.undefined)
    
    @scala.inline
    def setSubtree(value: scala.Boolean): Self = StObject.set(x, "subtree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtreeUndefined: Self = StObject.set(x, "subtree", js.undefined)
  }
}
