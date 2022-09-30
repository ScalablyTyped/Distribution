package typings.reactNativeWindows

import typings.std.Event
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// XMLHttpRequest
//
@js.native
trait ProgressEvent[T /* <: EventTarget */]
  extends StObject
     with Event {
  
  val lengthComputable: Boolean = js.native
  
  val loaded: Double = js.native
  
  @JSName("target")
  val target_ProgressEvent: T | Null = js.native
  
  val total: Double = js.native
}
