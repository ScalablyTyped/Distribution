package typings
package senchaUnderscoreTouchLib.ExtNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IElement
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Property] (Number) */
  var DISPLAY: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var OFFSETS: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var VISIBILITY: js.UndefOr[scala.Double] = js.undefined
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
      /* returnDom */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns true if this element is an ancestor of the passed element
  		* @param element HTMLElement/String The element to check.
  		* @returns Boolean true if this element is an ancestor of el, else false.
  		*/
  var contains: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Creates the passed DomHelper config and appends it to this element or optionally inserts it before the passed child e
  		* @param config Object DomHelper element config object. If no tag is specified (e.g., {tag:'input'}) then a div will be automatically generated with the specified attributes.
  		* @param insertBefore HTMLElement a child element of this element.
  		* @param returnDom Boolean true to return the dom node instead of creating an Element.
  		* @returns Ext.dom.Element The new child element.
  		*/
  var createChild: js.UndefOr[
    js.Function3[
      /* config */ js.UndefOr[js.Any], 
      /* insertBefore */ js.UndefOr[stdLib.HTMLElement], 
      /* returnDom */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Translates an element using CSS 3 in 2D  */
  var cssTranslate: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (String) */
  var defaultUnit: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (HTMLElement) */
  var dom: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** [Method] Selects a single child at any depth below this element based on the passed CSS selector the selector should not cont
  		* @param selector String The CSS selector.
  		* @param returnDom Boolean true to return the DOM node instead of Ext.dom.Element.
  		* @returns HTMLElement/Ext.dom.Element The child Ext.dom.Element (or DOM node if returnDom is true).
  		*/
  var down: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[scala.Boolean], 
      _
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
      /* returnEl */ js.UndefOr[scala.Boolean], 
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
      /* returnEl */ js.UndefOr[scala.Boolean], 
      _
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
      /* returnDom */ js.UndefOr[scala.Boolean], 
      _
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
      /* offsets */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
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
      /* local */ js.UndefOr[scala.Boolean], 
      /* size */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.Array
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
  var getBorderWidth: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], scala.Double]] = js.undefined
  /** [Method] Gets the bottom Y coordinate of the element element Y position  element height
  		* @returns Number
  		*/
  var getBottom: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
  		* @param contentBox Boolean If true a box for the content of the element is returned.
  		* @param local Boolean If true the element's left and top are returned instead of page x/y.
  		* @returns Object An object in the format
  		*/
  var getBox: js.UndefOr[
    js.Function2[/* contentBox */ js.UndefOr[scala.Boolean], /* local */ js.UndefOr[scala.Boolean], _]
  ] = js.undefined
  /** [Method] Returns the innerHTML of an element
  		* @returns String
  		*/
  var getHTML: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the offset height of the element
  		* @param contentHeight Boolean true to get the height minus borders and padding.
  		* @returns Number The element's height.
  		*/
  var getHeight: js.UndefOr[js.Function1[/* contentHeight */ js.UndefOr[scala.Boolean], scala.Double]] = js.undefined
  /** [Method] Returns the innerHTML of an element
  		* @returns String
  		*/
  var getHtml: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Gets the left X coordinate
  		* @returns Number
  		*/
  var getLeft: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns an object with properties top left right and bottom representing the margins of this element unless sides i
  		* @param sides String Any combination of 'l', 'r', 't', 'b' to get the sum of those sides.
  		* @returns Object/Number
  		*/
  var getMargin: js.UndefOr[js.Function1[/* sides */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Returns the offsets of this element from the passed element
  		* @param element Mixed The element to get the offsets from.
  		* @returns Array The XY page offsets (e.g. [100, -200])
  		*/
  var getOffsetsTo: js.UndefOr[
    js.Function1[/* element */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.Array]
  ] = js.undefined
  /** [Method] Retrieves the height of the element account for the top and bottom margins  */
  var getOuterHeight: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Retrieves the width of the element accounting for the left and right margins  */
  var getOuterWidth: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Gets the width of the padding s for the specified side s
  		* @param side String Can be t, l, r, b or any combination of those to add multiple values. For example, passing 'lr' would get the padding left + the padding right.
  		* @returns Number The padding of the sides passed added together.
  		*/
  var getPadding: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], scala.Double]] = js.undefined
  /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
  		* @param asRegion Boolean If true an Ext.util.Region will be returned.
  		* @returns Object box An object in the format: {  x: &lt;Element's X position&gt;,  y: &lt;Element's Y position&gt;,  width: &lt;Element's width&gt;,  height: &lt;Element's height&gt;,  bottom: &lt;Element's lower bound&gt;,  right: &lt;Element's rightmost bound&gt; }  The returned object may also be addressed as an Array where index 0 contains the X position and index 1 contains the Y position. So the result may also be used for setXY.
  		*/
  var getPageBox: js.UndefOr[js.Function1[/* asRegion */ js.UndefOr[scala.Boolean], _]] = js.undefined
  /** [Method] Gets the right X coordinate of the element element X position  element width
  		* @returns Number
  		*/
  var getRight: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Gets the Scroller instance of the first parent that has one  */
  var getScrollParent: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the size of the element
  		* @param contentSize Boolean true to get the width/size minus borders and padding.
  		* @returns Object An object containing the element's size:
  		*/
  var getSize: js.UndefOr[js.Function1[/* contentSize */ js.UndefOr[scala.Boolean], _]] = js.undefined
  /** [Method] Normalizes currentStyle and computedStyle
  		* @param prop String The style property whose value is returned.
  		* @returns String The current value of the style property for this element.
  		*/
  var getStyle: js.UndefOr[js.Function1[/* prop */ js.UndefOr[java.lang.String], java.lang.String]] = js.undefined
  /** [Method] Gets the top Y coordinate
  		* @returns Number
  		*/
  var getTop: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of the value attribute
  		* @param asNumber Boolean true to parse the value as a number.
  		* @returns String/Number
  		*/
  var getValue: js.UndefOr[js.Function1[/* asNumber */ js.UndefOr[scala.Boolean], _]] = js.undefined
  /** [Method] Returns the dimensions of the element available to lay content out in
  		* @returns Object Object describing width and height:
  		*/
  var getViewSize: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the offset width of the element
  		* @param contentWidth Boolean true to get the width minus borders and padding.
  		* @returns Number The element's width.
  		*/
  var getWidth: js.UndefOr[js.Function1[/* contentWidth */ js.UndefOr[scala.Boolean], scala.Double]] = js.undefined
  /** [Method] Gets the current X position of the element based on page coordinates
  		* @returns Number The X position of the element
  		*/
  var getX: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Gets the current position of the element based on page coordinates
  		* @returns Array The XY position of the element
  		*/
  var getXY: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Gets the current Y position of the element based on page coordinates
  		* @returns Number The Y position of the element
  		*/
  var getY: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Checks if the specified CSS class exists on this element s DOM node
  		* @param name String The CSS class to check for.
  		* @returns Boolean true if the class exists, else false.
  		*/
  var hasCls: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Method] Hides this element  */
  var hide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
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
      /* returnEl */ js.UndefOr[scala.Boolean], 
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
      /* returnDom */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Returns true if this element matches the passed simple selector e g
  		* @param selector String The simple selector to test.
  		* @returns Boolean true if this element matches the selector, else false.
  		*/
  var is: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Method] Determines if this element is a descendant of the passed in Element  */
  var isDescendent: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Checks if the current value of a style is equal to a given value
  		* @param style String property whose value is returned.
  		* @param value String to check against.
  		* @returns Boolean true for when the current value equals the given value.
  		*/
  var isStyle: js.UndefOr[
    js.Function2[
      /* style */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] Returns true if the value of the given property is visually transparent
  		* @param prop String The style property whose value is to be tested.
  		* @returns Boolean true if the style property is visually transparent.
  		*/
  var isTransparent: js.UndefOr[js.Function1[/* prop */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Method] Gets the last child skipping text nodes
  		* @param selector String Find the previous sibling that matches the passed simple selector.
  		* @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element.
  		* @returns Ext.dom.Element/HTMLElement/null The last child or null.
  		*/
  var last: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Puts a mask over this element to disable user interaction  */
  var mask: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Gets the next sibling skipping text nodes
  		* @param selector String Find the next sibling that matches the passed simple selector.
  		* @param returnDom Boolean true to return a raw dom node instead of an Ext.dom.Element.
  		* @returns Ext.dom.Element/HTMLElement/null The next sibling or null.
  		*/
  var next: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[scala.Boolean], 
      _
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
      /* returnDom */ js.UndefOr[scala.Boolean], 
      _
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
      /* returnDom */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Removes all listeners for this object  */
  var purgeAllListeners: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Selects child nodes based on the passed CSS selector the selector should not contain an id
  		* @param selector String The CSS selector.
  		* @returns HTMLElement[] An array of the matched nodes.
  		*/
  var query: js.UndefOr[
    js.Function1[/* selector */ js.UndefOr[java.lang.String], senchaUnderscoreTouchLib.ExtNs.Array]
  ] = js.undefined
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
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Method] Removes this element s DOM reference  */
  var remove: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Removes all listeners for this object  */
  var removeAllListeners: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
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
    js.Function2[
      /* attributes */ js.UndefOr[js.Any], 
      /* useSet */ js.UndefOr[scala.Boolean], 
      this.type
    ]
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
  var setCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the innerHTML of this element
  		* @param html String The new HTML.
  		*/
  var setHTML: js.UndefOr[js.Function1[/* html */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Set the height of this Element
  		* @param height Number/String The new height.
  		* @returns Ext.dom.Element this
  		*/
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the innerHTML of this element
  		* @param html String The new HTML.
  		*/
  var setHtml: js.UndefOr[js.Function1[/* html */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
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
  var setTopLeft: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Use this to change the visibility mode between VISIBILITY DISPLAY or OFFSETS
  		* @param mode Object
  		* @returns Ext.dom.Element this
  		*/
  var setVisibilityMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the visibility of the element see details
  		* @param visible Boolean Whether the element is visible.
  		* @returns Ext.Element this
  		*/
  var setVisible: js.UndefOr[js.Function1[/* visible */ js.UndefOr[scala.Boolean], this.type]] = js.undefined
  /** [Method] Set the width of this Element
  		* @param width Number/String The new width.
  		* @returns Ext.dom.Element this
  		*/
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the X position of the element based on page coordinates
  		* @param x Number The X position of the element
  		* @returns Ext.dom.Element this
  		*/
  var setX: js.UndefOr[js.Function1[/* x */ js.UndefOr[scala.Double], this.type]] = js.undefined
  /** [Method] Sets the position of the element in page coordinates regardless of how the element is positioned
  		* @param pos Number[] Contains X &amp; Y [x, y] values for new position (coordinates are page-based).
  		* @returns Ext.dom.Element this
  		*/
  var setXY: js.UndefOr[
    js.Function1[/* pos */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], this.type]
  ] = js.undefined
  /** [Method] Sets the Y position of the element based on page coordinates
  		* @param y Number The Y position of the element.
  		* @returns Ext.dom.Element this
  		*/
  var setY: js.UndefOr[js.Function1[/* y */ js.UndefOr[scala.Double], this.type]] = js.undefined
  /** [Method] Shows this element  */
  var show: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
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
  var translatePoints: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] Removes a previously applied mask  */
  var unmask: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
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
  var update: js.UndefOr[js.Function1[/* html */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Creates and wraps this element with another element
  		* @param config Object DomHelper element config object for the wrapper element or null for an empty div
  		* @param domNode Boolean true to return the raw DOM element instead of Ext.dom.Element.
  		* @returns HTMLElement/Ext.dom.Element The newly created wrapper element.
  		*/
  var wrap: js.UndefOr[
    js.Function2[/* config */ js.UndefOr[js.Any], /* domNode */ js.UndefOr[scala.Boolean], _]
  ] = js.undefined
}

