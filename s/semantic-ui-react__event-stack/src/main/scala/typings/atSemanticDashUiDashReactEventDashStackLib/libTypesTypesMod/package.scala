package typings
package atSemanticDashUiDashReactEventDashStackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesTypesMod {
  type CallableEventListener = stdLib.EventListener with atSemanticDashUiDashReactEventDashStackLib.Anon_Called
  type EventListeners = js.Array[CallableEventListener]
  type GenericMap[T] = stdLib.Map[java.lang.String, T]
  type InputEventListener = stdLib.EventListener | js.Array[stdLib.EventListener]
  type InputTargetElement = scala.Boolean | java.lang.String | TargetElement | reactLib.reactMod.ReactNs.RefObject[TargetElement]
  type TargetElement = stdLib.Document | stdLib.HTMLElement | stdLib.Window
}
