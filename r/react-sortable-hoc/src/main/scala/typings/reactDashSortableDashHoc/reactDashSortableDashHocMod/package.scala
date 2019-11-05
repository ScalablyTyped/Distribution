package typings.reactDashSortableDashHoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSortableDashHocMod {
  import typings.react.NativeMouseEvent
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.MouseEvent
  import typings.react.reactMod.ReactElement
  import typings.react.reactMod.SFC
  import typings.react.reactMod.TouchEvent
  import typings.react.reactMod._Global_.JSX.Element
  import typings.reactDashSortableDashHoc.Anon_Target
  import typings.std.HTMLElement

  type ContainerGetter = js.Function1[/* element */ ReactElement, HTMLElement | js.Promise[HTMLElement]]
  type HelperContainerGetter = js.Function0[HTMLElement]
  type Offset = Double | String
  type SortEndHandler = js.Function2[/* sort */ SortEnd, /* event */ SortEvent, Unit]
  type SortEvent = (MouseEvent[js.Any, NativeMouseEvent]) | TouchEvent[js.Any]
  type SortEventWithTag = SortEvent with Anon_Target
  type SortMoveHandler = js.Function1[/* event */ SortEvent, Unit]
  type SortOverHandler = js.Function2[/* sort */ SortOver, /* event */ SortEvent, Unit]
  type SortStartHandler = js.Function2[/* sort */ SortStart, /* event */ SortEvent, Unit]
  type WrappedComponent[P] = (ComponentClass[P, ComponentState]) | SFC[P] | WrappedComponentFactory[P]
  type WrappedComponentFactory[P] = js.Function1[/* props */ P, Element]
}
