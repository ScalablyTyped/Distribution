package typings
package reactDashMdLib.libProgressLinearProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearProgressProps
  extends reactDashMdLib.libProgressMod.BaseProgressProps {
  var progressClassName: js.UndefOr[
    java.lang.String | (js.Function2[/* value */ scala.Double, /* component */ Progress, java.lang.String])
  ] = js.undefined
  var progressStyle: js.UndefOr[
    reactLib.reactMod.ReactNs.CSSProperties | (js.Function2[
      /* value */ scala.Double, 
      /* component */ Progress, 
      reactLib.reactMod.ReactNs.CSSProperties
    ])
  ] = js.undefined
  var query: js.UndefOr[scala.Boolean] = js.undefined
}

