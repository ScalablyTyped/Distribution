package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderedModule extends js.Object {
  var originalLength: Double
  var removedExports: js.Array[String]
  var renderedExports: js.Array[String]
  var renderedLength: Double
}

object RenderedModule {
  @scala.inline
  def apply(
    originalLength: Double,
    removedExports: js.Array[String],
    renderedExports: js.Array[String],
    renderedLength: Double
  ): RenderedModule = {
    val __obj = js.Dynamic.literal(originalLength = originalLength.asInstanceOf[js.Any], removedExports = removedExports.asInstanceOf[js.Any], renderedExports = renderedExports.asInstanceOf[js.Any], renderedLength = renderedLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedModule]
  }
}

