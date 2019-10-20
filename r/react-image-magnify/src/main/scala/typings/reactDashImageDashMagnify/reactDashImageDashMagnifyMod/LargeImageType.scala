package typings.reactDashImageDashMagnify.reactDashImageDashMagnifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LargeImageType extends CommonImageType {
  /**
    * Defaults to empty string
    */
  var alt: js.UndefOr[String] = js.undefined
  var height: Double
  var width: Double
}

object LargeImageType {
  @scala.inline
  def apply(
    height: Double,
    src: String,
    width: Double,
    alt: String = null,
    onError: () => Unit = null,
    onLoad: () => Unit = null,
    sizes: String = null,
    srcSet: String = null
  ): LargeImageType = {
    val __obj = js.Dynamic.literal(height = height, src = src, width = width)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction0(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet)
    __obj.asInstanceOf[LargeImageType]
  }
}

