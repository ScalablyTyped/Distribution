package typings.slideout.mod

import typings.slideout.slideoutStrings.translate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A touch slideout navigation menu for your mobile web apps.
  */
@js.native
trait Slideout extends js.Object {
  
  /**
    * Closes the slideout menu. It emits beforeclose and close events.
    */
  def close(): Slideout = js.native
  
  /**
    * Cleans up the instance so another slideout can be created on the same area.
    */
  def destroy(): Slideout = js.native
  
  /**
    * Disables opening the slideout via touch events.
    */
  def disableTouch(): Slideout = js.native
  
  /**
    * Execute each item in the listener collection in order with the specified data.
    * @param event The name of the event you want to emit.
    * @param data Data to pass to the listeners.
    */
  def emit(event: Events, data: js.Any*): Slideout = js.native
  
  /**
    * Enables opening the slideout via touch events.
    */
  def enableTouch(): Slideout = js.native
  
  /**
    * Returns true if the slideout is currently open, and false if it is closed.
    */
  def isOpen(): Boolean = js.native
  
  /**
    * Removes a listener from the collection for the specified event.
    * @param event The event name.
    * @param listener A listener function to remove.
    */
  def off(event: Events, listener: js.Function): Slideout = js.native
  /**
    * Removes a listener from the collection for the specified event.
    * @param event The event name.
    * @param listener A listener function to remove.
    */
  @JSName("off")
  def off_translate(event: translate, listener: js.Function1[/* translateX */ Double, _]): Slideout = js.native
  
  /**
    * Adds a listener to the collection for the specified event.
    * @param event The event name.
    * @param listener A listener function to add.
    */
  def on(event: Events, listener: js.Function): Slideout = js.native
  /**
    * Adds a listener to the collection for the specified event.
    * @param event The event name.
    * @param listener A listener function to add.
    */
  @JSName("on")
  def on_translate(event: translate, listener: js.Function1[/* translateX */ Double, _]): Slideout = js.native
  
  /**
    * Adds a listener to the collection for the specified event that will be called only once.
    * @param event The event name.
    * @param listener A listener function to add.
    */
  def once(event: Events, listener: js.Function): Slideout = js.native
  /**
    * Adds a listener to the collection for the specified event that will be called only once.
    * @param event The event name.
    * @param listener A listener function to add.
    */
  @JSName("once")
  def once_translate(event: translate, listener: js.Function1[/* translateX */ Double, _]): Slideout = js.native
  
  /**
    * Opens the slideout menu. It emits beforeopen and open events.
    */
  def open(): Slideout = js.native
  
  /**
    * Toggles (open/close) the slideout menu.
    */
  def toggle(): Slideout = js.native
}
