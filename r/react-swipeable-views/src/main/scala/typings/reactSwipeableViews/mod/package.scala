package typings.reactSwipeableViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type OnChangeIndexCallback = js.Function2[/* index */ scala.Double, /* indexLatest */ scala.Double, scala.Unit]
  
  type OnSwitchingCallback = js.Function2[
    /* index */ scala.Double, 
    /* type */ typings.reactSwipeableViews.mod.OnSwitchingCallbackTypeDescriptor, 
    scala.Unit
  ]
  
  type OnTransitionEndCallback = js.Function0[scala.Unit]
  
  type SwipeableViews = typings.react.mod.Component[
    typings.reactSwipeableViews.mod.SwipeableViewsProps, 
    typings.reactSwipeableViews.mod.SwipeableViewsState, 
    js.Any
  ]
}
