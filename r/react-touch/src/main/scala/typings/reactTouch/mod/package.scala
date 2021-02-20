package typings.reactTouch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DraggableCallback = js.Function1[
    /* argument */ typings.reactTouch.mod.DraggableCallbackArgument, 
    typings.react.mod.global.JSX.Element
  ]
  
  @scala.inline
  def defineHold(): typings.reactTouch.mod.HoldableConfig = typings.reactTouch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineHold")().asInstanceOf[typings.reactTouch.mod.HoldableConfig]
  @scala.inline
  def defineHold(config: typings.reactTouch.mod.HoldConfig): typings.reactTouch.mod.HoldableConfig = typings.reactTouch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineHold")(config.asInstanceOf[js.Any]).asInstanceOf[typings.reactTouch.mod.HoldableConfig]
  
  @scala.inline
  def defineSwipe(): typings.reactTouch.mod.SwipeableConfig = typings.reactTouch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineSwipe")().asInstanceOf[typings.reactTouch.mod.SwipeableConfig]
  @scala.inline
  def defineSwipe(config: typings.reactTouch.mod.SwipeConfig): typings.reactTouch.mod.SwipeableConfig = typings.reactTouch.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineSwipe")(config.asInstanceOf[js.Any]).asInstanceOf[typings.reactTouch.mod.SwipeableConfig]
}
