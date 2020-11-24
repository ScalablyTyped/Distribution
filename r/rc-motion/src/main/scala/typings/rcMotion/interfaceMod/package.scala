package typings.rcMotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interfaceMod {
  
  type MotionEndEventHandler = js.Function2[
    /* element */ typings.std.HTMLElement, 
    /* event */ typings.rcMotion.interfaceMod.MotionEvent, 
    scala.Boolean | scala.Unit
  ]
  
  type MotionEvent = (typings.std.TransitionEvent | typings.std.AnimationEvent) with typings.rcMotion.anon.Deadline
  
  type MotionEventHandler = js.Function2[
    /* element */ typings.std.HTMLElement, 
    /* event */ typings.rcMotion.interfaceMod.MotionEvent, 
    typings.react.mod.CSSProperties | scala.Unit
  ]
  
  type MotionPrepareEventHandler = js.Function1[/* element */ typings.std.HTMLElement, js.Promise[js.Any] | scala.Unit]
}
