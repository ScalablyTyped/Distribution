package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcSelectMod {
  import typings.react.NativeMouseEvent
  import typings.react.reactMod.MouseEvent
  import typings.react.reactMod.Ref
  import typings.react.reactMod.TouchEvent
  import typings.std.HTMLElement

  type ElRef = Ref[js.Any]
  type MouseOrTouchEvent = (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement]
  type SelectComponentsProps = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in string ]: any}
    */ typings.reactDashSelect.reactDashSelectStrings.SelectComponentsProps with js.Any
}
