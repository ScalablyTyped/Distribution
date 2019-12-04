package typings.reactDashMovable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import typings.react.reactMod.KeyboardEvent
  import typings.react.reactMod.MouseEvent
  import typings.react.reactMod.NativeMouseEvent
  import typings.react.reactMod.TouchEvent
  import typings.std.Element

  type TEvent = (MouseEvent[Element, NativeMouseEvent]) | TouchEvent[Element] | KeyboardEvent[Element]
}
