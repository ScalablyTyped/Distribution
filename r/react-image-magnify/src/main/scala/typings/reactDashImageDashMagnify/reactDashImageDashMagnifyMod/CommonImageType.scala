package typings.reactDashImageDashMagnify.reactDashImageDashMagnifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonImageType extends js.Object {
  var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var src: String
  var srcSet: js.UndefOr[String] = js.undefined
}

object CommonImageType {
  @scala.inline
  def apply(
    src: String,
    onError: () => Unit = null,
    onLoad: () => Unit = null,
    sizes: String = null,
    srcSet: String = null
  ): CommonImageType = {
    val __obj = js.Dynamic.literal(src = src)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction0(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet)
    __obj.asInstanceOf[CommonImageType]
  }
}

