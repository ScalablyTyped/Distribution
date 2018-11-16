package typings
package reactDashTooltipLib.reactDashTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactTooltipNs {
  type Effect = reactDashTooltipLib.reactDashTooltipLibStrings.float | reactDashTooltipLib.reactDashTooltipLibStrings.solid
  /**
       * Adding `| string` seems strange but multiple events joined by a space are allowable, i.e. "click focus", so
       * at least using *EventMap will give developers some type hinting, but there's no way we can reliably
       * type this.
       */
  type ElementEvents = java.lang.String
  type GetContent = GetContentCallback | (js.Tuple2[GetContentCallback, scala.Double])
  type GetContentCallback = js.Function1[/* dataTip */ java.lang.String, reactLib.reactMod.ReactNs.ReactNode]
  type Place = reactDashTooltipLib.reactDashTooltipLibStrings.top | reactDashTooltipLib.reactDashTooltipLibStrings.right | reactDashTooltipLib.reactDashTooltipLibStrings.bottom | reactDashTooltipLib.reactDashTooltipLibStrings.left
  type Type = reactDashTooltipLib.reactDashTooltipLibStrings.dark | reactDashTooltipLib.reactDashTooltipLibStrings.success | reactDashTooltipLib.reactDashTooltipLibStrings.warning | reactDashTooltipLib.reactDashTooltipLibStrings.error | reactDashTooltipLib.reactDashTooltipLibStrings.info | reactDashTooltipLib.reactDashTooltipLibStrings.light
  type WindowEvents = /* LimitUnionLength: was union type with length 97 */js.Any
}
