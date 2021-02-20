package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICompositeElement
  extends typings.senchaTouch.Ext.dom.ICompositeElementLite {
  
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
      /* eventName */ js.UndefOr[js.Any], 
      /* handler */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* opt */ js.UndefOr[js.Any], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.native
  
  /** [Method] Adds elements to this Composite object
    * @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an Array of DOM elements to add, or another Composite object who's elements should be added.
    * @param root HTMLElement/String The root element of the query or id of the root.
    * @returns Ext.dom.CompositeElementLite This Composite object.
    */
  @JSName("add")
  var add_ICompositeElement: js.UndefOr[
    js.Function2[
      /* els */ js.UndefOr[js.Any], 
      /* root */ js.UndefOr[js.Any], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.native
  
  /** [Method] Calls the passed function for each element in this composite
    * @param fn Function The function to call.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Element.
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("each")
  var each_ICompositeElement: js.UndefOr[
    js.Function2[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.native
  
  /** [Method] Clears this Composite and adds the elements passed
    * @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an array of DOM elements, or another Composite from which to fill this Composite.
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("fill")
  var fill_ICompositeElement: js.UndefOr[
    js.Function1[/* els */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.ICompositeElementLite]
  ] = js.native
  
  /** [Method] Filters this composite to only elements that match the passed selector
    * @param selector String/Function A string CSS selector or a comparison function. The comparison function will be called with the following arguments:
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("filter")
  var filter_ICompositeElement: js.UndefOr[
    js.Function1[
      /* selector */ js.UndefOr[js.Any], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.native
  
  /** [Method] Removes the specified element s
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
    * @param removeDom Boolean true to also remove the element from the document
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("removeElement")
  var removeElement_ICompositeElement: js.UndefOr[
    js.Function2[
      /* el */ js.UndefOr[js.Any], 
      /* removeDom */ js.UndefOr[Boolean], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.native
  
  /** [Method] Replaces the specified element with the passed element
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite to replace.
    * @param replacement String/Ext.Element The id of an element or the Element itself.
    * @param domReplace Boolean true to remove and replace the element in the document too.
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("replaceElement")
  var replaceElement_ICompositeElement: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* replacement */ js.UndefOr[js.Any], 
      /* domReplace */ js.UndefOr[Boolean], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.native
  
  /** [Method] Selects elements based on the passed CSS selector to enable Element methods to be applied to many related elements in
    * @param selector String/HTMLElement[] The CSS selector or an array of elements
    * @param composite Boolean Return a CompositeElement as opposed to a CompositeElementLite. Defaults to false.
    * @returns Ext.dom.CompositeElementLite/Ext.dom.CompositeElement
    */
  @JSName("select")
  var select_ICompositeElement: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[js.Any], 
      /* composite */ js.UndefOr[Boolean], 
      typings.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.native
}
object ICompositeElement {
  
  @scala.inline
  def apply(): ICompositeElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompositeElement]
  }
  
  @scala.inline
  implicit class ICompositeElementMutableBuilder[Self <: ICompositeElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(
      value: (/* els */ js.UndefOr[js.Any], /* root */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* opt */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = StObject.set(x, "addListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setEach(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    @scala.inline
    def setFill(value: /* els */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.ICompositeElementLite): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFilter(value: /* selector */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.ICompositeElementLite): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setRemoveElement(
      value: (/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = StObject.set(x, "removeElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveElementUndefined: Self = StObject.set(x, "removeElement", js.undefined)
    
    @scala.inline
    def setReplaceElement(
      value: (/* el */ js.UndefOr[js.Any], /* replacement */ js.UndefOr[js.Any], /* domReplace */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = StObject.set(x, "replaceElement", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReplaceElementUndefined: Self = StObject.set(x, "replaceElement", js.undefined)
    
    @scala.inline
    def setSelect(
      value: (/* selector */ js.UndefOr[js.Any], /* composite */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
    ): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
