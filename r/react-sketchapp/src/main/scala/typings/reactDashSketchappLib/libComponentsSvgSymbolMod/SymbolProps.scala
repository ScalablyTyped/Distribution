package typings
package reactDashSketchappLib.libComponentsSvgSymbolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolProps extends js.Object {
  var children: js.Array[reactLib.reactMod.ReactNs.ReactChild] | reactLib.reactMod.ReactNs.ReactChild
  var id: java.lang.String
  var preserveAspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var viewBox: js.UndefOr[java.lang.String] = js.undefined
}

object SymbolProps {
  @scala.inline
  def apply(
    children: js.Array[reactLib.reactMod.ReactNs.ReactChild] | reactLib.reactMod.ReactNs.ReactChild,
    id: java.lang.String,
    preserveAspectRatio: java.lang.String = null,
    viewBox: java.lang.String = null
  ): SymbolProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id)
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[SymbolProps]
  }
}

