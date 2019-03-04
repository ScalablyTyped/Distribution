package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderedModule extends js.Object {
  var originalLength: scala.Double
  var removedExports: js.Array[java.lang.String]
  var renderedExports: js.Array[java.lang.String]
  var renderedLength: scala.Double
}

object RenderedModule {
  @scala.inline
  def apply(
    originalLength: scala.Double,
    removedExports: js.Array[java.lang.String],
    renderedExports: js.Array[java.lang.String],
    renderedLength: scala.Double
  ): RenderedModule = {
    val __obj = js.Dynamic.literal(originalLength = originalLength, removedExports = removedExports, renderedExports = renderedExports, renderedLength = renderedLength)
  
    __obj.asInstanceOf[RenderedModule]
  }
}

