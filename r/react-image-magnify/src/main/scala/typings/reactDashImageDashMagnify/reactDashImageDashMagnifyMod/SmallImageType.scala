package typings.reactDashImageDashMagnify.reactDashImageDashMagnifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmallImageType extends CommonImageType {
  var alt: js.UndefOr[String] = js.undefined
  /**
    * Required if isFluidWidth is not set
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Default: false
    */
  var isFluidWidth: Boolean
  /**
    * Required if isFluidWidth is not set
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SmallImageType {
  @scala.inline
  def apply(
    isFluidWidth: Boolean,
    src: String,
    alt: String = null,
    height: Int | Double = null,
    onError: () => Unit = null,
    onLoad: () => Unit = null,
    sizes: String = null,
    srcSet: String = null,
    width: Int | Double = null
  ): SmallImageType = {
    val __obj = js.Dynamic.literal(isFluidWidth = isFluidWidth, src = src)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction0(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmallImageType]
  }
}

