package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.mixin.IObservable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dom {
  
  @js.native
  trait Element extends StObject
  
  type ICompositeElement = typings.senchaTouch.Ext.dom.ICompositeElementLite
  
  @js.native
  trait ICompositeElementLite
    extends typings.senchaTouch.Ext.dom.IElement {
    
    /** [Method] Adds elements to this Composite object
      * @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an Array of DOM elements to add, or another Composite object who's elements should be added.
      * @param root HTMLElement/String The root element of the query or id of the root.
      * @returns Ext.dom.CompositeElementLite This Composite object.
      */
    var add: js.UndefOr[
        js.Function2[/* els */ js.UndefOr[js.Any], /* root */ js.UndefOr[js.Any], this.type]
      ] = js.native
    
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
      ] = js.native
    
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
          /* eventName */ js.UndefOr[js.Any], 
          /* handler */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          /* opt */ js.UndefOr[js.Any], 
          this.type
        ]
      ] = js.native
    
    /** [Method] Appends the passed element s to this element
      * @param element HTMLElement/Ext.dom.Element a DOM Node or an existing Element.
      * @returns Ext.dom.Element This element.
      */
    @JSName("appendChild")
    var appendChild_ICompositeElementLite: js.UndefOr[
        js.Function1[/* element */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
    
    /** [Method] Appends this element to the passed element
      * @param el String/HTMLElement/Ext.dom.Element The new parent element. The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.Element This element.
      */
    @JSName("appendTo")
    var appendTo_ICompositeElementLite: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.IElement]] = js.native
    
    /** [Method] More flexible version of setStyle for setting style properties
      * @param styles String/Object/Function A style specification string, e.g. "width:100px", or object in the form {width:"100px"}, or a function which returns such a specification.
      * @returns Ext.dom.Element this
      */
    @JSName("applyStyles")
    var applyStyles_ICompositeElementLite: js.UndefOr[
        js.Function1[/* styles */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
    
    /** [Method] Removes all elements  */
    var clear: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Creates the passed DomHelper config and appends it to this element or optionally inserts it before the passed child e
      * @param config Object DomHelper element config object. If no tag is specified (e.g., {tag:'input'}) then a div will be automatically generated with the specified attributes.
      * @param insertBefore HTMLElement a child element of this element.
      * @param returnDom Boolean true to return the dom node instead of creating an Element.
      * @returns Ext.dom.Element The new child element.
      */
    @JSName("createChild")
    var createChild_ICompositeElementLite: js.UndefOr[
        js.Function3[
          /* config */ js.UndefOr[js.Any], 
          /* insertBefore */ js.UndefOr[HTMLElement], 
          /* returnDom */ js.UndefOr[Boolean], 
          typings.senchaTouch.Ext.dom.IElement
        ]
      ] = js.native
    
    /** [Method] Calls the passed function for each element in this composite
      * @param fn Function The function to call.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Element.
      * @returns Ext.dom.CompositeElementLite this
      */
    var each: js.UndefOr[
        js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], this.type]
      ] = js.native
    
    /** [Property] (HTMLElement[]) */
    var elements: js.UndefOr[Array] = js.native
    
    /** [Method] Clears this Composite and adds the elements passed
      * @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an array of DOM elements, or another Composite from which to fill this Composite.
      * @returns Ext.dom.CompositeElementLite this
      */
    var fill: js.UndefOr[js.Function1[/* els */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Filters this composite to only elements that match the passed selector
      * @param selector String/Function A string CSS selector or a comparison function. The comparison function will be called with the following arguments:
      * @returns Ext.dom.CompositeElementLite this
      */
    var filter: js.UndefOr[js.Function1[/* selector */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Returns the number of elements in this Composite
      * @returns Number
      */
    var getCount: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Find the index of the passed element within the composite collection
      * @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.dom.Element, or an HtmlElement to find within the composite collection.
      * @returns Number The index of the passed Ext.dom.Element in the composite collection, or -1 if not found.
      */
    var indexOf: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Double]] = js.native
    
    /** [Method] Inserts this element after the passed element in the DOM
      * @param el String/HTMLElement/Ext.dom.Element The element to insert after. The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.Element This element.
      */
    @JSName("insertAfter")
    var insertAfter_ICompositeElementLite: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.IElement]] = js.native
    
    /** [Method] Inserts this element before the passed element in the DOM
      * @param el String/HTMLElement/Ext.dom.Element The element before which this element will be inserted. The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.Element This element.
      */
    @JSName("insertBefore")
    var insertBefore_ICompositeElementLite: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.IElement]] = js.native
    
    /** [Method] Inserts an element as the first child of this element
      * @param element String/HTMLElement/Ext.dom.Element The id or element to insert.
      * @returns Ext.dom.Element this
      */
    @JSName("insertFirst")
    var insertFirst_ICompositeElementLite: js.UndefOr[
        js.Function1[/* element */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
    
    /** [Method] Inserts or creates the passed element or DomHelper config as a sibling of this element
      * @param el String/HTMLElement/Ext.dom.Element/Object/Array The id, element to insert or a DomHelper config to create and insert or an array of any of those.
      * @param where String 'before' or 'after'.
      * @param returnDom Boolean true to return the raw DOM element instead of Ext.dom.Element.
      * @returns Ext.dom.Element The inserted Element. If an array is passed, the last inserted element is returned.
      */
    @JSName("insertSibling")
    var insertSibling_ICompositeElementLite: js.UndefOr[
        js.Function3[
          /* el */ js.UndefOr[js.Any], 
          /* where */ js.UndefOr[java.lang.String], 
          /* returnDom */ js.UndefOr[Boolean], 
          typings.senchaTouch.Ext.dom.IElement
        ]
      ] = js.native
    
    /** [Method] Returns a flyweight Element of the dom element object at the specified index
      * @param index Number
      * @returns Ext.dom.Element
      */
    var item: js.UndefOr[
        js.Function1[/* index */ js.UndefOr[Double], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
    
    /** [Method] Adds one or more CSS classes to this element and removes the same class es from all siblings
      * @param className String/String[] The CSS class to add, or an array of classes.
      * @returns Ext.dom.Element this
      */
    @JSName("radioCls")
    var radioCls_ICompositeElementLite: js.UndefOr[
        js.Function1[/* className */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
    
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
      ] = js.native
    
    /** [Method] Removes the specified element s
      * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
      * @param removeDom Boolean true to also remove the element from the document
      * @returns Ext.dom.CompositeElementLite this
      */
    var removeElement: js.UndefOr[
        js.Function2[/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean], this.type]
      ] = js.native
    
    /** [Method] Forces the browser to repaint this element
      * @returns Ext.dom.Element this
      */
    @JSName("repaint")
    var repaint_ICompositeElementLite: js.UndefOr[js.Function0[typings.senchaTouch.Ext.dom.IElement]] = js.native
    
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
      ] = js.native
    
    /** [Method] Replaces the specified element with the passed element
      * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite to replace.
      * @param replacement String/Ext.Element The id of an element or the Element itself.
      * @param domReplace Boolean true to remove and replace the element in the document too.
      * @returns Ext.dom.CompositeElementLite this
      */
    var replaceElement: js.UndefOr[
        js.Function3[
          /* el */ js.UndefOr[js.Any], 
          /* replacement */ js.UndefOr[js.Any], 
          /* domReplace */ js.UndefOr[Boolean], 
          this.type
        ]
      ] = js.native
    
    /** [Method] Replaces this element with the passed element
      * @param el String/HTMLElement/Ext.dom.Element/Object The new element (id of the node, a DOM Node or an existing Element) or a DomHelper config of an element to create.
      * @returns Ext.dom.Element This element.
      */
    @JSName("replaceWith")
    var replaceWith_ICompositeElementLite: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.IElement]] = js.native
    
    /** [Method] Replaces the passed element with this element
      * @param element String/HTMLElement/Ext.dom.Element The element to replace. The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.Element This element.
      */
    @JSName("replace")
    var replace_ICompositeElementLite: js.UndefOr[
        js.Function1[/* element */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
    
    /** [Method] Selects elements based on the passed CSS selector to enable Element methods to be applied to many related elements in
      * @param selector String/HTMLElement[] The CSS selector or an array of elements
      * @param composite Boolean Return a CompositeElement as opposed to a CompositeElementLite. Defaults to false.
      * @returns Ext.dom.CompositeElementLite/Ext.dom.CompositeElement
      */
    var select: js.UndefOr[
        js.Function2[/* selector */ js.UndefOr[js.Any], /* composite */ js.UndefOr[Boolean], this.type]
      ] = js.native
    
    /** [Method] Sets the element s CSS bottom style
      * @param bottom String The bottom CSS property value.
      * @returns Ext.dom.Element this
      */
    @JSName("setBottom")
    var setBottom_ICompositeElementLite: js.UndefOr[
        js.Function1[/* bottom */ js.UndefOr[java.lang.String], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
    
    /** [Method] Sets the element s box
      * @param box Object The box to fill, for example: {  left: ...,  top: ...,  width: ...,  height: ... }
      * @returns Ext.dom.Element this
      */
    @JSName("setBox")
    var setBox_ICompositeElementLite: js.UndefOr[js.Function1[/* box */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.IElement]] = js.native
    
    /** [Method] Set the height of this Element
      * @param height Number/String The new height.
      * @returns Ext.dom.Element this
      */
    @JSName("setHeight")
    var setHeight_ICompositeElementLite: js.UndefOr[
        js.Function1[/* height */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
    
    /** [Method] Sets the element s left position directly using CSS style instead of setX
      * @param left String The left CSS property value.
      * @returns Ext.dom.Element this
      */
    @JSName("setLeft")
    var setLeft_ICompositeElementLite: js.UndefOr[
        js.Function1[/* left */ js.UndefOr[java.lang.String], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
    
    /** [Method] Set the maximum height of this Element
      * @param height Number/String The new maximum height.
      * @returns Ext.dom.Element this
      */
    @JSName("setMaxHeight")
    var setMaxHeight_ICompositeElementLite: js.UndefOr[
        js.Function1[/* height */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
    
    /** [Method] Set the maximum width of this Element
      * @param width Number/String The new maximum width.
      * @returns Ext.dom.Element this
      */
    @JSName("setMaxWidth")
    var setMaxWidth_ICompositeElementLite: js.UndefOr[
        js.Function1[/* width */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
    
    /** [Method] Set the minimum height of this Element
      * @param height Number/String The new minimum height.
      * @returns Ext.dom.Element this
      */
    @JSName("setMinHeight")
    var setMinHeight_ICompositeElementLite: js.UndefOr[
        js.Function1[/* height */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
    
    /** [Method] Set the minimum width of this Element
      * @param width Number/String The new minimum width.
      * @returns Ext.dom.Element this
      */
    @JSName("setMinWidth")
    var setMinWidth_ICompositeElementLite: js.UndefOr[
        js.Function1[/* width */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
    
    /** [Method] Sets the element s CSS right style
      * @param right String The right CSS property value.
      * @returns Ext.dom.Element this
      */
    @JSName("setRight")
    var setRight_ICompositeElementLite: js.UndefOr[
        js.Function1[/* right */ js.UndefOr[java.lang.String], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
    
    /** [Method] Set the size of this Element
      * @param width Number/String The new width. This may be one of:  A Number specifying the new width in this Element's defaultUnits (by default, pixels). A String used to set the CSS width style. Animation may not be used. A size object in the format {width: widthValue, height: heightValue}.
      * @param height Number/String The new height. This may be one of:  A Number specifying the new height in this Element's defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used.
      * @returns Ext.dom.Element this
      */
    @JSName("setSize")
    var setSize_ICompositeElementLite: js.UndefOr[
        js.Function2[
          /* width */ js.UndefOr[js.Any], 
          /* height */ js.UndefOr[js.Any], 
          typings.senchaTouch.Ext.dom.IElement
        ]
      ] = js.native
    
    /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
      * @param property String/Object The style property to be set, or an object of multiple styles.
      * @param value String The value to apply to the given property, or null if an object was passed.
      * @returns Ext.dom.Element this
      */
    @JSName("setStyle")
    var setStyle_ICompositeElementLite: js.UndefOr[
        js.Function2[
          /* property */ js.UndefOr[js.Any], 
          /* value */ js.UndefOr[java.lang.String], 
          typings.senchaTouch.Ext.dom.IElement
        ]
      ] = js.native
    
    /** [Method] Sets the element s top position directly using CSS style instead of setY
      * @param top String The top CSS property value.
      * @returns Ext.dom.Element this
      */
    @JSName("setTop")
    var setTop_ICompositeElementLite: js.UndefOr[
        js.Function1[/* top */ js.UndefOr[java.lang.String], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
    
    /** [Method] Use this to change the visibility mode between VISIBILITY DISPLAY or OFFSETS
      * @param mode Object
      * @returns Ext.dom.Element this
      */
    @JSName("setVisibilityMode")
    var setVisibilityMode_ICompositeElementLite: js.UndefOr[
        js.Function1[/* mode */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
    
    /** [Method] Sets the visibility of the element see details
      * @param visible Boolean Whether the element is visible.
      * @returns Ext.Element this
      */
    @JSName("setVisible")
    var setVisible_ICompositeElementLite: js.UndefOr[
        js.Function1[/* visible */ js.UndefOr[Boolean], typings.senchaTouch.Ext.IElement]
      ] = js.native
    
    /** [Method] Set the width of this Element
      * @param width Number/String The new width.
      * @returns Ext.dom.Element this
      */
    @JSName("setWidth")
    var setWidth_ICompositeElementLite: js.UndefOr[
        js.Function1[/* width */ js.UndefOr[js.Any], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
    
    /** [Method] Sets the position of the element in page coordinates regardless of how the element is positioned
      * @param pos Number[] Contains X &amp; Y [x, y] values for new position (coordinates are page-based).
      * @returns Ext.dom.Element this
      */
    @JSName("setXY")
    var setXY_ICompositeElementLite: js.UndefOr[js.Function1[/* pos */ js.UndefOr[Array], typings.senchaTouch.Ext.dom.IElement]] = js.native
    
    /** [Method] Sets the X position of the element based on page coordinates
      * @param x Number The X position of the element
      * @returns Ext.dom.Element this
      */
    @JSName("setX")
    var setX_ICompositeElementLite: js.UndefOr[js.Function1[/* x */ js.UndefOr[Double], typings.senchaTouch.Ext.dom.IElement]] = js.native
    
    /** [Method] Sets the Y position of the element based on page coordinates
      * @param y Number The Y position of the element.
      * @returns Ext.dom.Element this
      */
    @JSName("setY")
    var setY_ICompositeElementLite: js.UndefOr[js.Function1[/* y */ js.UndefOr[Double], typings.senchaTouch.Ext.dom.IElement]] = js.native
    
    /** [Method] Sets the passed attributes as attributes of this element a style attribute can be a string object or function
      * @param attributes Object The object with the attributes.
      * @param useSet Boolean false to override the default setAttribute to use expandos.
      * @returns Ext.dom.Element this
      */
    @JSName("set")
    var set_ICompositeElementLite: js.UndefOr[
        js.Function2[
          /* attributes */ js.UndefOr[js.Any], 
          /* useSet */ js.UndefOr[Boolean], 
          typings.senchaTouch.Ext.dom.IElement
        ]
      ] = js.native
    
    /** [Method] Toggles the specified CSS class on this element removes it if it already exists otherwise adds it
      * @param className String The CSS class to toggle.
      * @returns Ext.dom.Element this
      */
    @JSName("toggleCls")
    var toggleCls_ICompositeElementLite: js.UndefOr[
        js.Function1[/* className */ js.UndefOr[java.lang.String], typings.senchaTouch.Ext.dom.IElement]
      ] = js.native
  }
  object ICompositeElementLite {
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.dom.ICompositeElementLite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.dom.ICompositeElementLite]
    }
    
    @scala.inline
    implicit class ICompositeElementLiteMutableBuilder[Self <: typings.senchaTouch.Ext.dom.ICompositeElementLite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(
        value: (/* els */ js.UndefOr[js.Any], /* root */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
      ): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddCls(
        value: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typings.senchaTouch.Ext.dom.IElement
      ): Self = StObject.set(x, "addCls", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddClsUndefined: Self = StObject.set(x, "addCls", js.undefined)
      
      @scala.inline
      def setAddListener(
        value: (/* eventName */ js.UndefOr[js.Any], /* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* opt */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
      ): Self = StObject.set(x, "addListener", js.Any.fromFunction4(value))
      
      @scala.inline
      def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
      
      @scala.inline
      def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      @scala.inline
      def setAppendChild(value: /* element */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAppendChildUndefined: Self = StObject.set(x, "appendChild", js.undefined)
      
      @scala.inline
      def setAppendTo(value: /* el */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setApplyStyles(value: /* styles */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "applyStyles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setApplyStylesUndefined: Self = StObject.set(x, "applyStyles", js.undefined)
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setCreateChild(
        value: (/* config */ js.UndefOr[js.Any], /* insertBefore */ js.UndefOr[HTMLElement], /* returnDom */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.IElement
      ): Self = StObject.set(x, "createChild", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCreateChildUndefined: Self = StObject.set(x, "createChild", js.undefined)
      
      @scala.inline
      def setEach(
        value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
      ): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      @scala.inline
      def setElements(value: Array): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      @scala.inline
      def setFill(value: /* els */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.ICompositeElementLite): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFilter(value: /* selector */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.ICompositeElementLite): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
      
      @scala.inline
      def setIndexOf(value: /* el */ js.UndefOr[js.Any] => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
      
      @scala.inline
      def setInsertAfter(value: /* el */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "insertAfter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsertAfterUndefined: Self = StObject.set(x, "insertAfter", js.undefined)
      
      @scala.inline
      def setInsertBefore(value: /* el */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "insertBefore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
      
      @scala.inline
      def setInsertFirst(value: /* element */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "insertFirst", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsertFirstUndefined: Self = StObject.set(x, "insertFirst", js.undefined)
      
      @scala.inline
      def setInsertSibling(
        value: (/* el */ js.UndefOr[js.Any], /* where */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.IElement
      ): Self = StObject.set(x, "insertSibling", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInsertSiblingUndefined: Self = StObject.set(x, "insertSibling", js.undefined)
      
      @scala.inline
      def setItem(value: /* index */ js.UndefOr[Double] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      @scala.inline
      def setRadioCls(value: /* className */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "radioCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRadioClsUndefined: Self = StObject.set(x, "radioCls", js.undefined)
      
      @scala.inline
      def setRemoveCls(
        value: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typings.senchaTouch.Ext.dom.IElement
      ): Self = StObject.set(x, "removeCls", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRemoveClsUndefined: Self = StObject.set(x, "removeCls", js.undefined)
      
      @scala.inline
      def setRemoveElement(
        value: (/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
      ): Self = StObject.set(x, "removeElement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveElementUndefined: Self = StObject.set(x, "removeElement", js.undefined)
      
      @scala.inline
      def setRepaint(value: () => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "repaint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRepaintUndefined: Self = StObject.set(x, "repaint", js.undefined)
      
      @scala.inline
      def setReplace(value: /* element */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReplaceCls(
        value: (/* oldName */ js.UndefOr[java.lang.String], /* newName */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typings.senchaTouch.Ext.dom.IElement
      ): Self = StObject.set(x, "replaceCls", js.Any.fromFunction4(value))
      
      @scala.inline
      def setReplaceClsUndefined: Self = StObject.set(x, "replaceCls", js.undefined)
      
      @scala.inline
      def setReplaceElement(
        value: (/* el */ js.UndefOr[js.Any], /* replacement */ js.UndefOr[js.Any], /* domReplace */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
      ): Self = StObject.set(x, "replaceElement", js.Any.fromFunction3(value))
      
      @scala.inline
      def setReplaceElementUndefined: Self = StObject.set(x, "replaceElement", js.undefined)
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setReplaceWith(value: /* el */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReplaceWithUndefined: Self = StObject.set(x, "replaceWith", js.undefined)
      
      @scala.inline
      def setSelect(
        value: (/* selector */ js.UndefOr[js.Any], /* composite */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.ICompositeElementLite
      ): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setSet(
        value: (/* attributes */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.IElement
      ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetBottom(value: /* bottom */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setBottom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBottomUndefined: Self = StObject.set(x, "setBottom", js.undefined)
      
      @scala.inline
      def setSetBox(value: /* box */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setBox", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBoxUndefined: Self = StObject.set(x, "setBox", js.undefined)
      
      @scala.inline
      def setSetHeight(value: /* height */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
      
      @scala.inline
      def setSetLeft(value: /* left */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLeftUndefined: Self = StObject.set(x, "setLeft", js.undefined)
      
      @scala.inline
      def setSetMaxHeight(value: /* height */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setMaxHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMaxHeightUndefined: Self = StObject.set(x, "setMaxHeight", js.undefined)
      
      @scala.inline
      def setSetMaxWidth(value: /* width */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setMaxWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMaxWidthUndefined: Self = StObject.set(x, "setMaxWidth", js.undefined)
      
      @scala.inline
      def setSetMinHeight(value: /* height */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setMinHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinHeightUndefined: Self = StObject.set(x, "setMinHeight", js.undefined)
      
      @scala.inline
      def setSetMinWidth(value: /* width */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setMinWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinWidthUndefined: Self = StObject.set(x, "setMinWidth", js.undefined)
      
      @scala.inline
      def setSetRight(value: /* right */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRightUndefined: Self = StObject.set(x, "setRight", js.undefined)
      
      @scala.inline
      def setSetSize(
        value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.dom.IElement
      ): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
      
      @scala.inline
      def setSetStyle(
        value: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => typings.senchaTouch.Ext.dom.IElement
      ): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
      
      @scala.inline
      def setSetTop(value: /* top */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setTop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTopUndefined: Self = StObject.set(x, "setTop", js.undefined)
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      @scala.inline
      def setSetVisibilityMode(value: /* mode */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setVisibilityMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetVisibilityModeUndefined: Self = StObject.set(x, "setVisibilityMode", js.undefined)
      
      @scala.inline
      def setSetVisible(value: /* visible */ js.UndefOr[Boolean] => typings.senchaTouch.Ext.IElement): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetVisibleUndefined: Self = StObject.set(x, "setVisible", js.undefined)
      
      @scala.inline
      def setSetWidth(value: /* width */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
      
      @scala.inline
      def setSetX(value: /* x */ js.UndefOr[Double] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetXUndefined: Self = StObject.set(x, "setX", js.undefined)
      
      @scala.inline
      def setSetXY(value: /* pos */ js.UndefOr[Array] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setXY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetXYUndefined: Self = StObject.set(x, "setXY", js.undefined)
      
      @scala.inline
      def setSetY(value: /* y */ js.UndefOr[Double] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetYUndefined: Self = StObject.set(x, "setY", js.undefined)
      
      @scala.inline
      def setToggleCls(value: /* className */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "toggleCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleClsUndefined: Self = StObject.set(x, "toggleCls", js.undefined)
    }
  }
  
  @js.native
  trait IElement extends IObservable {
    
    /** [Property] (Number) */
    var DISPLAY: js.UndefOr[Double] = js.native
    
    /** [Property] (Number) */
    var OFFSETS: js.UndefOr[Double] = js.native
    
    /** [Property] (Number) */
    var VISIBILITY: js.UndefOr[Double] = js.native
    
    /** [Method] Adds the given CSS class es to this Element
      * @param names String The CSS class(es) to add to this element.
      * @param prefix String Prefix to prepend to each class.
      * @param suffix String Suffix to append to each class.
      * @returns Ext.dom.Element this
      */
    var addCls: js.UndefOr[
        js.Function3[
          /* names */ js.UndefOr[java.lang.String], 
          /* prefix */ js.UndefOr[java.lang.String], 
          /* suffix */ js.UndefOr[java.lang.String], 
          this.type
        ]
      ] = js.native
    
    /** [Method] Appends the passed element s to this element
      * @param element HTMLElement/Ext.dom.Element a DOM Node or an existing Element.
      * @returns Ext.dom.Element This element.
      */
    var appendChild: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Appends this element to the passed element
      * @param el String/HTMLElement/Ext.dom.Element The new parent element. The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.Element This element.
      */
    var appendTo: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] More flexible version of setStyle for setting style properties
      * @param styles String/Object/Function A style specification string, e.g. "width:100px", or object in the form {width:"100px"}, or a function which returns such a specification.
      * @returns Ext.dom.Element this
      */
    var applyStyles: js.UndefOr[js.Function1[/* styles */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Selects a single direct child based on the passed CSS selector the selector should not contain an id
      * @param selector String The CSS selector.
      * @param returnDom Boolean true to return the DOM node instead of Ext.dom.Element.
      * @returns HTMLElement/Ext.dom.Element The child Ext.dom.Element (or DOM node if returnDom is true)
      */
    var child: js.UndefOr[
        js.Function2[/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean], _]
      ] = js.native
    
    /** [Method] Returns true if this element is an ancestor of the passed element
      * @param element HTMLElement/String The element to check.
      * @returns Boolean true if this element is an ancestor of el, else false.
      */
    var contains: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Boolean]] = js.native
    
    /** [Method] Creates the passed DomHelper config and appends it to this element or optionally inserts it before the passed child e
      * @param config Object DomHelper element config object. If no tag is specified (e.g., {tag:'input'}) then a div will be automatically generated with the specified attributes.
      * @param insertBefore HTMLElement a child element of this element.
      * @param returnDom Boolean true to return the dom node instead of creating an Element.
      * @returns Ext.dom.Element The new child element.
      */
    var createChild: js.UndefOr[
        js.Function3[
          /* config */ js.UndefOr[js.Any], 
          /* insertBefore */ js.UndefOr[HTMLElement], 
          /* returnDom */ js.UndefOr[Boolean], 
          this.type
        ]
      ] = js.native
    
    /** [Method] Translates an element using CSS 3 in 2D  */
    var cssTranslate: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Property] (String) */
    var defaultUnit: js.UndefOr[java.lang.String] = js.native
    
    /** [Property] (HTMLElement) */
    var dom: js.UndefOr[HTMLElement] = js.native
    
    /** [Method] Selects a single child at any depth below this element based on the passed CSS selector the selector should not cont
      * @param selector String The CSS selector.
      * @param returnDom Boolean true to return the DOM node instead of Ext.dom.Element.
      * @returns HTMLElement/Ext.dom.Element The child Ext.dom.Element (or DOM node if returnDom is true).
      */
    var down: js.UndefOr[
        js.Function2[/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean], _]
      ] = js.native
    
    /** [Method] Looks at this node and then at parent nodes for a match of the passed simple selector e g
      * @param simpleSelector String The simple selector to test.
      * @param maxDepth Number/String/HTMLElement/Ext.Element The max depth to search as a number or element (defaults to 50 || document.body)
      * @param returnEl Boolean true to return a Ext.Element object instead of DOM node.
      * @returns HTMLElement/null The matching DOM node (or null if no match was found).
      */
    var findParent: js.UndefOr[
        js.Function3[
          /* simpleSelector */ js.UndefOr[java.lang.String], 
          /* maxDepth */ js.UndefOr[js.Any], 
          /* returnEl */ js.UndefOr[Boolean], 
          _
        ]
      ] = js.native
    
    /** [Method] Looks at parent nodes for a match of the passed simple selector e g
      * @param simpleSelector String The simple selector to test.
      * @param maxDepth Number/String/HTMLElement/Ext.Element The max depth to search as a number or element (defaults to 10 || document.body).
      * @param returnEl Boolean true to return a Ext.Element object instead of DOM node.
      * @returns HTMLElement/null The matching DOM node (or null if no match was found).
      */
    var findParentNode: js.UndefOr[
        js.Function3[
          /* simpleSelector */ js.UndefOr[java.lang.String], 
          /* maxDepth */ js.UndefOr[js.Any], 
          /* returnEl */ js.UndefOr[Boolean], 
          _
        ]
      ] = js.native
    
    /** [Method] Gets the first child skipping text nodes
      * @param selector String Find the next sibling that matches the passed simple selector.
      * @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element.
      * @returns Ext.dom.Element/HTMLElement/null The first child or null.
      */
    var first: js.UndefOr[
        js.Function2[/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean], _]
      ] = js.native
    
    /** [Method] Gets the x y coordinates to align this element with another element
      * @param element Mixed The element to align to.
      * @param position String The position to align to.
      * @param offsets Array Offset the positioning by [x, y].
      * @returns Array [x, y]
      */
    var getAlignToXY: js.UndefOr[
        js.Function3[
          /* element */ js.UndefOr[js.Any], 
          /* position */ js.UndefOr[java.lang.String], 
          /* offsets */ js.UndefOr[Array], 
          Array
        ]
      ] = js.native
    
    /** [Method] Gets the x y coordinates specified by the anchor position on the element
      * @param anchor String The specified anchor position.
      * @param local Boolean true to get the local (element top/left-relative) anchor position instead of page coordinates.
      * @param size Object An object containing the size to use for calculating anchor position. {width: (target width), height: (target height)} (defaults to the element's current size)
      * @returns Array [x, y] An array containing the element's x and y coordinates.
      */
    var getAnchorXY: js.UndefOr[
        js.Function3[
          /* anchor */ js.UndefOr[java.lang.String], 
          /* local */ js.UndefOr[Boolean], 
          /* size */ js.UndefOr[js.Any], 
          Array
        ]
      ] = js.native
    
    /** [Method] Returns the value of an attribute from the element s underlying DOM node
      * @param name String The attribute name.
      * @param namespace String The namespace in which to look for the attribute.
      * @returns String The attribute value.
      */
    var getAttribute: js.UndefOr[
        js.Function2[
          /* name */ js.UndefOr[java.lang.String], 
          /* namespace */ js.UndefOr[java.lang.String], 
          java.lang.String
        ]
      ] = js.native
    
    /** [Method] Gets the width of the border s for the specified side s
      * @param side String Can be t, l, r, b or any combination of those to add multiple values. For example, passing 'lr' would get the border left width + the border right width.
      * @returns Number The width of the sides passed added together
      */
    var getBorderWidth: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], Double]] = js.native
    
    /** [Method] Gets the bottom Y coordinate of the element element Y position  element height
      * @returns Number
      */
    var getBottom: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
      * @param contentBox Boolean If true a box for the content of the element is returned.
      * @param local Boolean If true the element's left and top are returned instead of page x/y.
      * @returns Object An object in the format
      */
    var getBox: js.UndefOr[
        js.Function2[/* contentBox */ js.UndefOr[Boolean], /* local */ js.UndefOr[Boolean], _]
      ] = js.native
    
    /** [Method] Returns the innerHTML of an element
      * @returns String
      */
    var getHTML: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the offset height of the element
      * @param contentHeight Boolean true to get the height minus borders and padding.
      * @returns Number The element's height.
      */
    var getHeight: js.UndefOr[js.Function1[/* contentHeight */ js.UndefOr[Boolean], Double]] = js.native
    
    /** [Method] Returns the innerHTML of an element
      * @returns String
      */
    var getHtml: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Gets the left X coordinate
      * @returns Number
      */
    var getLeft: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns an object with properties top left right and bottom representing the margins of this element unless sides i
      * @param sides String Any combination of 'l', 'r', 't', 'b' to get the sum of those sides.
      * @returns Object/Number
      */
    var getMargin: js.UndefOr[js.Function1[/* sides */ js.UndefOr[java.lang.String], _]] = js.native
    
    /** [Method] Returns the offsets of this element from the passed element
      * @param element Mixed The element to get the offsets from.
      * @returns Array The XY page offsets (e.g. [100, -200])
      */
    var getOffsetsTo: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Array]] = js.native
    
    /** [Method] Retrieves the height of the element account for the top and bottom margins  */
    var getOuterHeight: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Retrieves the width of the element accounting for the left and right margins  */
    var getOuterWidth: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Gets the width of the padding s for the specified side s
      * @param side String Can be t, l, r, b or any combination of those to add multiple values. For example, passing 'lr' would get the padding left + the padding right.
      * @returns Number The padding of the sides passed added together.
      */
    var getPadding: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], Double]] = js.native
    
    /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
      * @param asRegion Boolean If true an Ext.util.Region will be returned.
      * @returns Object box An object in the format: {  x: &lt;Element's X position&gt;,  y: &lt;Element's Y position&gt;,  width: &lt;Element's width&gt;,  height: &lt;Element's height&gt;,  bottom: &lt;Element's lower bound&gt;,  right: &lt;Element's rightmost bound&gt; }  The returned object may also be addressed as an Array where index 0 contains the X position and index 1 contains the Y position. So the result may also be used for setXY.
      */
    var getPageBox: js.UndefOr[js.Function1[/* asRegion */ js.UndefOr[Boolean], _]] = js.native
    
    /** [Method] Gets the right X coordinate of the element element X position  element width
      * @returns Number
      */
    var getRight: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Gets the Scroller instance of the first parent that has one  */
    var getScrollParent: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Returns the size of the element
      * @param contentSize Boolean true to get the width/size minus borders and padding.
      * @returns Object An object containing the element's size:
      */
    var getSize: js.UndefOr[js.Function1[/* contentSize */ js.UndefOr[Boolean], _]] = js.native
    
    /** [Method] Normalizes currentStyle and computedStyle
      * @param prop String The style property whose value is returned.
      * @returns String The current value of the style property for this element.
      */
    var getStyle: js.UndefOr[js.Function1[/* prop */ js.UndefOr[java.lang.String], java.lang.String]] = js.native
    
    /** [Method] Gets the top Y coordinate
      * @returns Number
      */
    var getTop: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of the value attribute
      * @param asNumber Boolean true to parse the value as a number.
      * @returns String/Number
      */
    var getValue: js.UndefOr[js.Function1[/* asNumber */ js.UndefOr[Boolean], _]] = js.native
    
    /** [Method] Returns the dimensions of the element available to lay content out in
      * @returns Object Object describing width and height:
      */
    var getViewSize: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the offset width of the element
      * @param contentWidth Boolean true to get the width minus borders and padding.
      * @returns Number The element's width.
      */
    var getWidth: js.UndefOr[js.Function1[/* contentWidth */ js.UndefOr[Boolean], Double]] = js.native
    
    /** [Method] Gets the current X position of the element based on page coordinates
      * @returns Number The X position of the element
      */
    var getX: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Gets the current position of the element based on page coordinates
      * @returns Array The XY position of the element
      */
    var getXY: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] Gets the current Y position of the element based on page coordinates
      * @returns Number The Y position of the element
      */
    var getY: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Checks if the specified CSS class exists on this element s DOM node
      * @param name String The CSS class to check for.
      * @returns Boolean true if the class exists, else false.
      */
    var hasCls: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], Boolean]] = js.native
    
    /** [Method] Hides this element  */
    var hide: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Property] (String) */
    var id: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Inserts this element after the passed element in the DOM
      * @param el String/HTMLElement/Ext.dom.Element The element to insert after. The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.Element This element.
      */
    var insertAfter: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Inserts this element before the passed element in the DOM
      * @param el String/HTMLElement/Ext.dom.Element The element before which this element will be inserted. The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.Element This element.
      */
    var insertBefore: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Inserts an element as the first child of this element
      * @param element String/HTMLElement/Ext.dom.Element The id or element to insert.
      * @returns Ext.dom.Element this
      */
    var insertFirst: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Inserts an HTML fragment into this element
      * @param where String Where to insert the HTML in relation to this element - 'beforeBegin', 'afterBegin', 'beforeEnd', 'afterEnd'. See Ext.DomHelper.insertHtml for details.
      * @param html String The HTML fragment
      * @param returnEl Boolean true to return an Ext.dom.Element.
      * @returns HTMLElement/Ext.dom.Element The inserted node (or nearest related if more than 1 inserted).
      */
    var insertHtml: js.UndefOr[
        js.Function3[
          /* where */ js.UndefOr[java.lang.String], 
          /* html */ js.UndefOr[java.lang.String], 
          /* returnEl */ js.UndefOr[Boolean], 
          _
        ]
      ] = js.native
    
    /** [Method] Inserts or creates the passed element or DomHelper config as a sibling of this element
      * @param el String/HTMLElement/Ext.dom.Element/Object/Array The id, element to insert or a DomHelper config to create and insert or an array of any of those.
      * @param where String 'before' or 'after'.
      * @param returnDom Boolean true to return the raw DOM element instead of Ext.dom.Element.
      * @returns Ext.dom.Element The inserted Element. If an array is passed, the last inserted element is returned.
      */
    var insertSibling: js.UndefOr[
        js.Function3[
          /* el */ js.UndefOr[js.Any], 
          /* where */ js.UndefOr[java.lang.String], 
          /* returnDom */ js.UndefOr[Boolean], 
          this.type
        ]
      ] = js.native
    
    /** [Method] Returns true if this element matches the passed simple selector e g
      * @param selector String The simple selector to test.
      * @returns Boolean true if this element matches the selector, else false.
      */
    var is: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], Boolean]] = js.native
    
    /** [Method] Determines if this element is a descendant of the passed in Element  */
    var isDescendent: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Checks if the current value of a style is equal to a given value
      * @param style String property whose value is returned.
      * @param value String to check against.
      * @returns Boolean true for when the current value equals the given value.
      */
    var isStyle: js.UndefOr[
        js.Function2[
          /* style */ js.UndefOr[java.lang.String], 
          /* value */ js.UndefOr[java.lang.String], 
          Boolean
        ]
      ] = js.native
    
    /** [Method] Returns true if the value of the given property is visually transparent
      * @param prop String The style property whose value is to be tested.
      * @returns Boolean true if the style property is visually transparent.
      */
    var isTransparent: js.UndefOr[js.Function1[/* prop */ js.UndefOr[java.lang.String], Boolean]] = js.native
    
    /** [Method] Gets the last child skipping text nodes
      * @param selector String Find the previous sibling that matches the passed simple selector.
      * @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element.
      * @returns Ext.dom.Element/HTMLElement/null The last child or null.
      */
    var last: js.UndefOr[
        js.Function2[/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean], _]
      ] = js.native
    
    /** [Method] Puts a mask over this element to disable user interaction  */
    var mask: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Gets the next sibling skipping text nodes
      * @param selector String Find the next sibling that matches the passed simple selector.
      * @param returnDom Boolean true to return a raw dom node instead of an Ext.dom.Element.
      * @returns Ext.dom.Element/HTMLElement/null The next sibling or null.
      */
    var next: js.UndefOr[
        js.Function2[/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean], _]
      ] = js.native
    
    /** [Method] Gets the parent node for this element optionally chaining up trying to match a selector
      * @param selector String Find a parent node that matches the passed simple selector.
      * @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element.
      * @returns Ext.dom.Element/HTMLElement/null The parent node or null.
      */
    var parent: js.UndefOr[
        js.Function2[/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean], _]
      ] = js.native
    
    /** [Method] Gets the previous sibling skipping text nodes
      * @param selector String Find the previous sibling that matches the passed simple selector.
      * @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element
      * @returns Ext.dom.Element/HTMLElement/null The previous sibling or null.
      */
    var prev: js.UndefOr[
        js.Function2[/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean], _]
      ] = js.native
    
    /** [Method] Removes all listeners for this object  */
    var purgeAllListeners: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Selects child nodes based on the passed CSS selector the selector should not contain an id
      * @param selector String The CSS selector.
      * @returns HTMLElement[] An array of the matched nodes.
      */
    var query: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], Array]] = js.native
    
    /** [Method] Adds one or more CSS classes to this element and removes the same class es from all siblings
      * @param className String/String[] The CSS class to add, or an array of classes.
      * @returns Ext.dom.Element this
      */
    var radioCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IElement: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
      ] = js.native
    
    /** [Method] Removes this element s DOM reference  */
    var remove: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Removes all listeners for this object  */
    var removeAllListeners: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Removes the given CSS class es from this Element
      * @param names String The CSS class(es) to remove from this element.
      * @param prefix String Prefix to prepend to each class to be removed.
      * @param suffix String Suffix to append to each class to be removed.
      * @returns Ext.dom.Element this
      */
    var removeCls: js.UndefOr[
        js.Function3[
          /* names */ js.UndefOr[java.lang.String], 
          /* prefix */ js.UndefOr[java.lang.String], 
          /* suffix */ js.UndefOr[java.lang.String], 
          this.type
        ]
      ] = js.native
    
    /** [Method] Forces the browser to repaint this element
      * @returns Ext.dom.Element this
      */
    var repaint: js.UndefOr[js.Function0[this.type]] = js.native
    
    /** [Method] Replaces the passed element with this element
      * @param element String/HTMLElement/Ext.dom.Element The element to replace. The id of the node, a DOM Node or an existing Element.
      * @returns Ext.dom.Element This element.
      */
    var replace: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Replaces a CSS class on the element with another
      * @param oldName String The CSS class to replace.
      * @param newName String The replacement CSS class.
      * @param prefix String Prefix to prepend to each class to be replaced.
      * @param suffix String Suffix to append to each class to be replaced.
      * @returns Ext.dom.Element this
      */
    var replaceCls: js.UndefOr[
        js.Function4[
          /* oldName */ js.UndefOr[java.lang.String], 
          /* newName */ js.UndefOr[java.lang.String], 
          /* prefix */ js.UndefOr[java.lang.String], 
          /* suffix */ js.UndefOr[java.lang.String], 
          this.type
        ]
      ] = js.native
    
    /** [Method] Replaces this element with the passed element
      * @param el String/HTMLElement/Ext.dom.Element/Object The new element (id of the node, a DOM Node or an existing Element) or a DomHelper config of an element to create.
      * @returns Ext.dom.Element This element.
      */
    var replaceWith: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Serializes a DOM form into a url encoded string
      * @param form Object The form
      * @returns String The url encoded form
      */
    var serializeForm: js.UndefOr[js.Function1[/* form */ js.UndefOr[js.Any], java.lang.String]] = js.native
    
    /** [Method] Sets the passed attributes as attributes of this element a style attribute can be a string object or function
      * @param attributes Object The object with the attributes.
      * @param useSet Boolean false to override the default setAttribute to use expandos.
      * @returns Ext.dom.Element this
      */
    var set: js.UndefOr[
        js.Function2[/* attributes */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean], this.type]
      ] = js.native
    
    /** [Method] Sets the element s CSS bottom style
      * @param bottom String The bottom CSS property value.
      * @returns Ext.dom.Element this
      */
    var setBottom: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[java.lang.String], this.type]] = js.native
    
    /** [Method] Sets the element s box
      * @param box Object The box to fill, for example: {  left: ...,  top: ...,  width: ...,  height: ... }
      * @returns Ext.dom.Element this
      */
    var setBox: js.UndefOr[js.Function1[/* box */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Sets the specified CSS class on this element s DOM node
      * @param className String/Array The CSS class to set on this element.
      */
    var setCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the innerHTML of this element
      * @param html String The new HTML.
      */
    var setHTML: js.UndefOr[js.Function1[/* html */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Set the height of this Element
      * @param height Number/String The new height.
      * @returns Ext.dom.Element this
      */
    var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Sets the innerHTML of this element
      * @param html String The new HTML.
      */
    var setHtml: js.UndefOr[js.Function1[/* html */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the element s left position directly using CSS style instead of setX
      * @param left String The left CSS property value.
      * @returns Ext.dom.Element this
      */
    var setLeft: js.UndefOr[js.Function1[/* left */ js.UndefOr[java.lang.String], this.type]] = js.native
    
    /** [Method] Set the maximum height of this Element
      * @param height Number/String The new maximum height.
      * @returns Ext.dom.Element this
      */
    var setMaxHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Set the maximum width of this Element
      * @param width Number/String The new maximum width.
      * @returns Ext.dom.Element this
      */
    var setMaxWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Set the minimum height of this Element
      * @param height Number/String The new minimum height.
      * @returns Ext.dom.Element this
      */
    var setMinHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Set the minimum width of this Element
      * @param width Number/String The new minimum width.
      * @returns Ext.dom.Element this
      */
    var setMinWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Sets the element s CSS right style
      * @param right String The right CSS property value.
      * @returns Ext.dom.Element this
      */
    var setRight: js.UndefOr[js.Function1[/* right */ js.UndefOr[java.lang.String], this.type]] = js.native
    
    /** [Method] Set the size of this Element
      * @param width Number/String The new width. This may be one of:  A Number specifying the new width in this Element's defaultUnits (by default, pixels). A String used to set the CSS width style. Animation may not be used. A size object in the format {width: widthValue, height: heightValue}.
      * @param height Number/String The new height. This may be one of:  A Number specifying the new height in this Element's defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used.
      * @returns Ext.dom.Element this
      */
    var setSize: js.UndefOr[
        js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], this.type]
      ] = js.native
    
    /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
      * @param property String/Object The style property to be set, or an object of multiple styles.
      * @param value String The value to apply to the given property, or null if an object was passed.
      * @returns Ext.dom.Element this
      */
    var setStyle: js.UndefOr[
        js.Function2[
          /* property */ js.UndefOr[js.Any], 
          /* value */ js.UndefOr[java.lang.String], 
          this.type
        ]
      ] = js.native
    
    /** [Method] Sets the element s top position directly using CSS style instead of setY
      * @param top String The top CSS property value.
      * @returns Ext.dom.Element this
      */
    var setTop: js.UndefOr[js.Function1[/* top */ js.UndefOr[java.lang.String], this.type]] = js.native
    
    /** [Method] Sets the element s top and left positions directly using CSS style  */
    var setTopLeft: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Use this to change the visibility mode between VISIBILITY DISPLAY or OFFSETS
      * @param mode Object
      * @returns Ext.dom.Element this
      */
    var setVisibilityMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Sets the visibility of the element see details
      * @param visible Boolean Whether the element is visible.
      * @returns Ext.Element this
      */
    var setVisible: js.UndefOr[js.Function1[/* visible */ js.UndefOr[Boolean], this.type]] = js.native
    
    /** [Method] Set the width of this Element
      * @param width Number/String The new width.
      * @returns Ext.dom.Element this
      */
    var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Sets the X position of the element based on page coordinates
      * @param x Number The X position of the element
      * @returns Ext.dom.Element this
      */
    var setX: js.UndefOr[js.Function1[/* x */ js.UndefOr[Double], this.type]] = js.native
    
    /** [Method] Sets the position of the element in page coordinates regardless of how the element is positioned
      * @param pos Number[] Contains X &amp; Y [x, y] values for new position (coordinates are page-based).
      * @returns Ext.dom.Element this
      */
    var setXY: js.UndefOr[js.Function1[/* pos */ js.UndefOr[Array], this.type]] = js.native
    
    /** [Method] Sets the Y position of the element based on page coordinates
      * @param y Number The Y position of the element.
      * @returns Ext.dom.Element this
      */
    var setY: js.UndefOr[js.Function1[/* y */ js.UndefOr[Double], this.type]] = js.native
    
    /** [Method] Shows this element  */
    var show: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Toggles the specified CSS class on this element removes it if it already exists otherwise adds it
      * @param className String The CSS class to toggle.
      * @returns Ext.dom.Element this
      */
    var toggleCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[java.lang.String], this.type]] = js.native
    
    /** [Method] Translates the passed page coordinates into left top CSS values for this element
      * @param x Number/Array The page x or an array containing [x, y].
      * @param y Number The page y, required if x is not an array.
      * @returns Object An object with left and top properties. e.g. {left: (value), top: (value)}.
      */
    var translatePoints: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], _]] = js.native
    
    /** [Method] Removes a previously applied mask  */
    var unmask: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Walks up the dom looking for a parent node that matches the passed simple selector e g
      * @param simpleSelector String The simple selector to test
      * @param maxDepth Number/String/HTMLElement/Ext.Element The max depth to search as a number or element (defaults to 10 || document.body).
      * @returns Ext.dom.Element/null The matching DOM node (or null if no match was found).
      */
    var up: js.UndefOr[
        js.Function2[
          /* simpleSelector */ js.UndefOr[java.lang.String], 
          /* maxDepth */ js.UndefOr[js.Any], 
          _
        ]
      ] = js.native
    
    /** [Method] Sets the innerHTML of this element
      * @param html String The new HTML.
      */
    var update: js.UndefOr[js.Function1[/* html */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Creates and wraps this element with another element
      * @param config Object DomHelper element config object for the wrapper element or null for an empty div
      * @param domNode Boolean true to return the raw DOM element instead of Ext.dom.Element.
      * @returns HTMLElement/Ext.dom.Element The newly created wrapper element.
      */
    var wrap: js.UndefOr[
        js.Function2[/* config */ js.UndefOr[js.Any], /* domNode */ js.UndefOr[Boolean], _]
      ] = js.native
  }
  object IElement {
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.dom.IElement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.dom.IElement]
    }
    
    @scala.inline
    implicit class IElementMutableBuilder[Self <: typings.senchaTouch.Ext.dom.IElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddCls(
        value: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typings.senchaTouch.Ext.dom.IElement
      ): Self = StObject.set(x, "addCls", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddClsUndefined: Self = StObject.set(x, "addCls", js.undefined)
      
      @scala.inline
      def setAppendChild(value: /* element */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAppendChildUndefined: Self = StObject.set(x, "appendChild", js.undefined)
      
      @scala.inline
      def setAppendTo(value: /* el */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setApplyStyles(value: /* styles */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "applyStyles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setApplyStylesUndefined: Self = StObject.set(x, "applyStyles", js.undefined)
      
      @scala.inline
      def setChild(value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = StObject.set(x, "child", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      @scala.inline
      def setContains(value: /* element */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      @scala.inline
      def setCreateChild(
        value: (/* config */ js.UndefOr[js.Any], /* insertBefore */ js.UndefOr[HTMLElement], /* returnDom */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.IElement
      ): Self = StObject.set(x, "createChild", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCreateChildUndefined: Self = StObject.set(x, "createChild", js.undefined)
      
      @scala.inline
      def setCssTranslate(value: () => Unit): Self = StObject.set(x, "cssTranslate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCssTranslateUndefined: Self = StObject.set(x, "cssTranslate", js.undefined)
      
      @scala.inline
      def setDISPLAY(value: Double): Self = StObject.set(x, "DISPLAY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDISPLAYUndefined: Self = StObject.set(x, "DISPLAY", js.undefined)
      
      @scala.inline
      def setDefaultUnit(value: java.lang.String): Self = StObject.set(x, "defaultUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUnitUndefined: Self = StObject.set(x, "defaultUnit", js.undefined)
      
      @scala.inline
      def setDom(value: HTMLElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
      
      @scala.inline
      def setDown(value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = StObject.set(x, "down", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      @scala.inline
      def setFindParent(
        value: (/* simpleSelector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => _
      ): Self = StObject.set(x, "findParent", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFindParentNode(
        value: (/* simpleSelector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => _
      ): Self = StObject.set(x, "findParentNode", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFindParentNodeUndefined: Self = StObject.set(x, "findParentNode", js.undefined)
      
      @scala.inline
      def setFindParentUndefined: Self = StObject.set(x, "findParent", js.undefined)
      
      @scala.inline
      def setFirst(value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = StObject.set(x, "first", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      @scala.inline
      def setGetAlignToXY(
        value: (/* element */ js.UndefOr[js.Any], /* position */ js.UndefOr[java.lang.String], /* offsets */ js.UndefOr[Array]) => Array
      ): Self = StObject.set(x, "getAlignToXY", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetAlignToXYUndefined: Self = StObject.set(x, "getAlignToXY", js.undefined)
      
      @scala.inline
      def setGetAnchorXY(
        value: (/* anchor */ js.UndefOr[java.lang.String], /* local */ js.UndefOr[Boolean], /* size */ js.UndefOr[js.Any]) => Array
      ): Self = StObject.set(x, "getAnchorXY", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetAnchorXYUndefined: Self = StObject.set(x, "getAnchorXY", js.undefined)
      
      @scala.inline
      def setGetAttribute(
        value: (/* name */ js.UndefOr[java.lang.String], /* namespace */ js.UndefOr[java.lang.String]) => java.lang.String
      ): Self = StObject.set(x, "getAttribute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetAttributeUndefined: Self = StObject.set(x, "getAttribute", js.undefined)
      
      @scala.inline
      def setGetBorderWidth(value: /* side */ js.UndefOr[java.lang.String] => Double): Self = StObject.set(x, "getBorderWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetBorderWidthUndefined: Self = StObject.set(x, "getBorderWidth", js.undefined)
      
      @scala.inline
      def setGetBottom(value: () => Double): Self = StObject.set(x, "getBottom", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBottomUndefined: Self = StObject.set(x, "getBottom", js.undefined)
      
      @scala.inline
      def setGetBox(value: (/* contentBox */ js.UndefOr[Boolean], /* local */ js.UndefOr[Boolean]) => _): Self = StObject.set(x, "getBox", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetBoxUndefined: Self = StObject.set(x, "getBox", js.undefined)
      
      @scala.inline
      def setGetHTML(value: () => java.lang.String): Self = StObject.set(x, "getHTML", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHTMLUndefined: Self = StObject.set(x, "getHTML", js.undefined)
      
      @scala.inline
      def setGetHeight(value: /* contentHeight */ js.UndefOr[Boolean] => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetHeightUndefined: Self = StObject.set(x, "getHeight", js.undefined)
      
      @scala.inline
      def setGetLeft(value: () => Double): Self = StObject.set(x, "getLeft", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLeftUndefined: Self = StObject.set(x, "getLeft", js.undefined)
      
      @scala.inline
      def setGetMargin(value: /* sides */ js.UndefOr[java.lang.String] => _): Self = StObject.set(x, "getMargin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMarginUndefined: Self = StObject.set(x, "getMargin", js.undefined)
      
      @scala.inline
      def setGetOffsetsTo(value: /* element */ js.UndefOr[js.Any] => Array): Self = StObject.set(x, "getOffsetsTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOffsetsToUndefined: Self = StObject.set(x, "getOffsetsTo", js.undefined)
      
      @scala.inline
      def setGetOuterHeight(value: () => Unit): Self = StObject.set(x, "getOuterHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOuterHeightUndefined: Self = StObject.set(x, "getOuterHeight", js.undefined)
      
      @scala.inline
      def setGetOuterWidth(value: () => Unit): Self = StObject.set(x, "getOuterWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOuterWidthUndefined: Self = StObject.set(x, "getOuterWidth", js.undefined)
      
      @scala.inline
      def setGetPadding(value: /* side */ js.UndefOr[java.lang.String] => Double): Self = StObject.set(x, "getPadding", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPaddingUndefined: Self = StObject.set(x, "getPadding", js.undefined)
      
      @scala.inline
      def setGetPageBox(value: /* asRegion */ js.UndefOr[Boolean] => _): Self = StObject.set(x, "getPageBox", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPageBoxUndefined: Self = StObject.set(x, "getPageBox", js.undefined)
      
      @scala.inline
      def setGetRight(value: () => Double): Self = StObject.set(x, "getRight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRightUndefined: Self = StObject.set(x, "getRight", js.undefined)
      
      @scala.inline
      def setGetScrollParent(value: () => Unit): Self = StObject.set(x, "getScrollParent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScrollParentUndefined: Self = StObject.set(x, "getScrollParent", js.undefined)
      
      @scala.inline
      def setGetSize(value: /* contentSize */ js.UndefOr[Boolean] => _): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSizeUndefined: Self = StObject.set(x, "getSize", js.undefined)
      
      @scala.inline
      def setGetStyle(value: /* prop */ js.UndefOr[java.lang.String] => java.lang.String): Self = StObject.set(x, "getStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetStyleUndefined: Self = StObject.set(x, "getStyle", js.undefined)
      
      @scala.inline
      def setGetTop(value: () => Double): Self = StObject.set(x, "getTop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTopUndefined: Self = StObject.set(x, "getTop", js.undefined)
      
      @scala.inline
      def setGetValue(value: /* asNumber */ js.UndefOr[Boolean] => _): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      @scala.inline
      def setGetViewSize(value: () => _): Self = StObject.set(x, "getViewSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetViewSizeUndefined: Self = StObject.set(x, "getViewSize", js.undefined)
      
      @scala.inline
      def setGetWidth(value: /* contentWidth */ js.UndefOr[Boolean] => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
      
      @scala.inline
      def setGetX(value: () => Double): Self = StObject.set(x, "getX", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetXUndefined: Self = StObject.set(x, "getX", js.undefined)
      
      @scala.inline
      def setGetXY(value: () => Array): Self = StObject.set(x, "getXY", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetXYUndefined: Self = StObject.set(x, "getXY", js.undefined)
      
      @scala.inline
      def setGetY(value: () => Double): Self = StObject.set(x, "getY", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetYUndefined: Self = StObject.set(x, "getY", js.undefined)
      
      @scala.inline
      def setHasCls(value: /* name */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "hasCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClsUndefined: Self = StObject.set(x, "hasCls", js.undefined)
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInsertAfter(value: /* el */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "insertAfter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsertAfterUndefined: Self = StObject.set(x, "insertAfter", js.undefined)
      
      @scala.inline
      def setInsertBefore(value: /* el */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "insertBefore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
      
      @scala.inline
      def setInsertFirst(value: /* element */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "insertFirst", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsertFirstUndefined: Self = StObject.set(x, "insertFirst", js.undefined)
      
      @scala.inline
      def setInsertHtml(
        value: (/* where */ js.UndefOr[java.lang.String], /* html */ js.UndefOr[java.lang.String], /* returnEl */ js.UndefOr[Boolean]) => _
      ): Self = StObject.set(x, "insertHtml", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInsertHtmlUndefined: Self = StObject.set(x, "insertHtml", js.undefined)
      
      @scala.inline
      def setInsertSibling(
        value: (/* el */ js.UndefOr[js.Any], /* where */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.IElement
      ): Self = StObject.set(x, "insertSibling", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInsertSiblingUndefined: Self = StObject.set(x, "insertSibling", js.undefined)
      
      @scala.inline
      def setIs(value: /* selector */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsDescendent(value: () => Unit): Self = StObject.set(x, "isDescendent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDescendentUndefined: Self = StObject.set(x, "isDescendent", js.undefined)
      
      @scala.inline
      def setIsStyle(
        value: (/* style */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[java.lang.String]) => Boolean
      ): Self = StObject.set(x, "isStyle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsStyleUndefined: Self = StObject.set(x, "isStyle", js.undefined)
      
      @scala.inline
      def setIsTransparent(value: /* prop */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "isTransparent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsTransparentUndefined: Self = StObject.set(x, "isTransparent", js.undefined)
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setLast(value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = StObject.set(x, "last", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      @scala.inline
      def setMask(value: () => Unit): Self = StObject.set(x, "mask", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setNext(value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = StObject.set(x, "next", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setOFFSETS(value: Double): Self = StObject.set(x, "OFFSETS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOFFSETSUndefined: Self = StObject.set(x, "OFFSETS", js.undefined)
      
      @scala.inline
      def setParent(value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = StObject.set(x, "parent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setPrev(value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _): Self = StObject.set(x, "prev", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      @scala.inline
      def setPurgeAllListeners(value: () => Unit): Self = StObject.set(x, "purgeAllListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPurgeAllListenersUndefined: Self = StObject.set(x, "purgeAllListeners", js.undefined)
      
      @scala.inline
      def setQuery(value: /* selector */ js.UndefOr[java.lang.String] => Array): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRadioCls(value: /* className */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "radioCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRadioClsUndefined: Self = StObject.set(x, "radioCls", js.undefined)
      
      @scala.inline
      def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveAllListeners(value: () => Unit): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveAllListenersUndefined: Self = StObject.set(x, "removeAllListeners", js.undefined)
      
      @scala.inline
      def setRemoveCls(
        value: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typings.senchaTouch.Ext.dom.IElement
      ): Self = StObject.set(x, "removeCls", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRemoveClsUndefined: Self = StObject.set(x, "removeCls", js.undefined)
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setRepaint(value: () => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "repaint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRepaintUndefined: Self = StObject.set(x, "repaint", js.undefined)
      
      @scala.inline
      def setReplace(value: /* element */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReplaceCls(
        value: (/* oldName */ js.UndefOr[java.lang.String], /* newName */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typings.senchaTouch.Ext.dom.IElement
      ): Self = StObject.set(x, "replaceCls", js.Any.fromFunction4(value))
      
      @scala.inline
      def setReplaceClsUndefined: Self = StObject.set(x, "replaceCls", js.undefined)
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setReplaceWith(value: /* el */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReplaceWithUndefined: Self = StObject.set(x, "replaceWith", js.undefined)
      
      @scala.inline
      def setSerializeForm(value: /* form */ js.UndefOr[js.Any] => java.lang.String): Self = StObject.set(x, "serializeForm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerializeFormUndefined: Self = StObject.set(x, "serializeForm", js.undefined)
      
      @scala.inline
      def setSet(
        value: (/* attributes */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.IElement
      ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetBottom(value: /* bottom */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setBottom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBottomUndefined: Self = StObject.set(x, "setBottom", js.undefined)
      
      @scala.inline
      def setSetBox(value: /* box */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setBox", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBoxUndefined: Self = StObject.set(x, "setBox", js.undefined)
      
      @scala.inline
      def setSetCls(value: /* className */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
      
      @scala.inline
      def setSetHTML(value: /* html */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setHTML", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHTMLUndefined: Self = StObject.set(x, "setHTML", js.undefined)
      
      @scala.inline
      def setSetHeight(value: /* height */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
      
      @scala.inline
      def setSetLeft(value: /* left */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLeftUndefined: Self = StObject.set(x, "setLeft", js.undefined)
      
      @scala.inline
      def setSetMaxHeight(value: /* height */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setMaxHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMaxHeightUndefined: Self = StObject.set(x, "setMaxHeight", js.undefined)
      
      @scala.inline
      def setSetMaxWidth(value: /* width */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setMaxWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMaxWidthUndefined: Self = StObject.set(x, "setMaxWidth", js.undefined)
      
      @scala.inline
      def setSetMinHeight(value: /* height */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setMinHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinHeightUndefined: Self = StObject.set(x, "setMinHeight", js.undefined)
      
      @scala.inline
      def setSetMinWidth(value: /* width */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setMinWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinWidthUndefined: Self = StObject.set(x, "setMinWidth", js.undefined)
      
      @scala.inline
      def setSetRight(value: /* right */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRightUndefined: Self = StObject.set(x, "setRight", js.undefined)
      
      @scala.inline
      def setSetSize(
        value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.dom.IElement
      ): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
      
      @scala.inline
      def setSetStyle(
        value: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => typings.senchaTouch.Ext.dom.IElement
      ): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
      
      @scala.inline
      def setSetTop(value: /* top */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setTop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTopLeft(value: () => Unit): Self = StObject.set(x, "setTopLeft", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetTopLeftUndefined: Self = StObject.set(x, "setTopLeft", js.undefined)
      
      @scala.inline
      def setSetTopUndefined: Self = StObject.set(x, "setTop", js.undefined)
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      @scala.inline
      def setSetVisibilityMode(value: /* mode */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setVisibilityMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetVisibilityModeUndefined: Self = StObject.set(x, "setVisibilityMode", js.undefined)
      
      @scala.inline
      def setSetVisible(value: /* visible */ js.UndefOr[Boolean] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetVisibleUndefined: Self = StObject.set(x, "setVisible", js.undefined)
      
      @scala.inline
      def setSetWidth(value: /* width */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
      
      @scala.inline
      def setSetX(value: /* x */ js.UndefOr[Double] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetXUndefined: Self = StObject.set(x, "setX", js.undefined)
      
      @scala.inline
      def setSetXY(value: /* pos */ js.UndefOr[Array] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setXY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetXYUndefined: Self = StObject.set(x, "setXY", js.undefined)
      
      @scala.inline
      def setSetY(value: /* y */ js.UndefOr[Double] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "setY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetYUndefined: Self = StObject.set(x, "setY", js.undefined)
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setToggleCls(value: /* className */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "toggleCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleClsUndefined: Self = StObject.set(x, "toggleCls", js.undefined)
      
      @scala.inline
      def setTranslatePoints(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double]) => _): Self = StObject.set(x, "translatePoints", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTranslatePointsUndefined: Self = StObject.set(x, "translatePoints", js.undefined)
      
      @scala.inline
      def setUnmask(value: () => Unit): Self = StObject.set(x, "unmask", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnmaskUndefined: Self = StObject.set(x, "unmask", js.undefined)
      
      @scala.inline
      def setUp(value: (/* simpleSelector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "up", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
      
      @scala.inline
      def setUpdate(value: /* html */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      @scala.inline
      def setVISIBILITY(value: Double): Self = StObject.set(x, "VISIBILITY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVISIBILITYUndefined: Self = StObject.set(x, "VISIBILITY", js.undefined)
      
      @scala.inline
      def setWrap(value: (/* config */ js.UndefOr[js.Any], /* domNode */ js.UndefOr[Boolean]) => _): Self = StObject.set(x, "wrap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  @js.native
  trait IHelper extends StObject {
    
    /** [Method] Creates new DOM element s and appends them to el
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    var append: js.UndefOr[
        js.Function3[
          /* el */ js.UndefOr[js.Any], 
          /* o */ js.UndefOr[js.Any], 
          /* returnElement */ js.UndefOr[Boolean], 
          _
        ]
      ] = js.native
    
    /** [Method] Applies a style specification to an element
      * @param el String/HTMLElement The element to apply styles to
      * @param styles String/Object/Function A style specification string e.g. 'width:100px', or object in the form {width:'100px'}, or a function which returns such a specification.
      */
    var applyStyles: js.UndefOr[js.Function2[/* el */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Creates a new Ext Template from the DOM object spec
      * @param o Object The DOM object spec (and children)
      * @returns Ext.Template The new template
      */
    var createTemplate: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], ITemplate]] = js.native
    
    /** [Method] Converts the styles from the given object to text
      * @param styles Object The object describing the styles.
      * @param buffer String[] The output buffer.
      * @returns String/String[] If buffer is passed, it is returned. Otherwise the style string is returned.
      */
    var generateStyles: js.UndefOr[js.Function2[/* styles */ js.UndefOr[js.Any], /* buffer */ js.UndefOr[Array], _]] = js.native
    
    /** [Method] Creates new DOM element s and inserts them after el
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object The DOM object spec (and children)
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    var insertAfter: js.UndefOr[
        js.Function3[
          /* el */ js.UndefOr[js.Any], 
          /* o */ js.UndefOr[js.Any], 
          /* returnElement */ js.UndefOr[Boolean], 
          _
        ]
      ] = js.native
    
    /** [Method] Creates new DOM element s and inserts them before el
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    var insertBefore: js.UndefOr[
        js.Function3[
          /* el */ js.UndefOr[js.Any], 
          /* o */ js.UndefOr[js.Any], 
          /* returnElement */ js.UndefOr[Boolean], 
          _
        ]
      ] = js.native
    
    /** [Method] Creates new DOM element s and inserts them as the first child of el
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    var insertFirst: js.UndefOr[
        js.Function3[
          /* el */ js.UndefOr[js.Any], 
          /* o */ js.UndefOr[js.Any], 
          /* returnElement */ js.UndefOr[Boolean], 
          _
        ]
      ] = js.native
    
    /** [Method] Inserts an HTML fragment into the DOM
      * @param where String Where to insert the html in relation to el - beforeBegin, afterBegin, beforeEnd, afterEnd. For example take the following HTML: &lt;div&gt;Contents&lt;/div&gt; Using different where values inserts element to the following places:  beforeBegin: &lt;HERE&gt;&lt;div&gt;Contents&lt;/div&gt; afterBegin: &lt;div&gt;&lt;HERE&gt;Contents&lt;/div&gt; beforeEnd: &lt;div&gt;Contents&lt;HERE&gt;&lt;/div&gt; afterEnd: &lt;div&gt;Contents&lt;/div&gt;&lt;HERE&gt;
      * @param el HTMLElement/TextNode The context element
      * @param html String The HTML fragment
      * @returns HTMLElement The new node
      */
    var insertHtml: js.UndefOr[
        js.Function3[
          /* where */ js.UndefOr[java.lang.String], 
          /* el */ js.UndefOr[js.Any], 
          /* html */ js.UndefOr[java.lang.String], 
          HTMLElement
        ]
      ] = js.native
    
    /** [Method] Returns the markup for the passed Element s config
      * @param spec Object The DOM object spec (and children).
      * @returns String
      */
    var markup: js.UndefOr[js.Function1[/* spec */ js.UndefOr[js.Any], java.lang.String]] = js.native
    
    /** [Method] Creates new DOM element s and overwrites the contents of el with them
      * @param el String/HTMLElement/Ext.Element The context element
      * @param o Object/String The DOM object spec (and children) or raw HTML blob
      * @param returnElement Boolean true to return a Ext.Element
      * @returns HTMLElement/Ext.Element The new node
      */
    var overwrite: js.UndefOr[
        js.Function3[
          /* el */ js.UndefOr[js.Any], 
          /* o */ js.UndefOr[js.Any], 
          /* returnElement */ js.UndefOr[Boolean], 
          _
        ]
      ] = js.native
  }
  object IHelper {
    
    @scala.inline
    def apply(): IHelper = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHelper]
    }
    
    @scala.inline
    implicit class IHelperMutableBuilder[Self <: IHelper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppend(
        value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
      ): Self = StObject.set(x, "append", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      @scala.inline
      def setApplyStyles(value: (/* el */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "applyStyles", js.Any.fromFunction2(value))
      
      @scala.inline
      def setApplyStylesUndefined: Self = StObject.set(x, "applyStyles", js.undefined)
      
      @scala.inline
      def setCreateTemplate(value: /* o */ js.UndefOr[js.Any] => ITemplate): Self = StObject.set(x, "createTemplate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateTemplateUndefined: Self = StObject.set(x, "createTemplate", js.undefined)
      
      @scala.inline
      def setGenerateStyles(value: (/* styles */ js.UndefOr[js.Any], /* buffer */ js.UndefOr[Array]) => _): Self = StObject.set(x, "generateStyles", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGenerateStylesUndefined: Self = StObject.set(x, "generateStyles", js.undefined)
      
      @scala.inline
      def setInsertAfter(
        value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
      ): Self = StObject.set(x, "insertAfter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInsertAfterUndefined: Self = StObject.set(x, "insertAfter", js.undefined)
      
      @scala.inline
      def setInsertBefore(
        value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
      ): Self = StObject.set(x, "insertBefore", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
      
      @scala.inline
      def setInsertFirst(
        value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
      ): Self = StObject.set(x, "insertFirst", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInsertFirstUndefined: Self = StObject.set(x, "insertFirst", js.undefined)
      
      @scala.inline
      def setInsertHtml(
        value: (/* where */ js.UndefOr[java.lang.String], /* el */ js.UndefOr[js.Any], /* html */ js.UndefOr[java.lang.String]) => HTMLElement
      ): Self = StObject.set(x, "insertHtml", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInsertHtmlUndefined: Self = StObject.set(x, "insertHtml", js.undefined)
      
      @scala.inline
      def setMarkup(value: /* spec */ js.UndefOr[js.Any] => java.lang.String): Self = StObject.set(x, "markup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMarkupUndefined: Self = StObject.set(x, "markup", js.undefined)
      
      @scala.inline
      def setOverwrite(
        value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
      ): Self = StObject.set(x, "overwrite", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    }
  }
  
  @js.native
  trait IQuery extends IBase {
    
    /** [Method] Returns true if the passed element s match the passed simple selector e g
      * @param el String/HTMLElement/Array An element id, element or array of elements
      * @param selector String The simple selector to test
      * @returns Boolean
      */
    var is: js.UndefOr[
        js.Function2[/* el */ js.UndefOr[js.Any], /* selector */ js.UndefOr[java.lang.String], Boolean]
      ] = js.native
    
    /** [Method] Selects a group of elements
      * @param selector String The selector/xpath query (can be a comma separated list of selectors)
      * @param root HTMLElement/String The start of the query (defaults to document).
      * @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
      */
    var select: js.UndefOr[
        js.Function2[/* selector */ js.UndefOr[java.lang.String], /* root */ js.UndefOr[js.Any], Array]
      ] = js.native
    
    /** [Method] Selects a single element
      * @param selector String The selector/xpath query
      * @param root HTMLElement/String The start of the query (defaults to document).
      * @returns HTMLElement The DOM element which matched the selector.
      */
    var selectNode: js.UndefOr[
        js.Function2[
          /* selector */ js.UndefOr[java.lang.String], 
          /* root */ js.UndefOr[js.Any], 
          HTMLElement
        ]
      ] = js.native
  }
  object IQuery {
    
    @scala.inline
    def apply(): IQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IQuery]
    }
    
    @scala.inline
    implicit class IQueryMutableBuilder[Self <: IQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIs(value: (/* el */ js.UndefOr[js.Any], /* selector */ js.UndefOr[java.lang.String]) => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setSelect(value: (/* selector */ js.UndefOr[java.lang.String], /* root */ js.UndefOr[js.Any]) => Array): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelectNode(value: (/* selector */ js.UndefOr[java.lang.String], /* root */ js.UndefOr[js.Any]) => HTMLElement): Self = StObject.set(x, "selectNode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelectNodeUndefined: Self = StObject.set(x, "selectNode", js.undefined)
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    }
  }
}
