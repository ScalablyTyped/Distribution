package typings.reactLatexNext.anon

import typings.reactLatexNext.typesMod.Delimiter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-latex-next.react-latex-next/dist/Latex.LatexProps> */
trait PartialLatexProps extends js.Object {
  var children: js.UndefOr[String] = js.undefined
  var delimiters: js.UndefOr[js.Array[Delimiter]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object PartialLatexProps {
  @scala.inline
  def apply(
    children: String = null,
    delimiters: js.Array[Delimiter] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): PartialLatexProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLatexProps]
  }
}

