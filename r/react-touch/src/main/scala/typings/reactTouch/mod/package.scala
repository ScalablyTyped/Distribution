package typings.reactTouch.mod

import typings.react.mod.global.JSX.Element
import typings.reactTouch.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def defineHold(): HoldableConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("defineHold")().asInstanceOf[HoldableConfig]
inline def defineHold(config: HoldConfig): HoldableConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("defineHold")(config.asInstanceOf[js.Any]).asInstanceOf[HoldableConfig]

inline def defineSwipe(): SwipeableConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("defineSwipe")().asInstanceOf[SwipeableConfig]
inline def defineSwipe(config: SwipeConfig): SwipeableConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("defineSwipe")(config.asInstanceOf[js.Any]).asInstanceOf[SwipeableConfig]

type DraggableCallback = js.Function1[/* argument */ DraggableCallbackArgument, Element]
