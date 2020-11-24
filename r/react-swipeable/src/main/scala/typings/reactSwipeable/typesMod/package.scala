package typings.reactSwipeable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AttachTouch = js.Function2[
    /* el */ typings.std.HTMLElement, 
    /* passive */ scala.Boolean, 
    js.Function0[scala.Unit]
  ]
  
  type HandledEvents = (typings.react.mod.MouseEvent[typings.std.Element, typings.react.mod.NativeMouseEvent]) | typings.std.TouchEvent | typings.std.MouseEvent
  
  type Setter = js.Function1[/* stateSetter */ typings.reactSwipeable.typesMod.StateSetter, scala.Unit]
  
  type StateSetter = js.Function2[
    /* state */ typings.reactSwipeable.typesMod.SwipeableState, 
    /* props */ typings.reactSwipeable.typesMod.SwipeablePropsWithDefaultOptions, 
    typings.reactSwipeable.typesMod.SwipeableState
  ]
  
  type SwipeCallback = js.Function1[/* eventData */ typings.reactSwipeable.typesMod.SwipeEventData, scala.Unit]
  
  type SwipeDirections = /* "Left" */ java.lang.String
  
  type TapCallback = js.Function1[/* hasEvent */ typings.reactSwipeable.anon.Event, scala.Unit]
  
  type Vector2 = js.Tuple2[scala.Double, scala.Double]
}
