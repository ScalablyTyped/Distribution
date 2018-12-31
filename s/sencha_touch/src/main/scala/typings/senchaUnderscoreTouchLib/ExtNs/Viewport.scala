package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Viewport")
@js.native
class Viewport () extends js.Object

@JSGlobal("Ext.Viewport")
@js.native
object Viewport extends js.Object {
  /** [Property] (Boolean) */
  var isReady: scala.Boolean = js.native
  /** [Property] (Ext.util.MixedCollection) */
  var items: senchaUnderscoreTouchLib.ExtNs.utilNs.IMixedCollection = js.native
  /** [Property] (Ext.Class) */
  var self: senchaUnderscoreTouchLib.ExtNs.IClass = js.native
  /** [Method] Adds one or more Components to this Container
  		* @param newItems Object/Object[]/Ext.Component/Ext.Component[] The new items to add to the Container.
  		* @returns Ext.Component The last item added to the Container from the newItems array.
  		*/
  def add(): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  def add(newItems: js.Any): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  /** [Method] Appends an after event handler
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  def addAfterListener(): scala.Unit = js.native
  def addAfterListener(eventName: js.Any): scala.Unit = js.native
  def addAfterListener(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Adds an array of Components to this Container
  		* @param items Array The array of items to add to this container.
  		* @returns Array The array of items after they have been added.
  		*/
  def addAll(): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  def addAll(items: senchaUnderscoreTouchLib.ExtNs.Array): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  /** [Method] Appends a before event handler
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  def addBeforeListener(): scala.Unit = js.native
  def addBeforeListener(eventName: js.Any): scala.Unit = js.native
  def addBeforeListener(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Adds a CSS class or classes to this Component s rendered element
  		* @param cls String The CSS class to add.
  		* @param prefix String Optional prefix to add to each class.
  		* @param suffix String Optional suffix to add to each class.
  		*/
  def addCls(): scala.Unit = js.native
  def addCls(cls: java.lang.String): scala.Unit = js.native
  def addCls(cls: java.lang.String, prefix: java.lang.String): scala.Unit = js.native
  def addCls(cls: java.lang.String, prefix: java.lang.String, suffix: java.lang.String): scala.Unit = js.native
  /** [Method] Adds the specified events to the list of events which this Observable may fire
  		* @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
  		*/
  def addEvents(): scala.Unit = js.native
  def addEvents(eventNames: js.Any): scala.Unit = js.native
  /** [Method] Appends an event handler to this object
  		* @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
  		* @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		* @param options Object An object containing handler configuration.  This object may contain any of the following properties:
  		* @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
  		*/
  def addListener(): scala.Unit = js.native
  def addListener(eventName: js.Any): scala.Unit = js.native
  def addListener(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): scala.Unit = js.native
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		* @param options Object If the eventName parameter was an event name, this is the addListener options.
  		*/
  def addManagedListener(): scala.Unit = js.native
  def addManagedListener(`object`: js.Any): scala.Unit = js.native
  def addManagedListener(`object`: js.Any, eventName: js.Any): scala.Unit = js.native
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Animates to the supplied activeItem with a specified animation
  		* @param activeItem Object/Number The item or item index to make active.
  		* @param animation Object/Ext.fx.layout.Card Card animation configuration or instance.
  		*/
  def animateActiveItem(): scala.Unit = js.native
  def animateActiveItem(activeItem: js.Any): scala.Unit = js.native
  def animateActiveItem(activeItem: js.Any, animation: js.Any): scala.Unit = js.native
  /** [Method] Changes the masked configuration when its setter is called which will convert the value into a proper object instanc
  		* @param masked Boolean/Object/Ext.Mask/Ext.LoadMask
  		* @returns Object
  		*/
  def applyMasked(): js.Any = js.native
  def applyMasked(masked: js.Any): js.Any = js.native
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(): js.Any = js.native
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(): js.Any = js.native
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(): js.Any = js.native
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method] Retrieves the first direct child of this container which matches the passed selector
  		* @param selector String An Ext.ComponentQuery selector.
  		* @returns Ext.Component
  		*/
  def child(): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  def child(selector: java.lang.String): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  /** [Method] Removes all listeners for this object  */
  def clearListeners(): scala.Unit = js.native
  /** [Method]  */
  def destroy(): scala.Unit = js.native
  /** [Method] Disables this Component */
  def disable(): scala.Unit = js.native
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
  		* @param selector String An Ext.ComponentQuery selector.
  		* @returns Ext.Component
  		*/
  def down(): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  def down(selector: java.lang.String): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  /** [Method] Enables this Component */
  def enable(): scala.Unit = js.native
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
  		* @param events String/String[] The event name to bubble, or an Array of event names.
  		*/
  def enableBubble(): scala.Unit = js.native
  def enableBubble(events: js.Any): scala.Unit = js.native
  /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
  		* @param eventName String The name of the event to fire.
  		* @param args Array Arguments to pass to handers.
  		* @param fn Function Action.
  		* @param scope Object Scope of fn.
  		* @returns Object
  		*/
  def fireAction(): js.Any = js.native
  def fireAction(eventName: java.lang.String): js.Any = js.native
  def fireAction(eventName: java.lang.String, args: senchaUnderscoreTouchLib.ExtNs.Array): js.Any = js.native
  def fireAction(eventName: java.lang.String, args: senchaUnderscoreTouchLib.ExtNs.Array, fn: js.Any): js.Any = js.native
  def fireAction(eventName: java.lang.String, args: senchaUnderscoreTouchLib.ExtNs.Array, fn: js.Any, scope: js.Any): js.Any = js.native
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
  		* @param eventName String The name of the event to fire.
  		* @param args Object... Variable number of parameters are passed to handlers.
  		* @returns Boolean Returns false if any of the handlers return false.
  		*/
  def fireEvent(eventName: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /** [Method] Returns the value of activeItem
  		* @returns Object/String/Number
  		*/
  def getActiveItem(): js.Any = js.native
  /** [Method] Prepares information on aligning this to component using alignment
  		* @param component Object
  		* @param alignment Object
  		*/
  def getAlignmentInfo(): scala.Unit = js.native
  def getAlignmentInfo(component: js.Any): scala.Unit = js.native
  def getAlignmentInfo(component: js.Any, alignment: js.Any): scala.Unit = js.native
  /** [Method] Returns the Component for a given index in the Container s items
  		* @param index Number The index of the Component to return.
  		* @returns Ext.Component The item at the specified index, if found.
  		*/
  def getAt(): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  def getAt(index: scala.Double): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  /** [Method] Returns the value of autoDestroy
  		* @returns Boolean
  		*/
  def getAutoDestroy(): scala.Boolean = js.native
  /** [Method] Returns the value of autoMaximize
  		* @returns Boolean
  		*/
  def getAutoMaximize(): scala.Boolean = js.native
  /** [Method] Returns the value of baseCls
  		* @returns String
  		*/
  def getBaseCls(): java.lang.String = js.native
  /** [Method] Returns the value of border
  		* @returns Number/String
  		*/
  def getBorder(): js.Any = js.native
  /** [Method] Returns the value of bottom
  		* @returns Number/String
  		*/
  def getBottom(): js.Any = js.native
  /** [Method] Returns the value of bubbleEvents
  		* @returns String/String[]
  		*/
  def getBubbleEvents(): js.Any = js.native
  /** [Method] Returns the value of centered
  		* @returns Boolean
  		*/
  def getCentered(): scala.Boolean = js.native
  /** [Method] Returns the value of cls
  		* @returns String/String[]
  		*/
  def getCls(): js.Any = js.native
  /** [Method] Examines this container s items property and gets a direct child component of this container
  		* @param component String/Number This parameter may be any of the following:  {String} : representing the itemId or id of the child component. {Number} : representing the position of the child component within the items property. For additional information see Ext.util.MixedCollection.get.
  		* @returns Ext.Component The component (if found).
  		*/
  def getComponent(): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  def getComponent(component: js.Any): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  /** [Method] Returns the value of contentEl
  		* @returns Ext.Element/HTMLElement/String
  		*/
  def getContentEl(): js.Any = js.native
  /** [Method] Returns the value of control
  		* @returns Object
  		*/
  def getControl(): js.Any = js.native
  /** [Method] Returns the value of data
  		* @returns Object
  		*/
  def getData(): js.Any = js.native
  /** [Method] Returns the value of defaultType
  		* @returns String
  		*/
  def getDefaultType(): java.lang.String = js.native
  /** [Method] Returns the value of defaults
  		* @returns Object
  		*/
  def getDefaults(): js.Any = js.native
  /** [Method] Returns the value of disabled
  		* @returns Boolean
  		*/
  def getDisabled(): scala.Boolean = js.native
  /** [Method] Returns the value of disabledCls
  		* @returns String
  		*/
  def getDisabledCls(): java.lang.String = js.native
  /** [Method] Returns the value of docked
  		* @returns String
  		*/
  def getDocked(): java.lang.String = js.native
  /** [Method] Finds a docked item of this container using a reference idor an index of its location in getDockedItems
  		* @param component String/Number The id or index of the component to find.
  		* @returns Ext.Component/Boolean The docked component, if found.
  		*/
  def getDockedComponent(): js.Any = js.native
  def getDockedComponent(component: js.Any): js.Any = js.native
  /** [Method] Returns all the Ext Component docked items in this container
  		* @returns Array The docked items of this container.
  		*/
  def getDockedItems(): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  /** [Method] Retrieves the top level element representing this component
  		* @returns Ext.dom.Element
  		*/
  def getEl(): senchaUnderscoreTouchLib.ExtNs.domNs.IElement = js.native
  /** [Method] Returns the value of enterAnimation
  		* @returns String/Mixed
  		*/
  def getEnterAnimation(): js.Any = js.native
  /** [Method] Returns the value of exitAnimation
  		* @returns String/Mixed
  		*/
  def getExitAnimation(): js.Any = js.native
  /** [Method] Returns the value of flex
  		* @returns Number
  		*/
  def getFlex(): scala.Double = js.native
  /** [Method] Returns the value of floatingCls
  		* @returns String
  		*/
  def getFloatingCls(): java.lang.String = js.native
  /** [Method] Returns the value of hidden
  		* @returns Boolean
  		*/
  def getHidden(): scala.Boolean = js.native
  /** [Method] Returns the value of hiddenCls
  		* @returns String
  		*/
  def getHiddenCls(): java.lang.String = js.native
  /** [Method] Returns the value of hideAnimation
  		* @returns String/Mixed
  		*/
  def getHideAnimation(): js.Any = js.native
  /** [Method] Returns the value of hideOnMaskTap
  		* @returns Boolean
  		*/
  def getHideOnMaskTap(): scala.Boolean = js.native
  /** [Method] Returns the value of html
  		* @returns String/Ext.Element/HTMLElement
  		*/
  def getHtml(): js.Any = js.native
  /** [Method] Retrieves the id of this component
  		* @returns String id
  		*/
  def getId(): java.lang.String = js.native
  /** [Method] Returns the initial configuration passed to constructor
  		* @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
  		* @returns Object/Mixed
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Returns all inner items of this container
  		* @returns Array The inner items of this container.
  		*/
  def getInnerItems(): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  /** [Method] Returns the value of itemId
  		* @returns String
  		*/
  def getItemId(): java.lang.String = js.native
  /** [Method] Returns the value of items
  		* @returns Array/Object
  		*/
  def getItems(): js.Any = js.native
  /** [Method] Returns the value of layout
  		* @returns Object/String
  		*/
  def getLayout(): js.Any = js.native
  /** [Method] Returns the value of left
  		* @returns Number/String
  		*/
  def getLeft(): js.Any = js.native
  /** [Method] Returns the value of listeners
  		* @returns Object
  		*/
  def getListeners(): js.Any = js.native
  /** [Method] Returns the value of margin
  		* @returns Number/String
  		*/
  def getMargin(): js.Any = js.native
  /** [Method] Returns the value of masked
  		* @returns Boolean/Object/Ext.Mask/Ext.LoadMask
  		*/
  def getMasked(): js.Any = js.native
  /** [Method] Returns the value of maxHeight
  		* @returns Number/String
  		*/
  def getMaxHeight(): js.Any = js.native
  /** [Method] Returns the value of maxWidth
  		* @returns Number/String
  		*/
  def getMaxWidth(): js.Any = js.native
  /** [Method] Returns the value of minHeight
  		* @returns Number/String
  		*/
  def getMinHeight(): js.Any = js.native
  /** [Method] Returns the value of minWidth
  		* @returns Number/String
  		*/
  def getMinWidth(): js.Any = js.native
  /** [Method] Returns the value of modal
  		* @returns Boolean
  		*/
  def getModal(): scala.Boolean = js.native
  /** [Method] Returns the current orientation
  		* @returns String portrait or landscape
  		*/
  def getOrientation(): java.lang.String = js.native
  /** [Method] Returns the value of padding
  		* @returns Number/String
  		*/
  def getPadding(): js.Any = js.native
  /** [Method] Returns the parent of this component if it has one
  		* @returns Ext.Component The parent of this component.
  		*/
  def getParent(): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  /** [Method] Returns the value of plugins
  		* @returns Object/Array
  		*/
  def getPlugins(): js.Any = js.native
  /** [Method] Returns the value of preventPanning
  		* @returns Boolean
  		*/
  def getPreventPanning(): scala.Boolean = js.native
  /** [Method] Returns the value of preventZooming
  		* @returns Boolean
  		*/
  def getPreventZooming(): scala.Boolean = js.native
  /** [Method] Returns the value of record
  		* @returns Ext.data.Model
  		*/
  def getRecord(): senchaUnderscoreTouchLib.ExtNs.dataNs.IModel = js.native
  /** [Method] Returns the value of renderTo
  		* @returns Ext.Element
  		*/
  def getRenderTo(): senchaUnderscoreTouchLib.ExtNs.IElement = js.native
  /** [Method] Returns the value of right
  		* @returns Number/String
  		*/
  def getRight(): js.Any = js.native
  /** [Method] Returns an the scrollable instance for this container which is a Ext scroll View class
  		* @returns Ext.scroll.View The scroll view.
  		*/
  def getScrollable(): senchaUnderscoreTouchLib.ExtNs.scrollNs.IView = js.native
  /** [Method] Returns the value of showAnimation
  		* @returns String/Mixed
  		*/
  def getShowAnimation(): js.Any = js.native
  /** [Method] Returns the height and width of the Component
  		* @returns Object The current height and width of the Component.
  		*/
  def getSize(): js.Any = js.native
  /** [Method] Returns the value of style
  		* @returns String/Object
  		*/
  def getStyle(): js.Any = js.native
  /** [Method] Returns the value of styleHtmlCls
  		* @returns String
  		*/
  def getStyleHtmlCls(): java.lang.String = js.native
  /** [Method] Returns the value of styleHtmlContent
  		* @returns Boolean
  		*/
  def getStyleHtmlContent(): scala.Boolean = js.native
  /** [Method] Returns the value of top
  		* @returns Number/String
  		*/
  def getTop(): js.Any = js.native
  /** [Method] Returns the value of tpl
  		* @returns String/String[]/Ext.Template/Ext.XTemplate[]
  		*/
  def getTpl(): js.Any = js.native
  /** [Method] Returns the value of tplWriteMode
  		* @returns String
  		*/
  def getTplWriteMode(): java.lang.String = js.native
  /** [Method] Returns the value of ui
  		* @returns String
  		*/
  def getUi(): java.lang.String = js.native
  /** [Method] Returns the value of useBodyElement
  		* @returns Boolean
  		*/
  def getUseBodyElement(): scala.Boolean = js.native
  /** [Method] Retrieves the document height
  		* @returns Number height in pixels.
  		*/
  def getWindowHeight(): scala.Double = js.native
  /** [Method] Retrieves the document width
  		* @returns Number width in pixels.
  		*/
  def getWindowWidth(): scala.Double = js.native
  /** [Method] Returns this Component s xtype hierarchy as a slash delimited string
  		* @returns String The xtype hierarchy string.
  		*/
  def getXTypes(): java.lang.String = js.native
  /** [Method] Returns the value of zIndex
  		* @returns Number
  		*/
  def getZIndex(): scala.Double = js.native
  /** [Method] Checks to see if this object has any listeners for a specified event
  		* @param eventName String The name of the event to check for
  		* @returns Boolean True if the event is being listened for, else false
  		*/
  def hasListener(): scala.Boolean = js.native
  def hasListener(eventName: java.lang.String): scala.Boolean = js.native
  /** [Method] Returns true if this component has a parent
  		* @returns Boolean true if this component has a parent.
  		*/
  def hasParent(): scala.Boolean = js.native
  /** [Method] Hides this Component optionally using an animation
  		* @returns Ext.Component
  		*/
  def hide(): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  /** [Method] Hides all visible menus
  		* @param animation Object
  		*/
  def hideAllMenus(): scala.Unit = js.native
  def hideAllMenus(animation: js.Any): scala.Unit = js.native
  /** [Method] Hides a menu specified by the menu s side
  		* @param side String The side which the menu is placed.
  		*/
  def hideMenu(): scala.Unit = js.native
  def hideMenu(side: java.lang.String): scala.Unit = js.native
  /** [Method] Hides all menus except for the side specified
  		* @param side String Side(s) not to hide
  		* @param animation String Animation to hide with
  		*/
  def hideOtherMenus(): scala.Unit = js.native
  def hideOtherMenus(side: java.lang.String): scala.Unit = js.native
  def hideOtherMenus(side: java.lang.String, animation: java.lang.String): scala.Unit = js.native
  /** [Method] Initialize configuration for this class
  		* @param instanceConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  /** [Method] Allows addition of behavior to the rendering phase  */
  def initialize(): scala.Unit = js.native
  /** [Method] Adds a child Component at the given index
  		* @param index Number The index to insert the Component at.
  		* @param item Object The Component to insert.
  		*/
  def insert(): scala.Unit = js.native
  def insert(index: scala.Double): scala.Unit = js.native
  def insert(index: scala.Double, item: js.Any): scala.Unit = js.native
  /** [Method] Returns true if this Component is currently disabled
  		* @returns Boolean true if currently disabled.
  		*/
  def isDisabled(): scala.Boolean = js.native
  /** [Method] Returns true if this Component is currently hidden
  		* @returns Boolean true if currently hidden.
  		*/
  def isHidden(): scala.Boolean = js.native
  /** [Method] Tests whether or not this Component is of a specific xtype
  		* @param xtype String The xtype to check for this Component.
  		* @param shallow Boolean false to check whether this Component is descended from the xtype (this is the default), or true to check whether this Component is directly of the specified xtype.
  		* @returns Boolean true if this component descends from the specified xtype, false otherwise.
  		*/
  def isXType(): scala.Boolean = js.native
  def isXType(xtype: java.lang.String): scala.Boolean = js.native
  def isXType(xtype: java.lang.String, shallow: scala.Boolean): scala.Boolean = js.native
  /** [Method] Convenience method which calls setMasked with a value of true to show the mask
  		* @param mask Object
  		*/
  def mask(): scala.Unit = js.native
  def mask(mask: js.Any): scala.Unit = js.native
  /** [Method] Alias for addManagedListener
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		* @param options Object If the eventName parameter was an event name, this is the addListener options.
  		*/
  def mon(): scala.Unit = js.native
  def mon(`object`: js.Any): scala.Unit = js.native
  def mon(`object`: js.Any, eventName: js.Any): scala.Unit = js.native
  def mon(`object`: js.Any, eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Alias for removeManagedListener
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		*/
  def mun(): scala.Unit = js.native
  def mun(`object`: js.Any): scala.Unit = js.native
  def mun(`object`: js.Any, eventName: js.Any): scala.Unit = js.native
  def mun(`object`: js.Any, eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def mun(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Alias for addListener
  		* @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
  		* @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		* @param options Object An object containing handler configuration.  This object may contain any of the following properties:
  		* @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
  		*/
  def on(): scala.Unit = js.native
  def on(eventName: js.Any): scala.Unit = js.native
  def on(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): scala.Unit = js.native
  /** [Method] Alias for addAfterListener
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  def onAfter(): scala.Unit = js.native
  def onAfter(eventName: js.Any): scala.Unit = js.native
  def onAfter(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Alias for addBeforeListener
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  def onBefore(): scala.Unit = js.native
  def onBefore(eventName: js.Any): scala.Unit = js.native
  def onBefore(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Retrieves all descendant components which match the passed selector
  		* @param selector String Selector complying to an Ext.ComponentQuery selector.
  		* @returns Array Ext.Component's which matched the selector.
  		*/
  def query(): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  def query(selector: java.lang.String): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  def relayEvents(): senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable = js.native
  def relayEvents(`object`: js.Any): senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable = js.native
  def relayEvents(`object`: js.Any, events: js.Any): senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable = js.native
  /** [Method] Removes an item from this Container optionally destroying it
  		* @param item Object The item to remove.
  		* @param destroy Boolean Calls the Component's destroy method if true.
  		* @returns Ext.Component this
  		*/
  def remove(): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  def remove(item: js.Any): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  def remove(item: js.Any, destroy: scala.Boolean): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  /** [Method] Removes a before event handler
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  def removeAfterListener(): scala.Unit = js.native
  def removeAfterListener(eventName: js.Any): scala.Unit = js.native
  def removeAfterListener(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Removes all items currently in the Container optionally destroying them all
  		* @param destroy Boolean If true, destroys each removed Component.
  		* @param everything Boolean If true, completely remove all items including docked / centered and floating items.
  		* @returns Ext.Component this
  		*/
  def removeAll(): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  def removeAll(destroy: scala.Boolean): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  def removeAll(destroy: scala.Boolean, everything: scala.Boolean): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  /** [Method] Removes the Component at the specified index  myContainer removeAt 0 removes the first item
  		* @param index Number The index of the Component to remove.
  		* @returns Ext.Container this
  		*/
  def removeAt(): senchaUnderscoreTouchLib.ExtNs.IContainer = js.native
  def removeAt(index: scala.Double): senchaUnderscoreTouchLib.ExtNs.IContainer = js.native
  /** [Method] Removes a before event handler
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  def removeBeforeListener(): scala.Unit = js.native
  def removeBeforeListener(eventName: js.Any): scala.Unit = js.native
  def removeBeforeListener(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Removes the given CSS class es from this Component s rendered element
  		* @param cls String The class(es) to remove.
  		* @param prefix String Optional prefix to prepend before each class.
  		* @param suffix String Optional suffix to append to each class.
  		*/
  def removeCls(): scala.Unit = js.native
  def removeCls(cls: java.lang.String): scala.Unit = js.native
  def removeCls(cls: java.lang.String, prefix: java.lang.String): scala.Unit = js.native
  def removeCls(cls: java.lang.String, prefix: java.lang.String, suffix: java.lang.String): scala.Unit = js.native
  /** [Method] Removes a docked item from this Container
  		* @param item Object The item to remove.
  		* @param destroy Boolean Calls the Component's destroy method if true.
  		* @returns Ext.Component this
  		*/
  def removeDocked(): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  def removeDocked(item: js.Any): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  def removeDocked(item: js.Any, destroy: scala.Boolean): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  /** [Method] Removes an inner Component at the specified index  myContainer removeInnerAt 0 removes the first item of the in
  		* @param index Number The index of the Component to remove.
  		* @returns Ext.Container this
  		*/
  def removeInnerAt(): senchaUnderscoreTouchLib.ExtNs.IContainer = js.native
  def removeInnerAt(index: scala.Double): senchaUnderscoreTouchLib.ExtNs.IContainer = js.native
  /** [Method] Removes an event handler
  		* @param eventName String/String[]/Object The type of event the handler was associated with.
  		* @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
  		* @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
  		* @param options Object Extra options object. See addListener for details.
  		* @param order String The order of the listener to remove. Possible values are before, current and after.
  		*/
  def removeListener(): scala.Unit = js.native
  def removeListener(eventName: js.Any): scala.Unit = js.native
  def removeListener(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): scala.Unit = js.native
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		*/
  def removeManagedListener(): scala.Unit = js.native
  def removeManagedListener(`object`: js.Any): scala.Unit = js.native
  def removeManagedListener(`object`: js.Any, eventName: js.Any): scala.Unit = js.native
  def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Removes a menu from a specified side
  		* @param side String The side to remove the menu from
  		*/
  def removeMenu(): scala.Unit = js.native
  def removeMenu(side: java.lang.String): scala.Unit = js.native
  /** [Method] Replaces specified classes with the newly specified classes
  		* @param oldCls String The class(es) to remove.
  		* @param newCls String The class(es) to add.
  		* @param prefix String Optional prefix to prepend before each class.
  		* @param suffix String Optional suffix to append to each class.
  		*/
  def replaceCls(): scala.Unit = js.native
  def replaceCls(oldCls: java.lang.String): scala.Unit = js.native
  def replaceCls(oldCls: java.lang.String, newCls: java.lang.String): scala.Unit = js.native
  def replaceCls(oldCls: java.lang.String, newCls: java.lang.String, prefix: java.lang.String): scala.Unit = js.native
  def replaceCls(
    oldCls: java.lang.String,
    newCls: java.lang.String,
    prefix: java.lang.String,
    suffix: java.lang.String
  ): scala.Unit = js.native
  /** [Method] Resets top right bottom and left configurations to null which will un float this component  */
  def resetFloating(): scala.Unit = js.native
  /** [Method] Resumes firing events see suspendEvents
  		* @param discardQueuedEvents Boolean Pass as true to discard any queued events.
  		*/
  def resumeEvents(): scala.Unit = js.native
  def resumeEvents(discardQueuedEvents: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of activeItem
  		* @param activeItem Object/String/Number The new value.
  		*/
  def setActiveItem(): scala.Unit = js.native
  def setActiveItem(activeItem: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of autoDestroy
  		* @param autoDestroy Boolean The new value.
  		*/
  def setAutoDestroy(): scala.Unit = js.native
  def setAutoDestroy(autoDestroy: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of autoMaximize
  		* @param autoMaximize Boolean The new value.
  		*/
  def setAutoMaximize(): scala.Unit = js.native
  def setAutoMaximize(autoMaximize: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of baseCls
  		* @param baseCls String The new value.
  		*/
  def setBaseCls(): scala.Unit = js.native
  def setBaseCls(baseCls: java.lang.String): scala.Unit = js.native
  /** [Method] Sets the value of border
  		* @param border Number/String The new value.
  		*/
  def setBorder(): scala.Unit = js.native
  def setBorder(border: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of bottom
  		* @param bottom Number/String The new value.
  		*/
  def setBottom(): scala.Unit = js.native
  def setBottom(bottom: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of bubbleEvents
  		* @param bubbleEvents String/String[] The new value.
  		*/
  def setBubbleEvents(): scala.Unit = js.native
  def setBubbleEvents(bubbleEvents: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of centered
  		* @param centered Boolean The new value.
  		*/
  def setCentered(): scala.Unit = js.native
  def setCentered(centered: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of cls
  		* @param cls String/String[] The new value.
  		*/
  def setCls(): scala.Unit = js.native
  def setCls(cls: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of contentEl
  		* @param contentEl Ext.Element/HTMLElement/String The new value.
  		*/
  def setContentEl(): scala.Unit = js.native
  def setContentEl(contentEl: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of control
  		* @param control Object The new value.
  		*/
  def setControl(): scala.Unit = js.native
  def setControl(control: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of data
  		* @param data Object The new value.
  		*/
  def setData(): scala.Unit = js.native
  def setData(data: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of defaultType
  		* @param defaultType String The new value.
  		*/
  def setDefaultType(): scala.Unit = js.native
  def setDefaultType(defaultType: java.lang.String): scala.Unit = js.native
  /** [Method] Sets the value of defaults
  		* @param defaults Object The new value.
  		*/
  def setDefaults(): scala.Unit = js.native
  def setDefaults(defaults: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of disabled
  		* @param disabled Boolean The new value.
  		*/
  def setDisabled(): scala.Unit = js.native
  def setDisabled(disabled: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of disabledCls
  		* @param disabledCls String The new value.
  		*/
  def setDisabledCls(): scala.Unit = js.native
  def setDisabledCls(disabledCls: java.lang.String): scala.Unit = js.native
  /** [Method] Sets the value of docked
  		* @param docked String The new value.
  		*/
  def setDocked(): scala.Unit = js.native
  def setDocked(docked: java.lang.String): scala.Unit = js.native
  /** [Method] Sets the value of draggable
  		* @param draggable Object The new value.
  		*/
  def setDraggable(): scala.Unit = js.native
  def setDraggable(draggable: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of enterAnimation
  		* @param enterAnimation String/Mixed The new value.
  		*/
  def setEnterAnimation(): scala.Unit = js.native
  def setEnterAnimation(enterAnimation: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of exitAnimation
  		* @param exitAnimation String/Mixed The new value.
  		*/
  def setExitAnimation(): scala.Unit = js.native
  def setExitAnimation(exitAnimation: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of flex
  		* @param flex Number The new value.
  		*/
  def setFlex(): scala.Unit = js.native
  def setFlex(flex: scala.Double): scala.Unit = js.native
  /** [Method] Used to update the floating state of this component
  		* @param floating Boolean true if you want to float this component.
  		*/
  def setFloating(): scala.Unit = js.native
  def setFloating(floating: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of floatingCls
  		* @param floatingCls String The new value.
  		*/
  def setFloatingCls(): scala.Unit = js.native
  def setFloatingCls(floatingCls: java.lang.String): scala.Unit = js.native
  /** [Method] Sets the value of hidden
  		* @param hidden Boolean The new value.
  		*/
  def setHidden(): scala.Unit = js.native
  def setHidden(hidden: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of hiddenCls
  		* @param hiddenCls String The new value.
  		*/
  def setHiddenCls(): scala.Unit = js.native
  def setHiddenCls(hiddenCls: java.lang.String): scala.Unit = js.native
  /** [Method] Sets the value of hideAnimation
  		* @param hideAnimation String/Mixed The new value.
  		*/
  def setHideAnimation(): scala.Unit = js.native
  def setHideAnimation(hideAnimation: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of hideOnMaskTap
  		* @param hideOnMaskTap Boolean The new value.
  		*/
  def setHideOnMaskTap(): scala.Unit = js.native
  def setHideOnMaskTap(hideOnMaskTap: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of html
  		* @param html String/Ext.Element/HTMLElement The new value.
  		*/
  def setHtml(): scala.Unit = js.native
  def setHtml(html: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of itemId
  		* @param itemId String The new value.
  		*/
  def setItemId(): scala.Unit = js.native
  def setItemId(itemId: java.lang.String): scala.Unit = js.native
  /** [Method] Sets the value of items
  		* @param items Array/Object The new value.
  		*/
  def setItems(): scala.Unit = js.native
  def setItems(items: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of layout
  		* @param layout Object/String The new value.
  		*/
  def setLayout(): scala.Unit = js.native
  def setLayout(layout: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of left
  		* @param left Number/String The new value.
  		*/
  def setLeft(): scala.Unit = js.native
  def setLeft(left: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of listeners
  		* @param listeners Object The new value.
  		*/
  def setListeners(): scala.Unit = js.native
  def setListeners(listeners: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of margin
  		* @param margin Number/String The new value.
  		*/
  def setMargin(): scala.Unit = js.native
  def setMargin(margin: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of masked
  		* @param masked Boolean/Object/Ext.Mask/Ext.LoadMask The new value.
  		*/
  def setMasked(): scala.Unit = js.native
  def setMasked(masked: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of maxHeight
  		* @param maxHeight Number/String The new value.
  		*/
  def setMaxHeight(): scala.Unit = js.native
  def setMaxHeight(maxHeight: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of maxWidth
  		* @param maxWidth Number/String The new value.
  		*/
  def setMaxWidth(): scala.Unit = js.native
  def setMaxWidth(maxWidth: js.Any): scala.Unit = js.native
  /** [Method] Sets a menu for a given side of the Viewport
  		* @param menu Ext.Menu The menu to assign to the viewport
  		* @param config Object The configuration for the menu.
  		*/
  def setMenu(): scala.Unit = js.native
  def setMenu(menu: senchaUnderscoreTouchLib.ExtNs.IMenu): scala.Unit = js.native
  def setMenu(menu: senchaUnderscoreTouchLib.ExtNs.IMenu, config: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of minHeight
  		* @param minHeight Number/String The new value.
  		*/
  def setMinHeight(): scala.Unit = js.native
  def setMinHeight(minHeight: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of minWidth
  		* @param minWidth Number/String The new value.
  		*/
  def setMinWidth(): scala.Unit = js.native
  def setMinWidth(minWidth: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of modal
  		* @param modal Boolean The new value.
  		*/
  def setModal(): scala.Unit = js.native
  def setModal(modal: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of padding
  		* @param padding Number/String The new value.
  		*/
  def setPadding(): scala.Unit = js.native
  def setPadding(padding: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of plugins
  		* @param plugins Object/Array The new value.
  		*/
  def setPlugins(): scala.Unit = js.native
  def setPlugins(plugins: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of preventPanning
  		* @param preventPanning Boolean The new value.
  		*/
  def setPreventPanning(): scala.Unit = js.native
  def setPreventPanning(preventPanning: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of preventZooming
  		* @param preventZooming Boolean The new value.
  		*/
  def setPreventZooming(): scala.Unit = js.native
  def setPreventZooming(preventZooming: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of record
  		* @param record Ext.data.Model The new value.
  		*/
  def setRecord(): scala.Unit = js.native
  def setRecord(record: senchaUnderscoreTouchLib.ExtNs.dataNs.IModel): scala.Unit = js.native
  /** [Method] Sets the value of renderTo
  		* @param renderTo Ext.Element The new value.
  		*/
  def setRenderTo(): scala.Unit = js.native
  def setRenderTo(renderTo: senchaUnderscoreTouchLib.ExtNs.IElement): scala.Unit = js.native
  /** [Method] Sets the value of right
  		* @param right Number/String The new value.
  		*/
  def setRight(): scala.Unit = js.native
  def setRight(right: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of scrollable
  		* @param scrollable Boolean/String/Object The new value.
  		* @returns Ext.scroll.View The scroll view.
  		*/
  def setScrollable(): senchaUnderscoreTouchLib.ExtNs.scrollNs.IView = js.native
  def setScrollable(scrollable: js.Any): senchaUnderscoreTouchLib.ExtNs.scrollNs.IView = js.native
  /** [Method] Sets the value of showAnimation
  		* @param showAnimation String/Mixed The new value.
  		*/
  def setShowAnimation(): scala.Unit = js.native
  def setShowAnimation(showAnimation: js.Any): scala.Unit = js.native
  /** [Method] Sets the size of the Component
  		* @param width Number The new width for the Component.
  		* @param height Number The new height for the Component.
  		*/
  def setSize(): scala.Unit = js.native
  def setSize(width: scala.Double): scala.Unit = js.native
  def setSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  /** [Method] Sets the value of style
  		* @param style String/Object The new value.
  		*/
  def setStyle(): scala.Unit = js.native
  def setStyle(style: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of styleHtmlCls
  		* @param styleHtmlCls String The new value.
  		*/
  def setStyleHtmlCls(): scala.Unit = js.native
  def setStyleHtmlCls(styleHtmlCls: java.lang.String): scala.Unit = js.native
  /** [Method] Sets the value of styleHtmlContent
  		* @param styleHtmlContent Boolean The new value.
  		*/
  def setStyleHtmlContent(): scala.Unit = js.native
  def setStyleHtmlContent(styleHtmlContent: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of top
  		* @param top Number/String The new value.
  		*/
  def setTop(): scala.Unit = js.native
  def setTop(top: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of tpl
  		* @param tpl String/String[]/Ext.Template/Ext.XTemplate[] The new value.
  		*/
  def setTpl(): scala.Unit = js.native
  def setTpl(tpl: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of tplWriteMode
  		* @param tplWriteMode String The new value.
  		*/
  def setTplWriteMode(): scala.Unit = js.native
  def setTplWriteMode(tplWriteMode: java.lang.String): scala.Unit = js.native
  /** [Method] Sets the value of ui
  		* @param ui String The new value.
  		*/
  def setUi(): scala.Unit = js.native
  def setUi(ui: java.lang.String): scala.Unit = js.native
  /** [Method] Sets the value of useBodyElement
  		* @param useBodyElement Boolean The new value.
  		*/
  def setUseBodyElement(): scala.Unit = js.native
  def setUseBodyElement(useBodyElement: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of zIndex
  		* @param zIndex Number The new value.
  		*/
  def setZIndex(): scala.Unit = js.native
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
  /** [Method] Shows this component optionally using an animation
  		* @returns Ext.Component
  		*/
  def show(): senchaUnderscoreTouchLib.ExtNs.IComponent = js.native
  /** [Method] Shows this component by another component
  		* @param component Ext.Component The target component to show this component by.
  		* @param alignment String The specific alignment.
  		*/
  def showBy(): scala.Unit = js.native
  def showBy(component: senchaUnderscoreTouchLib.ExtNs.IComponent): scala.Unit = js.native
  def showBy(component: senchaUnderscoreTouchLib.ExtNs.IComponent, alignment: java.lang.String): scala.Unit = js.native
  /** [Method] Shows a menu specified by the menu s side
  		* @param side String The side which the menu is placed.
  		*/
  def showMenu(): scala.Unit = js.native
  def showMenu(side: java.lang.String): scala.Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): senchaUnderscoreTouchLib.ExtNs.IClass = js.native
  /** [Method] Suspends the firing of all events  */
  def suspendEvents(): scala.Unit = js.native
  /** [Method] Toggles the menu specified by side
  		* @param side String The side which the menu is placed.
  		*/
  def toggleMenu(): scala.Unit = js.native
  def toggleMenu(side: java.lang.String): scala.Unit = js.native
  /** [Method] Alias for removeListener
  		* @param eventName String/String[]/Object The type of event the handler was associated with.
  		* @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
  		* @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
  		* @param options Object Extra options object. See addListener for details.
  		* @param order String The order of the listener to remove. Possible values are before, current and after.
  		*/
  def un(): scala.Unit = js.native
  def un(eventName: js.Any): scala.Unit = js.native
  def un(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def un(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): scala.Unit = js.native
  /** [Method] Alias for removeAfterListener
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  def unAfter(): scala.Unit = js.native
  def unAfter(eventName: js.Any): scala.Unit = js.native
  def unAfter(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Alias for removeBeforeListener
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  def unBefore(): scala.Unit = js.native
  def unBefore(eventName: js.Any): scala.Unit = js.native
  def unBefore(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Convenience method which calls setMasked with a value of false to hide the mask */
  def unmask(): scala.Unit = js.native
  /** [Method] Walks up the ownerCt axis looking for an ancestor Container which matches the passed simple selector
  		* @param selector String The simple selector to test.
  		* @returns Ext.Container The matching ancestor Container (or undefined if no match was found).
  		*/
  def up(): senchaUnderscoreTouchLib.ExtNs.IContainer = js.native
  def up(selector: java.lang.String): senchaUnderscoreTouchLib.ExtNs.IContainer = js.native
  /** [Method] Updates the HTML content of the Component  */
  def update(): scala.Unit = js.native
  /** [Method] Updates the styleHtmlCls configuration
  		* @param newHtmlCls Object
  		* @param oldHtmlCls Object
  		*/
  def updateStyleHtmlCls(): scala.Unit = js.native
  def updateStyleHtmlCls(newHtmlCls: js.Any): scala.Unit = js.native
  def updateStyleHtmlCls(newHtmlCls: js.Any, oldHtmlCls: js.Any): scala.Unit = js.native
}

