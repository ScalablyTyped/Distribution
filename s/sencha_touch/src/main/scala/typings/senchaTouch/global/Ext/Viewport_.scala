package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.IComponent
import typings.senchaTouch.Ext.IContainer
import typings.senchaTouch.Ext.IMenu
import typings.senchaTouch.Ext.data.IModel
import typings.senchaTouch.Ext.dom.IElement
import typings.senchaTouch.Ext.mixin.IObservable
import typings.senchaTouch.Ext.scroll.IView
import typings.senchaTouch.Ext.util.IMixedCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Viewport")
@js.native
open class Viewport_ ()
  extends StObject
     with typings.senchaTouch.Ext.Viewport_
/* static members */
object Viewport_ {
  
  @JSGlobal("Ext.Viewport")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Adds one or more Components to this Container
    * @param newItems Object/Object[]/Ext.Component/Ext.Component[] The new items to add to the Container.
    * @returns Ext.Component The last item added to the Container from the newItems array.
    */
  inline def add(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[IComponent]
  inline def add(newItems: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(newItems.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Appends an after event handler
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  inline def addAfterListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")().asInstanceOf[Unit]
  inline def addAfterListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addAfterListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Adds an array of Components to this Container
    * @param items Array The array of items to add to this container.
    * @returns Array The array of items after they have been added.
    */
  inline def addAll(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("addAll")().asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def addAll(items: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("addAll")(items.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Appends a before event handler
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  inline def addBeforeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")().asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Adds a CSS class or classes to this Component s rendered element
    * @param cls String The CSS class to add.
    * @param prefix String Optional prefix to add to each class.
    * @param suffix String Optional suffix to add to each class.
    */
  inline def addCls(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCls")().asInstanceOf[Unit]
  inline def addCls(cls: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCls")(cls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addCls(cls: java.lang.String, prefix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCls")(cls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addCls(cls: java.lang.String, prefix: java.lang.String, suffix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCls")(cls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addCls(cls: java.lang.String, prefix: Unit, suffix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCls")(cls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addCls(cls: Unit, prefix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCls")(cls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addCls(cls: Unit, prefix: java.lang.String, suffix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCls")(cls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addCls(cls: Unit, prefix: Unit, suffix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCls")(cls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Adds the specified events to the list of events which this Observable may fire
    * @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
    */
  inline def addEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")().asInstanceOf[Unit]
  inline def addEvents(eventNames: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(eventNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Appends an event handler to this object
    * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
    * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
    */
  inline def addListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")().asInstanceOf[Unit]
  inline def addListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    * @param options Object If the eventName parameter was an event name, this is the addListener options.
    */
  inline def addManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")().asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Animates to the supplied activeItem with a specified animation
    * @param activeItem Object/Number The item or item index to make active.
    * @param animation Object/Ext.fx.layout.Card Card animation configuration or instance.
    */
  inline def animateActiveItem(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("animateActiveItem")().asInstanceOf[Unit]
  inline def animateActiveItem(activeItem: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("animateActiveItem")(activeItem.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def animateActiveItem(activeItem: Any, animation: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animateActiveItem")(activeItem.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def animateActiveItem(activeItem: Unit, animation: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animateActiveItem")(activeItem.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Changes the masked configuration when its setter is called which will convert the value into a proper object instanc
    * @param masked Boolean/Object/Ext.Mask/Ext.LoadMask
    * @returns Object
    */
  inline def applyMasked(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("applyMasked")().asInstanceOf[Any]
  inline def applyMasked(masked: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("applyMasked")(masked.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
  inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
  inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
  inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Retrieves the first direct child of this container which matches the passed selector
    * @param selector String An Ext.ComponentQuery selector.
    * @returns Ext.Component
    */
  inline def child(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("child")().asInstanceOf[IComponent]
  inline def child(selector: java.lang.String): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("child")(selector.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Removes all listeners for this object  */
  inline def clearListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearListeners")().asInstanceOf[Unit]
  
  /** [Method]  */
  inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /** [Method] Disables this Component */
  inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
  
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
    * @param selector String An Ext.ComponentQuery selector.
    * @returns Ext.Component
    */
  inline def down(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("down")().asInstanceOf[IComponent]
  inline def down(selector: java.lang.String): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("down")(selector.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Enables this Component */
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
    * @param events String/String[] The event name to bubble, or an Array of event names.
    */
  inline def enableBubble(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")().asInstanceOf[Unit]
  inline def enableBubble(events: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")(events.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
    * @param eventName String The name of the event to fire.
    * @param args Array Arguments to pass to handers.
    * @param fn Function Action.
    * @param scope Object Scope of fn.
    * @returns Object
    */
  inline def fireAction(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")().asInstanceOf[Any]
  inline def fireAction(eventName: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def fireAction(eventName: java.lang.String, args: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: java.lang.String, args: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: java.lang.String, args: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: Unit, args: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: Unit, args: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: Unit, args: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
    * @param eventName String The name of the event to fire.
    * @param args Object... Variable number of parameters are passed to handlers.
    * @returns Boolean Returns false if any of the handlers return false.
    */
  inline def fireEvent(eventName: java.lang.String, args: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(scala.List(eventName.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  
  /** [Method] Returns the value of activeItem
    * @returns Object/String/Number
    */
  inline def getActiveItem(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveItem")().asInstanceOf[Any]
  
  /** [Method] Prepares information on aligning this to component using alignment
    * @param component Object
    * @param alignment Object
    */
  inline def getAlignmentInfo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlignmentInfo")().asInstanceOf[Unit]
  inline def getAlignmentInfo(component: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlignmentInfo")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getAlignmentInfo(component: Any, alignment: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignmentInfo")(component.asInstanceOf[js.Any], alignment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getAlignmentInfo(component: Unit, alignment: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignmentInfo")(component.asInstanceOf[js.Any], alignment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Returns the Component for a given index in the Container s items
    * @param index Number The index of the Component to return.
    * @returns Ext.Component The item at the specified index, if found.
    */
  inline def getAt(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getAt")().asInstanceOf[IComponent]
  inline def getAt(index: Double): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getAt")(index.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Returns the value of autoDestroy
    * @returns Boolean
    */
  inline def getAutoDestroy(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoDestroy")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of autoMaximize
    * @returns Boolean
    */
  inline def getAutoMaximize(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoMaximize")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of baseCls
    * @returns String
    */
  inline def getBaseCls(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseCls")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of border
    * @returns Number/String
    */
  inline def getBorder(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBorder")().asInstanceOf[Any]
  
  /** [Method] Returns the value of bottom
    * @returns Number/String
    */
  inline def getBottom(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBottom")().asInstanceOf[Any]
  
  /** [Method] Returns the value of bubbleEvents
    * @returns String/String[]
    */
  inline def getBubbleEvents(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBubbleEvents")().asInstanceOf[Any]
  
  /** [Method] Returns the value of centered
    * @returns Boolean
    */
  inline def getCentered(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getCentered")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of cls
    * @returns String/String[]
    */
  inline def getCls(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCls")().asInstanceOf[Any]
  
  /** [Method] Examines this container s items property and gets a direct child component of this container
    * @param component String/Number This parameter may be any of the following:  {String} : representing the itemId or id of the child component. {Number} : representing the position of the child component within the items property. For additional information see Ext.util.MixedCollection.get.
    * @returns Ext.Component The component (if found).
    */
  inline def getComponent(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")().asInstanceOf[IComponent]
  inline def getComponent(component: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(component.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  
  /** [Method] Returns the value of contentEl
    * @returns Ext.Element/HTMLElement/String
    */
  inline def getContentEl(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentEl")().asInstanceOf[Any]
  
  /** [Method] Returns the value of control
    * @returns Object
    */
  inline def getControl(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getControl")().asInstanceOf[Any]
  
  /** [Method] Returns the value of data
    * @returns Object
    */
  inline def getData(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")().asInstanceOf[Any]
  
  /** [Method] Returns the value of defaultType
    * @returns String
    */
  inline def getDefaultType(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultType")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of defaults
    * @returns Object
    */
  inline def getDefaults(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaults")().asInstanceOf[Any]
  
  /** [Method] Returns the value of disabled
    * @returns Boolean
    */
  inline def getDisabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisabled")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of disabledCls
    * @returns String
    */
  inline def getDisabledCls(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisabledCls")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of docked
    * @returns String
    */
  inline def getDocked(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocked")().asInstanceOf[java.lang.String]
  
  /** [Method] Finds a docked item of this container using a reference idor an index of its location in getDockedItems
    * @param component String/Number The id or index of the component to find.
    * @returns Ext.Component/Boolean The docked component, if found.
    */
  inline def getDockedComponent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDockedComponent")().asInstanceOf[Any]
  inline def getDockedComponent(component: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDockedComponent")(component.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Returns all the Ext Component docked items in this container
    * @returns Array The docked items of this container.
    */
  inline def getDockedItems(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getDockedItems")().asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Retrieves the top level element representing this component
    * @returns Ext.dom.Element
    */
  inline def getEl(): IElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getEl")().asInstanceOf[IElement]
  
  /** [Method] Returns the value of enterAnimation
    * @returns String/Mixed
    */
  inline def getEnterAnimation(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnterAnimation")().asInstanceOf[Any]
  
  /** [Method] Returns the value of exitAnimation
    * @returns String/Mixed
    */
  inline def getExitAnimation(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getExitAnimation")().asInstanceOf[Any]
  
  /** [Method] Returns the value of flex
    * @returns Number
    */
  inline def getFlex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlex")().asInstanceOf[Double]
  
  /** [Method] Returns the value of floatingCls
    * @returns String
    */
  inline def getFloatingCls(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFloatingCls")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of hidden
    * @returns Boolean
    */
  inline def getHidden(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getHidden")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of hiddenCls
    * @returns String
    */
  inline def getHiddenCls(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHiddenCls")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of hideAnimation
    * @returns String/Mixed
    */
  inline def getHideAnimation(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getHideAnimation")().asInstanceOf[Any]
  
  /** [Method] Returns the value of hideOnMaskTap
    * @returns Boolean
    */
  inline def getHideOnMaskTap(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getHideOnMaskTap")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of html
    * @returns String/Ext.Element/HTMLElement
    */
  inline def getHtml(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getHtml")().asInstanceOf[Any]
  
  /** [Method] Retrieves the id of this component
    * @returns String id
    */
  inline def getId(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
  inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Returns all inner items of this container
    * @returns Array The inner items of this container.
    */
  inline def getInnerItems(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getInnerItems")().asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Returns the value of itemId
    * @returns String
    */
  inline def getItemId(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemId")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of items
    * @returns Array/Object
    */
  inline def getItems(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getItems")().asInstanceOf[Any]
  
  /** [Method] Returns the value of layout
    * @returns Object/String
    */
  inline def getLayout(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayout")().asInstanceOf[Any]
  
  /** [Method] Returns the value of left
    * @returns Number/String
    */
  inline def getLeft(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeft")().asInstanceOf[Any]
  
  /** [Method] Returns the value of listeners
    * @returns Object
    */
  inline def getListeners(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getListeners")().asInstanceOf[Any]
  
  /** [Method] Returns the value of margin
    * @returns Number/String
    */
  inline def getMargin(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMargin")().asInstanceOf[Any]
  
  /** [Method] Returns the value of masked
    * @returns Boolean/Object/Ext.Mask/Ext.LoadMask
    */
  inline def getMasked(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMasked")().asInstanceOf[Any]
  
  /** [Method] Returns the value of maxHeight
    * @returns Number/String
    */
  inline def getMaxHeight(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")().asInstanceOf[Any]
  
  /** [Method] Returns the value of maxWidth
    * @returns Number/String
    */
  inline def getMaxWidth(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxWidth")().asInstanceOf[Any]
  
  /** [Method] Returns the value of minHeight
    * @returns Number/String
    */
  inline def getMinHeight(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinHeight")().asInstanceOf[Any]
  
  /** [Method] Returns the value of minWidth
    * @returns Number/String
    */
  inline def getMinWidth(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinWidth")().asInstanceOf[Any]
  
  /** [Method] Returns the value of modal
    * @returns Boolean
    */
  inline def getModal(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getModal")().asInstanceOf[Boolean]
  
  /** [Method] Returns the current orientation
    * @returns String portrait or landscape
    */
  inline def getOrientation(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrientation")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of padding
    * @returns Number/String
    */
  inline def getPadding(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPadding")().asInstanceOf[Any]
  
  /** [Method] Returns the parent of this component if it has one
    * @returns Ext.Component The parent of this component.
    */
  inline def getParent(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getParent")().asInstanceOf[IComponent]
  
  /** [Method] Returns the value of plugins
    * @returns Object/Array
    */
  inline def getPlugins(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugins")().asInstanceOf[Any]
  
  /** [Method] Returns the value of preventPanning
    * @returns Boolean
    */
  inline def getPreventPanning(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreventPanning")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of preventZooming
    * @returns Boolean
    */
  inline def getPreventZooming(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreventZooming")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of record
    * @returns Ext.data.Model
    */
  inline def getRecord(): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("getRecord")().asInstanceOf[IModel]
  
  /** [Method] Returns the value of renderTo
    * @returns Ext.Element
    */
  inline def getRenderTo(): typings.senchaTouch.Ext.IElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderTo")().asInstanceOf[typings.senchaTouch.Ext.IElement]
  
  /** [Method] Returns the value of right
    * @returns Number/String
    */
  inline def getRight(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRight")().asInstanceOf[Any]
  
  /** [Method] Returns an the scrollable instance for this container which is a Ext scroll View class
    * @returns Ext.scroll.View The scroll view.
    */
  inline def getScrollable(): IView = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollable")().asInstanceOf[IView]
  
  /** [Method] Returns the value of showAnimation
    * @returns String/Mixed
    */
  inline def getShowAnimation(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getShowAnimation")().asInstanceOf[Any]
  
  /** [Method] Returns the height and width of the Component
    * @returns Object The current height and width of the Component.
    */
  inline def getSize(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")().asInstanceOf[Any]
  
  /** [Method] Returns the value of style
    * @returns String/Object
    */
  inline def getStyle(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")().asInstanceOf[Any]
  
  /** [Method] Returns the value of styleHtmlCls
    * @returns String
    */
  inline def getStyleHtmlCls(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyleHtmlCls")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of styleHtmlContent
    * @returns Boolean
    */
  inline def getStyleHtmlContent(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyleHtmlContent")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of top
    * @returns Number/String
    */
  inline def getTop(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")().asInstanceOf[Any]
  
  /** [Method] Returns the value of tpl
    * @returns String/String[]/Ext.Template/Ext.XTemplate[]
    */
  inline def getTpl(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTpl")().asInstanceOf[Any]
  
  /** [Method] Returns the value of tplWriteMode
    * @returns String
    */
  inline def getTplWriteMode(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTplWriteMode")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of ui
    * @returns String
    */
  inline def getUi(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUi")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of useBodyElement
    * @returns Boolean
    */
  inline def getUseBodyElement(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getUseBodyElement")().asInstanceOf[Boolean]
  
  /** [Method] Retrieves the document height
    * @returns Number height in pixels.
    */
  inline def getWindowHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowHeight")().asInstanceOf[Double]
  
  /** [Method] Retrieves the document width
    * @returns Number width in pixels.
    */
  inline def getWindowWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowWidth")().asInstanceOf[Double]
  
  /** [Method] Returns this Component s xtype hierarchy as a slash delimited string
    * @returns String The xtype hierarchy string.
    */
  inline def getXTypes(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getXTypes")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of zIndex
    * @returns Number
    */
  inline def getZIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getZIndex")().asInstanceOf[Double]
  
  /** [Method] Checks to see if this object has any listeners for a specified event
    * @param eventName String The name of the event to check for
    * @returns Boolean True if the event is being listened for, else false
    */
  inline def hasListener(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")().asInstanceOf[Boolean]
  inline def hasListener(eventName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Returns true if this component has a parent
    * @returns Boolean true if this component has a parent.
    */
  inline def hasParent(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasParent")().asInstanceOf[Boolean]
  
  /** [Method] Hides this Component optionally using an animation
    * @returns Ext.Component
    */
  inline def hide(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[IComponent]
  
  /** [Method] Hides all visible menus
    * @param animation Object
    */
  inline def hideAllMenus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideAllMenus")().asInstanceOf[Unit]
  inline def hideAllMenus(animation: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideAllMenus")(animation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Hides a menu specified by the menu s side
    * @param side String The side which the menu is placed.
    */
  inline def hideMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideMenu")().asInstanceOf[Unit]
  inline def hideMenu(side: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideMenu")(side.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Hides all menus except for the side specified
    * @param side String Side(s) not to hide
    * @param animation String Animation to hide with
    */
  inline def hideOtherMenus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideOtherMenus")().asInstanceOf[Unit]
  inline def hideOtherMenus(side: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideOtherMenus")(side.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def hideOtherMenus(side: java.lang.String, animation: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hideOtherMenus")(side.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hideOtherMenus(side: Unit, animation: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hideOtherMenus")(side.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
  inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Allows addition of behavior to the rendering phase  */
  inline def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
  
  /** [Method] Adds a child Component at the given index
    * @param index Number The index to insert the Component at.
    * @param item Object The Component to insert.
    */
  inline def insert(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")().asInstanceOf[Unit]
  inline def insert(index: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def insert(index: Double, item: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insert(index: Unit, item: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Returns true if this Component is currently disabled
    * @returns Boolean true if currently disabled.
    */
  inline def isDisabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisabled")().asInstanceOf[Boolean]
  
  /** [Method] Returns true if this Component is currently hidden
    * @returns Boolean true if currently hidden.
    */
  inline def isHidden(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHidden")().asInstanceOf[Boolean]
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.Viewport.isReady")
  @js.native
  def isReady: Boolean = js.native
  inline def isReady_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isReady")(x.asInstanceOf[js.Any])
  
  /** [Method] Tests whether or not this Component is of a specific xtype
    * @param xtype String The xtype to check for this Component.
    * @param shallow Boolean false to check whether this Component is descended from the xtype (this is the default), or true to check whether this Component is directly of the specified xtype.
    * @returns Boolean true if this component descends from the specified xtype, false otherwise.
    */
  inline def isXType(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isXType")().asInstanceOf[Boolean]
  inline def isXType(xtype: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isXType")(xtype.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isXType(xtype: java.lang.String, shallow: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isXType")(xtype.asInstanceOf[js.Any], shallow.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isXType(xtype: Unit, shallow: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isXType")(xtype.asInstanceOf[js.Any], shallow.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Property] (Ext.util.MixedCollection) */
  @JSGlobal("Ext.Viewport.items")
  @js.native
  def items: IMixedCollection = js.native
  inline def items_=(x: IMixedCollection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
  
  /** [Method] Convenience method which calls setMasked with a value of true to show the mask
    * @param mask Object
    */
  inline def mask(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mask")().asInstanceOf[Unit]
  inline def mask(mask: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mask")(mask.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Alias for addManagedListener
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    * @param options Object If the eventName parameter was an event name, this is the addListener options.
    */
  inline def mon(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")().asInstanceOf[Unit]
  inline def mon(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for removeManagedListener
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    */
  inline def mun(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")().asInstanceOf[Unit]
  inline def mun(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mun(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mun(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for addListener
    * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
    * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
    */
  inline def on(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")().asInstanceOf[Unit]
  inline def on(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for addAfterListener
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  inline def onAfter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")().asInstanceOf[Unit]
  inline def onAfter(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def onAfter(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAfter(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for addBeforeListener
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  inline def onBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")().asInstanceOf[Unit]
  inline def onBefore(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def onBefore(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onBefore(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Retrieves all descendant components which match the passed selector
    * @param selector String Selector complying to an Ext.ComponentQuery selector.
    * @returns Array Ext.Component's which matched the selector.
    */
  inline def query(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("query")().asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def query(selector: java.lang.String): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  inline def relayEvents(): IObservable = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")().asInstanceOf[IObservable]
  inline def relayEvents(`object`: Any): IObservable = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any]).asInstanceOf[IObservable]
  inline def relayEvents(`object`: Any, events: Any): IObservable = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[IObservable]
  inline def relayEvents(`object`: Unit, events: Any): IObservable = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[IObservable]
  
  /** [Method] Removes an item from this Container optionally destroying it
    * @param item Object The item to remove.
    * @param destroy Boolean Calls the Component's destroy method if true.
    * @returns Ext.Component this
    */
  inline def remove(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[IComponent]
  inline def remove(item: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(item.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  inline def remove(item: Any, destroy: Boolean): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(item.asInstanceOf[js.Any], destroy.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def remove(item: Unit, destroy: Boolean): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(item.asInstanceOf[js.Any], destroy.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method] Removes a before event handler
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  inline def removeAfterListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")().asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Removes all items currently in the Container optionally destroying them all
    * @param destroy Boolean If true, destroys each removed Component.
    * @param everything Boolean If true, completely remove all items including docked / centered and floating items.
    * @returns Ext.Component this
    */
  inline def removeAll(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[IComponent]
  inline def removeAll(destroy: Boolean): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")(destroy.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  inline def removeAll(destroy: Boolean, everything: Boolean): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")(destroy.asInstanceOf[js.Any], everything.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def removeAll(destroy: Unit, everything: Boolean): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")(destroy.asInstanceOf[js.Any], everything.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method] Removes the Component at the specified index  myContainer removeAt 0 removes the first item
    * @param index Number The index of the Component to remove.
    * @returns Ext.Container this
    */
  inline def removeAt(): IContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")().asInstanceOf[IContainer]
  inline def removeAt(index: Double): IContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")(index.asInstanceOf[js.Any]).asInstanceOf[IContainer]
  
  /** [Method] Removes a before event handler
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  inline def removeBeforeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")().asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Removes the given CSS class es from this Component s rendered element
    * @param cls String The class(es) to remove.
    * @param prefix String Optional prefix to prepend before each class.
    * @param suffix String Optional suffix to append to each class.
    */
  inline def removeCls(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")().asInstanceOf[Unit]
  inline def removeCls(cls: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")(cls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeCls(cls: java.lang.String, prefix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")(cls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeCls(cls: java.lang.String, prefix: java.lang.String, suffix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")(cls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeCls(cls: java.lang.String, prefix: Unit, suffix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")(cls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeCls(cls: Unit, prefix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")(cls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeCls(cls: Unit, prefix: java.lang.String, suffix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")(cls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeCls(cls: Unit, prefix: Unit, suffix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCls")(cls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Removes a docked item from this Container
    * @param item Object The item to remove.
    * @param destroy Boolean Calls the Component's destroy method if true.
    * @returns Ext.Component this
    */
  inline def removeDocked(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDocked")().asInstanceOf[IComponent]
  inline def removeDocked(item: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDocked")(item.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  inline def removeDocked(item: Any, destroy: Boolean): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDocked")(item.asInstanceOf[js.Any], destroy.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def removeDocked(item: Unit, destroy: Boolean): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDocked")(item.asInstanceOf[js.Any], destroy.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method] Removes an inner Component at the specified index  myContainer removeInnerAt 0 removes the first item of the in
    * @param index Number The index of the Component to remove.
    * @returns Ext.Container this
    */
  inline def removeInnerAt(): IContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("removeInnerAt")().asInstanceOf[IContainer]
  inline def removeInnerAt(index: Double): IContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("removeInnerAt")(index.asInstanceOf[js.Any]).asInstanceOf[IContainer]
  
  /** [Method] Removes an event handler
    * @param eventName String/String[]/Object The type of event the handler was associated with.
    * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
    * @param options Object Extra options object. See addListener for details.
    * @param order String The order of the listener to remove. Possible values are before, current and after.
    */
  inline def removeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")().asInstanceOf[Unit]
  inline def removeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    */
  inline def removeManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")().asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Removes a menu from a specified side
    * @param side String The side to remove the menu from
    */
  inline def removeMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeMenu")().asInstanceOf[Unit]
  inline def removeMenu(side: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeMenu")(side.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Replaces specified classes with the newly specified classes
    * @param oldCls String The class(es) to remove.
    * @param newCls String The class(es) to add.
    * @param prefix String Optional prefix to prepend before each class.
    * @param suffix String Optional suffix to append to each class.
    */
  inline def replaceCls(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceCls")().asInstanceOf[Unit]
  inline def replaceCls(oldCls: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceCls")(oldCls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def replaceCls(oldCls: java.lang.String, newCls: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCls")(oldCls.asInstanceOf[js.Any], newCls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceCls(oldCls: java.lang.String, newCls: java.lang.String, prefix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCls")(oldCls.asInstanceOf[js.Any], newCls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceCls(
    oldCls: java.lang.String,
    newCls: java.lang.String,
    prefix: java.lang.String,
    suffix: java.lang.String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCls")(oldCls.asInstanceOf[js.Any], newCls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceCls(oldCls: java.lang.String, newCls: java.lang.String, prefix: Unit, suffix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCls")(oldCls.asInstanceOf[js.Any], newCls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceCls(oldCls: java.lang.String, newCls: Unit, prefix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCls")(oldCls.asInstanceOf[js.Any], newCls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceCls(oldCls: java.lang.String, newCls: Unit, prefix: java.lang.String, suffix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCls")(oldCls.asInstanceOf[js.Any], newCls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceCls(oldCls: java.lang.String, newCls: Unit, prefix: Unit, suffix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCls")(oldCls.asInstanceOf[js.Any], newCls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceCls(oldCls: Unit, newCls: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCls")(oldCls.asInstanceOf[js.Any], newCls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceCls(oldCls: Unit, newCls: java.lang.String, prefix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCls")(oldCls.asInstanceOf[js.Any], newCls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceCls(oldCls: Unit, newCls: java.lang.String, prefix: java.lang.String, suffix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCls")(oldCls.asInstanceOf[js.Any], newCls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceCls(oldCls: Unit, newCls: java.lang.String, prefix: Unit, suffix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCls")(oldCls.asInstanceOf[js.Any], newCls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceCls(oldCls: Unit, newCls: Unit, prefix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCls")(oldCls.asInstanceOf[js.Any], newCls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceCls(oldCls: Unit, newCls: Unit, prefix: java.lang.String, suffix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCls")(oldCls.asInstanceOf[js.Any], newCls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceCls(oldCls: Unit, newCls: Unit, prefix: Unit, suffix: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCls")(oldCls.asInstanceOf[js.Any], newCls.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Resets top right bottom and left configurations to null which will un float this component  */
  inline def resetFloating(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetFloating")().asInstanceOf[Unit]
  
  /** [Method] Resumes firing events see suspendEvents
    * @param discardQueuedEvents Boolean Pass as true to discard any queued events.
    */
  inline def resumeEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")().asInstanceOf[Unit]
  inline def resumeEvents(discardQueuedEvents: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")(discardQueuedEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.Viewport.self")
  @js.native
  def self: IClass = js.native
  inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Sets the value of activeItem
    * @param activeItem Object/String/Number The new value.
    */
  inline def setActiveItem(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setActiveItem")().asInstanceOf[Unit]
  inline def setActiveItem(activeItem: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setActiveItem")(activeItem.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of autoDestroy
    * @param autoDestroy Boolean The new value.
    */
  inline def setAutoDestroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoDestroy")().asInstanceOf[Unit]
  inline def setAutoDestroy(autoDestroy: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoDestroy")(autoDestroy.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of autoMaximize
    * @param autoMaximize Boolean The new value.
    */
  inline def setAutoMaximize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoMaximize")().asInstanceOf[Unit]
  inline def setAutoMaximize(autoMaximize: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoMaximize")(autoMaximize.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of baseCls
    * @param baseCls String The new value.
    */
  inline def setBaseCls(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBaseCls")().asInstanceOf[Unit]
  inline def setBaseCls(baseCls: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBaseCls")(baseCls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of border
    * @param border Number/String The new value.
    */
  inline def setBorder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBorder")().asInstanceOf[Unit]
  inline def setBorder(border: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBorder")(border.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of bottom
    * @param bottom Number/String The new value.
    */
  inline def setBottom(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBottom")().asInstanceOf[Unit]
  inline def setBottom(bottom: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBottom")(bottom.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of bubbleEvents
    * @param bubbleEvents String/String[] The new value.
    */
  inline def setBubbleEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleEvents")().asInstanceOf[Unit]
  inline def setBubbleEvents(bubbleEvents: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleEvents")(bubbleEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of centered
    * @param centered Boolean The new value.
    */
  inline def setCentered(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCentered")().asInstanceOf[Unit]
  inline def setCentered(centered: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCentered")(centered.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of cls
    * @param cls String/String[] The new value.
    */
  inline def setCls(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCls")().asInstanceOf[Unit]
  inline def setCls(cls: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCls")(cls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of contentEl
    * @param contentEl Ext.Element/HTMLElement/String The new value.
    */
  inline def setContentEl(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContentEl")().asInstanceOf[Unit]
  inline def setContentEl(contentEl: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContentEl")(contentEl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of control
    * @param control Object The new value.
    */
  inline def setControl(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setControl")().asInstanceOf[Unit]
  inline def setControl(control: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setControl")(control.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of data
    * @param data Object The new value.
    */
  inline def setData(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setData")().asInstanceOf[Unit]
  inline def setData(data: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setData")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of defaultType
    * @param defaultType String The new value.
    */
  inline def setDefaultType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultType")().asInstanceOf[Unit]
  inline def setDefaultType(defaultType: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultType")(defaultType.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of defaults
    * @param defaults Object The new value.
    */
  inline def setDefaults(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaults")().asInstanceOf[Unit]
  inline def setDefaults(defaults: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaults")(defaults.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of disabled
    * @param disabled Boolean The new value.
    */
  inline def setDisabled(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisabled")().asInstanceOf[Unit]
  inline def setDisabled(disabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisabled")(disabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of disabledCls
    * @param disabledCls String The new value.
    */
  inline def setDisabledCls(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisabledCls")().asInstanceOf[Unit]
  inline def setDisabledCls(disabledCls: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisabledCls")(disabledCls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of docked
    * @param docked String The new value.
    */
  inline def setDocked(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDocked")().asInstanceOf[Unit]
  inline def setDocked(docked: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDocked")(docked.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of draggable
    * @param draggable Object The new value.
    */
  inline def setDraggable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDraggable")().asInstanceOf[Unit]
  inline def setDraggable(draggable: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDraggable")(draggable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of enterAnimation
    * @param enterAnimation String/Mixed The new value.
    */
  inline def setEnterAnimation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnterAnimation")().asInstanceOf[Unit]
  inline def setEnterAnimation(enterAnimation: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnterAnimation")(enterAnimation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of exitAnimation
    * @param exitAnimation String/Mixed The new value.
    */
  inline def setExitAnimation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setExitAnimation")().asInstanceOf[Unit]
  inline def setExitAnimation(exitAnimation: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setExitAnimation")(exitAnimation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of flex
    * @param flex Number The new value.
    */
  inline def setFlex(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFlex")().asInstanceOf[Unit]
  inline def setFlex(flex: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFlex")(flex.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Used to update the floating state of this component
    * @param floating Boolean true if you want to float this component.
    */
  inline def setFloating(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFloating")().asInstanceOf[Unit]
  inline def setFloating(floating: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFloating")(floating.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of floatingCls
    * @param floatingCls String The new value.
    */
  inline def setFloatingCls(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFloatingCls")().asInstanceOf[Unit]
  inline def setFloatingCls(floatingCls: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFloatingCls")(floatingCls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of hidden
    * @param hidden Boolean The new value.
    */
  inline def setHidden(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHidden")().asInstanceOf[Unit]
  inline def setHidden(hidden: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHidden")(hidden.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of hiddenCls
    * @param hiddenCls String The new value.
    */
  inline def setHiddenCls(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHiddenCls")().asInstanceOf[Unit]
  inline def setHiddenCls(hiddenCls: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHiddenCls")(hiddenCls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of hideAnimation
    * @param hideAnimation String/Mixed The new value.
    */
  inline def setHideAnimation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHideAnimation")().asInstanceOf[Unit]
  inline def setHideAnimation(hideAnimation: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHideAnimation")(hideAnimation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of hideOnMaskTap
    * @param hideOnMaskTap Boolean The new value.
    */
  inline def setHideOnMaskTap(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHideOnMaskTap")().asInstanceOf[Unit]
  inline def setHideOnMaskTap(hideOnMaskTap: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHideOnMaskTap")(hideOnMaskTap.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of html
    * @param html String/Ext.Element/HTMLElement The new value.
    */
  inline def setHtml(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHtml")().asInstanceOf[Unit]
  inline def setHtml(html: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHtml")(html.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of itemId
    * @param itemId String The new value.
    */
  inline def setItemId(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setItemId")().asInstanceOf[Unit]
  inline def setItemId(itemId: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setItemId")(itemId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of items
    * @param items Array/Object The new value.
    */
  inline def setItems(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setItems")().asInstanceOf[Unit]
  inline def setItems(items: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setItems")(items.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of layout
    * @param layout Object/String The new value.
    */
  inline def setLayout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLayout")().asInstanceOf[Unit]
  inline def setLayout(layout: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of left
    * @param left Number/String The new value.
    */
  inline def setLeft(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLeft")().asInstanceOf[Unit]
  inline def setLeft(left: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLeft")(left.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of listeners
    * @param listeners Object The new value.
    */
  inline def setListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setListeners")().asInstanceOf[Unit]
  inline def setListeners(listeners: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setListeners")(listeners.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of margin
    * @param margin Number/String The new value.
    */
  inline def setMargin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMargin")().asInstanceOf[Unit]
  inline def setMargin(margin: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMargin")(margin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of masked
    * @param masked Boolean/Object/Ext.Mask/Ext.LoadMask The new value.
    */
  inline def setMasked(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMasked")().asInstanceOf[Unit]
  inline def setMasked(masked: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMasked")(masked.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of maxHeight
    * @param maxHeight Number/String The new value.
    */
  inline def setMaxHeight(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxHeight")().asInstanceOf[Unit]
  inline def setMaxHeight(maxHeight: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxHeight")(maxHeight.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of maxWidth
    * @param maxWidth Number/String The new value.
    */
  inline def setMaxWidth(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxWidth")().asInstanceOf[Unit]
  inline def setMaxWidth(maxWidth: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxWidth")(maxWidth.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets a menu for a given side of the Viewport
    * @param menu Ext.Menu The menu to assign to the viewport
    * @param config Object The configuration for the menu.
    */
  inline def setMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMenu")().asInstanceOf[Unit]
  inline def setMenu(menu: Unit, config: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMenu")(menu.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMenu(menu: IMenu): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMenu")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setMenu(menu: IMenu, config: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMenu")(menu.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Sets the value of minHeight
    * @param minHeight Number/String The new value.
    */
  inline def setMinHeight(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMinHeight")().asInstanceOf[Unit]
  inline def setMinHeight(minHeight: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMinHeight")(minHeight.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of minWidth
    * @param minWidth Number/String The new value.
    */
  inline def setMinWidth(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMinWidth")().asInstanceOf[Unit]
  inline def setMinWidth(minWidth: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMinWidth")(minWidth.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of modal
    * @param modal Boolean The new value.
    */
  inline def setModal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setModal")().asInstanceOf[Unit]
  inline def setModal(modal: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setModal")(modal.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of padding
    * @param padding Number/String The new value.
    */
  inline def setPadding(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPadding")().asInstanceOf[Unit]
  inline def setPadding(padding: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPadding")(padding.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of plugins
    * @param plugins Object/Array The new value.
    */
  inline def setPlugins(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPlugins")().asInstanceOf[Unit]
  inline def setPlugins(plugins: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPlugins")(plugins.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of preventPanning
    * @param preventPanning Boolean The new value.
    */
  inline def setPreventPanning(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPreventPanning")().asInstanceOf[Unit]
  inline def setPreventPanning(preventPanning: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPreventPanning")(preventPanning.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of preventZooming
    * @param preventZooming Boolean The new value.
    */
  inline def setPreventZooming(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPreventZooming")().asInstanceOf[Unit]
  inline def setPreventZooming(preventZooming: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPreventZooming")(preventZooming.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of record
    * @param record Ext.data.Model The new value.
    */
  inline def setRecord(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRecord")().asInstanceOf[Unit]
  inline def setRecord(record: IModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRecord")(record.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of renderTo
    * @param renderTo Ext.Element The new value.
    */
  inline def setRenderTo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRenderTo")().asInstanceOf[Unit]
  inline def setRenderTo(renderTo: typings.senchaTouch.Ext.IElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRenderTo")(renderTo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of right
    * @param right Number/String The new value.
    */
  inline def setRight(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRight")().asInstanceOf[Unit]
  inline def setRight(right: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRight")(right.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of scrollable
    * @param scrollable Boolean/String/Object The new value.
    * @returns Ext.scroll.View The scroll view.
    */
  inline def setScrollable(): IView = ^.asInstanceOf[js.Dynamic].applyDynamic("setScrollable")().asInstanceOf[IView]
  inline def setScrollable(scrollable: Any): IView = ^.asInstanceOf[js.Dynamic].applyDynamic("setScrollable")(scrollable.asInstanceOf[js.Any]).asInstanceOf[IView]
  
  /** [Method] Sets the value of showAnimation
    * @param showAnimation String/Mixed The new value.
    */
  inline def setShowAnimation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShowAnimation")().asInstanceOf[Unit]
  inline def setShowAnimation(showAnimation: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShowAnimation")(showAnimation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the size of the Component
    * @param width Number The new width for the Component.
    * @param height Number The new height for the Component.
    */
  inline def setSize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSize")().asInstanceOf[Unit]
  inline def setSize(width: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSize")(width.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setSize(width: Double, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSize")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setSize(width: Unit, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSize")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Sets the value of style
    * @param style String/Object The new value.
    */
  inline def setStyle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStyle")().asInstanceOf[Unit]
  inline def setStyle(style: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStyle")(style.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of styleHtmlCls
    * @param styleHtmlCls String The new value.
    */
  inline def setStyleHtmlCls(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStyleHtmlCls")().asInstanceOf[Unit]
  inline def setStyleHtmlCls(styleHtmlCls: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStyleHtmlCls")(styleHtmlCls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of styleHtmlContent
    * @param styleHtmlContent Boolean The new value.
    */
  inline def setStyleHtmlContent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStyleHtmlContent")().asInstanceOf[Unit]
  inline def setStyleHtmlContent(styleHtmlContent: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStyleHtmlContent")(styleHtmlContent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of top
    * @param top Number/String The new value.
    */
  inline def setTop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTop")().asInstanceOf[Unit]
  inline def setTop(top: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTop")(top.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of tpl
    * @param tpl String/String[]/Ext.Template/Ext.XTemplate[] The new value.
    */
  inline def setTpl(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTpl")().asInstanceOf[Unit]
  inline def setTpl(tpl: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTpl")(tpl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of tplWriteMode
    * @param tplWriteMode String The new value.
    */
  inline def setTplWriteMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTplWriteMode")().asInstanceOf[Unit]
  inline def setTplWriteMode(tplWriteMode: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTplWriteMode")(tplWriteMode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of ui
    * @param ui String The new value.
    */
  inline def setUi(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUi")().asInstanceOf[Unit]
  inline def setUi(ui: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUi")(ui.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of useBodyElement
    * @param useBodyElement Boolean The new value.
    */
  inline def setUseBodyElement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUseBodyElement")().asInstanceOf[Unit]
  inline def setUseBodyElement(useBodyElement: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUseBodyElement")(useBodyElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of zIndex
    * @param zIndex Number The new value.
    */
  inline def setZIndex(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setZIndex")().asInstanceOf[Unit]
  inline def setZIndex(zIndex: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setZIndex")(zIndex.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Shows this component optionally using an animation
    * @returns Ext.Component
    */
  inline def show(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[IComponent]
  
  /** [Method] Shows this component by another component
    * @param component Ext.Component The target component to show this component by.
    * @param alignment String The specific alignment.
    */
  inline def showBy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showBy")().asInstanceOf[Unit]
  inline def showBy(component: Unit, alignment: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showBy")(component.asInstanceOf[js.Any], alignment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def showBy(component: IComponent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showBy")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def showBy(component: IComponent, alignment: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showBy")(component.asInstanceOf[js.Any], alignment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Shows a menu specified by the menu s side
    * @param side String The side which the menu is placed.
    */
  inline def showMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showMenu")().asInstanceOf[Unit]
  inline def showMenu(side: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showMenu")(side.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  
  /** [Method] Suspends the firing of all events  */
  inline def suspendEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvents")().asInstanceOf[Unit]
  
  /** [Method] Toggles the menu specified by side
    * @param side String The side which the menu is placed.
    */
  inline def toggleMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleMenu")().asInstanceOf[Unit]
  inline def toggleMenu(side: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleMenu")(side.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Alias for removeListener
    * @param eventName String/String[]/Object The type of event the handler was associated with.
    * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
    * @param options Object Extra options object. See addListener for details.
    * @param order String The order of the listener to remove. Possible values are before, current and after.
    */
  inline def un(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")().asInstanceOf[Unit]
  inline def un(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for removeAfterListener
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  inline def unAfter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")().asInstanceOf[Unit]
  inline def unAfter(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unAfter(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unAfter(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for removeBeforeListener
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  inline def unBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")().asInstanceOf[Unit]
  inline def unBefore(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unBefore(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unBefore(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Convenience method which calls setMasked with a value of false to hide the mask */
  inline def unmask(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmask")().asInstanceOf[Unit]
  
  /** [Method] Walks up the ownerCt axis looking for an ancestor Container which matches the passed simple selector
    * @param selector String The simple selector to test.
    * @returns Ext.Container The matching ancestor Container (or undefined if no match was found).
    */
  inline def up(): IContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("up")().asInstanceOf[IContainer]
  inline def up(selector: java.lang.String): IContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("up")(selector.asInstanceOf[js.Any]).asInstanceOf[IContainer]
  
  /** [Method] Updates the HTML content of the Component  */
  inline def update(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")().asInstanceOf[Unit]
  
  /** [Method] Updates the styleHtmlCls configuration
    * @param newHtmlCls Object
    * @param oldHtmlCls Object
    */
  inline def updateStyleHtmlCls(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateStyleHtmlCls")().asInstanceOf[Unit]
  inline def updateStyleHtmlCls(newHtmlCls: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateStyleHtmlCls")(newHtmlCls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def updateStyleHtmlCls(newHtmlCls: Any, oldHtmlCls: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateStyleHtmlCls")(newHtmlCls.asInstanceOf[js.Any], oldHtmlCls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateStyleHtmlCls(newHtmlCls: Unit, oldHtmlCls: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateStyleHtmlCls")(newHtmlCls.asInstanceOf[js.Any], oldHtmlCls.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
