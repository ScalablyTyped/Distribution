package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.mixin.IObservable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IElement
  extends StObject
     with IObservable {
  
  /** [Property] (Number) */
  var DISPLAY: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Number) */
  var OFFSETS: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Number) */
  var VISIBILITY: js.UndefOr[Double] = js.undefined
  
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
  ] = js.undefined
  
  /** [Method] Appends the passed element s to this element
    * @param element HTMLElement/Ext.dom.Element a DOM Node or an existing Element.
    * @returns Ext.dom.Element This element.
    */
  var appendChild: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Appends this element to the passed element
    * @param el String/HTMLElement/Ext.dom.Element The new parent element. The id of the node, a DOM Node or an existing Element.
    * @returns Ext.dom.Element This element.
    */
  var appendTo: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] More flexible version of setStyle for setting style properties
    * @param styles String/Object/Function A style specification string, e.g. "width:100px", or object in the form {width:"100px"}, or a function which returns such a specification.
    * @returns Ext.dom.Element this
    */
  var applyStyles: js.UndefOr[js.Function1[/* styles */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Selects a single direct child based on the passed CSS selector the selector should not contain an id
    * @param selector String The CSS selector.
    * @param returnDom Boolean true to return the DOM node instead of Ext.dom.Element.
    * @returns HTMLElement/Ext.dom.Element The child Ext.dom.Element (or DOM node if returnDom is true)
    */
  var child: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[Boolean], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Returns true if this element is an ancestor of the passed element
    * @param element HTMLElement/String The element to check.
    * @returns Boolean true if this element is an ancestor of el, else false.
    */
  var contains: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Boolean]] = js.undefined
  
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
  ] = js.undefined
  
  /** [Method] Translates an element using CSS 3 in 2D  */
  var cssTranslate: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (String) */
  var defaultUnit: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Property] (HTMLElement) */
  var dom: js.UndefOr[HTMLElement] = js.undefined
  
  /** [Method] Selects a single child at any depth below this element based on the passed CSS selector the selector should not cont
    * @param selector String The CSS selector.
    * @param returnDom Boolean true to return the DOM node instead of Ext.dom.Element.
    * @returns HTMLElement/Ext.dom.Element The child Ext.dom.Element (or DOM node if returnDom is true).
    */
  var down: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[Boolean], 
      js.Any
    ]
  ] = js.undefined
  
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
      js.Any
    ]
  ] = js.undefined
  
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
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Gets the first child skipping text nodes
    * @param selector String Find the next sibling that matches the passed simple selector.
    * @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element.
    * @returns Ext.dom.Element/HTMLElement/null The first child or null.
    */
  var first: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[Boolean], 
      js.Any
    ]
  ] = js.undefined
  
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
  ] = js.undefined
  
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
  ] = js.undefined
  
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
  ] = js.undefined
  
  /** [Method] Gets the width of the border s for the specified side s
    * @param side String Can be t, l, r, b or any combination of those to add multiple values. For example, passing 'lr' would get the border left width + the border right width.
    * @returns Number The width of the sides passed added together
    */
  var getBorderWidth: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], Double]] = js.undefined
  
  /** [Method] Gets the bottom Y coordinate of the element element Y position  element height
    * @returns Number
    */
  var getBottom: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
    * @param contentBox Boolean If true a box for the content of the element is returned.
    * @param local Boolean If true the element's left and top are returned instead of page x/y.
    * @returns Object An object in the format
    */
  var getBox: js.UndefOr[
    js.Function2[/* contentBox */ js.UndefOr[Boolean], /* local */ js.UndefOr[Boolean], js.Any]
  ] = js.undefined
  
  /** [Method] Returns the innerHTML of an element
    * @returns String
    */
  var getHTML: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the offset height of the element
    * @param contentHeight Boolean true to get the height minus borders and padding.
    * @returns Number The element's height.
    */
  var getHeight: js.UndefOr[js.Function1[/* contentHeight */ js.UndefOr[Boolean], Double]] = js.undefined
  
  /** [Method] Returns the innerHTML of an element
    * @returns String
    */
  var getHtml: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Gets the left X coordinate
    * @returns Number
    */
  var getLeft: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns an object with properties top left right and bottom representing the margins of this element unless sides i
    * @param sides String Any combination of 'l', 'r', 't', 'b' to get the sum of those sides.
    * @returns Object/Number
    */
  var getMargin: js.UndefOr[js.Function1[/* sides */ js.UndefOr[java.lang.String], js.Any]] = js.undefined
  
  /** [Method] Returns the offsets of this element from the passed element
    * @param element Mixed The element to get the offsets from.
    * @returns Array The XY page offsets (e.g. [100, -200])
    */
  var getOffsetsTo: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Array]] = js.undefined
  
  /** [Method] Retrieves the height of the element account for the top and bottom margins  */
  var getOuterHeight: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Retrieves the width of the element accounting for the left and right margins  */
  var getOuterWidth: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Gets the width of the padding s for the specified side s
    * @param side String Can be t, l, r, b or any combination of those to add multiple values. For example, passing 'lr' would get the padding left + the padding right.
    * @returns Number The padding of the sides passed added together.
    */
  var getPadding: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], Double]] = js.undefined
  
  /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
    * @param asRegion Boolean If true an Ext.util.Region will be returned.
    * @returns Object box An object in the format: {  x: &lt;Element's X position&gt;,  y: &lt;Element's Y position&gt;,  width: &lt;Element's width&gt;,  height: &lt;Element's height&gt;,  bottom: &lt;Element's lower bound&gt;,  right: &lt;Element's rightmost bound&gt; }  The returned object may also be addressed as an Array where index 0 contains the X position and index 1 contains the Y position. So the result may also be used for setXY.
    */
  var getPageBox: js.UndefOr[js.Function1[/* asRegion */ js.UndefOr[Boolean], js.Any]] = js.undefined
  
  /** [Method] Gets the right X coordinate of the element element X position  element width
    * @returns Number
    */
  var getRight: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Gets the Scroller instance of the first parent that has one  */
  var getScrollParent: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the size of the element
    * @param contentSize Boolean true to get the width/size minus borders and padding.
    * @returns Object An object containing the element's size:
    */
  var getSize: js.UndefOr[js.Function1[/* contentSize */ js.UndefOr[Boolean], js.Any]] = js.undefined
  
  /** [Method] Normalizes currentStyle and computedStyle
    * @param prop String The style property whose value is returned.
    * @returns String The current value of the style property for this element.
    */
  var getStyle: js.UndefOr[js.Function1[/* prop */ js.UndefOr[java.lang.String], java.lang.String]] = js.undefined
  
  /** [Method] Gets the top Y coordinate
    * @returns Number
    */
  var getTop: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of the value attribute
    * @param asNumber Boolean true to parse the value as a number.
    * @returns String/Number
    */
  var getValue: js.UndefOr[js.Function1[/* asNumber */ js.UndefOr[Boolean], js.Any]] = js.undefined
  
  /** [Method] Returns the dimensions of the element available to lay content out in
    * @returns Object Object describing width and height:
    */
  var getViewSize: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the offset width of the element
    * @param contentWidth Boolean true to get the width minus borders and padding.
    * @returns Number The element's width.
    */
  var getWidth: js.UndefOr[js.Function1[/* contentWidth */ js.UndefOr[Boolean], Double]] = js.undefined
  
  /** [Method] Gets the current X position of the element based on page coordinates
    * @returns Number The X position of the element
    */
  var getX: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Gets the current position of the element based on page coordinates
    * @returns Array The XY position of the element
    */
  var getXY: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Gets the current Y position of the element based on page coordinates
    * @returns Number The Y position of the element
    */
  var getY: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Checks if the specified CSS class exists on this element s DOM node
    * @param name String The CSS class to check for.
    * @returns Boolean true if the class exists, else false.
    */
  var hasCls: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
  
  /** [Method] Hides this element  */
  var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (String) */
  var id: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Inserts this element after the passed element in the DOM
    * @param el String/HTMLElement/Ext.dom.Element The element to insert after. The id of the node, a DOM Node or an existing Element.
    * @returns Ext.dom.Element This element.
    */
  var insertAfter: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Inserts this element before the passed element in the DOM
    * @param el String/HTMLElement/Ext.dom.Element The element before which this element will be inserted. The id of the node, a DOM Node or an existing Element.
    * @returns Ext.dom.Element This element.
    */
  var insertBefore: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Inserts an element as the first child of this element
    * @param element String/HTMLElement/Ext.dom.Element The id or element to insert.
    * @returns Ext.dom.Element this
    */
  var insertFirst: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], this.type]] = js.undefined
  
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
      js.Any
    ]
  ] = js.undefined
  
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
  ] = js.undefined
  
  /** [Method] Returns true if this element matches the passed simple selector e g
    * @param selector String The simple selector to test.
    * @returns Boolean true if this element matches the selector, else false.
    */
  var is: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
  
  /** [Method] Determines if this element is a descendant of the passed in Element  */
  var isDescendent: js.UndefOr[js.Function0[Unit]] = js.undefined
  
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
  ] = js.undefined
  
  /** [Method] Returns true if the value of the given property is visually transparent
    * @param prop String The style property whose value is to be tested.
    * @returns Boolean true if the style property is visually transparent.
    */
  var isTransparent: js.UndefOr[js.Function1[/* prop */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
  
  /** [Method] Gets the last child skipping text nodes
    * @param selector String Find the previous sibling that matches the passed simple selector.
    * @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element.
    * @returns Ext.dom.Element/HTMLElement/null The last child or null.
    */
  var last: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[Boolean], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Puts a mask over this element to disable user interaction  */
  var mask: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Gets the next sibling skipping text nodes
    * @param selector String Find the next sibling that matches the passed simple selector.
    * @param returnDom Boolean true to return a raw dom node instead of an Ext.dom.Element.
    * @returns Ext.dom.Element/HTMLElement/null The next sibling or null.
    */
  var next: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[Boolean], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Gets the parent node for this element optionally chaining up trying to match a selector
    * @param selector String Find a parent node that matches the passed simple selector.
    * @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element.
    * @returns Ext.dom.Element/HTMLElement/null The parent node or null.
    */
  var parent: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[Boolean], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Gets the previous sibling skipping text nodes
    * @param selector String Find the previous sibling that matches the passed simple selector.
    * @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element
    * @returns Ext.dom.Element/HTMLElement/null The previous sibling or null.
    */
  var prev: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[Boolean], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Removes all listeners for this object  */
  var purgeAllListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Selects child nodes based on the passed CSS selector the selector should not contain an id
    * @param selector String The CSS selector.
    * @returns HTMLElement[] An array of the matched nodes.
    */
  var query: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], Array]] = js.undefined
  
  /** [Method] Adds one or more CSS classes to this element and removes the same class es from all siblings
    * @param className String/String[] The CSS class to add, or an array of classes.
    * @returns Ext.dom.Element this
    */
  var radioCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IElement: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.undefined
  
  /** [Method] Removes this element s DOM reference  */
  var remove: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Removes all listeners for this object  */
  var removeAllListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
  
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
  ] = js.undefined
  
  /** [Method] Forces the browser to repaint this element
    * @returns Ext.dom.Element this
    */
  var repaint: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Method] Replaces the passed element with this element
    * @param element String/HTMLElement/Ext.dom.Element The element to replace. The id of the node, a DOM Node or an existing Element.
    * @returns Ext.dom.Element This element.
    */
  var replace: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], this.type]] = js.undefined
  
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
  ] = js.undefined
  
  /** [Method] Replaces this element with the passed element
    * @param el String/HTMLElement/Ext.dom.Element/Object The new element (id of the node, a DOM Node or an existing Element) or a DomHelper config of an element to create.
    * @returns Ext.dom.Element This element.
    */
  var replaceWith: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Serializes a DOM form into a url encoded string
    * @param form Object The form
    * @returns String The url encoded form
    */
  var serializeForm: js.UndefOr[js.Function1[/* form */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  
  /** [Method] Sets the passed attributes as attributes of this element a style attribute can be a string object or function
    * @param attributes Object The object with the attributes.
    * @param useSet Boolean false to override the default setAttribute to use expandos.
    * @returns Ext.dom.Element this
    */
  var set: js.UndefOr[
    js.Function2[/* attributes */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  
  /** [Method] Sets the element s CSS bottom style
    * @param bottom String The bottom CSS property value.
    * @returns Ext.dom.Element this
    */
  var setBottom: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  
  /** [Method] Sets the element s box
    * @param box Object The box to fill, for example: {  left: ...,  top: ...,  width: ...,  height: ... }
    * @returns Ext.dom.Element this
    */
  var setBox: js.UndefOr[js.Function1[/* box */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Sets the specified CSS class on this element s DOM node
    * @param className String/Array The CSS class to set on this element.
    */
  var setCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the innerHTML of this element
    * @param html String The new HTML.
    */
  var setHTML: js.UndefOr[js.Function1[/* html */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Set the height of this Element
    * @param height Number/String The new height.
    * @returns Ext.dom.Element this
    */
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Sets the innerHTML of this element
    * @param html String The new HTML.
    */
  var setHtml: js.UndefOr[js.Function1[/* html */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the element s left position directly using CSS style instead of setX
    * @param left String The left CSS property value.
    * @returns Ext.dom.Element this
    */
  var setLeft: js.UndefOr[js.Function1[/* left */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  
  /** [Method] Set the maximum height of this Element
    * @param height Number/String The new maximum height.
    * @returns Ext.dom.Element this
    */
  var setMaxHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Set the maximum width of this Element
    * @param width Number/String The new maximum width.
    * @returns Ext.dom.Element this
    */
  var setMaxWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Set the minimum height of this Element
    * @param height Number/String The new minimum height.
    * @returns Ext.dom.Element this
    */
  var setMinHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Set the minimum width of this Element
    * @param width Number/String The new minimum width.
    * @returns Ext.dom.Element this
    */
  var setMinWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Sets the element s CSS right style
    * @param right String The right CSS property value.
    * @returns Ext.dom.Element this
    */
  var setRight: js.UndefOr[js.Function1[/* right */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  
  /** [Method] Set the size of this Element
    * @param width Number/String The new width. This may be one of:  A Number specifying the new width in this Element's defaultUnits (by default, pixels). A String used to set the CSS width style. Animation may not be used. A size object in the format {width: widthValue, height: heightValue}.
    * @param height Number/String The new height. This may be one of:  A Number specifying the new height in this Element's defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used.
    * @returns Ext.dom.Element this
    */
  var setSize: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  
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
  ] = js.undefined
  
  /** [Method] Sets the element s top position directly using CSS style instead of setY
    * @param top String The top CSS property value.
    * @returns Ext.dom.Element this
    */
  var setTop: js.UndefOr[js.Function1[/* top */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  
  /** [Method] Sets the element s top and left positions directly using CSS style  */
  var setTopLeft: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Use this to change the visibility mode between VISIBILITY DISPLAY or OFFSETS
    * @param mode Object
    * @returns Ext.dom.Element this
    */
  var setVisibilityMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Sets the visibility of the element see details
    * @param visible Boolean Whether the element is visible.
    * @returns Ext.Element this
    */
  var setVisible: js.UndefOr[js.Function1[/* visible */ js.UndefOr[Boolean], this.type]] = js.undefined
  
  /** [Method] Set the width of this Element
    * @param width Number/String The new width.
    * @returns Ext.dom.Element this
    */
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Sets the X position of the element based on page coordinates
    * @param x Number The X position of the element
    * @returns Ext.dom.Element this
    */
  var setX: js.UndefOr[js.Function1[/* x */ js.UndefOr[Double], this.type]] = js.undefined
  
  /** [Method] Sets the position of the element in page coordinates regardless of how the element is positioned
    * @param pos Number[] Contains X &amp; Y [x, y] values for new position (coordinates are page-based).
    * @returns Ext.dom.Element this
    */
  var setXY: js.UndefOr[js.Function1[/* pos */ js.UndefOr[Array], this.type]] = js.undefined
  
  /** [Method] Sets the Y position of the element based on page coordinates
    * @param y Number The Y position of the element.
    * @returns Ext.dom.Element this
    */
  var setY: js.UndefOr[js.Function1[/* y */ js.UndefOr[Double], this.type]] = js.undefined
  
  /** [Method] Shows this element  */
  var show: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Toggles the specified CSS class on this element removes it if it already exists otherwise adds it
    * @param className String The CSS class to toggle.
    * @returns Ext.dom.Element this
    */
  var toggleCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  
  /** [Method] Translates the passed page coordinates into left top CSS values for this element
    * @param x Number/Array The page x or an array containing [x, y].
    * @param y Number The page y, required if x is not an array.
    * @returns Object An object with left and top properties. e.g. {left: (value), top: (value)}.
    */
  var translatePoints: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], js.Any]] = js.undefined
  
  /** [Method] Removes a previously applied mask  */
  var unmask: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Walks up the dom looking for a parent node that matches the passed simple selector e g
    * @param simpleSelector String The simple selector to test
    * @param maxDepth Number/String/HTMLElement/Ext.Element The max depth to search as a number or element (defaults to 10 || document.body).
    * @returns Ext.dom.Element/null The matching DOM node (or null if no match was found).
    */
  var up: js.UndefOr[
    js.Function2[
      /* simpleSelector */ js.UndefOr[java.lang.String], 
      /* maxDepth */ js.UndefOr[js.Any], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Sets the innerHTML of this element
    * @param html String The new HTML.
    */
  var update: js.UndefOr[js.Function1[/* html */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Creates and wraps this element with another element
    * @param config Object DomHelper element config object for the wrapper element or null for an empty div
    * @param domNode Boolean true to return the raw DOM element instead of Ext.dom.Element.
    * @returns HTMLElement/Ext.dom.Element The newly created wrapper element.
    */
  var wrap: js.UndefOr[
    js.Function2[/* config */ js.UndefOr[js.Any], /* domNode */ js.UndefOr[Boolean], js.Any]
  ] = js.undefined
}
object IElement {
  
  inline def apply(): IElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IElement]
  }
  
  extension [Self <: IElement](x: Self) {
    
    inline def setAddCls(
      value: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => IElement
    ): Self = StObject.set(x, "addCls", js.Any.fromFunction3(value))
    
    inline def setAddClsUndefined: Self = StObject.set(x, "addCls", js.undefined)
    
    inline def setAppendChild(value: /* element */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    inline def setAppendChildUndefined: Self = StObject.set(x, "appendChild", js.undefined)
    
    inline def setAppendTo(value: /* el */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    inline def setApplyStyles(value: /* styles */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "applyStyles", js.Any.fromFunction1(value))
    
    inline def setApplyStylesUndefined: Self = StObject.set(x, "applyStyles", js.undefined)
    
    inline def setChild(
      value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "child", js.Any.fromFunction2(value))
    
    inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
    
    inline def setContains(value: /* element */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setCreateChild(
      value: (/* config */ js.UndefOr[js.Any], /* insertBefore */ js.UndefOr[HTMLElement], /* returnDom */ js.UndefOr[Boolean]) => IElement
    ): Self = StObject.set(x, "createChild", js.Any.fromFunction3(value))
    
    inline def setCreateChildUndefined: Self = StObject.set(x, "createChild", js.undefined)
    
    inline def setCssTranslate(value: () => Unit): Self = StObject.set(x, "cssTranslate", js.Any.fromFunction0(value))
    
    inline def setCssTranslateUndefined: Self = StObject.set(x, "cssTranslate", js.undefined)
    
    inline def setDISPLAY(value: Double): Self = StObject.set(x, "DISPLAY", value.asInstanceOf[js.Any])
    
    inline def setDISPLAYUndefined: Self = StObject.set(x, "DISPLAY", js.undefined)
    
    inline def setDefaultUnit(value: java.lang.String): Self = StObject.set(x, "defaultUnit", value.asInstanceOf[js.Any])
    
    inline def setDefaultUnitUndefined: Self = StObject.set(x, "defaultUnit", js.undefined)
    
    inline def setDom(value: HTMLElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    inline def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
    
    inline def setDown(
      value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "down", js.Any.fromFunction2(value))
    
    inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    inline def setFindParent(
      value: (/* simpleSelector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "findParent", js.Any.fromFunction3(value))
    
    inline def setFindParentNode(
      value: (/* simpleSelector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "findParentNode", js.Any.fromFunction3(value))
    
    inline def setFindParentNodeUndefined: Self = StObject.set(x, "findParentNode", js.undefined)
    
    inline def setFindParentUndefined: Self = StObject.set(x, "findParent", js.undefined)
    
    inline def setFirst(
      value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "first", js.Any.fromFunction2(value))
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setGetAlignToXY(
      value: (/* element */ js.UndefOr[js.Any], /* position */ js.UndefOr[java.lang.String], /* offsets */ js.UndefOr[Array]) => Array
    ): Self = StObject.set(x, "getAlignToXY", js.Any.fromFunction3(value))
    
    inline def setGetAlignToXYUndefined: Self = StObject.set(x, "getAlignToXY", js.undefined)
    
    inline def setGetAnchorXY(
      value: (/* anchor */ js.UndefOr[java.lang.String], /* local */ js.UndefOr[Boolean], /* size */ js.UndefOr[js.Any]) => Array
    ): Self = StObject.set(x, "getAnchorXY", js.Any.fromFunction3(value))
    
    inline def setGetAnchorXYUndefined: Self = StObject.set(x, "getAnchorXY", js.undefined)
    
    inline def setGetAttribute(
      value: (/* name */ js.UndefOr[java.lang.String], /* namespace */ js.UndefOr[java.lang.String]) => java.lang.String
    ): Self = StObject.set(x, "getAttribute", js.Any.fromFunction2(value))
    
    inline def setGetAttributeUndefined: Self = StObject.set(x, "getAttribute", js.undefined)
    
    inline def setGetBorderWidth(value: /* side */ js.UndefOr[java.lang.String] => Double): Self = StObject.set(x, "getBorderWidth", js.Any.fromFunction1(value))
    
    inline def setGetBorderWidthUndefined: Self = StObject.set(x, "getBorderWidth", js.undefined)
    
    inline def setGetBottom(value: () => Double): Self = StObject.set(x, "getBottom", js.Any.fromFunction0(value))
    
    inline def setGetBottomUndefined: Self = StObject.set(x, "getBottom", js.undefined)
    
    inline def setGetBox(value: (/* contentBox */ js.UndefOr[Boolean], /* local */ js.UndefOr[Boolean]) => js.Any): Self = StObject.set(x, "getBox", js.Any.fromFunction2(value))
    
    inline def setGetBoxUndefined: Self = StObject.set(x, "getBox", js.undefined)
    
    inline def setGetHTML(value: () => java.lang.String): Self = StObject.set(x, "getHTML", js.Any.fromFunction0(value))
    
    inline def setGetHTMLUndefined: Self = StObject.set(x, "getHTML", js.undefined)
    
    inline def setGetHeight(value: /* contentHeight */ js.UndefOr[Boolean] => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction1(value))
    
    inline def setGetHeightUndefined: Self = StObject.set(x, "getHeight", js.undefined)
    
    inline def setGetLeft(value: () => Double): Self = StObject.set(x, "getLeft", js.Any.fromFunction0(value))
    
    inline def setGetLeftUndefined: Self = StObject.set(x, "getLeft", js.undefined)
    
    inline def setGetMargin(value: /* sides */ js.UndefOr[java.lang.String] => js.Any): Self = StObject.set(x, "getMargin", js.Any.fromFunction1(value))
    
    inline def setGetMarginUndefined: Self = StObject.set(x, "getMargin", js.undefined)
    
    inline def setGetOffsetsTo(value: /* element */ js.UndefOr[js.Any] => Array): Self = StObject.set(x, "getOffsetsTo", js.Any.fromFunction1(value))
    
    inline def setGetOffsetsToUndefined: Self = StObject.set(x, "getOffsetsTo", js.undefined)
    
    inline def setGetOuterHeight(value: () => Unit): Self = StObject.set(x, "getOuterHeight", js.Any.fromFunction0(value))
    
    inline def setGetOuterHeightUndefined: Self = StObject.set(x, "getOuterHeight", js.undefined)
    
    inline def setGetOuterWidth(value: () => Unit): Self = StObject.set(x, "getOuterWidth", js.Any.fromFunction0(value))
    
    inline def setGetOuterWidthUndefined: Self = StObject.set(x, "getOuterWidth", js.undefined)
    
    inline def setGetPadding(value: /* side */ js.UndefOr[java.lang.String] => Double): Self = StObject.set(x, "getPadding", js.Any.fromFunction1(value))
    
    inline def setGetPaddingUndefined: Self = StObject.set(x, "getPadding", js.undefined)
    
    inline def setGetPageBox(value: /* asRegion */ js.UndefOr[Boolean] => js.Any): Self = StObject.set(x, "getPageBox", js.Any.fromFunction1(value))
    
    inline def setGetPageBoxUndefined: Self = StObject.set(x, "getPageBox", js.undefined)
    
    inline def setGetRight(value: () => Double): Self = StObject.set(x, "getRight", js.Any.fromFunction0(value))
    
    inline def setGetRightUndefined: Self = StObject.set(x, "getRight", js.undefined)
    
    inline def setGetScrollParent(value: () => Unit): Self = StObject.set(x, "getScrollParent", js.Any.fromFunction0(value))
    
    inline def setGetScrollParentUndefined: Self = StObject.set(x, "getScrollParent", js.undefined)
    
    inline def setGetSize(value: /* contentSize */ js.UndefOr[Boolean] => js.Any): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
    
    inline def setGetSizeUndefined: Self = StObject.set(x, "getSize", js.undefined)
    
    inline def setGetStyle(value: /* prop */ js.UndefOr[java.lang.String] => java.lang.String): Self = StObject.set(x, "getStyle", js.Any.fromFunction1(value))
    
    inline def setGetStyleUndefined: Self = StObject.set(x, "getStyle", js.undefined)
    
    inline def setGetTop(value: () => Double): Self = StObject.set(x, "getTop", js.Any.fromFunction0(value))
    
    inline def setGetTopUndefined: Self = StObject.set(x, "getTop", js.undefined)
    
    inline def setGetValue(value: /* asNumber */ js.UndefOr[Boolean] => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setGetViewSize(value: () => js.Any): Self = StObject.set(x, "getViewSize", js.Any.fromFunction0(value))
    
    inline def setGetViewSizeUndefined: Self = StObject.set(x, "getViewSize", js.undefined)
    
    inline def setGetWidth(value: /* contentWidth */ js.UndefOr[Boolean] => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction1(value))
    
    inline def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
    
    inline def setGetX(value: () => Double): Self = StObject.set(x, "getX", js.Any.fromFunction0(value))
    
    inline def setGetXUndefined: Self = StObject.set(x, "getX", js.undefined)
    
    inline def setGetXY(value: () => Array): Self = StObject.set(x, "getXY", js.Any.fromFunction0(value))
    
    inline def setGetXYUndefined: Self = StObject.set(x, "getXY", js.undefined)
    
    inline def setGetY(value: () => Double): Self = StObject.set(x, "getY", js.Any.fromFunction0(value))
    
    inline def setGetYUndefined: Self = StObject.set(x, "getY", js.undefined)
    
    inline def setHasCls(value: /* name */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "hasCls", js.Any.fromFunction1(value))
    
    inline def setHasClsUndefined: Self = StObject.set(x, "hasCls", js.undefined)
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInsertAfter(value: /* el */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "insertAfter", js.Any.fromFunction1(value))
    
    inline def setInsertAfterUndefined: Self = StObject.set(x, "insertAfter", js.undefined)
    
    inline def setInsertBefore(value: /* el */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "insertBefore", js.Any.fromFunction1(value))
    
    inline def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
    
    inline def setInsertFirst(value: /* element */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "insertFirst", js.Any.fromFunction1(value))
    
    inline def setInsertFirstUndefined: Self = StObject.set(x, "insertFirst", js.undefined)
    
    inline def setInsertHtml(
      value: (/* where */ js.UndefOr[java.lang.String], /* html */ js.UndefOr[java.lang.String], /* returnEl */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "insertHtml", js.Any.fromFunction3(value))
    
    inline def setInsertHtmlUndefined: Self = StObject.set(x, "insertHtml", js.undefined)
    
    inline def setInsertSibling(
      value: (/* el */ js.UndefOr[js.Any], /* where */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => IElement
    ): Self = StObject.set(x, "insertSibling", js.Any.fromFunction3(value))
    
    inline def setInsertSiblingUndefined: Self = StObject.set(x, "insertSibling", js.undefined)
    
    inline def setIs(value: /* selector */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
    
    inline def setIsDescendent(value: () => Unit): Self = StObject.set(x, "isDescendent", js.Any.fromFunction0(value))
    
    inline def setIsDescendentUndefined: Self = StObject.set(x, "isDescendent", js.undefined)
    
    inline def setIsStyle(
      value: (/* style */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[java.lang.String]) => Boolean
    ): Self = StObject.set(x, "isStyle", js.Any.fromFunction2(value))
    
    inline def setIsStyleUndefined: Self = StObject.set(x, "isStyle", js.undefined)
    
    inline def setIsTransparent(value: /* prop */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "isTransparent", js.Any.fromFunction1(value))
    
    inline def setIsTransparentUndefined: Self = StObject.set(x, "isTransparent", js.undefined)
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    inline def setLast(
      value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "last", js.Any.fromFunction2(value))
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setMask(value: () => Unit): Self = StObject.set(x, "mask", js.Any.fromFunction0(value))
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setNext(
      value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "next", js.Any.fromFunction2(value))
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setOFFSETS(value: Double): Self = StObject.set(x, "OFFSETS", value.asInstanceOf[js.Any])
    
    inline def setOFFSETSUndefined: Self = StObject.set(x, "OFFSETS", js.undefined)
    
    inline def setParent(
      value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "parent", js.Any.fromFunction2(value))
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPrev(
      value: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "prev", js.Any.fromFunction2(value))
    
    inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    inline def setPurgeAllListeners(value: () => Unit): Self = StObject.set(x, "purgeAllListeners", js.Any.fromFunction0(value))
    
    inline def setPurgeAllListenersUndefined: Self = StObject.set(x, "purgeAllListeners", js.undefined)
    
    inline def setQuery(value: /* selector */ js.UndefOr[java.lang.String] => Array): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRadioCls(value: /* className */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "radioCls", js.Any.fromFunction1(value))
    
    inline def setRadioClsUndefined: Self = StObject.set(x, "radioCls", js.undefined)
    
    inline def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setRemoveAllListeners(value: () => Unit): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction0(value))
    
    inline def setRemoveAllListenersUndefined: Self = StObject.set(x, "removeAllListeners", js.undefined)
    
    inline def setRemoveCls(
      value: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => IElement
    ): Self = StObject.set(x, "removeCls", js.Any.fromFunction3(value))
    
    inline def setRemoveClsUndefined: Self = StObject.set(x, "removeCls", js.undefined)
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setRepaint(value: () => IElement): Self = StObject.set(x, "repaint", js.Any.fromFunction0(value))
    
    inline def setRepaintUndefined: Self = StObject.set(x, "repaint", js.undefined)
    
    inline def setReplace(value: /* element */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
    
    inline def setReplaceCls(
      value: (/* oldName */ js.UndefOr[java.lang.String], /* newName */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => IElement
    ): Self = StObject.set(x, "replaceCls", js.Any.fromFunction4(value))
    
    inline def setReplaceClsUndefined: Self = StObject.set(x, "replaceCls", js.undefined)
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setReplaceWith(value: /* el */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1(value))
    
    inline def setReplaceWithUndefined: Self = StObject.set(x, "replaceWith", js.undefined)
    
    inline def setSerializeForm(value: /* form */ js.UndefOr[js.Any] => java.lang.String): Self = StObject.set(x, "serializeForm", js.Any.fromFunction1(value))
    
    inline def setSerializeFormUndefined: Self = StObject.set(x, "serializeForm", js.undefined)
    
    inline def setSet(value: (/* attributes */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean]) => IElement): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetBottom(value: /* bottom */ js.UndefOr[java.lang.String] => IElement): Self = StObject.set(x, "setBottom", js.Any.fromFunction1(value))
    
    inline def setSetBottomUndefined: Self = StObject.set(x, "setBottom", js.undefined)
    
    inline def setSetBox(value: /* box */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "setBox", js.Any.fromFunction1(value))
    
    inline def setSetBoxUndefined: Self = StObject.set(x, "setBox", js.undefined)
    
    inline def setSetCls(value: /* className */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
    
    inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
    
    inline def setSetHTML(value: /* html */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setHTML", js.Any.fromFunction1(value))
    
    inline def setSetHTMLUndefined: Self = StObject.set(x, "setHTML", js.undefined)
    
    inline def setSetHeight(value: /* height */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
    
    inline def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
    
    inline def setSetLeft(value: /* left */ js.UndefOr[java.lang.String] => IElement): Self = StObject.set(x, "setLeft", js.Any.fromFunction1(value))
    
    inline def setSetLeftUndefined: Self = StObject.set(x, "setLeft", js.undefined)
    
    inline def setSetMaxHeight(value: /* height */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "setMaxHeight", js.Any.fromFunction1(value))
    
    inline def setSetMaxHeightUndefined: Self = StObject.set(x, "setMaxHeight", js.undefined)
    
    inline def setSetMaxWidth(value: /* width */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "setMaxWidth", js.Any.fromFunction1(value))
    
    inline def setSetMaxWidthUndefined: Self = StObject.set(x, "setMaxWidth", js.undefined)
    
    inline def setSetMinHeight(value: /* height */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "setMinHeight", js.Any.fromFunction1(value))
    
    inline def setSetMinHeightUndefined: Self = StObject.set(x, "setMinHeight", js.undefined)
    
    inline def setSetMinWidth(value: /* width */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "setMinWidth", js.Any.fromFunction1(value))
    
    inline def setSetMinWidthUndefined: Self = StObject.set(x, "setMinWidth", js.undefined)
    
    inline def setSetRight(value: /* right */ js.UndefOr[java.lang.String] => IElement): Self = StObject.set(x, "setRight", js.Any.fromFunction1(value))
    
    inline def setSetRightUndefined: Self = StObject.set(x, "setRight", js.undefined)
    
    inline def setSetSize(value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => IElement): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
    
    inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
    
    inline def setSetStyle(value: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => IElement): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
    
    inline def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
    
    inline def setSetTop(value: /* top */ js.UndefOr[java.lang.String] => IElement): Self = StObject.set(x, "setTop", js.Any.fromFunction1(value))
    
    inline def setSetTopLeft(value: () => Unit): Self = StObject.set(x, "setTopLeft", js.Any.fromFunction0(value))
    
    inline def setSetTopLeftUndefined: Self = StObject.set(x, "setTopLeft", js.undefined)
    
    inline def setSetTopUndefined: Self = StObject.set(x, "setTop", js.undefined)
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setSetVisibilityMode(value: /* mode */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "setVisibilityMode", js.Any.fromFunction1(value))
    
    inline def setSetVisibilityModeUndefined: Self = StObject.set(x, "setVisibilityMode", js.undefined)
    
    inline def setSetVisible(value: /* visible */ js.UndefOr[Boolean] => IElement): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
    
    inline def setSetVisibleUndefined: Self = StObject.set(x, "setVisible", js.undefined)
    
    inline def setSetWidth(value: /* width */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
    
    inline def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
    
    inline def setSetX(value: /* x */ js.UndefOr[Double] => IElement): Self = StObject.set(x, "setX", js.Any.fromFunction1(value))
    
    inline def setSetXUndefined: Self = StObject.set(x, "setX", js.undefined)
    
    inline def setSetXY(value: /* pos */ js.UndefOr[Array] => IElement): Self = StObject.set(x, "setXY", js.Any.fromFunction1(value))
    
    inline def setSetXYUndefined: Self = StObject.set(x, "setXY", js.undefined)
    
    inline def setSetY(value: /* y */ js.UndefOr[Double] => IElement): Self = StObject.set(x, "setY", js.Any.fromFunction1(value))
    
    inline def setSetYUndefined: Self = StObject.set(x, "setY", js.undefined)
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setToggleCls(value: /* className */ js.UndefOr[java.lang.String] => IElement): Self = StObject.set(x, "toggleCls", js.Any.fromFunction1(value))
    
    inline def setToggleClsUndefined: Self = StObject.set(x, "toggleCls", js.undefined)
    
    inline def setTranslatePoints(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double]) => js.Any): Self = StObject.set(x, "translatePoints", js.Any.fromFunction2(value))
    
    inline def setTranslatePointsUndefined: Self = StObject.set(x, "translatePoints", js.undefined)
    
    inline def setUnmask(value: () => Unit): Self = StObject.set(x, "unmask", js.Any.fromFunction0(value))
    
    inline def setUnmaskUndefined: Self = StObject.set(x, "unmask", js.undefined)
    
    inline def setUp(
      value: (/* simpleSelector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any]) => js.Any
    ): Self = StObject.set(x, "up", js.Any.fromFunction2(value))
    
    inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
    
    inline def setUpdate(value: /* html */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setVISIBILITY(value: Double): Self = StObject.set(x, "VISIBILITY", value.asInstanceOf[js.Any])
    
    inline def setVISIBILITYUndefined: Self = StObject.set(x, "VISIBILITY", js.undefined)
    
    inline def setWrap(value: (/* config */ js.UndefOr[js.Any], /* domNode */ js.UndefOr[Boolean]) => js.Any): Self = StObject.set(x, "wrap", js.Any.fromFunction2(value))
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
