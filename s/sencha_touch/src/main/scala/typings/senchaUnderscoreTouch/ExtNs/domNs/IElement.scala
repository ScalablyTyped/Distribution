package typings.senchaUnderscoreTouch.ExtNs.domNs

import typings.senchaUnderscoreTouch.ExtNs.Array
import typings.senchaUnderscoreTouch.ExtNs.IClass
import typings.senchaUnderscoreTouch.ExtNs.mixinNs.IObservable
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IElement extends IObservable {
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
    js.Function2[/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean], _]
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
    js.Function2[/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean], _]
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
      _
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
      _
    ]
  ] = js.undefined
  /** [Method] Gets the first child skipping text nodes
  		* @param selector String Find the next sibling that matches the passed simple selector.
  		* @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element.
  		* @returns Ext.dom.Element/HTMLElement/null The first child or null.
  		*/
  var first: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean], _]
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
    js.Function2[/* contentBox */ js.UndefOr[Boolean], /* local */ js.UndefOr[Boolean], _]
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
  var getMargin: js.UndefOr[js.Function1[/* sides */ js.UndefOr[java.lang.String], _]] = js.undefined
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
  var getPageBox: js.UndefOr[js.Function1[/* asRegion */ js.UndefOr[Boolean], _]] = js.undefined
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
  var getSize: js.UndefOr[js.Function1[/* contentSize */ js.UndefOr[Boolean], _]] = js.undefined
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
  var getValue: js.UndefOr[js.Function1[/* asNumber */ js.UndefOr[Boolean], _]] = js.undefined
  /** [Method] Returns the dimensions of the element available to lay content out in
  		* @returns Object Object describing width and height:
  		*/
  var getViewSize: js.UndefOr[js.Function0[_]] = js.undefined
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
      _
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
    js.Function2[/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Puts a mask over this element to disable user interaction  */
  var mask: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Gets the next sibling skipping text nodes
  		* @param selector String Find the next sibling that matches the passed simple selector.
  		* @param returnDom Boolean true to return a raw dom node instead of an Ext.dom.Element.
  		* @returns Ext.dom.Element/HTMLElement/null The next sibling or null.
  		*/
  var next: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Gets the parent node for this element optionally chaining up trying to match a selector
  		* @param selector String Find a parent node that matches the passed simple selector.
  		* @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element.
  		* @returns Ext.dom.Element/HTMLElement/null The parent node or null.
  		*/
  var parent: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Gets the previous sibling skipping text nodes
  		* @param selector String Find the previous sibling that matches the passed simple selector.
  		* @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element
  		* @returns Ext.dom.Element/HTMLElement/null The previous sibling or null.
  		*/
  var prev: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean], _]
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
  var translatePoints: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], _]] = js.undefined
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
      _
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
    js.Function2[/* config */ js.UndefOr[js.Any], /* domNode */ js.UndefOr[Boolean], _]
  ] = js.undefined
}

object IElement {
  @scala.inline
  def apply(
    DISPLAY: Int | Double = null,
    OFFSETS: Int | Double = null,
    VISIBILITY: Int | Double = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addCls: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    appendChild: /* element */ js.UndefOr[js.Any] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    appendTo: /* el */ js.UndefOr[js.Any] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    applyStyles: /* styles */ js.UndefOr[js.Any] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    child: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    clearListeners: () => Unit = null,
    config: js.Any = null,
    contains: /* element */ js.UndefOr[js.Any] => Boolean = null,
    createChild: (/* config */ js.UndefOr[js.Any], /* insertBefore */ js.UndefOr[HTMLElement], /* returnDom */ js.UndefOr[Boolean]) => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    cssTranslate: () => Unit = null,
    defaultUnit: java.lang.String = null,
    destroy: () => Unit = null,
    dom: HTMLElement = null,
    down: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    findParent: (/* simpleSelector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => _ = null,
    findParentNode: (/* simpleSelector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => _ = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    first: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    getAlignToXY: (/* element */ js.UndefOr[js.Any], /* position */ js.UndefOr[java.lang.String], /* offsets */ js.UndefOr[Array]) => Array = null,
    getAnchorXY: (/* anchor */ js.UndefOr[java.lang.String], /* local */ js.UndefOr[Boolean], /* size */ js.UndefOr[js.Any]) => Array = null,
    getAttribute: (/* name */ js.UndefOr[java.lang.String], /* namespace */ js.UndefOr[java.lang.String]) => java.lang.String = null,
    getBorderWidth: /* side */ js.UndefOr[java.lang.String] => Double = null,
    getBottom: () => Double = null,
    getBox: (/* contentBox */ js.UndefOr[Boolean], /* local */ js.UndefOr[Boolean]) => _ = null,
    getBubbleEvents: () => _ = null,
    getHTML: () => java.lang.String = null,
    getHeight: /* contentHeight */ js.UndefOr[Boolean] => Double = null,
    getHtml: () => java.lang.String = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getLeft: () => Double = null,
    getListeners: () => _ = null,
    getMargin: /* sides */ js.UndefOr[java.lang.String] => _ = null,
    getOffsetsTo: /* element */ js.UndefOr[js.Any] => Array = null,
    getOuterHeight: () => Unit = null,
    getOuterWidth: () => Unit = null,
    getPadding: /* side */ js.UndefOr[java.lang.String] => Double = null,
    getPageBox: /* asRegion */ js.UndefOr[Boolean] => _ = null,
    getRight: () => Double = null,
    getScrollParent: () => Unit = null,
    getSize: /* contentSize */ js.UndefOr[Boolean] => _ = null,
    getStyle: /* prop */ js.UndefOr[java.lang.String] => java.lang.String = null,
    getTop: () => Double = null,
    getValue: /* asNumber */ js.UndefOr[Boolean] => _ = null,
    getViewSize: () => _ = null,
    getWidth: /* contentWidth */ js.UndefOr[Boolean] => Double = null,
    getX: () => Double = null,
    getXY: () => Array = null,
    getY: () => Double = null,
    hasCls: /* name */ js.UndefOr[java.lang.String] => Boolean = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    hide: () => Unit = null,
    id: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    insertAfter: /* el */ js.UndefOr[js.Any] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    insertBefore: /* el */ js.UndefOr[js.Any] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    insertFirst: /* element */ js.UndefOr[js.Any] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    insertHtml: (/* where */ js.UndefOr[java.lang.String], /* html */ js.UndefOr[java.lang.String], /* returnEl */ js.UndefOr[Boolean]) => _ = null,
    insertSibling: (/* el */ js.UndefOr[js.Any], /* where */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    is: /* selector */ js.UndefOr[java.lang.String] => Boolean = null,
    isDescendent: () => Unit = null,
    isStyle: (/* style */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[java.lang.String]) => Boolean = null,
    isTransparent: /* prop */ js.UndefOr[java.lang.String] => Boolean = null,
    last: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    listeners: js.Any = null,
    mask: () => Unit = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    next: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    parent: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    platformConfig: js.Any = null,
    prev: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    purgeAllListeners: () => Unit = null,
    query: /* selector */ js.UndefOr[java.lang.String] => Array = null,
    radioCls: /* className */ js.UndefOr[js.Any] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    remove: () => Unit = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeAllListeners: () => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeCls: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    repaint: () => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    replace: /* element */ js.UndefOr[js.Any] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    replaceCls: (/* oldName */ js.UndefOr[java.lang.String], /* newName */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    replaceWith: /* el */ js.UndefOr[js.Any] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    self: IClass = null,
    serializeForm: /* form */ js.UndefOr[js.Any] => java.lang.String = null,
    set: (/* attributes */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean]) => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setBottom: /* bottom */ js.UndefOr[java.lang.String] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setBox: /* box */ js.UndefOr[js.Any] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setCls: /* className */ js.UndefOr[js.Any] => Unit = null,
    setHTML: /* html */ js.UndefOr[java.lang.String] => Unit = null,
    setHeight: /* height */ js.UndefOr[js.Any] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setHtml: /* html */ js.UndefOr[java.lang.String] => Unit = null,
    setLeft: /* left */ js.UndefOr[java.lang.String] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setMaxHeight: /* height */ js.UndefOr[js.Any] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setMaxWidth: /* width */ js.UndefOr[js.Any] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setMinHeight: /* height */ js.UndefOr[js.Any] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setMinWidth: /* width */ js.UndefOr[js.Any] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setRight: /* right */ js.UndefOr[java.lang.String] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setSize: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setStyle: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setTop: /* top */ js.UndefOr[java.lang.String] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setTopLeft: () => Unit = null,
    setVisibilityMode: /* mode */ js.UndefOr[js.Any] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setVisible: /* visible */ js.UndefOr[Boolean] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setWidth: /* width */ js.UndefOr[js.Any] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setX: /* x */ js.UndefOr[Double] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setXY: /* pos */ js.UndefOr[Array] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    setY: /* y */ js.UndefOr[Double] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    show: () => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvents: () => Unit = null,
    toggleCls: /* className */ js.UndefOr[java.lang.String] => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    translatePoints: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double]) => _ = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unmask: () => Unit = null,
    up: (/* simpleSelector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any]) => _ = null,
    update: /* html */ js.UndefOr[java.lang.String] => Unit = null,
    uses: Array = null,
    wrap: (/* config */ js.UndefOr[js.Any], /* domNode */ js.UndefOr[Boolean]) => _ = null
  ): IElement = {
    val __obj = js.Dynamic.literal()
    if (DISPLAY != null) __obj.updateDynamic("DISPLAY")(DISPLAY.asInstanceOf[js.Any])
    if (OFFSETS != null) __obj.updateDynamic("OFFSETS")(OFFSETS.asInstanceOf[js.Any])
    if (VISIBILITY != null) __obj.updateDynamic("VISIBILITY")(VISIBILITY.asInstanceOf[js.Any])
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction3(addCls))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction1(appendChild))
    if (appendTo != null) __obj.updateDynamic("appendTo")(js.Any.fromFunction1(appendTo))
    if (applyStyles != null) __obj.updateDynamic("applyStyles")(js.Any.fromFunction1(applyStyles))
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (child != null) __obj.updateDynamic("child")(js.Any.fromFunction2(child))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1(contains))
    if (createChild != null) __obj.updateDynamic("createChild")(js.Any.fromFunction3(createChild))
    if (cssTranslate != null) __obj.updateDynamic("cssTranslate")(js.Any.fromFunction0(cssTranslate))
    if (defaultUnit != null) __obj.updateDynamic("defaultUnit")(defaultUnit)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (dom != null) __obj.updateDynamic("dom")(dom)
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction2(down))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
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
    if (id != null) __obj.updateDynamic("id")(id)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
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
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction2(last))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mask != null) __obj.updateDynamic("mask")(js.Any.fromFunction0(mask))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction2(next))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (parent != null) __obj.updateDynamic("parent")(js.Any.fromFunction2(parent))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
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
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (repaint != null) __obj.updateDynamic("repaint")(js.Any.fromFunction0(repaint))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction1(replace))
    if (replaceCls != null) __obj.updateDynamic("replaceCls")(js.Any.fromFunction4(replaceCls))
    if (replaceWith != null) __obj.updateDynamic("replaceWith")(js.Any.fromFunction1(replaceWith))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self)
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
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (toggleCls != null) __obj.updateDynamic("toggleCls")(js.Any.fromFunction1(toggleCls))
    if (translatePoints != null) __obj.updateDynamic("translatePoints")(js.Any.fromFunction2(translatePoints))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (unmask != null) __obj.updateDynamic("unmask")(js.Any.fromFunction0(unmask))
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction2(up))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (wrap != null) __obj.updateDynamic("wrap")(js.Any.fromFunction2(wrap))
    __obj.asInstanceOf[IElement]
  }
}

