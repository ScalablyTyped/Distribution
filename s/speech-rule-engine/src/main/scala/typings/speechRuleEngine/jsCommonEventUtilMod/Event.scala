package typings.speechRuleEngine.jsCommonEventUtilMod

import typings.std.EventListener
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("speech-rule-engine/js/common/event_util", "Event")
@js.native
open class Event protected () extends StObject {
  def this(src: Node, `type`: EventType, callback: EventListener) = this()
  
  def add(): Unit = js.native
  
  def callback(evt: typings.std.Event): Unit = js.native
  @JSName("callback")
  var callback_Original: EventListener = js.native
  
  def remove(): Unit = js.native
  
  var src: Node = js.native
  
  var `type`: EventType = js.native
}
