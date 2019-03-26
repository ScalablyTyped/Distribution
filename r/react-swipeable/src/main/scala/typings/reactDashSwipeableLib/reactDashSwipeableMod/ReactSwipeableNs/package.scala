package typings
package reactDashSwipeableLib.reactDashSwipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactSwipeableNs {
  type OnSwipedCallback[T /* <: stdLib.Element */] = js.Function5[
    /* event */ reactLib.reactMod.ReactNs.TouchEvent[T], 
    /* deltaX */ scala.Double, 
    /* deltaY */ scala.Double, 
    /* isFlick */ scala.Boolean, 
    /* velocity */ scala.Double, 
    scala.Unit
  ]
  type OnSwipedDirectionCallback[T /* <: stdLib.Element */] = js.Function3[
    /* event */ reactLib.reactMod.ReactNs.TouchEvent[T], 
    /* delta */ scala.Double, 
    /* isFlick */ scala.Boolean, 
    scala.Unit
  ]
  type OnSwipingCallback[T /* <: stdLib.Element */] = js.Function6[
    /* event */ reactLib.reactMod.ReactNs.TouchEvent[T], 
    /* deltaX */ scala.Double, 
    /* deltaY */ scala.Double, 
    /* absX */ scala.Double, 
    /* absY */ scala.Double, 
    /* velocity */ scala.Double, 
    scala.Unit
  ]
  type OnSwipingDirectionCallback[T /* <: stdLib.Element */] = js.Function2[
    /* event */ reactLib.reactMod.ReactNs.TouchEvent[T], 
    /* delta */ scala.Double, 
    scala.Unit
  ]
  type OnTapCallback[T /* <: stdLib.Element */] = js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[T], scala.Unit]
}
