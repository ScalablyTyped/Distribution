package typings.reactDashMovable

import typings.react.Element
import typings.react.NativeMouseEvent
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  type TEvent = (MouseEvent[Element, NativeMouseEvent]) | TouchEvent[Element] | KeyboardEvent[Element]
}
