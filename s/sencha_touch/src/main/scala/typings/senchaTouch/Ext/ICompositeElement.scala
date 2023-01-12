package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompositeElement
  extends StObject
     with typings.senchaTouch.Ext.dom.ICompositeElementLite {
  
  /** [Method] fixes scope with flyweight
    * @param eventName Object
    * @param handler Object
    * @param scope Object
    * @param opt Object
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("addListener")
  var addListener_ICompositeElement: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[Any], 
      /* handler */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      /* opt */ js.UndefOr[Any], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.undefined
  
  /** [Method] Adds elements to this Composite object
    * @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an Array of DOM elements to add, or another Composite object who's elements should be added.
    * @param root HTMLElement/String The root element of the query or id of the root.
    * @returns Ext.dom.CompositeElementLite This Composite object.
    */
  @JSName("add")
  var add_ICompositeElement: js.UndefOr[
    js.Function2[
      /* els */ js.UndefOr[Any], 
      /* root */ js.UndefOr[Any], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.undefined
  
  /** [Method] Calls the passed function for each element in this composite
    * @param fn Function The function to call.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Element.
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("each")
  var each_ICompositeElement: js.UndefOr[
    js.Function2[
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.undefined
  
  /** [Method] Clears this Composite and adds the elements passed
    * @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an array of DOM elements, or another Composite from which to fill this Composite.
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("fill")
  var fill_ICompositeElement: js.UndefOr[
    js.Function1[/* els */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.ICompositeElementLite]
  ] = js.undefined
  
  /** [Method] Filters this composite to only elements that match the passed selector
    * @param selector String/Function A string CSS selector or a comparison function. The comparison function will be called with the following arguments:
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("filter")
  var filter_ICompositeElement: js.UndefOr[
    js.Function1[/* selector */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.ICompositeElementLite]
  ] = js.undefined
  
  /** [Method] Removes the specified element s
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
    * @param removeDom Boolean true to also remove the element from the document
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("removeElement")
  var removeElement_ICompositeElement: js.UndefOr[
    js.Function2[
      /* el */ js.UndefOr[Any], 
      /* removeDom */ js.UndefOr[Boolean], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.undefined
  
  /** [Method] Replaces the specified element with the passed element
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite to replace.
    * @param replacement String/Ext.Element The id of an element or the Element itself.
    * @param domReplace Boolean true to remove and replace the element in the document too.
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("replaceElement")
  var replaceElement_ICompositeElement: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[Any], 
      /* replacement */ js.UndefOr[Any], 
      /* domReplace */ js.UndefOr[Boolean], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.undefined
  
  /** [Method] Selects elements based on the passed CSS selector to enable Element methods to be applied to many related elements in
    * @param selector String/HTMLElement[] The CSS selector or an array of elements
    * @param composite Boolean Return a CompositeElement as opposed to a CompositeElementLite. Defaults to false.
    * @returns Ext.dom.CompositeElementLite/Ext.dom.CompositeElement
    */
  @JSName("select")
  var select_ICompositeElement: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[Any], 
      /* composite */ js.UndefOr[Boolean], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.undefined
}
object ICompositeElement {
  
  inline def apply(): ICompositeElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompositeElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICompositeElement] (val x: Self) extends AnyVal {
    
    inline def setAdd(
      value: (/* els */ js.UndefOr[Any], /* root */ js.UndefOr[Any]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setAddListener(
      value: (/* eventName */ js.UndefOr[Any], /* handler */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* opt */ js.UndefOr[Any]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = StObject.set(x, "addListener", js.Any.fromFunction4(value))
    
    inline def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setEach(
      value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
    
    inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    inline def setFill(value: /* els */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.ICompositeElementLite): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFilter(value: /* selector */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.ICompositeElementLite): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setRemoveElement(
      value: (/* el */ js.UndefOr[Any], /* removeDom */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = StObject.set(x, "removeElement", js.Any.fromFunction2(value))
    
    inline def setRemoveElementUndefined: Self = StObject.set(x, "removeElement", js.undefined)
    
    inline def setReplaceElement(
      value: (/* el */ js.UndefOr[Any], /* replacement */ js.UndefOr[Any], /* domReplace */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = StObject.set(x, "replaceElement", js.Any.fromFunction3(value))
    
    inline def setReplaceElementUndefined: Self = StObject.set(x, "replaceElement", js.undefined)
    
    inline def setSelect(
      value: (/* selector */ js.UndefOr[Any], /* composite */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
