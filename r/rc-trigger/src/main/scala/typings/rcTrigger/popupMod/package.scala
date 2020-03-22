package typings.rcTrigger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object popupMod {
  /**
    * Popup should follow the steps for each component work correctly:
    * measure - check for the current stretch size
    * align - let component align the position
    * aligned - re-align again in case additional className changed the size
    * afterAlign - choice next step is trigger motion or finished
    * beforeMotion - should reset motion to invisible so that CSSMotion can do normal motion
    * motion - play the motion
    * stable - everything is done
    */
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typings.rcTrigger.rcTriggerStrings.measure
    - typings.rcTrigger.rcTriggerStrings.align
    - typings.rcTrigger.rcTriggerStrings.aligned
    - typings.rcTrigger.rcTriggerStrings.afterAlign
    - typings.rcTrigger.rcTriggerStrings.beforeMotion
    - typings.rcTrigger.rcTriggerStrings.motion
    - typings.rcTrigger.rcTriggerStrings.AfterMotion
    - typings.rcTrigger.rcTriggerStrings.stable
  */
  type PopupStatus = typings.rcTrigger.popupMod._PopupStatus | scala.Null
}
