package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.always
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.never
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
    * Fades out the edges of the the scroll content.
    *
    * If the value is greater than 0, the fading edges will be set accordingly
    * to the current scroll direction and position,
    * indicating if there is more content to show.
    *
    * The default value is 0.
    * @platform android
    */
  var fadingEdgeLength: js.UndefOr[Double] = js.undefined
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
    fadingEdgeLength: Int | Double = null,
    nestedScrollEnabled: js.UndefOr[Boolean] = js.undefined,
    overScrollMode: auto | always | never = null,
    scrollPerfTag: String = null
  ): ScrollViewPropsAndroid = {
    val __obj = js.Dynamic.literal()
    if (endFillColor != null) __obj.updateDynamic("endFillColor")(endFillColor.asInstanceOf[js.Any])
    if (fadingEdgeLength != null) __obj.updateDynamic("fadingEdgeLength")(fadingEdgeLength.asInstanceOf[js.Any])
    if (!js.isUndefined(nestedScrollEnabled)) __obj.updateDynamic("nestedScrollEnabled")(nestedScrollEnabled.asInstanceOf[js.Any])
    if (overScrollMode != null) __obj.updateDynamic("overScrollMode")(overScrollMode.asInstanceOf[js.Any])
    if (scrollPerfTag != null) __obj.updateDynamic("scrollPerfTag")(scrollPerfTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewPropsAndroid]
  }
}

