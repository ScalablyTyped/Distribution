package typings.reactDashSketchapp.libComponentsSvgSymbolMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolProps extends js.Object {
  var children: js.Array[ReactNode] | ReactNode
  var id: String
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  var viewBox: js.UndefOr[String] = js.undefined
}

object SymbolProps {
  @scala.inline
  def apply(
    id: String,
    children: js.Array[ReactNode] | ReactNode = null,
    preserveAspectRatio: String = null,
    viewBox: String = null
  ): SymbolProps = {
    val __obj = js.Dynamic.literal(id = id)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[SymbolProps]
  }
}

