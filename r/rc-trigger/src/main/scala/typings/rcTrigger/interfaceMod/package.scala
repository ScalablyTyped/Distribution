package typings.rcTrigger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type ActionType = java.lang.String
  type AlignPoint = java.lang.String
  type AnimationType = java.lang.String
  type BuildInPlacements = org.scalablytyped.runtime.StringDictionary[typings.rcTrigger.interfaceMod.AlignType]
  type CSSMotionClass = typings.react.mod.ComponentClass[typings.rcTrigger.interfaceMod.MotionProps, typings.react.mod.ComponentState]
  type MotionEventHandler = js.Function2[
    /* element */ typings.std.HTMLElement, 
    /* event */ js.UndefOr[
      typings.react.mod.TransitionEvent[typings.std.HTMLElement] | typings.react.mod.AnimationEvent[typings.std.HTMLElement]
    ], 
    js.UndefOr[
      typings.react.mod.CSSProperties | typings.rcTrigger.rcTriggerBooleans.`false` | scala.Null | scala.Unit
    ]
  ]
  type StretchType = java.lang.String
  type TransitionNameType = java.lang.String
}
