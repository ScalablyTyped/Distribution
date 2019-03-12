package typings
package reactDashSortableDashHocLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSortableDashHocMod {
  type ContainerGetter = js.Function1[/* element */ reactLib.reactMod.ReactNs.ReactElement[js.Any], stdLib.HTMLElement]
  type Offset = scala.Double | java.lang.String
  type SortEndHandler = js.Function2[/* sort */ SortEnd, /* event */ SortEvent, scala.Unit]
  type SortEvent = (reactLib.reactMod.ReactNs.MouseEvent[js.Any, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.TouchEvent[js.Any]
  type SortEventWithTag = SortEvent with reactDashSortableDashHocLib.Anon_Target
  type SortMoveHandler = js.Function1[/* event */ SortEvent, scala.Unit]
  type SortStartHandler = js.Function2[/* sort */ SortStart, /* event */ SortEvent, scala.Unit]
  type WrappedComponent[P] = (reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState]) | WrappedComponentFactory[P]
  type WrappedComponentFactory[P] = js.Function1[/* props */ P, reactLib.reactMod.Global.JSXNs.Element]
}
