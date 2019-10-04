package typings.atStardustDashUiReactDashComponentDashEventDashListener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsTypesMod {
  import typings.react.reactMod.RefObject
  import typings.std.Node
  import typings.std.Window

  type EventHandler[T /* <: EventTypes */] = js.Function1[
    /* import warning: ImportType.apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any, 
    Unit
  ]
  type TargetRef = RefObject[Node | Window]
}
