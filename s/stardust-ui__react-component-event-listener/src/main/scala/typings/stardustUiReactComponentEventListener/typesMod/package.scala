package typings.stardustUiReactComponentEventListener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type EventHandler[T /* <: typings.stardustUiReactComponentEventListener.typesMod.EventTypes */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any, 
    scala.Unit
  ]
  type TargetRef = typings.react.mod.RefObject[typings.std.Node | typings.std.Window]
}
