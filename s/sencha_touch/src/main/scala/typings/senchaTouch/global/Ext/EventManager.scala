package typings.senchaTouch.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.EventManager")
@js.native
class EventManager ()
  extends StObject
     with typings.senchaTouch.Ext.EventManager
/* static members */
object EventManager {
  
  @JSGlobal("Ext.EventManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Appends an event handler to an element
    * @param el String/HTMLElement The HTML element or id to assign the event handler to.
    * @param eventName String The name of the event to listen for.
    * @param handler Function The handler function the event invokes. This function is passed the following parameters:
    * @param scope Object The scope (this reference) in which the handler function is executed. Defaults to the Element.
    * @param options Object An object containing handler configuration properties. This may contain any of the following properties:
    */
  @scala.inline
  def addListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")().asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: java.lang.String, handler: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: java.lang.String, handler: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: java.lang.String, handler: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: java.lang.String, handler: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: Unit, handler: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: Unit, handler: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: Unit, handler: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: Unit, handler: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: Unit, handler: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: Unit, handler: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: js.Any, eventName: Unit, handler: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: java.lang.String, handler: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: java.lang.String, handler: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: java.lang.String, handler: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: java.lang.String, handler: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: java.lang.String, handler: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: java.lang.String, handler: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: java.lang.String, handler: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: Unit, handler: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: Unit, handler: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: Unit, handler: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: Unit, handler: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: Unit, handler: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: Unit, handler: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addListener(el: Unit, eventName: Unit, handler: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Appends an event handler to an element
    * @param el String/HTMLElement The html element or id to assign the event handler to.
    * @param eventName String The name of the event to listen for.
    * @param handler Function The handler function the event invokes.
    * @param scope Object (this reference) in which the handler function executes. Defaults to the Element.
    * @param options Object An object containing standard addListener options
    */
  @scala.inline
  def on(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")().asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: java.lang.String, handler: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: java.lang.String, handler: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: java.lang.String, handler: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: java.lang.String, handler: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: java.lang.String, handler: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: Unit, handler: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: Unit, handler: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: Unit, handler: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: Unit, handler: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: Unit, handler: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: Unit, handler: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: js.Any, eventName: Unit, handler: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: java.lang.String, handler: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: java.lang.String, handler: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: java.lang.String, handler: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: java.lang.String, handler: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: java.lang.String, handler: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: java.lang.String, handler: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: java.lang.String, handler: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: Unit, handler: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: Unit, handler: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: Unit, handler: js.Any, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: Unit, handler: js.Any, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: Unit, handler: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: Unit, handler: Unit, scope: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def on(el: Unit, eventName: Unit, handler: Unit, scope: Unit, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Adds a listener to be notified when the document is ready before onload and before images are loaded */
  @scala.inline
  def onDocumentReady(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDocumentReady")().asInstanceOf[Unit]
  
  /** [Method] Adds a listener to be notified when the browser window is resized and provides resize event buffering 50 millisecond
    * @param fn Function The handler function the window resize event invokes.
    * @param scope Object The scope (this reference) in which the handler function executes. Defaults to the browser window.
    * @param options Boolean Options object as passed to Ext.Element.addListener
    */
  @scala.inline
  def onWindowResize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onWindowResize")().asInstanceOf[Unit]
  @scala.inline
  def onWindowResize(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onWindowResize")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def onWindowResize(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowResize")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onWindowResize(fn: js.Any, scope: js.Any, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowResize")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onWindowResize(fn: js.Any, scope: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowResize")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onWindowResize(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowResize")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onWindowResize(fn: Unit, scope: js.Any, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowResize")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onWindowResize(fn: Unit, scope: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onWindowResize")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Removes all event handers from an element
    * @param el String/HTMLElement The id or html element from which to remove all event handlers.
    */
  @scala.inline
  def removeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Unit]
  @scala.inline
  def removeAll(el: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Removes an event handler from an element
    * @param el String/HTMLElement The id or html element from which to remove the listener.
    * @param eventName String The name of the event.
    * @param fn Function The handler function to remove. This must be a reference to the function passed into the addListener call.
    * @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
    */
  @scala.inline
  def removeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")().asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: js.Any, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: js.Any, eventName: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: js.Any, eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: js.Any, eventName: java.lang.String, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: js.Any, eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: js.Any, eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: js.Any, eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: Unit, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: Unit, eventName: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: Unit, eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: Unit, eventName: java.lang.String, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: Unit, eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: Unit, eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeListener(el: Unit, eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Removes an event handler from an element
    * @param el String/HTMLElement The id or html element from which to remove the listener.
    * @param eventName String The name of the event.
    * @param fn Function The handler function to remove. This must be a reference to the function passed into the on call.
    * @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
    */
  @scala.inline
  def un(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")().asInstanceOf[Unit]
  @scala.inline
  def un(el: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def un(el: js.Any, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: js.Any, eventName: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: js.Any, eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: js.Any, eventName: java.lang.String, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: js.Any, eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: js.Any, eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: js.Any, eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: Unit, eventName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: Unit, eventName: java.lang.String, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: Unit, eventName: java.lang.String, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: Unit, eventName: java.lang.String, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: Unit, eventName: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: Unit, eventName: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def un(el: Unit, eventName: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
