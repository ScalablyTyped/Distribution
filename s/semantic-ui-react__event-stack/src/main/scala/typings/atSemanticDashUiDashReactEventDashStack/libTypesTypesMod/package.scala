package typings.atSemanticDashUiDashReactEventDashStack

import typings.atSemanticDashUiDashReactEventDashStack.Anon_Called
import typings.react.reactMod.RefObject
import typings.std.Document
import typings.std.EventListener
import typings.std.HTMLElement
import typings.std.Map
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesTypesMod {
  type CallableEventListener = EventListener with Anon_Called
  type EventListeners = js.Array[CallableEventListener]
  type GenericMap[T] = Map[String, T]
  type InputEventListener = EventListener | js.Array[EventListener]
  type InputTargetElement = Boolean | String | TargetElement | RefObject[TargetElement]
  type TargetElement = Document | HTMLElement | Window
}
