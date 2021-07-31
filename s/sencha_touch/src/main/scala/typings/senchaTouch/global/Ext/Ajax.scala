package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.mixin.IObservable
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Ajax")
@js.native
class Ajax ()
  extends StObject
     with typings.senchaTouch.Ext.Ajax
/* static members */
object Ajax {
  
  @JSGlobal("Ext.Ajax")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Aborts any outstanding request
    * @param request Object Defaults to the last request.
    */
  @scala.inline
  def abort(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")().asInstanceOf[Unit]
  @scala.inline
  def abort(request: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Aborts all outstanding requests  */
  @scala.inline
  def abortAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abortAll")().asInstanceOf[Unit]
  
  /** [Method] Appends an after event handler
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  @scala.inline
  def addAfterListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")().asInstanceOf[Unit]
  @scala.inline
  def addAfterListener(eventName: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def addAfterListener(eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addAfterListener(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addAfterListener(eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addAfterListener(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addAfterListener(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addAfterListener(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addAfterListener(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addAfterListener(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addAfterListener(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addAfterListener(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addAfterListener(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addAfterListener(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Appends a before event handler
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  @scala.inline
  def addBeforeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")().asInstanceOf[Unit]
  @scala.inline
  def addBeforeListener(eventName: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def addBeforeListener(eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addBeforeListener(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addBeforeListener(eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addBeforeListener(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addBeforeListener(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addBeforeListener(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addBeforeListener(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addBeforeListener(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addBeforeListener(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addBeforeListener(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addBeforeListener(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addBeforeListener(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Adds the specified events to the list of events which this Observable may fire
    * @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
    */
  @scala.inline
  def addEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")().asInstanceOf[Unit]
  @scala.inline
  def addEvents(eventNames: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(eventNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Appends an event handler to this object
    * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
    * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
    */
  @scala.inline
  def addListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")().asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: js.Any, fn: js.Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: js.Any, fn: Unit, scope: js.Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: js.Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: Unit, fn: js.Any, scope: js.Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: Unit, fn: js.Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: Unit, fn: Unit, scope: js.Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: Unit, fn: Unit, scope: Unit, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    * @param options Object If the eventName parameter was an event name, this is the addListener options.
    */
  @scala.inline
  def addManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")().asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: js.Any, eventName: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: js.Any, eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: js.Any, eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: js.Any, eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: js.Any, eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: js.Any, eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: js.Any, eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: js.Any, eventName: Unit, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: Unit, eventName: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: Unit, eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: Unit, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: Unit, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: Unit, eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: Unit, eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: Unit, eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: Unit, eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: Unit, eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: Unit, eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: Unit, eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: Unit, eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.Ajax.autoAbort")
  @js.native
  def autoAbort: Boolean = js.native
  @scala.inline
  def autoAbort_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoAbort")(x.asInstanceOf[js.Any])
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @scala.inline
  def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
  @scala.inline
  def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @scala.inline
  def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
  @scala.inline
  def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @scala.inline
  def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
  @scala.inline
  def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Removes all listeners for this object  */
  @scala.inline
  def clearListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearListeners")().asInstanceOf[Unit]
  
  /** [Method]  */
  @scala.inline
  def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
    * @param events String/String[] The event name to bubble, or an Array of event names.
    */
  @scala.inline
  def enableBubble(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")().asInstanceOf[Unit]
  @scala.inline
  def enableBubble(events: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")(events.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
    * @param eventName String The name of the event to fire.
    * @param args Array Arguments to pass to handers.
    * @param fn Function Action.
    * @param scope Object Scope of fn.
    * @returns Object
    */
  @scala.inline
  def fireAction(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")().asInstanceOf[js.Any]
  @scala.inline
  def fireAction(eventName: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def fireAction(eventName: java.lang.String, args: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def fireAction(eventName: java.lang.String, args: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def fireAction(eventName: java.lang.String, args: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def fireAction(eventName: Unit, args: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def fireAction(eventName: Unit, args: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def fireAction(eventName: Unit, args: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
    * @param eventName String The name of the event to fire.
    * @param args Object... Variable number of parameters are passed to handlers.
    * @returns Boolean Returns false if any of the handlers return false.
    */
  @scala.inline
  def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Returns the value of async
    * @returns Boolean
    */
  @scala.inline
  def getAsync(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getAsync")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of autoAbort
    * @returns Boolean
    */
  @scala.inline
  def getAutoAbort(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoAbort")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of bubbleEvents
    * @returns String/String[]
    */
  @scala.inline
  def getBubbleEvents(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBubbleEvents")().asInstanceOf[js.Any]
  
  /** [Method] Returns the value of defaultHeaders
    * @returns Object
    */
  @scala.inline
  def getDefaultHeaders(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultHeaders")().asInstanceOf[js.Any]
  
  /** [Method] Returns the value of defaultPostHeader
    * @returns String
    */
  @scala.inline
  def getDefaultPostHeader(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultPostHeader")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of defaultXhrHeader
    * @returns String
    */
  @scala.inline
  def getDefaultXhrHeader(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultXhrHeader")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of disableCaching
    * @returns Boolean
    */
  @scala.inline
  def getDisableCaching(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisableCaching")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of disableCachingParam
    * @returns String
    */
  @scala.inline
  def getDisableCachingParam(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisableCachingParam")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of extraParams
    * @returns Object
    */
  @scala.inline
  def getExtraParams(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtraParams")().asInstanceOf[js.Any]
  
  /** [Method] Retrieves the id of this component
    * @returns String id
    */
  @scala.inline
  def getId(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  @scala.inline
  def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
  @scala.inline
  def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Returns the value of listeners
    * @returns Object
    */
  @scala.inline
  def getListeners(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getListeners")().asInstanceOf[js.Any]
  
  /** [Method] Returns the value of method
    * @returns String
    */
  @scala.inline
  def getMethod(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMethod")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of password
    * @returns String
    */
  @scala.inline
  def getPassword(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPassword")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of timeout
    * @returns Number
    */
  @scala.inline
  def getTimeout(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeout")().asInstanceOf[Double]
  
  /** [Method] Returns the value of url
    * @returns String
    */
  @scala.inline
  def getUrl(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of useDefaultHeader
    * @returns Boolean
    */
  @scala.inline
  def getUseDefaultHeader(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getUseDefaultHeader")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of useDefaultXhrHeader
    * @returns Boolean
    */
  @scala.inline
  def getUseDefaultXhrHeader(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getUseDefaultXhrHeader")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of username
    * @returns String
    */
  @scala.inline
  def getUsername(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUsername")().asInstanceOf[java.lang.String]
  
  /** [Method] Checks to see if this object has any listeners for a specified event
    * @param eventName String The name of the event to check for
    * @returns Boolean True if the event is being listened for, else false
    */
  @scala.inline
  def hasListener(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")().asInstanceOf[Boolean]
  @scala.inline
  def hasListener(eventName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  @scala.inline
  def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
  @scala.inline
  def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Determines whether this object has a request outstanding
    * @param request Object The request to check.
    * @returns Boolean True if there is an outstanding request.
    */
  @scala.inline
  def isLoading(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoading")().asInstanceOf[Boolean]
  @scala.inline
  def isLoading(request: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoading")(request.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Alias for addManagedListener
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    * @param options Object If the eventName parameter was an event name, this is the addListener options.
    */
  @scala.inline
  def mon(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")().asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: js.Any, eventName: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: js.Any, eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: js.Any, eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: js.Any, eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: js.Any, eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: js.Any, eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: js.Any, eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: js.Any, eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: js.Any, eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: js.Any, eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: js.Any, eventName: Unit, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: Unit, eventName: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: Unit, eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: Unit, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: Unit, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: Unit, eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: Unit, eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: Unit, eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: Unit, eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: Unit, eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: Unit, eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: Unit, eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: Unit, eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for removeManagedListener
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    */
  @scala.inline
  def mun(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")().asInstanceOf[Unit]
  @scala.inline
  def mun(`object`: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def mun(`object`: js.Any, eventName: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mun(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mun(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mun(`object`: js.Any, eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mun(`object`: js.Any, eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mun(`object`: js.Any, eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mun(`object`: js.Any, eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mun(`object`: Unit, eventName: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mun(`object`: Unit, eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mun(`object`: Unit, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mun(`object`: Unit, eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mun(`object`: Unit, eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mun(`object`: Unit, eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mun(`object`: Unit, eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for addListener
    * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
    * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
    */
  @scala.inline
  def on(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")().asInstanceOf[Unit]
  @scala.inline
  def on(eventName: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: js.Any, fn: js.Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: js.Any, fn: Unit, scope: js.Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: js.Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: Unit, fn: js.Any, scope: js.Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: Unit, fn: js.Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: Unit, fn: Unit, scope: js.Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: Unit, fn: Unit, scope: Unit, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for addAfterListener
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  @scala.inline
  def onAfter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")().asInstanceOf[Unit]
  @scala.inline
  def onAfter(eventName: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def onAfter(eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAfter(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAfter(eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAfter(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAfter(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAfter(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAfter(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAfter(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAfter(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAfter(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAfter(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onAfter(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for addBeforeListener
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  @scala.inline
  def onBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")().asInstanceOf[Unit]
  @scala.inline
  def onBefore(eventName: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def onBefore(eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onBefore(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onBefore(eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onBefore(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onBefore(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onBefore(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onBefore(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onBefore(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onBefore(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onBefore(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onBefore(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onBefore(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Checks if the response status was successful
    * @param status Number The status code.
    * @param xhr XMLHttpRequest
    * @returns Object An object containing success/status state.
    */
  @scala.inline
  def parseStatus(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStatus")().asInstanceOf[js.Any]
  @scala.inline
  def parseStatus(status: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStatus")(status.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def parseStatus(status: Double, xhr: XMLHttpRequest): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStatus")(status.asInstanceOf[js.Any], xhr.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def parseStatus(status: Unit, xhr: XMLHttpRequest): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStatus")(status.asInstanceOf[js.Any], xhr.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @scala.inline
  def relayEvents(): IObservable = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")().asInstanceOf[IObservable]
  @scala.inline
  def relayEvents(`object`: js.Any): IObservable = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any]).asInstanceOf[IObservable]
  @scala.inline
  def relayEvents(`object`: js.Any, events: js.Any): IObservable = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[IObservable]
  @scala.inline
  def relayEvents(`object`: Unit, events: js.Any): IObservable = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[IObservable]
  
  /** [Method] Removes a before event handler
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  @scala.inline
  def removeAfterListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")().asInstanceOf[Unit]
  @scala.inline
  def removeAfterListener(eventName: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def removeAfterListener(eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeAfterListener(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeAfterListener(eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeAfterListener(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeAfterListener(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeAfterListener(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeAfterListener(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeAfterListener(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeAfterListener(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeAfterListener(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeAfterListener(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeAfterListener(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Removes a before event handler
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  @scala.inline
  def removeBeforeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")().asInstanceOf[Unit]
  @scala.inline
  def removeBeforeListener(eventName: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def removeBeforeListener(eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeBeforeListener(eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeBeforeListener(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeBeforeListener(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeBeforeListener(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeBeforeListener(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeBeforeListener(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeBeforeListener(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeBeforeListener(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeBeforeListener(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeBeforeListener(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Removes an event handler
    * @param eventName String/String[]/Object The type of event the handler was associated with.
    * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
    * @param options Object Extra options object. See addListener for details.
    * @param order String The order of the listener to remove. Possible values are before, current and after.
    */
  @scala.inline
  def removeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")().asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: js.Any, fn: js.Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: js.Any, fn: Unit, scope: js.Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: js.Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: Unit, fn: js.Any, scope: js.Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: Unit, fn: js.Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: Unit, fn: Unit, scope: js.Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    */
  @scala.inline
  def removeManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")().asInstanceOf[Unit]
  @scala.inline
  def removeManagedListener(`object`: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def removeManagedListener(`object`: js.Any, eventName: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeManagedListener(`object`: js.Any, eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeManagedListener(`object`: js.Any, eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeManagedListener(`object`: js.Any, eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeManagedListener(`object`: Unit, eventName: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeManagedListener(`object`: Unit, eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeManagedListener(`object`: Unit, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeManagedListener(`object`: Unit, eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeManagedListener(`object`: Unit, eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeManagedListener(`object`: Unit, eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Sends an HTTP request to a remote server
    * @param options Object An object which may contain the following properties: (The options object may also contain any other property which might be needed to perform post-processing in a callback because it is passed to callback functions.)
    * @returns Object/null The request object. This may be used to cancel the request.
    */
  @scala.inline
  def request(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("request")().asInstanceOf[js.Any]
  @scala.inline
  def request(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Resumes firing events see suspendEvents
    * @param discardQueuedEvents Boolean Pass as true to discard any queued events.
    */
  @scala.inline
  def resumeEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")().asInstanceOf[Unit]
  @scala.inline
  def resumeEvents(discardQueuedEvents: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")(discardQueuedEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.Ajax.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Sets the value of async
    * @param async Boolean The new value.
    */
  @scala.inline
  def setAsync(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAsync")().asInstanceOf[Unit]
  @scala.inline
  def setAsync(async: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAsync")(async.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of autoAbort
    * @param autoAbort Boolean The new value.
    */
  @scala.inline
  def setAutoAbort(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoAbort")().asInstanceOf[Unit]
  @scala.inline
  def setAutoAbort(autoAbort: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoAbort")(autoAbort.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of bubbleEvents
    * @param bubbleEvents String/String[] The new value.
    */
  @scala.inline
  def setBubbleEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleEvents")().asInstanceOf[Unit]
  @scala.inline
  def setBubbleEvents(bubbleEvents: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleEvents")(bubbleEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of defaultHeaders
    * @param defaultHeaders Object The new value.
    */
  @scala.inline
  def setDefaultHeaders(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultHeaders")().asInstanceOf[Unit]
  @scala.inline
  def setDefaultHeaders(defaultHeaders: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultHeaders")(defaultHeaders.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of defaultPostHeader
    * @param defaultPostHeader String The new value.
    */
  @scala.inline
  def setDefaultPostHeader(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultPostHeader")().asInstanceOf[Unit]
  @scala.inline
  def setDefaultPostHeader(defaultPostHeader: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultPostHeader")(defaultPostHeader.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of defaultXhrHeader
    * @param defaultXhrHeader String The new value.
    */
  @scala.inline
  def setDefaultXhrHeader(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultXhrHeader")().asInstanceOf[Unit]
  @scala.inline
  def setDefaultXhrHeader(defaultXhrHeader: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultXhrHeader")(defaultXhrHeader.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of disableCaching
    * @param disableCaching Boolean The new value.
    */
  @scala.inline
  def setDisableCaching(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisableCaching")().asInstanceOf[Unit]
  @scala.inline
  def setDisableCaching(disableCaching: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisableCaching")(disableCaching.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of disableCachingParam
    * @param disableCachingParam String The new value.
    */
  @scala.inline
  def setDisableCachingParam(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisableCachingParam")().asInstanceOf[Unit]
  @scala.inline
  def setDisableCachingParam(disableCachingParam: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisableCachingParam")(disableCachingParam.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of extraParams
    * @param extraParams Object The new value.
    */
  @scala.inline
  def setExtraParams(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setExtraParams")().asInstanceOf[Unit]
  @scala.inline
  def setExtraParams(extraParams: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setExtraParams")(extraParams.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of listeners
    * @param listeners Object The new value.
    */
  @scala.inline
  def setListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setListeners")().asInstanceOf[Unit]
  @scala.inline
  def setListeners(listeners: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setListeners")(listeners.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of method
    * @param method String The new value.
    */
  @scala.inline
  def setMethod(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMethod")().asInstanceOf[Unit]
  @scala.inline
  def setMethod(method: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMethod")(method.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets various options such as the url params for the request
    * @param options Object The initial options.
    * @param scope Object The scope to execute in.
    * @returns Object The params for the request.
    */
  @scala.inline
  def setOptions(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")().asInstanceOf[js.Any]
  @scala.inline
  def setOptions(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def setOptions(options: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def setOptions(options: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Sets the value of password
    * @param password String The new value.
    */
  @scala.inline
  def setPassword(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPassword")().asInstanceOf[Unit]
  @scala.inline
  def setPassword(password: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPassword")(password.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of timeout
    * @param timeout Number The new value.
    */
  @scala.inline
  def setTimeout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")().asInstanceOf[Unit]
  @scala.inline
  def setTimeout(timeout: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(timeout.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of url
    * @param url String The new value.
    */
  @scala.inline
  def setUrl(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUrl")().asInstanceOf[Unit]
  @scala.inline
  def setUrl(url: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of useDefaultHeader
    * @param useDefaultHeader Boolean The new value.
    */
  @scala.inline
  def setUseDefaultHeader(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUseDefaultHeader")().asInstanceOf[Unit]
  @scala.inline
  def setUseDefaultHeader(useDefaultHeader: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUseDefaultHeader")(useDefaultHeader.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of useDefaultXhrHeader
    * @param useDefaultXhrHeader Boolean The new value.
    */
  @scala.inline
  def setUseDefaultXhrHeader(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUseDefaultXhrHeader")().asInstanceOf[Unit]
  @scala.inline
  def setUseDefaultXhrHeader(useDefaultXhrHeader: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUseDefaultXhrHeader")(useDefaultXhrHeader.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of username
    * @param username String The new value.
    */
  @scala.inline
  def setUsername(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUsername")().asInstanceOf[Unit]
  @scala.inline
  def setUsername(username: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUsername")(username.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @scala.inline
  def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  
  /** [Method] Suspends the firing of all events  */
  @scala.inline
  def suspendEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvents")().asInstanceOf[Unit]
  
  /** [Method] Alias for removeListener
    * @param eventName String/String[]/Object The type of event the handler was associated with.
    * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
    * @param options Object Extra options object. See addListener for details.
    * @param order String The order of the listener to remove. Possible values are before, current and after.
    */
  @scala.inline
  def un(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")().asInstanceOf[Unit]
  @scala.inline
  def un(eventName: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: js.Any, fn: js.Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: js.Any, fn: Unit, scope: js.Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: js.Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: Unit, fn: js.Any, scope: js.Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: Unit, fn: js.Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: Unit, fn: Unit, scope: js.Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: Unit, fn: Unit, scope: Unit, options: js.Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for removeAfterListener
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  @scala.inline
  def unAfter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")().asInstanceOf[Unit]
  @scala.inline
  def unAfter(eventName: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def unAfter(eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unAfter(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unAfter(eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unAfter(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unAfter(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unAfter(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unAfter(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unAfter(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unAfter(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unAfter(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unAfter(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unAfter(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Alias for removeBeforeListener
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  @scala.inline
  def unBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")().asInstanceOf[Unit]
  @scala.inline
  def unBefore(eventName: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def unBefore(eventName: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unBefore(eventName: js.Any, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unBefore(eventName: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unBefore(eventName: js.Any, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unBefore(eventName: js.Any, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unBefore(eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unBefore(eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unBefore(eventName: Unit, fn: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unBefore(eventName: Unit, fn: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unBefore(eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unBefore(eventName: Unit, fn: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unBefore(eventName: Unit, fn: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Uploads a form using a hidden iframe
    * @param form String/HTMLElement/Ext.Element The form to upload.
    * @param url String The url to post to.
    * @param params String Any extra parameters to pass.
    * @param options Object The initial options.
    */
  @scala.inline
  def upload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("upload")().asInstanceOf[Unit]
  @scala.inline
  def upload(form: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def upload(form: js.Any, url: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def upload(form: js.Any, url: java.lang.String, params: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def upload(form: js.Any, url: java.lang.String, params: java.lang.String, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def upload(form: js.Any, url: java.lang.String, params: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def upload(form: js.Any, url: Unit, params: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def upload(form: js.Any, url: Unit, params: java.lang.String, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def upload(form: js.Any, url: Unit, params: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def upload(form: Unit, url: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def upload(form: Unit, url: java.lang.String, params: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def upload(form: Unit, url: java.lang.String, params: java.lang.String, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def upload(form: Unit, url: java.lang.String, params: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def upload(form: Unit, url: Unit, params: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def upload(form: Unit, url: Unit, params: java.lang.String, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def upload(form: Unit, url: Unit, params: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(form.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
