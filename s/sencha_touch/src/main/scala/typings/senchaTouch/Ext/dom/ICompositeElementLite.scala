package typings.senchaTouch.Ext.dom

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.mixin.IObservable
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompositeElementLite extends IElement {
  /** [Method] Adds elements to this Composite object
    * @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an Array of DOM elements to add, or another Composite object who's elements should be added.
    * @param root HTMLElement/String The root element of the query or id of the root.
    * @returns Ext.dom.CompositeElementLite This Composite object.
    */
  var add: js.UndefOr[
    js.Function2[/* els */ js.UndefOr[js.Any], /* root */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Adds the given CSS class es to this Element
    * @param names String The CSS class(es) to add to this element.
    * @param prefix String Prefix to prepend to each class.
    * @param suffix String Suffix to append to each class.
    * @returns Ext.dom.Element this
    */
  @JSName("addCls")
  var addCls_ICompositeElementLite: js.UndefOr[
    js.Function3[
      /* names */ js.UndefOr[String], 
      /* prefix */ js.UndefOr[String], 
      /* suffix */ js.UndefOr[String], 
      IElement
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
      /* eventName */ js.UndefOr[js.Any], 
      /* handler */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* opt */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Appends the passed element s to this element
    * @param element HTMLElement/Ext.dom.Element a DOM Node or an existing Element.
    * @returns Ext.dom.Element This element.
    */
  @JSName("appendChild")
  var appendChild_ICompositeElementLite: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Appends this element to the passed element
    * @param el String/HTMLElement/Ext.dom.Element The new parent element. The id of the node, a DOM Node or an existing Element.
    * @returns Ext.dom.Element This element.
    */
  @JSName("appendTo")
  var appendTo_ICompositeElementLite: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] More flexible version of setStyle for setting style properties
    * @param styles String/Object/Function A style specification string, e.g. "width:100px", or object in the form {width:"100px"}, or a function which returns such a specification.
    * @returns Ext.dom.Element this
    */
  @JSName("applyStyles")
  var applyStyles_ICompositeElementLite: js.UndefOr[js.Function1[/* styles */ js.UndefOr[js.Any], IElement]] = js.undefined
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
      /* config */ js.UndefOr[js.Any], 
      /* insertBefore */ js.UndefOr[HTMLElement], 
      /* returnDom */ js.UndefOr[Boolean], 
      IElement
    ]
  ] = js.undefined
  /** [Method] Calls the passed function for each element in this composite
    * @param fn Function The function to call.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Element.
    * @returns Ext.dom.CompositeElementLite this
    */
  var each: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Property] (HTMLElement[]) */
  var elements: js.UndefOr[Array] = js.undefined
  /** [Method] Clears this Composite and adds the elements passed
    * @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an array of DOM elements, or another Composite from which to fill this Composite.
    * @returns Ext.dom.CompositeElementLite this
    */
  var fill: js.UndefOr[js.Function1[/* els */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Filters this composite to only elements that match the passed selector
    * @param selector String/Function A string CSS selector or a comparison function. The comparison function will be called with the following arguments:
    * @returns Ext.dom.CompositeElementLite this
    */
  var filter: js.UndefOr[js.Function1[/* selector */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Returns the number of elements in this Composite
    * @returns Number
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Find the index of the passed element within the composite collection
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.dom.Element, or an HtmlElement to find within the composite collection.
    * @returns Number The index of the passed Ext.dom.Element in the composite collection, or -1 if not found.
    */
  var indexOf: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Double]] = js.undefined
  /** [Method] Inserts this element after the passed element in the DOM
    * @param el String/HTMLElement/Ext.dom.Element The element to insert after. The id of the node, a DOM Node or an existing Element.
    * @returns Ext.dom.Element This element.
    */
  @JSName("insertAfter")
  var insertAfter_ICompositeElementLite: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Inserts this element before the passed element in the DOM
    * @param el String/HTMLElement/Ext.dom.Element The element before which this element will be inserted. The id of the node, a DOM Node or an existing Element.
    * @returns Ext.dom.Element This element.
    */
  @JSName("insertBefore")
  var insertBefore_ICompositeElementLite: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Inserts an element as the first child of this element
    * @param element String/HTMLElement/Ext.dom.Element The id or element to insert.
    * @returns Ext.dom.Element this
    */
  @JSName("insertFirst")
  var insertFirst_ICompositeElementLite: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], IElement]] = js.undefined
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
      /* where */ js.UndefOr[String], 
      /* returnDom */ js.UndefOr[Boolean], 
      IElement
    ]
  ] = js.undefined
  /** [Method] Returns a flyweight Element of the dom element object at the specified index
    * @param index Number
    * @returns Ext.dom.Element
    */
  var item: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], IElement]] = js.undefined
  /** [Method] Adds one or more CSS classes to this element and removes the same class es from all siblings
    * @param className String/String[] The CSS class to add, or an array of classes.
    * @returns Ext.dom.Element this
    */
  @JSName("radioCls")
  var radioCls_ICompositeElementLite: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Removes the given CSS class es from this Element
    * @param names String The CSS class(es) to remove from this element.
    * @param prefix String Prefix to prepend to each class to be removed.
    * @param suffix String Suffix to append to each class to be removed.
    * @returns Ext.dom.Element this
    */
  @JSName("removeCls")
  var removeCls_ICompositeElementLite: js.UndefOr[
    js.Function3[
      /* names */ js.UndefOr[String], 
      /* prefix */ js.UndefOr[String], 
      /* suffix */ js.UndefOr[String], 
      IElement
    ]
  ] = js.undefined
  /** [Method] Removes the specified element s
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
    * @param removeDom Boolean true to also remove the element from the document
    * @returns Ext.dom.CompositeElementLite this
    */
  var removeElement: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  /** [Method] Forces the browser to repaint this element
    * @returns Ext.dom.Element this
    */
  @JSName("repaint")
  var repaint_ICompositeElementLite: js.UndefOr[js.Function0[IElement]] = js.undefined
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
      /* oldName */ js.UndefOr[String], 
      /* newName */ js.UndefOr[String], 
      /* prefix */ js.UndefOr[String], 
      /* suffix */ js.UndefOr[String], 
      IElement
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
      /* el */ js.UndefOr[js.Any], 
      /* replacement */ js.UndefOr[js.Any], 
      /* domReplace */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Replaces this element with the passed element
    * @param el String/HTMLElement/Ext.dom.Element/Object The new element (id of the node, a DOM Node or an existing Element) or a DomHelper config of an element to create.
    * @returns Ext.dom.Element This element.
    */
  @JSName("replaceWith")
  var replaceWith_ICompositeElementLite: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Replaces the passed element with this element
    * @param element String/HTMLElement/Ext.dom.Element The element to replace. The id of the node, a DOM Node or an existing Element.
    * @returns Ext.dom.Element This element.
    */
  @JSName("replace")
  var replace_ICompositeElementLite: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Selects elements based on the passed CSS selector to enable Element methods to be applied to many related elements in
    * @param selector String/HTMLElement[] The CSS selector or an array of elements
    * @param composite Boolean Return a CompositeElement as opposed to a CompositeElementLite. Defaults to false.
    * @returns Ext.dom.CompositeElementLite/Ext.dom.CompositeElement
    */
  var select: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[js.Any], /* composite */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  /** [Method] Sets the element s CSS bottom style
    * @param bottom String The bottom CSS property value.
    * @returns Ext.dom.Element this
    */
  @JSName("setBottom")
  var setBottom_ICompositeElementLite: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[String], IElement]] = js.undefined
  /** [Method] Sets the element s box
    * @param box Object The box to fill, for example: {  left: ...,  top: ...,  width: ...,  height: ... }
    * @returns Ext.dom.Element this
    */
  @JSName("setBox")
  var setBox_ICompositeElementLite: js.UndefOr[js.Function1[/* box */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Set the height of this Element
    * @param height Number/String The new height.
    * @returns Ext.dom.Element this
    */
  @JSName("setHeight")
  var setHeight_ICompositeElementLite: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Sets the element s left position directly using CSS style instead of setX
    * @param left String The left CSS property value.
    * @returns Ext.dom.Element this
    */
  @JSName("setLeft")
  var setLeft_ICompositeElementLite: js.UndefOr[js.Function1[/* left */ js.UndefOr[String], IElement]] = js.undefined
  /** [Method] Set the maximum height of this Element
    * @param height Number/String The new maximum height.
    * @returns Ext.dom.Element this
    */
  @JSName("setMaxHeight")
  var setMaxHeight_ICompositeElementLite: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Set the maximum width of this Element
    * @param width Number/String The new maximum width.
    * @returns Ext.dom.Element this
    */
  @JSName("setMaxWidth")
  var setMaxWidth_ICompositeElementLite: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Set the minimum height of this Element
    * @param height Number/String The new minimum height.
    * @returns Ext.dom.Element this
    */
  @JSName("setMinHeight")
  var setMinHeight_ICompositeElementLite: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Set the minimum width of this Element
    * @param width Number/String The new minimum width.
    * @returns Ext.dom.Element this
    */
  @JSName("setMinWidth")
  var setMinWidth_ICompositeElementLite: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Sets the element s CSS right style
    * @param right String The right CSS property value.
    * @returns Ext.dom.Element this
    */
  @JSName("setRight")
  var setRight_ICompositeElementLite: js.UndefOr[js.Function1[/* right */ js.UndefOr[String], IElement]] = js.undefined
  /** [Method] Set the size of this Element
    * @param width Number/String The new width. This may be one of:  A Number specifying the new width in this Element's defaultUnits (by default, pixels). A String used to set the CSS width style. Animation may not be used. A size object in the format {width: widthValue, height: heightValue}.
    * @param height Number/String The new height. This may be one of:  A Number specifying the new height in this Element's defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used.
    * @returns Ext.dom.Element this
    */
  @JSName("setSize")
  var setSize_ICompositeElementLite: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], IElement]
  ] = js.undefined
  /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
    * @param property String/Object The style property to be set, or an object of multiple styles.
    * @param value String The value to apply to the given property, or null if an object was passed.
    * @returns Ext.dom.Element this
    */
  @JSName("setStyle")
  var setStyle_ICompositeElementLite: js.UndefOr[
    js.Function2[/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], IElement]
  ] = js.undefined
  /** [Method] Sets the element s top position directly using CSS style instead of setY
    * @param top String The top CSS property value.
    * @returns Ext.dom.Element this
    */
  @JSName("setTop")
  var setTop_ICompositeElementLite: js.UndefOr[js.Function1[/* top */ js.UndefOr[String], IElement]] = js.undefined
  /** [Method] Use this to change the visibility mode between VISIBILITY DISPLAY or OFFSETS
    * @param mode Object
    * @returns Ext.dom.Element this
    */
  @JSName("setVisibilityMode")
  var setVisibilityMode_ICompositeElementLite: js.UndefOr[js.Function1[/* mode */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Sets the visibility of the element see details
    * @param visible Boolean Whether the element is visible.
    * @returns Ext.Element this
    */
  @JSName("setVisible")
  var setVisible_ICompositeElementLite: js.UndefOr[
    js.Function1[/* visible */ js.UndefOr[Boolean], typings.senchaTouch.Ext.IElement]
  ] = js.undefined
  /** [Method] Set the width of this Element
    * @param width Number/String The new width.
    * @returns Ext.dom.Element this
    */
  @JSName("setWidth")
  var setWidth_ICompositeElementLite: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Sets the position of the element in page coordinates regardless of how the element is positioned
    * @param pos Number[] Contains X &amp; Y [x, y] values for new position (coordinates are page-based).
    * @returns Ext.dom.Element this
    */
  @JSName("setXY")
  var setXY_ICompositeElementLite: js.UndefOr[js.Function1[/* pos */ js.UndefOr[Array], IElement]] = js.undefined
  /** [Method] Sets the X position of the element based on page coordinates
    * @param x Number The X position of the element
    * @returns Ext.dom.Element this
    */
  @JSName("setX")
  var setX_ICompositeElementLite: js.UndefOr[js.Function1[/* x */ js.UndefOr[Double], IElement]] = js.undefined
  /** [Method] Sets the Y position of the element based on page coordinates
    * @param y Number The Y position of the element.
    * @returns Ext.dom.Element this
    */
  @JSName("setY")
  var setY_ICompositeElementLite: js.UndefOr[js.Function1[/* y */ js.UndefOr[Double], IElement]] = js.undefined
  /** [Method] Sets the passed attributes as attributes of this element a style attribute can be a string object or function
    * @param attributes Object The object with the attributes.
    * @param useSet Boolean false to override the default setAttribute to use expandos.
    * @returns Ext.dom.Element this
    */
  @JSName("set")
  var set_ICompositeElementLite: js.UndefOr[
    js.Function2[/* attributes */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean], IElement]
  ] = js.undefined
  /** [Method] Toggles the specified CSS class on this element removes it if it already exists otherwise adds it
    * @param className String The CSS class to toggle.
    * @returns Ext.dom.Element this
    */
  @JSName("toggleCls")
  var toggleCls_ICompositeElementLite: js.UndefOr[js.Function1[/* className */ js.UndefOr[String], IElement]] = js.undefined
}

object ICompositeElementLite {
  @scala.inline
  def apply(
    DISPLAY: js.UndefOr[Double] = js.undefined,
    OFFSETS: js.UndefOr[Double] = js.undefined,
    VISIBILITY: js.UndefOr[Double] = js.undefined,
    add: (/* els */ js.UndefOr[js.Any], /* root */ js.UndefOr[js.Any]) => ICompositeElementLite = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addCls: (/* names */ js.UndefOr[String], /* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => IElement = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* opt */ js.UndefOr[js.Any]) => ICompositeElementLite = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    appendChild: /* element */ js.UndefOr[js.Any] => IElement = null,
    appendTo: /* el */ js.UndefOr[js.Any] => IElement = null,
    applyStyles: /* styles */ js.UndefOr[js.Any] => IElement = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    child: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    clear: () => Unit = null,
    clearListeners: () => Unit = null,
    config: js.Any = null,
    contains: /* element */ js.UndefOr[js.Any] => Boolean = null,
    createChild: (/* config */ js.UndefOr[js.Any], /* insertBefore */ js.UndefOr[HTMLElement], /* returnDom */ js.UndefOr[Boolean]) => IElement = null,
    cssTranslate: () => Unit = null,
    defaultUnit: String = null,
    destroy: () => Unit = null,
    dom: HTMLElement = null,
    down: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => ICompositeElementLite = null,
    elements: Array = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: String = null,
    fill: /* els */ js.UndefOr[js.Any] => ICompositeElementLite = null,
    filter: /* selector */ js.UndefOr[js.Any] => ICompositeElementLite = null,
    findParent: (/* simpleSelector */ js.UndefOr[String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => _ = null,
    findParentNode: (/* simpleSelector */ js.UndefOr[String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => _ = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    first: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    getAlignToXY: (/* element */ js.UndefOr[js.Any], /* position */ js.UndefOr[String], /* offsets */ js.UndefOr[Array]) => Array = null,
    getAnchorXY: (/* anchor */ js.UndefOr[String], /* local */ js.UndefOr[Boolean], /* size */ js.UndefOr[js.Any]) => Array = null,
    getAttribute: (/* name */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => String = null,
    getBorderWidth: /* side */ js.UndefOr[String] => Double = null,
    getBottom: () => Double = null,
    getBox: (/* contentBox */ js.UndefOr[Boolean], /* local */ js.UndefOr[Boolean]) => _ = null,
    getBubbleEvents: () => _ = null,
    getCount: () => Double = null,
    getHTML: () => String = null,
    getHeight: /* contentHeight */ js.UndefOr[Boolean] => Double = null,
    getHtml: () => String = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getLeft: () => Double = null,
    getListeners: () => _ = null,
    getMargin: /* sides */ js.UndefOr[String] => _ = null,
    getOffsetsTo: /* element */ js.UndefOr[js.Any] => Array = null,
    getOuterHeight: () => Unit = null,
    getOuterWidth: () => Unit = null,
    getPadding: /* side */ js.UndefOr[String] => Double = null,
    getPageBox: /* asRegion */ js.UndefOr[Boolean] => _ = null,
    getRight: () => Double = null,
    getScrollParent: () => Unit = null,
    getSize: /* contentSize */ js.UndefOr[Boolean] => _ = null,
    getStyle: /* prop */ js.UndefOr[String] => String = null,
    getTop: () => Double = null,
    getValue: /* asNumber */ js.UndefOr[Boolean] => _ = null,
    getViewSize: () => _ = null,
    getWidth: /* contentWidth */ js.UndefOr[Boolean] => Double = null,
    getX: () => Double = null,
    getXY: () => Array = null,
    getY: () => Double = null,
    hasCls: /* name */ js.UndefOr[String] => Boolean = null,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    hide: () => Unit = null,
    id: String = null,
    indexOf: /* el */ js.UndefOr[js.Any] => Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    insertAfter: /* el */ js.UndefOr[js.Any] => IElement = null,
    insertBefore: /* el */ js.UndefOr[js.Any] => IElement = null,
    insertFirst: /* element */ js.UndefOr[js.Any] => IElement = null,
    insertHtml: (/* where */ js.UndefOr[String], /* html */ js.UndefOr[String], /* returnEl */ js.UndefOr[Boolean]) => _ = null,
    insertSibling: (/* el */ js.UndefOr[js.Any], /* where */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => IElement = null,
    is: /* selector */ js.UndefOr[String] => Boolean = null,
    isDescendent: () => Unit = null,
    isStyle: (/* style */ js.UndefOr[String], /* value */ js.UndefOr[String]) => Boolean = null,
    isTransparent: /* prop */ js.UndefOr[String] => Boolean = null,
    item: /* index */ js.UndefOr[Double] => IElement = null,
    last: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    listeners: js.Any = null,
    mask: () => Unit = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    next: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    parent: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    platformConfig: js.Any = null,
    prev: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    purgeAllListeners: () => Unit = null,
    query: /* selector */ js.UndefOr[String] => Array = null,
    radioCls: /* className */ js.UndefOr[js.Any] => IElement = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    remove: () => Unit = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeAllListeners: () => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeCls: (/* names */ js.UndefOr[String], /* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => IElement = null,
    removeElement: (/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean]) => ICompositeElementLite = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    repaint: () => IElement = null,
    replace: /* element */ js.UndefOr[js.Any] => IElement = null,
    replaceCls: (/* oldName */ js.UndefOr[String], /* newName */ js.UndefOr[String], /* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => IElement = null,
    replaceElement: (/* el */ js.UndefOr[js.Any], /* replacement */ js.UndefOr[js.Any], /* domReplace */ js.UndefOr[Boolean]) => ICompositeElementLite = null,
    replaceWith: /* el */ js.UndefOr[js.Any] => IElement = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    select: (/* selector */ js.UndefOr[js.Any], /* composite */ js.UndefOr[Boolean]) => ICompositeElementLite = null,
    self: IClass = null,
    serializeForm: /* form */ js.UndefOr[js.Any] => String = null,
    set: (/* attributes */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean]) => IElement = null,
    setBottom: /* bottom */ js.UndefOr[String] => IElement = null,
    setBox: /* box */ js.UndefOr[js.Any] => IElement = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setCls: /* className */ js.UndefOr[js.Any] => Unit = null,
    setHTML: /* html */ js.UndefOr[String] => Unit = null,
    setHeight: /* height */ js.UndefOr[js.Any] => IElement = null,
    setHtml: /* html */ js.UndefOr[String] => Unit = null,
    setLeft: /* left */ js.UndefOr[String] => IElement = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setMaxHeight: /* height */ js.UndefOr[js.Any] => IElement = null,
    setMaxWidth: /* width */ js.UndefOr[js.Any] => IElement = null,
    setMinHeight: /* height */ js.UndefOr[js.Any] => IElement = null,
    setMinWidth: /* width */ js.UndefOr[js.Any] => IElement = null,
    setRight: /* right */ js.UndefOr[String] => IElement = null,
    setSize: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => IElement = null,
    setStyle: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => IElement = null,
    setTop: /* top */ js.UndefOr[String] => IElement = null,
    setTopLeft: () => Unit = null,
    setVisibilityMode: /* mode */ js.UndefOr[js.Any] => IElement = null,
    setVisible: /* visible */ js.UndefOr[Boolean] => typings.senchaTouch.Ext.IElement = null,
    setWidth: /* width */ js.UndefOr[js.Any] => IElement = null,
    setX: /* x */ js.UndefOr[Double] => IElement = null,
    setXY: /* pos */ js.UndefOr[Array] => IElement = null,
    setY: /* y */ js.UndefOr[Double] => IElement = null,
    show: () => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvents: () => Unit = null,
    toggleCls: /* className */ js.UndefOr[String] => IElement = null,
    translatePoints: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double]) => _ = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unmask: () => Unit = null,
    up: (/* simpleSelector */ js.UndefOr[String], /* maxDepth */ js.UndefOr[js.Any]) => _ = null,
    update: /* html */ js.UndefOr[String] => Unit = null,
    uses: Array = null,
    wrap: (/* config */ js.UndefOr[js.Any], /* domNode */ js.UndefOr[Boolean]) => _ = null
  ): ICompositeElementLite = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DISPLAY)) __obj.updateDynamic("DISPLAY")(DISPLAY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(OFFSETS)) __obj.updateDynamic("OFFSETS")(OFFSETS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(VISIBILITY)) __obj.updateDynamic("VISIBILITY")(VISIBILITY.get.asInstanceOf[js.Any])
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction2(add))
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction3(addCls))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction1(appendChild))
    if (appendTo != null) __obj.updateDynamic("appendTo")(js.Any.fromFunction1(appendTo))
    if (applyStyles != null) __obj.updateDynamic("applyStyles")(js.Any.fromFunction1(applyStyles))
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (child != null) __obj.updateDynamic("child")(js.Any.fromFunction2(child))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1(contains))
    if (createChild != null) __obj.updateDynamic("createChild")(js.Any.fromFunction3(createChild))
    if (cssTranslate != null) __obj.updateDynamic("cssTranslate")(js.Any.fromFunction0(cssTranslate))
    if (defaultUnit != null) __obj.updateDynamic("defaultUnit")(defaultUnit.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (dom != null) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction2(down))
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2(each))
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(js.Any.fromFunction1(fill))
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (findParent != null) __obj.updateDynamic("findParent")(js.Any.fromFunction3(findParent))
    if (findParentNode != null) __obj.updateDynamic("findParentNode")(js.Any.fromFunction3(findParentNode))
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction2(first))
    if (getAlignToXY != null) __obj.updateDynamic("getAlignToXY")(js.Any.fromFunction3(getAlignToXY))
    if (getAnchorXY != null) __obj.updateDynamic("getAnchorXY")(js.Any.fromFunction3(getAnchorXY))
    if (getAttribute != null) __obj.updateDynamic("getAttribute")(js.Any.fromFunction2(getAttribute))
    if (getBorderWidth != null) __obj.updateDynamic("getBorderWidth")(js.Any.fromFunction1(getBorderWidth))
    if (getBottom != null) __obj.updateDynamic("getBottom")(js.Any.fromFunction0(getBottom))
    if (getBox != null) __obj.updateDynamic("getBox")(js.Any.fromFunction2(getBox))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getHTML != null) __obj.updateDynamic("getHTML")(js.Any.fromFunction0(getHTML))
    if (getHeight != null) __obj.updateDynamic("getHeight")(js.Any.fromFunction1(getHeight))
    if (getHtml != null) __obj.updateDynamic("getHtml")(js.Any.fromFunction0(getHtml))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLeft != null) __obj.updateDynamic("getLeft")(js.Any.fromFunction0(getLeft))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getMargin != null) __obj.updateDynamic("getMargin")(js.Any.fromFunction1(getMargin))
    if (getOffsetsTo != null) __obj.updateDynamic("getOffsetsTo")(js.Any.fromFunction1(getOffsetsTo))
    if (getOuterHeight != null) __obj.updateDynamic("getOuterHeight")(js.Any.fromFunction0(getOuterHeight))
    if (getOuterWidth != null) __obj.updateDynamic("getOuterWidth")(js.Any.fromFunction0(getOuterWidth))
    if (getPadding != null) __obj.updateDynamic("getPadding")(js.Any.fromFunction1(getPadding))
    if (getPageBox != null) __obj.updateDynamic("getPageBox")(js.Any.fromFunction1(getPageBox))
    if (getRight != null) __obj.updateDynamic("getRight")(js.Any.fromFunction0(getRight))
    if (getScrollParent != null) __obj.updateDynamic("getScrollParent")(js.Any.fromFunction0(getScrollParent))
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction1(getSize))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction1(getStyle))
    if (getTop != null) __obj.updateDynamic("getTop")(js.Any.fromFunction0(getTop))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction1(getValue))
    if (getViewSize != null) __obj.updateDynamic("getViewSize")(js.Any.fromFunction0(getViewSize))
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction1(getWidth))
    if (getX != null) __obj.updateDynamic("getX")(js.Any.fromFunction0(getX))
    if (getXY != null) __obj.updateDynamic("getXY")(js.Any.fromFunction0(getXY))
    if (getY != null) __obj.updateDynamic("getY")(js.Any.fromFunction0(getY))
    if (hasCls != null) __obj.updateDynamic("hasCls")(js.Any.fromFunction1(hasCls))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1(indexOf))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(js.Any.fromFunction1(insertAfter))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction1(insertBefore))
    if (insertFirst != null) __obj.updateDynamic("insertFirst")(js.Any.fromFunction1(insertFirst))
    if (insertHtml != null) __obj.updateDynamic("insertHtml")(js.Any.fromFunction3(insertHtml))
    if (insertSibling != null) __obj.updateDynamic("insertSibling")(js.Any.fromFunction3(insertSibling))
    if (is != null) __obj.updateDynamic("is")(js.Any.fromFunction1(is))
    if (isDescendent != null) __obj.updateDynamic("isDescendent")(js.Any.fromFunction0(isDescendent))
    if (isStyle != null) __obj.updateDynamic("isStyle")(js.Any.fromFunction2(isStyle))
    if (isTransparent != null) __obj.updateDynamic("isTransparent")(js.Any.fromFunction1(isTransparent))
    if (item != null) __obj.updateDynamic("item")(js.Any.fromFunction1(item))
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction2(last))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(js.Any.fromFunction0(mask))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction2(next))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (parent != null) __obj.updateDynamic("parent")(js.Any.fromFunction2(parent))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(js.Any.fromFunction2(prev))
    if (purgeAllListeners != null) __obj.updateDynamic("purgeAllListeners")(js.Any.fromFunction0(purgeAllListeners))
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1(query))
    if (radioCls != null) __obj.updateDynamic("radioCls")(js.Any.fromFunction1(radioCls))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction0(remove))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeAllListeners != null) __obj.updateDynamic("removeAllListeners")(js.Any.fromFunction0(removeAllListeners))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction3(removeCls))
    if (removeElement != null) __obj.updateDynamic("removeElement")(js.Any.fromFunction2(removeElement))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (repaint != null) __obj.updateDynamic("repaint")(js.Any.fromFunction0(repaint))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction1(replace))
    if (replaceCls != null) __obj.updateDynamic("replaceCls")(js.Any.fromFunction4(replaceCls))
    if (replaceElement != null) __obj.updateDynamic("replaceElement")(js.Any.fromFunction3(replaceElement))
    if (replaceWith != null) __obj.updateDynamic("replaceWith")(js.Any.fromFunction1(replaceWith))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2(select))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (serializeForm != null) __obj.updateDynamic("serializeForm")(js.Any.fromFunction1(serializeForm))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2(set))
    if (setBottom != null) __obj.updateDynamic("setBottom")(js.Any.fromFunction1(setBottom))
    if (setBox != null) __obj.updateDynamic("setBox")(js.Any.fromFunction1(setBox))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1(setCls))
    if (setHTML != null) __obj.updateDynamic("setHTML")(js.Any.fromFunction1(setHTML))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setHtml != null) __obj.updateDynamic("setHtml")(js.Any.fromFunction1(setHtml))
    if (setLeft != null) __obj.updateDynamic("setLeft")(js.Any.fromFunction1(setLeft))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setMaxHeight != null) __obj.updateDynamic("setMaxHeight")(js.Any.fromFunction1(setMaxHeight))
    if (setMaxWidth != null) __obj.updateDynamic("setMaxWidth")(js.Any.fromFunction1(setMaxWidth))
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(js.Any.fromFunction1(setMinHeight))
    if (setMinWidth != null) __obj.updateDynamic("setMinWidth")(js.Any.fromFunction1(setMinWidth))
    if (setRight != null) __obj.updateDynamic("setRight")(js.Any.fromFunction1(setRight))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2(setSize))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction2(setStyle))
    if (setTop != null) __obj.updateDynamic("setTop")(js.Any.fromFunction1(setTop))
    if (setTopLeft != null) __obj.updateDynamic("setTopLeft")(js.Any.fromFunction0(setTopLeft))
    if (setVisibilityMode != null) __obj.updateDynamic("setVisibilityMode")(js.Any.fromFunction1(setVisibilityMode))
    if (setVisible != null) __obj.updateDynamic("setVisible")(js.Any.fromFunction1(setVisible))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    if (setX != null) __obj.updateDynamic("setX")(js.Any.fromFunction1(setX))
    if (setXY != null) __obj.updateDynamic("setXY")(js.Any.fromFunction1(setXY))
    if (setY != null) __obj.updateDynamic("setY")(js.Any.fromFunction1(setY))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (toggleCls != null) __obj.updateDynamic("toggleCls")(js.Any.fromFunction1(toggleCls))
    if (translatePoints != null) __obj.updateDynamic("translatePoints")(js.Any.fromFunction2(translatePoints))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (unmask != null) __obj.updateDynamic("unmask")(js.Any.fromFunction0(unmask))
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction2(up))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(js.Any.fromFunction2(wrap))
    __obj.asInstanceOf[ICompositeElementLite]
  }
}

