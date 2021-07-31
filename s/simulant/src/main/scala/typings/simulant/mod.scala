package typings.simulant

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.Node
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(eventName: String): Event = ^.asInstanceOf[js.Dynamic].apply(eventName.asInstanceOf[js.Any]).asInstanceOf[Event]
  @scala.inline
  def apply(eventName: String, payload: StringDictionary[js.Any]): Event = (^.asInstanceOf[js.Dynamic].apply(eventName.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[Event]
  @scala.inline
  def apply(window: Window, eventName: String): Event = (^.asInstanceOf[js.Dynamic].apply(window.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Event]
  @scala.inline
  def apply(window: Window, eventName: String, payload: StringDictionary[js.Any]): Event = (^.asInstanceOf[js.Dynamic].apply(window.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  @JSImport("simulant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fire(el: Node, e: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fire")(el.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fire(el: Node, e: String, payload: StringDictionary[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fire")(el.asInstanceOf[js.Any], e.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fire(el: Node, e: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fire")(el.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
