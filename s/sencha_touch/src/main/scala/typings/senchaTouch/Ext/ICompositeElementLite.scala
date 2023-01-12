package typings.senchaTouch.Ext

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompositeElementLite
  extends StObject
     with typings.senchaTouch.Ext.dom.IElement {
  
  /** [Method] Adds elements to this Composite object
    * @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an Array of DOM elements to add, or another Composite object who's elements should be added.
    * @param root HTMLElement/String The root element of the query or id of the root.
    * @returns Ext.dom.CompositeElementLite This Composite object.
    */
  var add: js.UndefOr[js.Function2[/* els */ js.UndefOr[Any], /* root */ js.UndefOr[Any], this.type]] = js.undefined
  
  /** [Method] Adds the given CSS class es to this Element
    * @param names String The CSS class(es) to add to this element.
    * @param prefix String Prefix to prepend to each class.
    * @param suffix String Suffix to append to each class.
    * @returns Ext.dom.Element this
    */
  @JSName("addCls")
  var addCls_ICompositeElementLite: js.UndefOr[
    js.Function3[
      /* names */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      typings.senchaTouch.Ext.dom.IElement
    ]
  ] = js.undefined
  
  /** [Method] fixes scope with flyweight
    * @param eventName Object
    * @param handler Object
    * @param scope Object
    * @param opt Object
    * @returns Ext.dom.CompositeElementLite this
    */
  @JSName("addListener")
  var addListener_ICompositeElementLite: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[Any], 
      /* handler */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      /* opt */ js.UndefOr[Any], 
      this.type
    ]
  ] = js.undefined
  
  /** [Method] Appends the passed element s to this element
    * @param element HTMLElement/Ext.dom.Element a DOM Node or an existing Element.
    * @returns Ext.dom.Element This element.
    */
  @JSName("appendChild")
  var appendChild_ICompositeElementLite: js.UndefOr[
    js.Function1[/* element */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.IElement]
  ] = js.undefined
  
  /** [Method] Appends this element to the passed element
    * @param el String/HTMLElement/Ext.dom.Element The new parent element. The id of the node, a DOM Node or an existing Element.
    * @returns Ext.dom.Element This element.
    */
  @JSName("appendTo")
  var appendTo_ICompositeElementLite: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] More flexible version of setStyle for setting style properties
    * @param styles String/Object/Function A style specification string, e.g. "width:100px", or object in the form {width:"100px"}, or a function which returns such a specification.
    * @returns Ext.dom.Element this
    */
  @JSName("applyStyles")
  var applyStyles_ICompositeElementLite: js.UndefOr[js.Function1[/* styles */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Removes all elements  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Creates the passed DomHelper config and appends it to this element or optionally inserts it before the passed child e
    * @param config Object DomHelper element config object. If no tag is specified (e.g., {tag:'input'}) then a div will be automatically generated with the specified attributes.
    * @param insertBefore HTMLElement a child element of this element.
    * @param returnDom Boolean true to return the dom node instead of creating an Element.
    * @returns Ext.dom.Element The new child element.
    */
  @JSName("createChild")
  var createChild_ICompositeElementLite: js.UndefOr[
    js.Function3[
      /* config */ js.UndefOr[Any], 
      /* insertBefore */ js.UndefOr[HTMLElement], 
      /* returnDom */ js.UndefOr[Boolean], 
      typings.senchaTouch.Ext.dom.IElement
    ]
  ] = js.undefined
  
  /** [Method] Calls the passed function for each element in this composite
    * @param fn Function The function to call.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Element.
    * @returns Ext.dom.CompositeElementLite this
    */
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], this.type]] = js.undefined
  
  /** [Property] (HTMLElement[]) */
  var elements: js.UndefOr[Array] = js.undefined
  
  /** [Method] Clears this Composite and adds the elements passed
    * @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an array of DOM elements, or another Composite from which to fill this Composite.
    * @returns Ext.dom.CompositeElementLite this
    */
  var fill: js.UndefOr[js.Function1[/* els */ js.UndefOr[Any], this.type]] = js.undefined
  
  /** [Method] Filters this composite to only elements that match the passed selector
    * @param selector String/Function A string CSS selector or a comparison function. The comparison function will be called with the following arguments:
    * @returns Ext.dom.CompositeElementLite this
    */
  var filter: js.UndefOr[js.Function1[/* selector */ js.UndefOr[Any], this.type]] = js.undefined
  
  /** [Method] Returns the number of elements in this Composite
    * @returns Number
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Find the index of the passed element within the composite collection
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.dom.Element, or an HtmlElement to find within the composite collection.
    * @returns Number The index of the passed Ext.dom.Element in the composite collection, or -1 if not found.
    */
  var indexOf: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], Double]] = js.undefined
  
  /** [Method] Inserts this element after the passed element in the DOM
    * @param el String/HTMLElement/Ext.dom.Element The element to insert after. The id of the node, a DOM Node or an existing Element.
    * @returns Ext.dom.Element This element.
    */
  @JSName("insertAfter")
  var insertAfter_ICompositeElementLite: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Inserts this element before the passed element in the DOM
    * @param el String/HTMLElement/Ext.dom.Element The element before which this element will be inserted. The id of the node, a DOM Node or an existing Element.
    * @returns Ext.dom.Element This element.
    */
  @JSName("insertBefore")
  var insertBefore_ICompositeElementLite: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Inserts an element as the first child of this element
    * @param element String/HTMLElement/Ext.dom.Element The id or element to insert.
    * @returns Ext.dom.Element this
    */
  @JSName("insertFirst")
  var insertFirst_ICompositeElementLite: js.UndefOr[
    js.Function1[/* element */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.IElement]
  ] = js.undefined
  
  /** [Method] Inserts or creates the passed element or DomHelper config as a sibling of this element
    * @param el String/HTMLElement/Ext.dom.Element/Object/Array The id, element to insert or a DomHelper config to create and insert or an array of any of those.
    * @param where String 'before' or 'after'.
    * @param returnDom Boolean true to return the raw DOM element instead of Ext.dom.Element.
    * @returns Ext.dom.Element The inserted Element. If an array is passed, the last inserted element is returned.
    */
  @JSName("insertSibling")
  var insertSibling_ICompositeElementLite: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[Any], 
      /* where */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[Boolean], 
      typings.senchaTouch.Ext.dom.IElement
    ]
  ] = js.undefined
  
  /** [Method] Returns a flyweight Element of the dom element object at the specified index
    * @param index Number
    * @returns Ext.dom.Element
    */
  var item: js.UndefOr[
    js.Function1[/* index */ js.UndefOr[Double], typings.senchaTouch.Ext.dom.IElement]
  ] = js.undefined
  
  /** [Method] Adds one or more CSS classes to this element and removes the same class es from all siblings
    * @param className String/String[] The CSS class to add, or an array of classes.
    * @returns Ext.dom.Element this
    */
  @JSName("radioCls")
  var radioCls_ICompositeElementLite: js.UndefOr[
    js.Function1[/* className */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.IElement]
  ] = js.undefined
  
  /** [Method] Removes the given CSS class es from this Element
    * @param names String The CSS class(es) to remove from this element.
    * @param prefix String Prefix to prepend to each class to be removed.
    * @param suffix String Suffix to append to each class to be removed.
    * @returns Ext.dom.Element this
    */
  @JSName("removeCls")
  var removeCls_ICompositeElementLite: js.UndefOr[
    js.Function3[
      /* names */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      typings.senchaTouch.Ext.dom.IElement
    ]
  ] = js.undefined
  
  /** [Method] Removes the specified element s
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
    * @param removeDom Boolean true to also remove the element from the document
    * @returns Ext.dom.CompositeElementLite this
    */
  var removeElement: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[Any], /* removeDom */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  
  /** [Method] Forces the browser to repaint this element
    * @returns Ext.dom.Element this
    */
  @JSName("repaint")
  var repaint_ICompositeElementLite: js.UndefOr[js.Function0[typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Replaces a CSS class on the element with another
    * @param oldName String The CSS class to replace.
    * @param newName String The replacement CSS class.
    * @param prefix String Prefix to prepend to each class to be replaced.
    * @param suffix String Suffix to append to each class to be replaced.
    * @returns Ext.dom.Element this
    */
  @JSName("replaceCls")
  var replaceCls_ICompositeElementLite: js.UndefOr[
    js.Function4[
      /* oldName */ js.UndefOr[java.lang.String], 
      /* newName */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      typings.senchaTouch.Ext.dom.IElement
    ]
  ] = js.undefined
  
  /** [Method] Replaces the specified element with the passed element
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite to replace.
    * @param replacement String/Ext.Element The id of an element or the Element itself.
    * @param domReplace Boolean true to remove and replace the element in the document too.
    * @returns Ext.dom.CompositeElementLite this
    */
  var replaceElement: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[Any], 
      /* replacement */ js.UndefOr[Any], 
      /* domReplace */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  
  /** [Method] Replaces this element with the passed element
    * @param el String/HTMLElement/Ext.dom.Element/Object The new element (id of the node, a DOM Node or an existing Element) or a DomHelper config of an element to create.
    * @returns Ext.dom.Element This element.
    */
  @JSName("replaceWith")
  var replaceWith_ICompositeElementLite: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Replaces the passed element with this element
    * @param element String/HTMLElement/Ext.dom.Element The element to replace. The id of the node, a DOM Node or an existing Element.
    * @returns Ext.dom.Element This element.
    */
  @JSName("replace")
  var replace_ICompositeElementLite: js.UndefOr[
    js.Function1[/* element */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.IElement]
  ] = js.undefined
  
  /** [Method] Selects elements based on the passed CSS selector to enable Element methods to be applied to many related elements in
    * @param selector String/HTMLElement[] The CSS selector or an array of elements
    * @param composite Boolean Return a CompositeElement as opposed to a CompositeElementLite. Defaults to false.
    * @returns Ext.dom.CompositeElementLite/Ext.dom.CompositeElement
    */
  var select: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[Any], /* composite */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  
  /** [Method] Sets the element s CSS bottom style
    * @param bottom String The bottom CSS property value.
    * @returns Ext.dom.Element this
    */
  @JSName("setBottom")
  var setBottom_ICompositeElementLite: js.UndefOr[
    js.Function1[/* bottom */ js.UndefOr[java.lang.String], typings.senchaTouch.Ext.dom.IElement]
  ] = js.undefined
  
  /** [Method] Sets the element s box
    * @param box Object The box to fill, for example: {  left: ...,  top: ...,  width: ...,  height: ... }
    * @returns Ext.dom.Element this
    */
  @JSName("setBox")
  var setBox_ICompositeElementLite: js.UndefOr[js.Function1[/* box */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Set the height of this Element
    * @param height Number/String The new height.
    * @returns Ext.dom.Element this
    */
  @JSName("setHeight")
  var setHeight_ICompositeElementLite: js.UndefOr[js.Function1[/* height */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Sets the element s left position directly using CSS style instead of setX
    * @param left String The left CSS property value.
    * @returns Ext.dom.Element this
    */
  @JSName("setLeft")
  var setLeft_ICompositeElementLite: js.UndefOr[
    js.Function1[/* left */ js.UndefOr[java.lang.String], typings.senchaTouch.Ext.dom.IElement]
  ] = js.undefined
  
  /** [Method] Set the maximum height of this Element
    * @param height Number/String The new maximum height.
    * @returns Ext.dom.Element this
    */
  @JSName("setMaxHeight")
  var setMaxHeight_ICompositeElementLite: js.UndefOr[js.Function1[/* height */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Set the maximum width of this Element
    * @param width Number/String The new maximum width.
    * @returns Ext.dom.Element this
    */
  @JSName("setMaxWidth")
  var setMaxWidth_ICompositeElementLite: js.UndefOr[js.Function1[/* width */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Set the minimum height of this Element
    * @param height Number/String The new minimum height.
    * @returns Ext.dom.Element this
    */
  @JSName("setMinHeight")
  var setMinHeight_ICompositeElementLite: js.UndefOr[js.Function1[/* height */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Set the minimum width of this Element
    * @param width Number/String The new minimum width.
    * @returns Ext.dom.Element this
    */
  @JSName("setMinWidth")
  var setMinWidth_ICompositeElementLite: js.UndefOr[js.Function1[/* width */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Sets the element s CSS right style
    * @param right String The right CSS property value.
    * @returns Ext.dom.Element this
    */
  @JSName("setRight")
  var setRight_ICompositeElementLite: js.UndefOr[
    js.Function1[/* right */ js.UndefOr[java.lang.String], typings.senchaTouch.Ext.dom.IElement]
  ] = js.undefined
  
  /** [Method] Set the size of this Element
    * @param width Number/String The new width. This may be one of:  A Number specifying the new width in this Element's defaultUnits (by default, pixels). A String used to set the CSS width style. Animation may not be used. A size object in the format {width: widthValue, height: heightValue}.
    * @param height Number/String The new height. This may be one of:  A Number specifying the new height in this Element's defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used.
    * @returns Ext.dom.Element this
    */
  @JSName("setSize")
  var setSize_ICompositeElementLite: js.UndefOr[
    js.Function2[
      /* width */ js.UndefOr[Any], 
      /* height */ js.UndefOr[Any], 
      typings.senchaTouch.Ext.dom.IElement
    ]
  ] = js.undefined
  
  /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
    * @param property String/Object The style property to be set, or an object of multiple styles.
    * @param value String The value to apply to the given property, or null if an object was passed.
    * @returns Ext.dom.Element this
    */
  @JSName("setStyle")
  var setStyle_ICompositeElementLite: js.UndefOr[
    js.Function2[
      /* property */ js.UndefOr[Any], 
      /* value */ js.UndefOr[java.lang.String], 
      typings.senchaTouch.Ext.dom.IElement
    ]
  ] = js.undefined
  
  /** [Method] Sets the element s top position directly using CSS style instead of setY
    * @param top String The top CSS property value.
    * @returns Ext.dom.Element this
    */
  @JSName("setTop")
  var setTop_ICompositeElementLite: js.UndefOr[
    js.Function1[/* top */ js.UndefOr[java.lang.String], typings.senchaTouch.Ext.dom.IElement]
  ] = js.undefined
  
  /** [Method] Use this to change the visibility mode between VISIBILITY DISPLAY or OFFSETS
    * @param mode Object
    * @returns Ext.dom.Element this
    */
  @JSName("setVisibilityMode")
  var setVisibilityMode_ICompositeElementLite: js.UndefOr[js.Function1[/* mode */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Sets the visibility of the element see details
    * @param visible Boolean Whether the element is visible.
    * @returns Ext.Element this
    */
  @JSName("setVisible")
  var setVisible_ICompositeElementLite: js.UndefOr[js.Function1[/* visible */ js.UndefOr[Boolean], IElement]] = js.undefined
  
  /** [Method] Set the width of this Element
    * @param width Number/String The new width.
    * @returns Ext.dom.Element this
    */
  @JSName("setWidth")
  var setWidth_ICompositeElementLite: js.UndefOr[js.Function1[/* width */ js.UndefOr[Any], typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Sets the position of the element in page coordinates regardless of how the element is positioned
    * @param pos Number[] Contains X &amp; Y [x, y] values for new position (coordinates are page-based).
    * @returns Ext.dom.Element this
    */
  @JSName("setXY")
  var setXY_ICompositeElementLite: js.UndefOr[js.Function1[/* pos */ js.UndefOr[Array], typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Sets the X position of the element based on page coordinates
    * @param x Number The X position of the element
    * @returns Ext.dom.Element this
    */
  @JSName("setX")
  var setX_ICompositeElementLite: js.UndefOr[js.Function1[/* x */ js.UndefOr[Double], typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Sets the Y position of the element based on page coordinates
    * @param y Number The Y position of the element.
    * @returns Ext.dom.Element this
    */
  @JSName("setY")
  var setY_ICompositeElementLite: js.UndefOr[js.Function1[/* y */ js.UndefOr[Double], typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Sets the passed attributes as attributes of this element a style attribute can be a string object or function
    * @param attributes Object The object with the attributes.
    * @param useSet Boolean false to override the default setAttribute to use expandos.
    * @returns Ext.dom.Element this
    */
  @JSName("set")
  var set_ICompositeElementLite: js.UndefOr[
    js.Function2[
      /* attributes */ js.UndefOr[Any], 
      /* useSet */ js.UndefOr[Boolean], 
      typings.senchaTouch.Ext.dom.IElement
    ]
  ] = js.undefined
  
  /** [Method] Toggles the specified CSS class on this element removes it if it already exists otherwise adds it
    * @param className String The CSS class to toggle.
    * @returns Ext.dom.Element this
    */
  @JSName("toggleCls")
  var toggleCls_ICompositeElementLite: js.UndefOr[
    js.Function1[/* className */ js.UndefOr[java.lang.String], typings.senchaTouch.Ext.dom.IElement]
  ] = js.undefined
}
object ICompositeElementLite {
  
  inline def apply(): ICompositeElementLite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompositeElementLite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICompositeElementLite] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (/* els */ js.UndefOr[Any], /* root */ js.UndefOr[Any]) => ICompositeElementLite): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setAddCls(
      value: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typings.senchaTouch.Ext.dom.IElement
    ): Self = StObject.set(x, "addCls", js.Any.fromFunction3(value))
    
    inline def setAddClsUndefined: Self = StObject.set(x, "addCls", js.undefined)
    
    inline def setAddListener(
      value: (/* eventName */ js.UndefOr[Any], /* handler */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* opt */ js.UndefOr[Any]) => ICompositeElementLite
    ): Self = StObject.set(x, "addListener", js.Any.fromFunction4(value))
    
    inline def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAppendChild(value: /* element */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    inline def setAppendChildUndefined: Self = StObject.set(x, "appendChild", js.undefined)
    
    inline def setAppendTo(value: /* el */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    inline def setApplyStyles(value: /* styles */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "applyStyles", js.Any.fromFunction1(value))
    
    inline def setApplyStylesUndefined: Self = StObject.set(x, "applyStyles", js.undefined)
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setCreateChild(
      value: (/* config */ js.UndefOr[Any], /* insertBefore */ js.UndefOr[HTMLElement], /* returnDom */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.IElement
    ): Self = StObject.set(x, "createChild", js.Any.fromFunction3(value))
    
    inline def setCreateChildUndefined: Self = StObject.set(x, "createChild", js.undefined)
    
    inline def setEach(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => ICompositeElementLite): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
    
    inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    inline def setElements(value: Array): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setFill(value: /* els */ js.UndefOr[Any] => ICompositeElementLite): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFilter(value: /* selector */ js.UndefOr[Any] => ICompositeElementLite): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    inline def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
    
    inline def setIndexOf(value: /* el */ js.UndefOr[Any] => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
    
    inline def setInsertAfter(value: /* el */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "insertAfter", js.Any.fromFunction1(value))
    
    inline def setInsertAfterUndefined: Self = StObject.set(x, "insertAfter", js.undefined)
    
    inline def setInsertBefore(value: /* el */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "insertBefore", js.Any.fromFunction1(value))
    
    inline def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
    
    inline def setInsertFirst(value: /* element */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "insertFirst", js.Any.fromFunction1(value))
    
    inline def setInsertFirstUndefined: Self = StObject.set(x, "insertFirst", js.undefined)
    
    inline def setInsertSibling(
      value: (/* el */ js.UndefOr[Any], /* where */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.IElement
    ): Self = StObject.set(x, "insertSibling", js.Any.fromFunction3(value))
    
    inline def setInsertSiblingUndefined: Self = StObject.set(x, "insertSibling", js.undefined)
    
    inline def setItem(value: /* index */ js.UndefOr[Double] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setRadioCls(value: /* className */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "radioCls", js.Any.fromFunction1(value))
    
    inline def setRadioClsUndefined: Self = StObject.set(x, "radioCls", js.undefined)
    
    inline def setRemoveCls(
      value: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typings.senchaTouch.Ext.dom.IElement
    ): Self = StObject.set(x, "removeCls", js.Any.fromFunction3(value))
    
    inline def setRemoveClsUndefined: Self = StObject.set(x, "removeCls", js.undefined)
    
    inline def setRemoveElement(value: (/* el */ js.UndefOr[Any], /* removeDom */ js.UndefOr[Boolean]) => ICompositeElementLite): Self = StObject.set(x, "removeElement", js.Any.fromFunction2(value))
    
    inline def setRemoveElementUndefined: Self = StObject.set(x, "removeElement", js.undefined)
    
    inline def setRepaint(value: () => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "repaint", js.Any.fromFunction0(value))
    
    inline def setRepaintUndefined: Self = StObject.set(x, "repaint", js.undefined)
    
    inline def setReplace(value: /* element */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
    
    inline def setReplaceCls(
      value: (/* oldName */ js.UndefOr[java.lang.String], /* newName */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typings.senchaTouch.Ext.dom.IElement
    ): Self = StObject.set(x, "replaceCls", js.Any.fromFunction4(value))
    
    inline def setReplaceClsUndefined: Self = StObject.set(x, "replaceCls", js.undefined)
    
    inline def setReplaceElement(
      value: (/* el */ js.UndefOr[Any], /* replacement */ js.UndefOr[Any], /* domReplace */ js.UndefOr[Boolean]) => ICompositeElementLite
    ): Self = StObject.set(x, "replaceElement", js.Any.fromFunction3(value))
    
    inline def setReplaceElementUndefined: Self = StObject.set(x, "replaceElement", js.undefined)
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setReplaceWith(value: /* el */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1(value))
    
    inline def setReplaceWithUndefined: Self = StObject.set(x, "replaceWith", js.undefined)
    
    inline def setSelect(
      value: (/* selector */ js.UndefOr[Any], /* composite */ js.UndefOr[Boolean]) => ICompositeElementLite
    ): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSet(
      value: (/* attributes */ js.UndefOr[Any], /* useSet */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.IElement
    ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetBottom(value: /* bottom */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setBottom", js.Any.fromFunction1(value))
    
    inline def setSetBottomUndefined: Self = StObject.set(x, "setBottom", js.undefined)
    
    inline def setSetBox(value: /* box */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setBox", js.Any.fromFunction1(value))
    
    inline def setSetBoxUndefined: Self = StObject.set(x, "setBox", js.undefined)
    
    inline def setSetHeight(value: /* height */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
    
    inline def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
    
    inline def setSetLeft(value: /* left */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setLeft", js.Any.fromFunction1(value))
    
    inline def setSetLeftUndefined: Self = StObject.set(x, "setLeft", js.undefined)
    
    inline def setSetMaxHeight(value: /* height */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setMaxHeight", js.Any.fromFunction1(value))
    
    inline def setSetMaxHeightUndefined: Self = StObject.set(x, "setMaxHeight", js.undefined)
    
    inline def setSetMaxWidth(value: /* width */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setMaxWidth", js.Any.fromFunction1(value))
    
    inline def setSetMaxWidthUndefined: Self = StObject.set(x, "setMaxWidth", js.undefined)
    
    inline def setSetMinHeight(value: /* height */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setMinHeight", js.Any.fromFunction1(value))
    
    inline def setSetMinHeightUndefined: Self = StObject.set(x, "setMinHeight", js.undefined)
    
    inline def setSetMinWidth(value: /* width */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setMinWidth", js.Any.fromFunction1(value))
    
    inline def setSetMinWidthUndefined: Self = StObject.set(x, "setMinWidth", js.undefined)
    
    inline def setSetRight(value: /* right */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setRight", js.Any.fromFunction1(value))
    
    inline def setSetRightUndefined: Self = StObject.set(x, "setRight", js.undefined)
    
    inline def setSetSize(
      value: (/* width */ js.UndefOr[Any], /* height */ js.UndefOr[Any]) => typings.senchaTouch.Ext.dom.IElement
    ): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
    
    inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
    
    inline def setSetStyle(
      value: (/* property */ js.UndefOr[Any], /* value */ js.UndefOr[java.lang.String]) => typings.senchaTouch.Ext.dom.IElement
    ): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
    
    inline def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
    
    inline def setSetTop(value: /* top */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setTop", js.Any.fromFunction1(value))
    
    inline def setSetTopUndefined: Self = StObject.set(x, "setTop", js.undefined)
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setSetVisibilityMode(value: /* mode */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setVisibilityMode", js.Any.fromFunction1(value))
    
    inline def setSetVisibilityModeUndefined: Self = StObject.set(x, "setVisibilityMode", js.undefined)
    
    inline def setSetVisible(value: /* visible */ js.UndefOr[Boolean] => IElement): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
    
    inline def setSetVisibleUndefined: Self = StObject.set(x, "setVisible", js.undefined)
    
    inline def setSetWidth(value: /* width */ js.UndefOr[Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
    
    inline def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
    
    inline def setSetX(value: /* x */ js.UndefOr[Double] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setX", js.Any.fromFunction1(value))
    
    inline def setSetXUndefined: Self = StObject.set(x, "setX", js.undefined)
    
    inline def setSetXY(value: /* pos */ js.UndefOr[Array] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setXY", js.Any.fromFunction1(value))
    
    inline def setSetXYUndefined: Self = StObject.set(x, "setXY", js.undefined)
    
    inline def setSetY(value: /* y */ js.UndefOr[Double] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setY", js.Any.fromFunction1(value))
    
    inline def setSetYUndefined: Self = StObject.set(x, "setY", js.undefined)
    
    inline def setToggleCls(value: /* className */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "toggleCls", js.Any.fromFunction1(value))
    
    inline def setToggleClsUndefined: Self = StObject.set(x, "toggleCls", js.undefined)
  }
}
