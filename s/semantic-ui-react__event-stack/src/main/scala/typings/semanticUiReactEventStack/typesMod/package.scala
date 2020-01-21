package typings.semanticUiReactEventStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type CallableEventListener = typings.std.EventListener with typings.semanticUiReactEventStack.AnonCalled
  type EventListeners = js.Array[typings.semanticUiReactEventStack.typesMod.CallableEventListener]
  type GenericMap[T] = typings.std.Map[java.lang.String, T]
  type InputEventListener = typings.std.EventListener | js.Array[typings.std.EventListener]
  type InputTargetElement = scala.Boolean | java.lang.String | typings.semanticUiReactEventStack.typesMod.TargetElement | typings.react.mod.RefObject[typings.semanticUiReactEventStack.typesMod.TargetElement]
  type TargetElement = typings.std.Document_ | typings.std.HTMLElement | typings.std.Window_
}
