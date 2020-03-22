package typings.storybookComponents.typesetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypesetProps extends js.Object {
  var fontFamily: js.UndefOr[String] = js.native
  var fontSizes: js.Array[String] = js.native
  var fontWeight: js.UndefOr[Double] = js.native
  var sampleText: js.UndefOr[String] = js.native
}

object TypesetProps {
  @scala.inline
  def apply(
    fontSizes: js.Array[String],
    fontFamily: String = null,
    fontWeight: Int | Double = null,
    sampleText: String = null
  ): TypesetProps = {
    val __obj = js.Dynamic.literal(fontSizes = fontSizes.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (sampleText != null) __obj.updateDynamic("sampleText")(sampleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypesetProps]
  }
}

