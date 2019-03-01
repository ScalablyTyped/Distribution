package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompositeElement
  extends senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite {
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
      senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite
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
      /* els */ js.UndefOr[js.Any], 
      /* root */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite
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
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite
    ]
  ] = js.undefined
  /** [Method] Clears this Composite and adds the elements passed
  		* @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an array of DOM elements, or another Composite from which to fill this Composite.
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  @JSName("fill")
  var fill_ICompositeElement: js.UndefOr[
    js.Function1[
      /* els */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite
    ]
  ] = js.undefined
  /** [Method] Filters this composite to only elements that match the passed selector
  		* @param selector String/Function A string CSS selector or a comparison function. The comparison function will be called with the following arguments:
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  @JSName("filter")
  var filter_ICompositeElement: js.UndefOr[
    js.Function1[
      /* selector */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite
    ]
  ] = js.undefined
  /** [Method] Removes the specified element s
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
  		* @param removeDom Boolean true to also remove the element from the document
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  @JSName("removeElement")
  var removeElement_ICompositeElement: js.UndefOr[
    js.Function2[
      /* el */ js.UndefOr[js.Any], 
      /* removeDom */ js.UndefOr[scala.Boolean], 
      senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite
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
      /* el */ js.UndefOr[js.Any], 
      /* replacement */ js.UndefOr[js.Any], 
      /* domReplace */ js.UndefOr[scala.Boolean], 
      senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite
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
      /* selector */ js.UndefOr[js.Any], 
      /* composite */ js.UndefOr[scala.Boolean], 
      senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite
    ]
  ] = js.undefined
}

object ICompositeElement {
  @scala.inline
  def apply(
    ICompositeElementLite: senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite = null,
    add: js.Function2[
      /* els */ js.UndefOr[js.Any], 
      /* root */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite
    ] = null,
    addCls: js.Function3[
      /* names */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      senchaUnderscoreTouchLib.ExtNs.domNs.IElement
    ] = null,
    addListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* handler */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* opt */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite
    ] = null,
    appendChild: js.Function1[/* element */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    appendTo: js.Function1[/* el */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    applyStyles: js.Function1[/* styles */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    child: js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    clear: js.Function0[scala.Unit] = null,
    contains: js.Function1[/* el */ js.UndefOr[js.Any], scala.Boolean] = null,
    createChild: js.Function3[
      /* config */ js.UndefOr[js.Any], 
      /* insertBefore */ js.UndefOr[stdLib.HTMLElement], 
      /* returnDom */ js.UndefOr[scala.Boolean], 
      senchaUnderscoreTouchLib.ExtNs.domNs.IElement
    ] = null,
    cssTranslate: js.Function0[scala.Unit] = null,
    destroy: js.Function0[scala.Unit] = null,
    down: js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    each: js.Function2[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite
    ] = null,
    elements: Array = null,
    fill: js.Function1[
      /* els */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite
    ] = null,
    filter: js.Function1[
      /* selector */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite
    ] = null,
    findParent: js.Function3[
      /* simpleSelector */ js.UndefOr[java.lang.String], 
      /* maxDepth */ js.UndefOr[js.Any], 
      /* returnEl */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    findParentNode: js.Function3[
      /* simpleSelector */ js.UndefOr[java.lang.String], 
      /* maxDepth */ js.UndefOr[js.Any], 
      /* returnEl */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    getAlignToXY: js.Function3[
      /* element */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[java.lang.String], 
      /* offsets */ js.UndefOr[Array], 
      Array
    ] = null,
    getAnchorXY: js.Function3[
      /* anchor */ js.UndefOr[java.lang.String], 
      /* local */ js.UndefOr[scala.Boolean], 
      /* size */ js.UndefOr[js.Any], 
      Array
    ] = null,
    getAttribute: js.Function2[
      /* name */ js.UndefOr[java.lang.String], 
      /* namespace */ js.UndefOr[java.lang.String], 
      java.lang.String
    ] = null,
    getBorderWidth: js.Function1[/* side */ js.UndefOr[java.lang.String], scala.Double] = null,
    getBottom: js.Function0[scala.Double] = null,
    getBox: js.Function2[/* contentBox */ js.UndefOr[scala.Boolean], /* local */ js.UndefOr[scala.Boolean], _] = null,
    getCount: js.Function0[scala.Double] = null,
    getHTML: js.Function0[java.lang.String] = null,
    getHeight: js.Function1[/* contentHeight */ js.UndefOr[scala.Boolean], scala.Double] = null,
    getHtml: js.Function0[java.lang.String] = null,
    getLeft: js.Function0[scala.Double] = null,
    getMargin: js.Function1[/* sides */ js.UndefOr[java.lang.String], _] = null,
    getOffsetsTo: js.Function1[/* element */ js.UndefOr[js.Any], Array] = null,
    getOuterHeight: js.Function0[scala.Unit] = null,
    getOuterWidth: js.Function0[scala.Unit] = null,
    getPadding: js.Function1[/* side */ js.UndefOr[java.lang.String], scala.Double] = null,
    getPageBox: js.Function1[/* asRegion */ js.UndefOr[scala.Boolean], _] = null,
    getRight: js.Function0[scala.Double] = null,
    getScrollParent: js.Function0[scala.Unit] = null,
    getSize: js.Function1[/* contentSize */ js.UndefOr[scala.Boolean], _] = null,
    getStyle: js.Function1[/* prop */ js.UndefOr[java.lang.String], java.lang.String] = null,
    getTop: js.Function0[scala.Double] = null,
    getValue: js.Function1[/* asNumber */ js.UndefOr[scala.Boolean], _] = null,
    getViewSize: js.Function0[_] = null,
    getWidth: js.Function1[/* contentWidth */ js.UndefOr[scala.Boolean], scala.Double] = null,
    getX: js.Function0[scala.Double] = null,
    getXY: js.Function0[Array] = null,
    getY: js.Function0[scala.Double] = null,
    hasCls: js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hide: js.Function0[scala.Unit] = null,
    indexOf: js.Function1[/* el */ js.UndefOr[js.Any], scala.Double] = null,
    insertAfter: js.Function1[/* el */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    insertBefore: js.Function1[/* el */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    insertFirst: js.Function1[/* element */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    insertHtml: js.Function3[
      /* where */ js.UndefOr[java.lang.String], 
      /* html */ js.UndefOr[java.lang.String], 
      /* returnEl */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    insertSibling: js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* where */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[scala.Boolean], 
      senchaUnderscoreTouchLib.ExtNs.domNs.IElement
    ] = null,
    is: js.Function1[/* selector */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    isDescendent: js.Function0[scala.Unit] = null,
    isStyle: js.Function2[
      /* style */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ] = null,
    isTransparent: js.Function1[/* prop */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    item: js.Function1[
      /* index */ js.UndefOr[scala.Double], 
      senchaUnderscoreTouchLib.ExtNs.domNs.IElement
    ] = null,
    mask: js.Function0[scala.Unit] = null,
    next: js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    parent: js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    prev: js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    purgeAllListeners: js.Function0[scala.Unit] = null,
    query: js.Function1[/* selector */ js.UndefOr[java.lang.String], Array] = null,
    radioCls: js.Function1[/* className */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    remove: js.Function0[scala.Unit] = null,
    removeAllListeners: js.Function0[scala.Unit] = null,
    removeCls: js.Function3[
      /* names */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      senchaUnderscoreTouchLib.ExtNs.domNs.IElement
    ] = null,
    removeElement: js.Function2[
      /* el */ js.UndefOr[js.Any], 
      /* removeDom */ js.UndefOr[scala.Boolean], 
      senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite
    ] = null,
    repaint: js.Function0[senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    replace: js.Function1[/* element */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    replaceCls: js.Function4[
      /* oldName */ js.UndefOr[java.lang.String], 
      /* newName */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      senchaUnderscoreTouchLib.ExtNs.domNs.IElement
    ] = null,
    replaceElement: js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* replacement */ js.UndefOr[js.Any], 
      /* domReplace */ js.UndefOr[scala.Boolean], 
      senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite
    ] = null,
    replaceWith: js.Function1[/* el */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    select: js.Function2[
      /* selector */ js.UndefOr[js.Any], 
      /* composite */ js.UndefOr[scala.Boolean], 
      senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite
    ] = null,
    serializeForm: js.Function1[/* form */ js.UndefOr[js.Any], java.lang.String] = null,
    set: js.Function2[
      /* attributes */ js.UndefOr[js.Any], 
      /* useSet */ js.UndefOr[scala.Boolean], 
      senchaUnderscoreTouchLib.ExtNs.domNs.IElement
    ] = null,
    setBottom: js.Function1[
      /* bottom */ js.UndefOr[java.lang.String], 
      senchaUnderscoreTouchLib.ExtNs.domNs.IElement
    ] = null,
    setBox: js.Function1[/* box */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    setCls: js.Function1[/* className */ js.UndefOr[js.Any], scala.Unit] = null,
    setHTML: js.Function1[/* html */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setHeight: js.Function1[/* height */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    setHtml: js.Function1[/* html */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setLeft: js.Function1[
      /* left */ js.UndefOr[java.lang.String], 
      senchaUnderscoreTouchLib.ExtNs.domNs.IElement
    ] = null,
    setMaxHeight: js.Function1[/* height */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    setMaxWidth: js.Function1[/* width */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    setMinHeight: js.Function1[/* height */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    setMinWidth: js.Function1[/* width */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    setRight: js.Function1[
      /* right */ js.UndefOr[java.lang.String], 
      senchaUnderscoreTouchLib.ExtNs.domNs.IElement
    ] = null,
    setSize: js.Function2[
      /* width */ js.UndefOr[js.Any], 
      /* height */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.domNs.IElement
    ] = null,
    setStyle: js.Function2[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[java.lang.String], 
      senchaUnderscoreTouchLib.ExtNs.domNs.IElement
    ] = null,
    setTop: js.Function1[
      /* top */ js.UndefOr[java.lang.String], 
      senchaUnderscoreTouchLib.ExtNs.domNs.IElement
    ] = null,
    setTopLeft: js.Function0[scala.Unit] = null,
    setVisibilityMode: js.Function1[/* mode */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    setVisible: js.Function1[/* visible */ js.UndefOr[scala.Boolean], IElement] = null,
    setWidth: js.Function1[/* width */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    setX: js.Function1[/* x */ js.UndefOr[scala.Double], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    setXY: js.Function1[/* pos */ js.UndefOr[Array], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    setY: js.Function1[/* y */ js.UndefOr[scala.Double], senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    show: js.Function0[scala.Unit] = null,
    toggleCls: js.Function1[
      /* className */ js.UndefOr[java.lang.String], 
      senchaUnderscoreTouchLib.ExtNs.domNs.IElement
    ] = null,
    translatePoints: js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[scala.Double], _] = null,
    unmask: js.Function0[scala.Unit] = null,
    up: js.Function2[
      /* simpleSelector */ js.UndefOr[java.lang.String], 
      /* maxDepth */ js.UndefOr[js.Any], 
      _
    ] = null,
    update: js.Function1[/* html */ js.UndefOr[java.lang.String], scala.Unit] = null,
    wrap: js.Function2[/* config */ js.UndefOr[js.Any], /* domNode */ js.UndefOr[scala.Boolean], _] = null
  ): ICompositeElement = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ICompositeElementLite)
    if (add != null) __obj.updateDynamic("add")(add)
    if (addCls != null) __obj.updateDynamic("addCls")(addCls)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (appendChild != null) __obj.updateDynamic("appendChild")(appendChild)
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (applyStyles != null) __obj.updateDynamic("applyStyles")(applyStyles)
    if (child != null) __obj.updateDynamic("child")(child)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (contains != null) __obj.updateDynamic("contains")(contains)
    if (createChild != null) __obj.updateDynamic("createChild")(createChild)
    if (cssTranslate != null) __obj.updateDynamic("cssTranslate")(cssTranslate)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (down != null) __obj.updateDynamic("down")(down)
    if (each != null) __obj.updateDynamic("each")(each)
    if (elements != null) __obj.updateDynamic("elements")(elements)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (findParent != null) __obj.updateDynamic("findParent")(findParent)
    if (findParentNode != null) __obj.updateDynamic("findParentNode")(findParentNode)
    if (getAlignToXY != null) __obj.updateDynamic("getAlignToXY")(getAlignToXY)
    if (getAnchorXY != null) __obj.updateDynamic("getAnchorXY")(getAnchorXY)
    if (getAttribute != null) __obj.updateDynamic("getAttribute")(getAttribute)
    if (getBorderWidth != null) __obj.updateDynamic("getBorderWidth")(getBorderWidth)
    if (getBottom != null) __obj.updateDynamic("getBottom")(getBottom)
    if (getBox != null) __obj.updateDynamic("getBox")(getBox)
    if (getCount != null) __obj.updateDynamic("getCount")(getCount)
    if (getHTML != null) __obj.updateDynamic("getHTML")(getHTML)
    if (getHeight != null) __obj.updateDynamic("getHeight")(getHeight)
    if (getHtml != null) __obj.updateDynamic("getHtml")(getHtml)
    if (getLeft != null) __obj.updateDynamic("getLeft")(getLeft)
    if (getMargin != null) __obj.updateDynamic("getMargin")(getMargin)
    if (getOffsetsTo != null) __obj.updateDynamic("getOffsetsTo")(getOffsetsTo)
    if (getOuterHeight != null) __obj.updateDynamic("getOuterHeight")(getOuterHeight)
    if (getOuterWidth != null) __obj.updateDynamic("getOuterWidth")(getOuterWidth)
    if (getPadding != null) __obj.updateDynamic("getPadding")(getPadding)
    if (getPageBox != null) __obj.updateDynamic("getPageBox")(getPageBox)
    if (getRight != null) __obj.updateDynamic("getRight")(getRight)
    if (getScrollParent != null) __obj.updateDynamic("getScrollParent")(getScrollParent)
    if (getSize != null) __obj.updateDynamic("getSize")(getSize)
    if (getStyle != null) __obj.updateDynamic("getStyle")(getStyle)
    if (getTop != null) __obj.updateDynamic("getTop")(getTop)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (getViewSize != null) __obj.updateDynamic("getViewSize")(getViewSize)
    if (getWidth != null) __obj.updateDynamic("getWidth")(getWidth)
    if (getX != null) __obj.updateDynamic("getX")(getX)
    if (getXY != null) __obj.updateDynamic("getXY")(getXY)
    if (getY != null) __obj.updateDynamic("getY")(getY)
    if (hasCls != null) __obj.updateDynamic("hasCls")(hasCls)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (indexOf != null) __obj.updateDynamic("indexOf")(indexOf)
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(insertAfter)
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(insertBefore)
    if (insertFirst != null) __obj.updateDynamic("insertFirst")(insertFirst)
    if (insertHtml != null) __obj.updateDynamic("insertHtml")(insertHtml)
    if (insertSibling != null) __obj.updateDynamic("insertSibling")(insertSibling)
    if (is != null) __obj.updateDynamic("is")(is)
    if (isDescendent != null) __obj.updateDynamic("isDescendent")(isDescendent)
    if (isStyle != null) __obj.updateDynamic("isStyle")(isStyle)
    if (isTransparent != null) __obj.updateDynamic("isTransparent")(isTransparent)
    if (item != null) __obj.updateDynamic("item")(item)
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (next != null) __obj.updateDynamic("next")(next)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    if (purgeAllListeners != null) __obj.updateDynamic("purgeAllListeners")(purgeAllListeners)
    if (query != null) __obj.updateDynamic("query")(query)
    if (radioCls != null) __obj.updateDynamic("radioCls")(radioCls)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (removeAllListeners != null) __obj.updateDynamic("removeAllListeners")(removeAllListeners)
    if (removeCls != null) __obj.updateDynamic("removeCls")(removeCls)
    if (removeElement != null) __obj.updateDynamic("removeElement")(removeElement)
    if (repaint != null) __obj.updateDynamic("repaint")(repaint)
    if (replace != null) __obj.updateDynamic("replace")(replace)
    if (replaceCls != null) __obj.updateDynamic("replaceCls")(replaceCls)
    if (replaceElement != null) __obj.updateDynamic("replaceElement")(replaceElement)
    if (replaceWith != null) __obj.updateDynamic("replaceWith")(replaceWith)
    if (select != null) __obj.updateDynamic("select")(select)
    if (serializeForm != null) __obj.updateDynamic("serializeForm")(serializeForm)
    if (set != null) __obj.updateDynamic("set")(set)
    if (setBottom != null) __obj.updateDynamic("setBottom")(setBottom)
    if (setBox != null) __obj.updateDynamic("setBox")(setBox)
    if (setCls != null) __obj.updateDynamic("setCls")(setCls)
    if (setHTML != null) __obj.updateDynamic("setHTML")(setHTML)
    if (setHeight != null) __obj.updateDynamic("setHeight")(setHeight)
    if (setHtml != null) __obj.updateDynamic("setHtml")(setHtml)
    if (setLeft != null) __obj.updateDynamic("setLeft")(setLeft)
    if (setMaxHeight != null) __obj.updateDynamic("setMaxHeight")(setMaxHeight)
    if (setMaxWidth != null) __obj.updateDynamic("setMaxWidth")(setMaxWidth)
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(setMinHeight)
    if (setMinWidth != null) __obj.updateDynamic("setMinWidth")(setMinWidth)
    if (setRight != null) __obj.updateDynamic("setRight")(setRight)
    if (setSize != null) __obj.updateDynamic("setSize")(setSize)
    if (setStyle != null) __obj.updateDynamic("setStyle")(setStyle)
    if (setTop != null) __obj.updateDynamic("setTop")(setTop)
    if (setTopLeft != null) __obj.updateDynamic("setTopLeft")(setTopLeft)
    if (setVisibilityMode != null) __obj.updateDynamic("setVisibilityMode")(setVisibilityMode)
    if (setVisible != null) __obj.updateDynamic("setVisible")(setVisible)
    if (setWidth != null) __obj.updateDynamic("setWidth")(setWidth)
    if (setX != null) __obj.updateDynamic("setX")(setX)
    if (setXY != null) __obj.updateDynamic("setXY")(setXY)
    if (setY != null) __obj.updateDynamic("setY")(setY)
    if (show != null) __obj.updateDynamic("show")(show)
    if (toggleCls != null) __obj.updateDynamic("toggleCls")(toggleCls)
    if (translatePoints != null) __obj.updateDynamic("translatePoints")(translatePoints)
    if (unmask != null) __obj.updateDynamic("unmask")(unmask)
    if (up != null) __obj.updateDynamic("up")(up)
    if (update != null) __obj.updateDynamic("update")(update)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[ICompositeElement]
  }
}

