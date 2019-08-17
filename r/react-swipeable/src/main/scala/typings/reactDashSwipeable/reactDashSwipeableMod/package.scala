package typings.reactDashSwipeable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSwipeableMod {
  import typings.react.reactMod.TouchEvent
  import typings.std.Element

  type OnSwipedCallback[T /* <: Element */] = js.Function5[
    /* event */ TouchEvent[T], 
    /* deltaX */ Double, 
    /* deltaY */ Double, 
    /* isFlick */ Boolean, 
    /* velocity */ Double, 
    Unit
  ]
  type OnSwipedDirectionCallback[T /* <: Element */] = js.Function3[/* event */ TouchEvent[T], /* delta */ Double, /* isFlick */ Boolean, Unit]
  type OnSwipingCallback[T /* <: Element */] = js.Function6[
    /* event */ TouchEvent[T], 
    /* deltaX */ Double, 
    /* deltaY */ Double, 
    /* absX */ Double, 
    /* absY */ Double, 
    /* velocity */ Double, 
    Unit
  ]
  type OnSwipingDirectionCallback[T /* <: Element */] = js.Function2[/* event */ TouchEvent[T], /* delta */ Double, Unit]
  type OnTapCallback[T /* <: Element */] = js.Function1[/* event */ TouchEvent[T], Unit]
}
