package typings
package semanticDashUiDashReactLib.distCommonjsModulesRatingRatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictRatingProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * You can clear the rating by clicking on the current start rating.
    * By default a rating will be only clearable if there is 1 icon.
    * Setting to `true`/`false` will allow or disallow a user to clear their rating.
    */
  var clearable: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.auto
  ] = js.undefined
  /** The initial rating value. */
  var defaultRating: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** You can disable or enable interactive rating.  Makes a read-only rating. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** A rating can use a set of star or heart icons. */
  var icon: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.star | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.heart
  ] = js.undefined
  /** The total number of icons. */
  var maxRating: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Called after user selects a new rating.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and proposed rating.
    */
  var onRate: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      /* data */ RatingProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** The current number of active icons. */
  var rating: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** A progress bar can vary in size. */
  var size: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.mini | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.tiny | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.huge | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.massive
  ] = js.undefined
}

object StrictRatingProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    className: java.lang.String = null,
    clearable: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.auto = null,
    defaultRating: scala.Double | java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    icon: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.star | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.heart = null,
    maxRating: scala.Double | java.lang.String = null,
    onRate: (/* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], /* data */ RatingProps) => scala.Unit = null,
    rating: scala.Double | java.lang.String = null,
    size: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.mini | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.tiny | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.huge | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.massive = null
  ): StrictRatingProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (className != null) __obj.updateDynamic("className")(className)
    if (clearable != null) __obj.updateDynamic("clearable")(clearable.asInstanceOf[js.Any])
    if (defaultRating != null) __obj.updateDynamic("defaultRating")(defaultRating.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (maxRating != null) __obj.updateDynamic("maxRating")(maxRating.asInstanceOf[js.Any])
    if (onRate != null) __obj.updateDynamic("onRate")(js.Any.fromFunction2(onRate))
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictRatingProps]
  }
}

