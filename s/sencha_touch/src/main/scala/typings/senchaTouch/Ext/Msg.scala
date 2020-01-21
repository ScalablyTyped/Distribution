package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.data.IModel
import typings.senchaTouch.Ext.mixin.IObservable
import typings.senchaTouch.Ext.scroll.IView
import typings.senchaTouch.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Msg")
@js.native
class Msg () extends js.Object

/* static members */
@JSGlobal("Ext.Msg")
@js.native
object Msg extends js.Object {
  /** [Property] (Ext.util.MixedCollection) */
  var items: IMixedCollection = js.native
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  /** [Method] Adds one or more Components to this Container
  		* @param newItems Object/Object[]/Ext.Component/Ext.Component[] The new items to add to the Container.
  		* @returns Ext.Component The last item added to the Container from the newItems array.
  		*/
  def add(): IComponent = js.native
  def add(newItems: js.Any): IComponent = js.native
  /** [Method] Appends an after event handler
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  def addAfterListener(): Unit = js.native
  def addAfterListener(eventName: js.Any): Unit = js.native
  def addAfterListener(eventName: js.Any, fn: js.Any): Unit = js.native
  def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Adds an array of Components to this Container
  		* @param items Array The array of items to add to this container.
  		* @returns Array The array of items after they have been added.
  		*/
  def addAll(): Array = js.native
  def addAll(items: Array): Array = js.native
  /** [Method] Appends a before event handler
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  def addBeforeListener(): Unit = js.native
  def addBeforeListener(eventName: js.Any): Unit = js.native
  def addBeforeListener(eventName: js.Any, fn: js.Any): Unit = js.native
  def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Adds a CSS class or classes to this Component s rendered element
  		* @param cls String The CSS class to add.
  		* @param prefix String Optional prefix to add to each class.
  		* @param suffix String Optional suffix to add to each class.
  		*/
  def addCls(): Unit = js.native
  def addCls(cls: java.lang.String): Unit = js.native
  def addCls(cls: java.lang.String, prefix: java.lang.String): Unit = js.native
  def addCls(cls: java.lang.String, prefix: java.lang.String, suffix: java.lang.String): Unit = js.native
  /** [Method] Adds the specified events to the list of events which this Observable may fire
  		* @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
  		*/
  def addEvents(): Unit = js.native
  def addEvents(eventNames: js.Any): Unit = js.native
  /** [Method] Appends an event handler to this object
  		* @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
  		* @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		* @param options Object An object containing handler configuration.  This object may contain any of the following properties:
  		* @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
  		*/
  def addListener(): Unit = js.native
  def addListener(eventName: js.Any): Unit = js.native
  def addListener(eventName: js.Any, fn: js.Any): Unit = js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		* @param options Object If the eventName parameter was an event name, this is the addListener options.
  		*/
  def addManagedListener(): Unit = js.native
  def addManagedListener(`object`: js.Any): Unit = js.native
  def addManagedListener(`object`: js.Any, eventName: js.Any): Unit = js.native
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Displays a standard read only message box with an OK button comparable to the basic JavaScript alert prompt
  		* @param title String The title bar text.
  		* @param message String The message box body text.
  		* @param fn Function A callback function which is called when the dialog is dismissed by clicking on the configured buttons.
  		* @param scope Object The scope (this reference) in which the callback is executed. Defaults to: the browser window
  		* @returns Ext.MessageBox this
  		*/
  def alert(): IMessageBox = js.native
  def alert(title: java.lang.String): IMessageBox = js.native
  def alert(title: java.lang.String, message: java.lang.String): IMessageBox = js.native
  def alert(title: java.lang.String, message: java.lang.String, fn: js.Any): IMessageBox = js.native
  def alert(title: java.lang.String, message: java.lang.String, fn: js.Any, scope: js.Any): IMessageBox = js.native
  /** [Method] Animates to the supplied activeItem with a specified animation
  		* @param activeItem Object/Number The item or item index to make active.
  		* @param animation Object/Ext.fx.layout.Card Card animation configuration or instance.
  		*/
  def animateActiveItem(): Unit = js.native
  def animateActiveItem(activeItem: js.Any): Unit = js.native
  def animateActiveItem(activeItem: js.Any, animation: js.Any): Unit = js.native
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
  def child(): IComponent = js.native
  def child(selector: java.lang.String): IComponent = js.native
  /** [Method] Removes all listeners for this object  */
  def clearListeners(): Unit = js.native
  /** [Method] Displays a confirmation message box with Yes and No buttons comparable to JavaScript s confirm
  		* @param title String The title bar text.
  		* @param message String The message box body text.
  		* @param fn Function A callback function which is called when the dialog is dismissed by clicking on the configured buttons.
  		* @param scope Object The scope (this reference) in which the callback is executed. Defaults to: the browser window
  		* @returns Ext.MessageBox this
  		*/
  def confirm(): IMessageBox = js.native
  def confirm(title: java.lang.String): IMessageBox = js.native
  def confirm(title: java.lang.String, message: java.lang.String): IMessageBox = js.native
  def confirm(title: java.lang.String, message: java.lang.String, fn: js.Any): IMessageBox = js.native
  def confirm(title: java.lang.String, message: java.lang.String, fn: js.Any, scope: js.Any): IMessageBox = js.native
  /** [Method]  */
  def destroy(): Unit = js.native
  /** [Method] Disables this Component */
  def disable(): Unit = js.native
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
  		* @param selector String An Ext.ComponentQuery selector.
  		* @returns Ext.Component
  		*/
  def down(): IComponent = js.native
  def down(selector: java.lang.String): IComponent = js.native
  /** [Method] Enables this Component */
  def enable(): Unit = js.native
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
  		* @param events String/String[] The event name to bubble, or an Array of event names.
  		*/
  def enableBubble(): Unit = js.native
  def enableBubble(events: js.Any): Unit = js.native
  /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
  		* @param eventName String The name of the event to fire.
  		* @param args Array Arguments to pass to handers.
  		* @param fn Function Action.
  		* @param scope Object Scope of fn.
  		* @returns Object
  		*/
  def fireAction(): js.Any = js.native
  def fireAction(eventName: java.lang.String): js.Any = js.native
  def fireAction(eventName: java.lang.String, args: Array): js.Any = js.native
  def fireAction(eventName: java.lang.String, args: Array, fn: js.Any): js.Any = js.native
  def fireAction(eventName: java.lang.String, args: Array, fn: js.Any, scope: js.Any): js.Any = js.native
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
  		* @param eventName String The name of the event to fire.
  		* @param args Object... Variable number of parameters are passed to handlers.
  		* @returns Boolean Returns false if any of the handlers return false.
  		*/
  def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = js.native
  /** [Method] Returns the value of activeItem
  		* @returns Object/String/Number
  		*/
  def getActiveItem(): js.Any = js.native
  /** [Method] Prepares information on aligning this to component using alignment
  		* @param component Object
  		* @param alignment Object
  		*/
  def getAlignmentInfo(): Unit = js.native
  def getAlignmentInfo(component: js.Any): Unit = js.native
  def getAlignmentInfo(component: js.Any, alignment: js.Any): Unit = js.native
  /** [Method] Returns the Component for a given index in the Container s items
  		* @param index Number The index of the Component to return.
  		* @returns Ext.Component The item at the specified index, if found.
  		*/
  def getAt(): IComponent = js.native
  def getAt(index: Double): IComponent = js.native
  /** [Method] Returns the value of autoDestroy
  		* @returns Boolean
  		*/
  def getAutoDestroy(): Boolean = js.native
  /** [Method] Returns the value of baseCls
  		* @returns String
  		*/
  def getBaseCls(): java.lang.String = js.native
  /** [Method] Returns the value of bodyBorder
  		* @returns Number/Boolean/String
  		*/
  def getBodyBorder(): js.Any = js.native
  /** [Method] Returns the value of bodyMargin
  		* @returns Number/Boolean/String
  		*/
  def getBodyMargin(): js.Any = js.native
  /** [Method] Returns the value of bodyPadding
  		* @returns Number/Boolean/String
  		*/
  def getBodyPadding(): js.Any = js.native
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
  /** [Method] Returns the value of buttons
  		* @returns Array/Object
  		*/
  def getButtons(): js.Any = js.native
  /** [Method] Returns the value of centered
  		* @returns Boolean
  		*/
  def getCentered(): Boolean = js.native
  /** [Method] Returns the value of cls
  		* @returns String/String[]
  		*/
  def getCls(): js.Any = js.native
  /** [Method] Examines this container s items property and gets a direct child component of this container
  		* @param component String/Number This parameter may be any of the following:  {String} : representing the itemId or id of the child component. {Number} : representing the position of the child component within the items property. For additional information see Ext.util.MixedCollection.get.
  		* @returns Ext.Component The component (if found).
  		*/
  def getComponent(): IComponent = js.native
  def getComponent(component: js.Any): IComponent = js.native
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
  /** [Method] Returns the value of defaultTextHeight
  		* @returns Number
  		*/
  def getDefaultTextHeight(): Double = js.native
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
  def getDisabled(): Boolean = js.native
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
  def getDockedItems(): Array = js.native
  /** [Method] Retrieves the top level element representing this component
  		* @returns Ext.dom.Element
  		*/
  def getEl(): typings.senchaTouch.Ext.dom.IElement = js.native
  /** [Method] Returns the value of enter
  		* @returns String
  		*/
  def getEnter(): java.lang.String = js.native
  /** [Method] Returns the value of enterAnimation
  		* @returns String/Mixed
  		*/
  def getEnterAnimation(): js.Any = js.native
  /** [Method] Returns the value of exit
  		* @returns String
  		*/
  def getExit(): java.lang.String = js.native
  /** [Method] Returns the value of exitAnimation
  		* @returns String/Mixed
  		*/
  def getExitAnimation(): js.Any = js.native
  /** [Method] Returns the value of flex
  		* @returns Number
  		*/
  def getFlex(): Double = js.native
  /** [Method] Returns the value of floatingCls
  		* @returns String
  		*/
  def getFloatingCls(): java.lang.String = js.native
  /** [Method] Returns the value of height
  		* @returns Number/String
  		*/
  def getHeight(): js.Any = js.native
  /** [Method] Returns the value of hidden
  		* @returns Boolean
  		*/
  def getHidden(): Boolean = js.native
  /** [Method] Returns the value of hiddenCls
  		* @returns String
  		*/
  def getHiddenCls(): java.lang.String = js.native
  /** [Method] Returns the value of hideAnimation
  		* @returns Object
  		*/
  def getHideAnimation(): js.Any = js.native
  /** [Method] Returns the value of hideOnMaskTap
  		* @returns Boolean
  		*/
  def getHideOnMaskTap(): Boolean = js.native
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
  def getInnerItems(): Array = js.native
  /** [Method] Returns the value of itemId
  		* @returns String
  		*/
  def getItemId(): java.lang.String = js.native
  /** [Method] Returns the value of items
  		* @returns Array/Object
  		*/
  def getItems(): js.Any = js.native
  /** [Method] Returns the value of layout
  		* @returns Object
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
  /** [Method] Returns the value of padding
  		* @returns Number/String
  		*/
  def getPadding(): js.Any = js.native
  /** [Method] Returns the parent of this component if it has one
  		* @returns Ext.Component The parent of this component.
  		*/
  def getParent(): IComponent = js.native
  /** [Method] Returns the value of plugins
  		* @returns Object/Array
  		*/
  def getPlugins(): js.Any = js.native
  /** [Method] Returns the value of prompt
  		* @returns Object
  		*/
  def getPrompt(): js.Any = js.native
  /** [Method] Returns the value of record
  		* @returns Ext.data.Model
  		*/
  def getRecord(): IModel = js.native
  /** [Method] Returns the value of renderTo
  		* @returns Ext.Element
  		*/
  def getRenderTo(): IElement = js.native
  /** [Method] Returns the value of right
  		* @returns Number/String
  		*/
  def getRight(): js.Any = js.native
  /** [Method] Returns an the scrollable instance for this container which is a Ext scroll View class
  		* @returns Ext.scroll.View The scroll view.
  		*/
  def getScrollable(): IView = js.native
  /** [Method] Returns the value of showAnimation
  		* @returns Object
  		*/
  def getShowAnimation(): js.Any = js.native
  /** [Method] Returns the height and width of the Component
  		* @returns Object The current height and width of the Component.
  		*/
  def getSize(): js.Any = js.native
  /** [Method] Returns the value of stretchX
  		* @returns Boolean
  		*/
  def getStretchX(): Boolean = js.native
  /** [Method] Returns the value of stretchY
  		* @returns Boolean
  		*/
  def getStretchY(): Boolean = js.native
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
  def getStyleHtmlContent(): Boolean = js.native
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  def getTitle(): java.lang.String = js.native
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
  /** [Method] Returns the value of width
  		* @returns Number/String
  		*/
  def getWidth(): js.Any = js.native
  /** [Method] Returns this Component s xtype hierarchy as a slash delimited string
  		* @returns String The xtype hierarchy string.
  		*/
  def getXTypes(): java.lang.String = js.native
  /** [Method] Returns the value of zIndex
  		* @returns Number
  		*/
  def getZIndex(): Double = js.native
  /** [Method] Checks to see if this object has any listeners for a specified event
  		* @param eventName String The name of the event to check for
  		* @returns Boolean True if the event is being listened for, else false
  		*/
  def hasListener(): Boolean = js.native
  def hasListener(eventName: java.lang.String): Boolean = js.native
  /** [Method] Returns true if this component has a parent
  		* @returns Boolean true if this component has a parent.
  		*/
  def hasParent(): Boolean = js.native
  /** [Method] Hides this Component optionally using an animation
  		* @returns Ext.Component
  		*/
  def hide(): IComponent = js.native
  /** [Method] Initialize configuration for this class
  		* @param instanceConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  /** [Method] Allows addition of behavior to the rendering phase  */
  def initialize(): Unit = js.native
  /** [Method] Adds a child Component at the given index
  		* @param index Number The index to insert the Component at.
  		* @param item Object The Component to insert.
  		*/
  def insert(): Unit = js.native
  def insert(index: Double): Unit = js.native
  def insert(index: Double, item: js.Any): Unit = js.native
  /** [Method] Returns true if this Component is currently disabled
  		* @returns Boolean true if currently disabled.
  		*/
  def isDisabled(): Boolean = js.native
  /** [Method] Returns true if this Component is currently hidden
  		* @returns Boolean true if currently hidden.
  		*/
  def isHidden(): Boolean = js.native
  /** [Method] Tests whether or not this Component is of a specific xtype
  		* @param xtype String The xtype to check for this Component.
  		* @param shallow Boolean false to check whether this Component is descended from the xtype (this is the default), or true to check whether this Component is directly of the specified xtype.
  		* @returns Boolean true if this component descends from the specified xtype, false otherwise.
  		*/
  def isXType(): Boolean = js.native
  def isXType(xtype: java.lang.String): Boolean = js.native
  def isXType(xtype: java.lang.String, shallow: Boolean): Boolean = js.native
  /** [Method] Convenience method which calls setMasked with a value of true to show the mask
  		* @param mask Object
  		*/
  def mask(): Unit = js.native
  def mask(mask: js.Any): Unit = js.native
  /** [Method] Alias for addManagedListener
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		* @param options Object If the eventName parameter was an event name, this is the addListener options.
  		*/
  def mon(): Unit = js.native
  def mon(`object`: js.Any): Unit = js.native
  def mon(`object`: js.Any, eventName: js.Any): Unit = js.native
  def mon(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
  def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Alias for removeManagedListener
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		*/
  def mun(): Unit = js.native
  def mun(`object`: js.Any): Unit = js.native
  def mun(`object`: js.Any, eventName: js.Any): Unit = js.native
  def mun(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
  def mun(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  /** [Method] Alias for addListener
  		* @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
  		* @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		* @param options Object An object containing handler configuration.  This object may contain any of the following properties:
  		* @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
  		*/
  def on(): Unit = js.native
  def on(eventName: js.Any): Unit = js.native
  def on(eventName: js.Any, fn: js.Any): Unit = js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
  /** [Method] Alias for addAfterListener
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  def onAfter(): Unit = js.native
  def onAfter(eventName: js.Any): Unit = js.native
  def onAfter(eventName: js.Any, fn: js.Any): Unit = js.native
  def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Alias for addBeforeListener
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  def onBefore(): Unit = js.native
  def onBefore(eventName: js.Any): Unit = js.native
  def onBefore(eventName: js.Any, fn: js.Any): Unit = js.native
  def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Displays a message box with OK and Cancel buttons prompting the user to enter some text comparable to JavaScript s p
  		* @param title String The title bar text.
  		* @param message String The message box body text.
  		* @param fn Function A callback function which is called when the dialog is dismissed by clicking on the configured buttons.
  		* @param scope Object The scope (this reference) in which the callback is executed. Defaults to: the browser window.
  		* @param multiLine Boolean/Number true to create a multiline textbox using the defaultTextHeight property, or the height in pixels to create the textbox.
  		* @param value String Default value of the text input element.
  		* @param prompt Object The configuration for the prompt. See the prompt documentation in Ext.MessageBox for more information.
  		* @returns Ext.MessageBox this
  		*/
  def prompt(
    title: js.UndefOr[java.lang.String],
    message: js.UndefOr[java.lang.String],
    fn: js.UndefOr[js.Any],
    scope: js.UndefOr[js.Any],
    multiLine: js.UndefOr[js.Any],
    value: js.UndefOr[java.lang.String],
    prompt: js.UndefOr[js.Any]
  ): IMessageBox = js.native
  /** [Method] Retrieves all descendant components which match the passed selector
  		* @param selector String Selector complying to an Ext.ComponentQuery selector.
  		* @returns Array Ext.Component's which matched the selector.
  		*/
  def query(): Array = js.native
  def query(selector: java.lang.String): Array = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  def relayEvents(): IObservable = js.native
  def relayEvents(`object`: js.Any): IObservable = js.native
  def relayEvents(`object`: js.Any, events: js.Any): IObservable = js.native
  /** [Method] Removes an item from this Container optionally destroying it
  		* @param item Object The item to remove.
  		* @param destroy Boolean Calls the Component's destroy method if true.
  		* @returns Ext.Component this
  		*/
  def remove(): IComponent = js.native
  def remove(item: js.Any): IComponent = js.native
  def remove(item: js.Any, destroy: Boolean): IComponent = js.native
  /** [Method] Removes a before event handler
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  def removeAfterListener(): Unit = js.native
  def removeAfterListener(eventName: js.Any): Unit = js.native
  def removeAfterListener(eventName: js.Any, fn: js.Any): Unit = js.native
  def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Removes all items currently in the Container optionally destroying them all
  		* @param destroy Boolean If true, destroys each removed Component.
  		* @param everything Boolean If true, completely remove all items including docked / centered and floating items.
  		* @returns Ext.Component this
  		*/
  def removeAll(): IComponent = js.native
  def removeAll(destroy: Boolean): IComponent = js.native
  def removeAll(destroy: Boolean, everything: Boolean): IComponent = js.native
  /** [Method] Removes the Component at the specified index  myContainer removeAt 0 removes the first item
  		* @param index Number The index of the Component to remove.
  		* @returns Ext.Container this
  		*/
  def removeAt(): IContainer = js.native
  def removeAt(index: Double): IContainer = js.native
  /** [Method] Removes a before event handler
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  def removeBeforeListener(): Unit = js.native
  def removeBeforeListener(eventName: js.Any): Unit = js.native
  def removeBeforeListener(eventName: js.Any, fn: js.Any): Unit = js.native
  def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Removes the given CSS class es from this Component s rendered element
  		* @param cls String The class(es) to remove.
  		* @param prefix String Optional prefix to prepend before each class.
  		* @param suffix String Optional suffix to append to each class.
  		*/
  def removeCls(): Unit = js.native
  def removeCls(cls: java.lang.String): Unit = js.native
  def removeCls(cls: java.lang.String, prefix: java.lang.String): Unit = js.native
  def removeCls(cls: java.lang.String, prefix: java.lang.String, suffix: java.lang.String): Unit = js.native
  /** [Method] Removes a docked item from this Container
  		* @param item Object The item to remove.
  		* @param destroy Boolean Calls the Component's destroy method if true.
  		* @returns Ext.Component this
  		*/
  def removeDocked(): IComponent = js.native
  def removeDocked(item: js.Any): IComponent = js.native
  def removeDocked(item: js.Any, destroy: Boolean): IComponent = js.native
  /** [Method] Removes an inner Component at the specified index  myContainer removeInnerAt 0 removes the first item of the in
  		* @param index Number The index of the Component to remove.
  		* @returns Ext.Container this
  		*/
  def removeInnerAt(): IContainer = js.native
  def removeInnerAt(index: Double): IContainer = js.native
  /** [Method] Removes an event handler
  		* @param eventName String/String[]/Object The type of event the handler was associated with.
  		* @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
  		* @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
  		* @param options Object Extra options object. See addListener for details.
  		* @param order String The order of the listener to remove. Possible values are before, current and after.
  		*/
  def removeListener(): Unit = js.native
  def removeListener(eventName: js.Any): Unit = js.native
  def removeListener(eventName: js.Any, fn: js.Any): Unit = js.native
  def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		*/
  def removeManagedListener(): Unit = js.native
  def removeManagedListener(`object`: js.Any): Unit = js.native
  def removeManagedListener(`object`: js.Any, eventName: js.Any): Unit = js.native
  def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
  def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  /** [Method] Replaces specified classes with the newly specified classes
  		* @param oldCls String The class(es) to remove.
  		* @param newCls String The class(es) to add.
  		* @param prefix String Optional prefix to prepend before each class.
  		* @param suffix String Optional suffix to append to each class.
  		*/
  def replaceCls(): Unit = js.native
  def replaceCls(oldCls: java.lang.String): Unit = js.native
  def replaceCls(oldCls: java.lang.String, newCls: java.lang.String): Unit = js.native
  def replaceCls(oldCls: java.lang.String, newCls: java.lang.String, prefix: java.lang.String): Unit = js.native
  def replaceCls(
    oldCls: java.lang.String,
    newCls: java.lang.String,
    prefix: java.lang.String,
    suffix: java.lang.String
  ): Unit = js.native
  /** [Method] Resets top right bottom and left configurations to null which will un float this component  */
  def resetFloating(): Unit = js.native
  /** [Method] Resumes firing events see suspendEvents
  		* @param discardQueuedEvents Boolean Pass as true to discard any queued events.
  		*/
  def resumeEvents(): Unit = js.native
  def resumeEvents(discardQueuedEvents: Boolean): Unit = js.native
  /** [Method] Sets the value of activeItem
  		* @param activeItem Object/String/Number The new value.
  		*/
  def setActiveItem(): Unit = js.native
  def setActiveItem(activeItem: js.Any): Unit = js.native
  /** [Method] Sets the value of autoDestroy
  		* @param autoDestroy Boolean The new value.
  		*/
  def setAutoDestroy(): Unit = js.native
  def setAutoDestroy(autoDestroy: Boolean): Unit = js.native
  /** [Method] Sets the value of baseCls
  		* @param baseCls String The new value.
  		*/
  def setBaseCls(): Unit = js.native
  def setBaseCls(baseCls: java.lang.String): Unit = js.native
  /** [Method] Sets the value of bodyBorder
  		* @param bodyBorder Number/Boolean/String The new value.
  		*/
  def setBodyBorder(): Unit = js.native
  def setBodyBorder(bodyBorder: js.Any): Unit = js.native
  /** [Method] Sets the value of bodyMargin
  		* @param bodyMargin Number/Boolean/String The new value.
  		*/
  def setBodyMargin(): Unit = js.native
  def setBodyMargin(bodyMargin: js.Any): Unit = js.native
  /** [Method] Sets the value of bodyPadding
  		* @param bodyPadding Number/Boolean/String The new value.
  		*/
  def setBodyPadding(): Unit = js.native
  def setBodyPadding(bodyPadding: js.Any): Unit = js.native
  /** [Method] Sets the value of border
  		* @param border Number/String The new value.
  		*/
  def setBorder(): Unit = js.native
  def setBorder(border: js.Any): Unit = js.native
  /** [Method] Sets the value of bottom
  		* @param bottom Number/String The new value.
  		*/
  def setBottom(): Unit = js.native
  def setBottom(bottom: js.Any): Unit = js.native
  /** [Method] Sets the value of bubbleEvents
  		* @param bubbleEvents String/String[] The new value.
  		*/
  def setBubbleEvents(): Unit = js.native
  def setBubbleEvents(bubbleEvents: js.Any): Unit = js.native
  /** [Method] Sets the value of buttons
  		* @param buttons Array/Object The new value.
  		*/
  def setButtons(): Unit = js.native
  def setButtons(buttons: js.Any): Unit = js.native
  /** [Method] Sets the value of centered
  		* @param centered Boolean The new value.
  		*/
  def setCentered(): Unit = js.native
  def setCentered(centered: Boolean): Unit = js.native
  /** [Method] Sets the value of cls
  		* @param cls String/String[] The new value.
  		*/
  def setCls(): Unit = js.native
  def setCls(cls: js.Any): Unit = js.native
  /** [Method] Sets the value of contentEl
  		* @param contentEl Ext.Element/HTMLElement/String The new value.
  		*/
  def setContentEl(): Unit = js.native
  def setContentEl(contentEl: js.Any): Unit = js.native
  /** [Method] Sets the value of control
  		* @param control Object The new value.
  		*/
  def setControl(): Unit = js.native
  def setControl(control: js.Any): Unit = js.native
  /** [Method] Sets the value of data
  		* @param data Object The new value.
  		*/
  def setData(): Unit = js.native
  def setData(data: js.Any): Unit = js.native
  /** [Method] Sets the value of defaultTextHeight
  		* @param defaultTextHeight Number The new value.
  		*/
  def setDefaultTextHeight(): Unit = js.native
  def setDefaultTextHeight(defaultTextHeight: Double): Unit = js.native
  /** [Method] Sets the value of defaultType
  		* @param defaultType String The new value.
  		*/
  def setDefaultType(): Unit = js.native
  def setDefaultType(defaultType: java.lang.String): Unit = js.native
  /** [Method] Sets the value of defaults
  		* @param defaults Object The new value.
  		*/
  def setDefaults(): Unit = js.native
  def setDefaults(defaults: js.Any): Unit = js.native
  /** [Method] Sets the value of disabled
  		* @param disabled Boolean The new value.
  		*/
  def setDisabled(): Unit = js.native
  def setDisabled(disabled: Boolean): Unit = js.native
  /** [Method] Sets the value of disabledCls
  		* @param disabledCls String The new value.
  		*/
  def setDisabledCls(): Unit = js.native
  def setDisabledCls(disabledCls: java.lang.String): Unit = js.native
  /** [Method] Sets the value of docked
  		* @param docked String The new value.
  		*/
  def setDocked(): Unit = js.native
  def setDocked(docked: java.lang.String): Unit = js.native
  /** [Method] Sets the value of draggable
  		* @param draggable Object The new value.
  		*/
  def setDraggable(): Unit = js.native
  def setDraggable(draggable: js.Any): Unit = js.native
  /** [Method] Sets the value of enter
  		* @param enter String The new value.
  		*/
  def setEnter(): Unit = js.native
  def setEnter(enter: java.lang.String): Unit = js.native
  /** [Method] Sets the value of enterAnimation
  		* @param enterAnimation String/Mixed The new value.
  		*/
  def setEnterAnimation(): Unit = js.native
  def setEnterAnimation(enterAnimation: js.Any): Unit = js.native
  /** [Method] Sets the value of exit
  		* @param exit String The new value.
  		*/
  def setExit(): Unit = js.native
  def setExit(exit: java.lang.String): Unit = js.native
  /** [Method] Sets the value of exitAnimation
  		* @param exitAnimation String/Mixed The new value.
  		*/
  def setExitAnimation(): Unit = js.native
  def setExitAnimation(exitAnimation: js.Any): Unit = js.native
  /** [Method] Sets the value of flex
  		* @param flex Number The new value.
  		*/
  def setFlex(): Unit = js.native
  def setFlex(flex: Double): Unit = js.native
  /** [Method] Used to update the floating state of this component
  		* @param floating Boolean true if you want to float this component.
  		*/
  def setFloating(): Unit = js.native
  def setFloating(floating: Boolean): Unit = js.native
  /** [Method] Sets the value of floatingCls
  		* @param floatingCls String The new value.
  		*/
  def setFloatingCls(): Unit = js.native
  def setFloatingCls(floatingCls: java.lang.String): Unit = js.native
  /** [Method] Sets the value of height
  		* @param height Number/String The new value.
  		*/
  def setHeight(): Unit = js.native
  def setHeight(height: js.Any): Unit = js.native
  /** [Method] Sets the value of hidden
  		* @param hidden Boolean The new value.
  		*/
  def setHidden(): Unit = js.native
  def setHidden(hidden: Boolean): Unit = js.native
  /** [Method] Sets the value of hiddenCls
  		* @param hiddenCls String The new value.
  		*/
  def setHiddenCls(): Unit = js.native
  def setHiddenCls(hiddenCls: java.lang.String): Unit = js.native
  /** [Method] Sets the value of hideAnimation
  		* @param hideAnimation Object The new value.
  		*/
  def setHideAnimation(): Unit = js.native
  def setHideAnimation(hideAnimation: js.Any): Unit = js.native
  /** [Method] Sets the value of hideOnMaskTap
  		* @param hideOnMaskTap Boolean The new value.
  		*/
  def setHideOnMaskTap(): Unit = js.native
  def setHideOnMaskTap(hideOnMaskTap: Boolean): Unit = js.native
  /** [Method] Sets the value of html
  		* @param html String/Ext.Element/HTMLElement The new value.
  		*/
  def setHtml(): Unit = js.native
  def setHtml(html: js.Any): Unit = js.native
  /** [Method] Sets icon
  		* @param iconCls String A CSS class name or empty string to clear the icon.
  		* @returns Ext.MessageBox this
  		*/
  def setIcon(): IMessageBox = js.native
  def setIcon(iconCls: java.lang.String): IMessageBox = js.native
  /** [Method] Sets the value of iconCls
  		* @param iconCls String The new value.
  		*/
  def setIconCls(): Unit = js.native
  def setIconCls(iconCls: java.lang.String): Unit = js.native
  /** [Method] Sets the value of itemId
  		* @param itemId String The new value.
  		*/
  def setItemId(): Unit = js.native
  def setItemId(itemId: java.lang.String): Unit = js.native
  /** [Method] Sets the value of items
  		* @param items Array/Object The new value.
  		*/
  def setItems(): Unit = js.native
  def setItems(items: js.Any): Unit = js.native
  /** [Method] Sets the value of layout
  		* @param layout Object The new value.
  		*/
  def setLayout(): Unit = js.native
  def setLayout(layout: js.Any): Unit = js.native
  /** [Method] Sets the value of left
  		* @param left Number/String The new value.
  		*/
  def setLeft(): Unit = js.native
  def setLeft(left: js.Any): Unit = js.native
  /** [Method] Sets the value of listeners
  		* @param listeners Object The new value.
  		*/
  def setListeners(): Unit = js.native
  def setListeners(listeners: js.Any): Unit = js.native
  /** [Method] Sets the value of margin
  		* @param margin Number/String The new value.
  		*/
  def setMargin(): Unit = js.native
  def setMargin(margin: js.Any): Unit = js.native
  /** [Method] Sets the value of masked
  		* @param masked Boolean/Object/Ext.Mask/Ext.LoadMask The new value.
  		*/
  def setMasked(): Unit = js.native
  def setMasked(masked: js.Any): Unit = js.native
  /** [Method] Sets the value of maxHeight
  		* @param maxHeight Number/String The new value.
  		*/
  def setMaxHeight(): Unit = js.native
  def setMaxHeight(maxHeight: js.Any): Unit = js.native
  /** [Method] Sets the value of maxWidth
  		* @param maxWidth Number/String The new value.
  		*/
  def setMaxWidth(): Unit = js.native
  def setMaxWidth(maxWidth: js.Any): Unit = js.native
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		*/
  def setMessage(): Unit = js.native
  def setMessage(message: java.lang.String): Unit = js.native
  /** [Method] Sets the value of minHeight
  		* @param minHeight Number/String The new value.
  		*/
  def setMinHeight(): Unit = js.native
  def setMinHeight(minHeight: js.Any): Unit = js.native
  /** [Method] Sets the value of minWidth
  		* @param minWidth Number/String The new value.
  		*/
  def setMinWidth(): Unit = js.native
  def setMinWidth(minWidth: js.Any): Unit = js.native
  /** [Method] Sets the value of padding
  		* @param padding Number/String The new value.
  		*/
  def setPadding(): Unit = js.native
  def setPadding(padding: js.Any): Unit = js.native
  /** [Method] Sets the value of plugins
  		* @param plugins Object/Array The new value.
  		*/
  def setPlugins(): Unit = js.native
  def setPlugins(plugins: js.Any): Unit = js.native
  /** [Method] Sets the value of prompt
  		* @param prompt Object The new value.
  		*/
  def setPrompt(): Unit = js.native
  def setPrompt(prompt: js.Any): Unit = js.native
  /** [Method] Sets the value of record
  		* @param record Ext.data.Model The new value.
  		*/
  def setRecord(): Unit = js.native
  def setRecord(record: IModel): Unit = js.native
  /** [Method] Sets the value of renderTo
  		* @param renderTo Ext.Element The new value.
  		*/
  def setRenderTo(): Unit = js.native
  def setRenderTo(renderTo: IElement): Unit = js.native
  /** [Method] Sets the value of right
  		* @param right Number/String The new value.
  		*/
  def setRight(): Unit = js.native
  def setRight(right: js.Any): Unit = js.native
  /** [Method] Sets the value of scrollable
  		* @param scrollable Boolean/String/Object The new value.
  		* @returns Ext.scroll.View The scroll view.
  		*/
  def setScrollable(): IView = js.native
  def setScrollable(scrollable: js.Any): IView = js.native
  /** [Method] Sets the value of showAnimation
  		* @param showAnimation Object The new value.
  		*/
  def setShowAnimation(): Unit = js.native
  def setShowAnimation(showAnimation: js.Any): Unit = js.native
  /** [Method] Sets the size of the Component
  		* @param width Number The new width for the Component.
  		* @param height Number The new height for the Component.
  		*/
  def setSize(): Unit = js.native
  def setSize(width: Double): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
  /** [Method] Sets the value of stretchX
  		* @param stretchX Boolean The new value.
  		*/
  def setStretchX(): Unit = js.native
  def setStretchX(stretchX: Boolean): Unit = js.native
  /** [Method] Sets the value of stretchY
  		* @param stretchY Boolean The new value.
  		*/
  def setStretchY(): Unit = js.native
  def setStretchY(stretchY: Boolean): Unit = js.native
  /** [Method] Sets the value of style
  		* @param style String/Object The new value.
  		*/
  def setStyle(): Unit = js.native
  def setStyle(style: js.Any): Unit = js.native
  /** [Method] Sets the value of styleHtmlCls
  		* @param styleHtmlCls String The new value.
  		*/
  def setStyleHtmlCls(): Unit = js.native
  def setStyleHtmlCls(styleHtmlCls: java.lang.String): Unit = js.native
  /** [Method] Sets the value of styleHtmlContent
  		* @param styleHtmlContent Boolean The new value.
  		*/
  def setStyleHtmlContent(): Unit = js.native
  def setStyleHtmlContent(styleHtmlContent: Boolean): Unit = js.native
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  def setTitle(): Unit = js.native
  def setTitle(title: java.lang.String): Unit = js.native
  /** [Method] Sets the value of top
  		* @param top Number/String The new value.
  		*/
  def setTop(): Unit = js.native
  def setTop(top: js.Any): Unit = js.native
  /** [Method] Sets the value of tpl
  		* @param tpl String/String[]/Ext.Template/Ext.XTemplate[] The new value.
  		*/
  def setTpl(): Unit = js.native
  def setTpl(tpl: js.Any): Unit = js.native
  /** [Method] Sets the value of tplWriteMode
  		* @param tplWriteMode String The new value.
  		*/
  def setTplWriteMode(): Unit = js.native
  def setTplWriteMode(tplWriteMode: java.lang.String): Unit = js.native
  /** [Method] Sets the value of ui
  		* @param ui String The new value.
  		*/
  def setUi(): Unit = js.native
  def setUi(ui: java.lang.String): Unit = js.native
  /** [Method] Sets the value of width
  		* @param width Number/String The new value.
  		*/
  def setWidth(): Unit = js.native
  def setWidth(width: js.Any): Unit = js.native
  /** [Method] Sets the value of zIndex
  		* @param zIndex Number The new value.
  		*/
  def setZIndex(): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
  /** [Method] Displays the Ext MessageBox with a specified configuration
  		* @param config Object An object with the following config options:
  		* @returns Ext.MessageBox this
  		*/
  def show(): IMessageBox = js.native
  def show(config: js.Any): IMessageBox = js.native
  /** [Method] Shows this component by another component
  		* @param component Ext.Component The target component to show this component by.
  		* @param alignment String The specific alignment.
  		*/
  def showBy(): Unit = js.native
  def showBy(component: IComponent): Unit = js.native
  def showBy(component: IComponent, alignment: java.lang.String): Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
  /** [Method] Suspends the firing of all events  */
  def suspendEvents(): Unit = js.native
  /** [Method] Alias for removeListener
  		* @param eventName String/String[]/Object The type of event the handler was associated with.
  		* @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
  		* @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
  		* @param options Object Extra options object. See addListener for details.
  		* @param order String The order of the listener to remove. Possible values are before, current and after.
  		*/
  def un(): Unit = js.native
  def un(eventName: js.Any): Unit = js.native
  def un(eventName: js.Any, fn: js.Any): Unit = js.native
  def un(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
  /** [Method] Alias for removeAfterListener
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  def unAfter(): Unit = js.native
  def unAfter(eventName: js.Any): Unit = js.native
  def unAfter(eventName: js.Any, fn: js.Any): Unit = js.native
  def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Alias for removeBeforeListener
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  def unBefore(): Unit = js.native
  def unBefore(eventName: js.Any): Unit = js.native
  def unBefore(eventName: js.Any, fn: js.Any): Unit = js.native
  def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Convenience method which calls setMasked with a value of false to hide the mask */
  def unmask(): Unit = js.native
  /** [Method] Walks up the ownerCt axis looking for an ancestor Container which matches the passed simple selector
  		* @param selector String The simple selector to test.
  		* @returns Ext.Container The matching ancestor Container (or undefined if no match was found).
  		*/
  def up(): IContainer = js.native
  def up(selector: java.lang.String): IContainer = js.native
  /** [Method] Updates the HTML content of the Component  */
  def update(): Unit = js.native
  /** [Method] Updates the styleHtmlCls configuration
  		* @param newHtmlCls Object
  		* @param oldHtmlCls Object
  		*/
  def updateStyleHtmlCls(): Unit = js.native
  def updateStyleHtmlCls(newHtmlCls: js.Any): Unit = js.native
  def updateStyleHtmlCls(newHtmlCls: js.Any, oldHtmlCls: js.Any): Unit = js.native
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		* @returns Ext.MessageBox this
  		*/
  def updateText(): IMessageBox = js.native
  def updateText(message: java.lang.String): IMessageBox = js.native
}

