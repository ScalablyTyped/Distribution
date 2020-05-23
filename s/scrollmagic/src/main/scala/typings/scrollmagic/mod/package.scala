package typings.scrollmagic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ElementOrSelector = typings.std.Element | java.lang.String
  type EnterEvent = typings.scrollmagic.mod.SceneProgressEvent[typings.scrollmagic.scrollmagicStrings.enter]
  type LeaveEvent = typings.scrollmagic.mod.SceneProgressEvent[typings.scrollmagic.scrollmagicStrings.leave]
  type ProgressEvent = typings.scrollmagic.mod.SceneProgressEvent[typings.scrollmagic.scrollmagicStrings.progress]
  type RemoveEvent = typings.scrollmagic.mod.Event[typings.scrollmagic.scrollmagicStrings.remove]
  type ScrollTarget = js.Function2[
    /* newScrollPos */ scala.Double, 
    /* repeated */ js.Any, 
    scala.Unit | scala.Double | typings.scrollmagic.mod.ElementOrSelector | js.Object
  ]
  type StartEvent = typings.scrollmagic.mod.SceneProgressEvent[typings.scrollmagic.scrollmagicStrings.start]
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.scrollmagic.scrollmagicStrings.onEnter
    - typings.scrollmagic.scrollmagicStrings.onCenter
    - typings.scrollmagic.scrollmagicStrings.onLeave
  */
  type TriggerHook = typings.scrollmagic.mod._TriggerHook | scala.Double
}
