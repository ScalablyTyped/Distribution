package typings
package reactDashFlexLib.reactDashFlexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemProps
  extends reactLib.reactMod.ReactNs.Props[Flex]
     with CommonFlexProps {
  /**
    * A value for the flex-basis css property. Valid values are: `0` (and `'none'`, which is the same),
    * `'auto'`, `'content'`, `'fit-content'`, `'min-content'`, `'max-content'`, `'fit'`.
    */
  var flexBasis: js.UndefOr[
    scala.Double | reactDashFlexLib.reactDashFlexLibStrings.none | reactDashFlexLib.reactDashFlexLibStrings.auto | reactDashFlexLib.reactDashFlexLibStrings.content | reactDashFlexLib.reactDashFlexLibStrings.`fit-content` | reactDashFlexLib.reactDashFlexLibStrings.`min-content` | reactDashFlexLib.reactDashFlexLibStrings.`max-content` | reactDashFlexLib.reactDashFlexLibStrings.fit
  ] = js.undefined
  /**
    * A number/string from 0 to 24 for `flex-grow`. Most of the times, using `flex` is just enough.
    */
  var flexGrow: js.UndefOr[scala.Double | java.lang.String | scala.Boolean] = js.undefined
  /**
    * A value for the `flex-shrink` css property. From `0` to `24`.
    */
  var flexShrink: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

