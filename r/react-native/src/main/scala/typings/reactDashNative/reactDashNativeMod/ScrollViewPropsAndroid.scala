package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.always
import typings.reactDashNative.reactDashNativeStrings.auto
import typings.reactDashNative.reactDashNativeStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollViewPropsAndroid extends js.Object {
  /**
    * Sometimes a scrollview takes up more space than its content fills.
    * When this is the case, this prop will fill the rest of the
    * scrollview with a color to avoid setting a background and creating
    * unnecessary overdraw. This is an advanced optimization that is not
    * needed in the general case.
    */
  var endFillColor: js.UndefOr[String] = js.undefined
  /**
    * Enables nested scrolling for Android API level 21+. Nested scrolling is supported by default on iOS.
    */
  var nestedScrollEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to override default value of overScroll mode.
    * Possible values:
    *   - 'auto' - Default value, allow a user to over-scroll this view only if the content is large enough to meaningfully scroll.
    *   - 'always' - Always allow a user to over-scroll this view.
    *   - 'never' - Never allow a user to over-scroll this view.
    */
  var overScrollMode: js.UndefOr[auto | always | never] = js.undefined
  /**
    * Tag used to log scroll performance on this scroll view. Will force
    * momentum events to be turned on (see sendMomentumEvents). This doesn't do
    * anything out of the box and you need to implement a custom native
    * FpsListener for it to be useful.
    * @platform android
    */
  var scrollPerfTag: js.UndefOr[String] = js.undefined
}

object ScrollViewPropsAndroid {
  @scala.inline
  def apply(
    endFillColor: String = null,
    nestedScrollEnabled: js.UndefOr[Boolean] = js.undefined,
    overScrollMode: auto | always | never = null,
    scrollPerfTag: String = null
  ): ScrollViewPropsAndroid = {
    val __obj = js.Dynamic.literal()
    if (endFillColor != null) __obj.updateDynamic("endFillColor")(endFillColor)
    if (!js.isUndefined(nestedScrollEnabled)) __obj.updateDynamic("nestedScrollEnabled")(nestedScrollEnabled)
    if (overScrollMode != null) __obj.updateDynamic("overScrollMode")(overScrollMode.asInstanceOf[js.Any])
    if (scrollPerfTag != null) __obj.updateDynamic("scrollPerfTag")(scrollPerfTag)
    __obj.asInstanceOf[ScrollViewPropsAndroid]
  }
}

