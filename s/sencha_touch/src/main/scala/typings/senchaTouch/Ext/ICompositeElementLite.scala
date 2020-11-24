package typings.senchaTouch.Ext

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var setVisible_ICompositeElementLite: js.UndefOr[js.Function1[/* visible */ js.UndefOr[Boolean], IElement]] = js.native
  
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
  def apply(): ICompositeElementLite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompositeElementLite]
  }
  
  @scala.inline
  implicit class ICompositeElementLiteOps[Self <: ICompositeElementLite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: (/* els */ js.UndefOr[js.Any], /* root */ js.UndefOr[js.Any]) => ICompositeElementLite): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setAddCls(
      value: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typings.senchaTouch.Ext.dom.IElement
    ): Self = this.set("addCls", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAddCls: Self = this.set("addCls", js.undefined)
    
    @scala.inline
    def setAddListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* opt */ js.UndefOr[js.Any]) => ICompositeElementLite
    ): Self = this.set("addListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteAddListener: Self = this.set("addListener", js.undefined)
    
    @scala.inline
    def setAppendChild(value: /* element */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("appendChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAppendChild: Self = this.set("appendChild", js.undefined)
    
    @scala.inline
    def setAppendTo(value: /* el */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("appendTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    
    @scala.inline
    def setApplyStyles(value: /* styles */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("applyStyles", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteApplyStyles: Self = this.set("applyStyles", js.undefined)
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    
    @scala.inline
    def setCreateChild(
      value: (/* config */ js.UndefOr[js.Any], /* insertBefore */ js.UndefOr[HTMLElement], /* returnDom */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.IElement
    ): Self = this.set("createChild", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCreateChild: Self = this.set("createChild", js.undefined)
    
    @scala.inline
    def setEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => ICompositeElementLite): Self = this.set("each", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    
    @scala.inline
    def setElements(value: Array): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    
    @scala.inline
    def setFill(value: /* els */ js.UndefOr[js.Any] => ICompositeElementLite): Self = this.set("fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFilter(value: /* selector */ js.UndefOr[js.Any] => ICompositeElementLite): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCount: Self = this.set("getCount", js.undefined)
    
    @scala.inline
    def setIndexOf(value: /* el */ js.UndefOr[js.Any] => Double): Self = this.set("indexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIndexOf: Self = this.set("indexOf", js.undefined)
    
    @scala.inline
    def setInsertAfter(value: /* el */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("insertAfter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInsertAfter: Self = this.set("insertAfter", js.undefined)
    
    @scala.inline
    def setInsertBefore(value: /* el */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("insertBefore", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInsertBefore: Self = this.set("insertBefore", js.undefined)
    
    @scala.inline
    def setInsertFirst(value: /* element */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("insertFirst", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInsertFirst: Self = this.set("insertFirst", js.undefined)
    
    @scala.inline
    def setInsertSibling(
      value: (/* el */ js.UndefOr[js.Any], /* where */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.IElement
    ): Self = this.set("insertSibling", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteInsertSibling: Self = this.set("insertSibling", js.undefined)
    
    @scala.inline
    def setItem(value: /* index */ js.UndefOr[Double] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("item", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setRadioCls(value: /* className */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("radioCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRadioCls: Self = this.set("radioCls", js.undefined)
    
    @scala.inline
    def setRemoveCls(
      value: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typings.senchaTouch.Ext.dom.IElement
    ): Self = this.set("removeCls", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRemoveCls: Self = this.set("removeCls", js.undefined)
    
    @scala.inline
    def setRemoveElement(value: (/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean]) => ICompositeElementLite): Self = this.set("removeElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveElement: Self = this.set("removeElement", js.undefined)
    
    @scala.inline
    def setRepaint(value: () => typings.senchaTouch.Ext.dom.IElement): Self = this.set("repaint", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRepaint: Self = this.set("repaint", js.undefined)
    
    @scala.inline
    def setReplace(value: /* element */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("replace", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    
    @scala.inline
    def setReplaceCls(
      value: (/* oldName */ js.UndefOr[java.lang.String], /* newName */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typings.senchaTouch.Ext.dom.IElement
    ): Self = this.set("replaceCls", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteReplaceCls: Self = this.set("replaceCls", js.undefined)
    
    @scala.inline
    def setReplaceElement(
      value: (/* el */ js.UndefOr[js.Any], /* replacement */ js.UndefOr[js.Any], /* domReplace */ js.UndefOr[Boolean]) => ICompositeElementLite
    ): Self = this.set("replaceElement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteReplaceElement: Self = this.set("replaceElement", js.undefined)
    
    @scala.inline
    def setReplaceWith(value: /* el */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("replaceWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReplaceWith: Self = this.set("replaceWith", js.undefined)
    
    @scala.inline
    def setSelect(
      value: (/* selector */ js.UndefOr[js.Any], /* composite */ js.UndefOr[Boolean]) => ICompositeElementLite
    ): Self = this.set("select", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSet(
      value: (/* attributes */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.dom.IElement
    ): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    
    @scala.inline
    def setSetBottom(value: /* bottom */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("setBottom", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetBottom: Self = this.set("setBottom", js.undefined)
    
    @scala.inline
    def setSetBox(value: /* box */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("setBox", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetBox: Self = this.set("setBox", js.undefined)
    
    @scala.inline
    def setSetHeight(value: /* height */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("setHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHeight: Self = this.set("setHeight", js.undefined)
    
    @scala.inline
    def setSetLeft(value: /* left */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("setLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLeft: Self = this.set("setLeft", js.undefined)
    
    @scala.inline
    def setSetMaxHeight(value: /* height */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("setMaxHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMaxHeight: Self = this.set("setMaxHeight", js.undefined)
    
    @scala.inline
    def setSetMaxWidth(value: /* width */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("setMaxWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMaxWidth: Self = this.set("setMaxWidth", js.undefined)
    
    @scala.inline
    def setSetMinHeight(value: /* height */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("setMinHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMinHeight: Self = this.set("setMinHeight", js.undefined)
    
    @scala.inline
    def setSetMinWidth(value: /* width */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("setMinWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMinWidth: Self = this.set("setMinWidth", js.undefined)
    
    @scala.inline
    def setSetRight(value: /* right */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("setRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRight: Self = this.set("setRight", js.undefined)
    
    @scala.inline
    def setSetSize(
      value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.dom.IElement
    ): Self = this.set("setSize", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetSize: Self = this.set("setSize", js.undefined)
    
    @scala.inline
    def setSetStyle(
      value: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => typings.senchaTouch.Ext.dom.IElement
    ): Self = this.set("setStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetStyle: Self = this.set("setStyle", js.undefined)
    
    @scala.inline
    def setSetTop(value: /* top */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("setTop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTop: Self = this.set("setTop", js.undefined)
    
    @scala.inline
    def setSetVisibilityMode(value: /* mode */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("setVisibilityMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetVisibilityMode: Self = this.set("setVisibilityMode", js.undefined)
    
    @scala.inline
    def setSetVisible(value: /* visible */ js.UndefOr[Boolean] => IElement): Self = this.set("setVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetVisible: Self = this.set("setVisible", js.undefined)
    
    @scala.inline
    def setSetWidth(value: /* width */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("setWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetWidth: Self = this.set("setWidth", js.undefined)
    
    @scala.inline
    def setSetX(value: /* x */ js.UndefOr[Double] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("setX", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetX: Self = this.set("setX", js.undefined)
    
    @scala.inline
    def setSetXY(value: /* pos */ js.UndefOr[Array] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("setXY", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetXY: Self = this.set("setXY", js.undefined)
    
    @scala.inline
    def setSetY(value: /* y */ js.UndefOr[Double] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("setY", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetY: Self = this.set("setY", js.undefined)
    
    @scala.inline
    def setToggleCls(value: /* className */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.dom.IElement): Self = this.set("toggleCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToggleCls: Self = this.set("toggleCls", js.undefined)
  }
}
