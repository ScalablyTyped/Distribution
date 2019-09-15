package typings.atStorybookComponents.distBlocksTypesetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypesetProps extends js.Object {
  var fontSizes: js.Array[Double]
  var fontWeight: js.UndefOr[Double] = js.undefined
  var sampleText: js.UndefOr[String] = js.undefined
}

object TypesetProps {
  @scala.inline
  def apply(fontSizes: js.Array[Double], fontWeight: Int | Double = null, sampleText: String = null): TypesetProps = {
    val __obj = js.Dynamic.literal(fontSizes = fontSizes)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (sampleText != null) __obj.updateDynamic("sampleText")(sampleText)
    __obj.asInstanceOf[TypesetProps]
  }
}

