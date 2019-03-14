package typings
package reactDashLatexDashNextLib.distLatexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatexProps extends js.Object {
  var children: java.lang.String
  var delimiters: js.UndefOr[js.Array[reactDashLatexDashNextLib.distTypesMod.Delimiter]] = js.undefined
}

object LatexProps {
  @scala.inline
  def apply(
    children: java.lang.String,
    delimiters: js.Array[reactDashLatexDashNextLib.distTypesMod.Delimiter] = null
  ): LatexProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters)
    __obj.asInstanceOf[LatexProps]
  }
}

