package typings.reactLatexNext

import typings.reactLatexNext.typesMod.Delimiter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-latex-next.react-latex-next/dist/Latex.LatexProps> */
trait PartialLatexProps extends js.Object {
  var children: js.UndefOr[String] = js.undefined
  var delimiters: js.UndefOr[js.Array[Delimiter]] = js.undefined
}

object PartialLatexProps {
  @scala.inline
  def apply(children: String = null, delimiters: js.Array[Delimiter] = null): PartialLatexProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLatexProps]
  }
}

