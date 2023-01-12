package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutationObserverInit extends StObject {
  
  /** Set to a list of attribute local names (without namespace) if not all attribute mutations need to be observed and attributes is true or omitted. */
  /* standard dom */
  var attributeFilter: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  /** Set to true if attributes is true or omitted and target's attribute value before the mutation needs to be recorded. */
  /* standard dom */
  var attributeOldValue: js.UndefOr[scala.Boolean] = js.undefined
  
  /** Set to true if mutations to target's attributes are to be observed. Can be omitted if attributeOldValue or attributeFilter is specified. */
  /* standard dom */
  var attributes: js.UndefOr[scala.Boolean] = js.undefined
  
  /** Set to true if mutations to target's data are to be observed. Can be omitted if characterDataOldValue is specified. */
  /* standard dom */
  var characterData: js.UndefOr[scala.Boolean] = js.undefined
  
  /** Set to true if characterData is set to true or omitted and target's data before the mutation needs to be recorded. */
  /* standard dom */
  var characterDataOldValue: js.UndefOr[scala.Boolean] = js.undefined
  
  /** Set to true if mutations to target's children are to be observed. */
  /* standard dom */
  var childList: js.UndefOr[scala.Boolean] = js.undefined
  
  /** Set to true if mutations to not just target, but also target's descendants are to be observed. */
  /* standard dom */
  var subtree: js.UndefOr[scala.Boolean] = js.undefined
}
object MutationObserverInit {
  
  inline def apply(): MutationObserverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationObserverInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MutationObserverInit] (val x: Self) extends AnyVal {
    
    inline def setAttributeFilter(value: js.Array[java.lang.String]): Self = StObject.set(x, "attributeFilter", value.asInstanceOf[js.Any])
    
    inline def setAttributeFilterUndefined: Self = StObject.set(x, "attributeFilter", js.undefined)
    
    inline def setAttributeFilterVarargs(value: java.lang.String*): Self = StObject.set(x, "attributeFilter", js.Array(value*))
    
    inline def setAttributeOldValue(value: scala.Boolean): Self = StObject.set(x, "attributeOldValue", value.asInstanceOf[js.Any])
    
    inline def setAttributeOldValueUndefined: Self = StObject.set(x, "attributeOldValue", js.undefined)
    
    inline def setAttributes(value: scala.Boolean): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setCharacterData(value: scala.Boolean): Self = StObject.set(x, "characterData", value.asInstanceOf[js.Any])
    
    inline def setCharacterDataOldValue(value: scala.Boolean): Self = StObject.set(x, "characterDataOldValue", value.asInstanceOf[js.Any])
    
    inline def setCharacterDataOldValueUndefined: Self = StObject.set(x, "characterDataOldValue", js.undefined)
    
    inline def setCharacterDataUndefined: Self = StObject.set(x, "characterData", js.undefined)
    
    inline def setChildList(value: scala.Boolean): Self = StObject.set(x, "childList", value.asInstanceOf[js.Any])
    
    inline def setChildListUndefined: Self = StObject.set(x, "childList", js.undefined)
    
    inline def setSubtree(value: scala.Boolean): Self = StObject.set(x, "subtree", value.asInstanceOf[js.Any])
    
    inline def setSubtreeUndefined: Self = StObject.set(x, "subtree", js.undefined)
  }
}
