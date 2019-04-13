package typings
package reactDashStarDashRatingDashComponentLib.reactDashStarDashRatingDashComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarRatingComponentProps extends js.Object {
  /** is component available for editing, default `true` */
  var editing: js.UndefOr[scala.Boolean] = js.undefined
  /** color of non-selected icons */
  var emptyStarColor: js.UndefOr[java.lang.String] = js.undefined
  /** name of the radio input */
  var name: java.lang.String
  var onStarClick: js.UndefOr[
    js.Function3[
      /* nextValue */ scala.Double, 
      /* prevValue */ scala.Double, 
      /* name */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var onStarHover: js.UndefOr[
    js.Function3[
      /* nextValue */ scala.Double, 
      /* prevValue */ scala.Double, 
      /* name */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var onStarHoverOut: js.UndefOr[
    js.Function3[
      /* nextValue */ scala.Double, 
      /* prevValue */ scala.Double, 
      /* name */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  /** render method for the full-star icon */
  var renderStarIcon: js.UndefOr[
    js.Function3[
      /* nextValue */ scala.Double, 
      /* prevValue */ scala.Double, 
      /* name */ java.lang.String, 
      reactLib.reactMod.ReactNode | java.lang.String
    ]
  ] = js.undefined
  /** render method for the half-star icon */
  var renderStarIconHalf: js.UndefOr[
    js.Function3[
      /* nextValue */ scala.Double, 
      /* prevValue */ scala.Double, 
      /* name */ java.lang.String, 
      reactLib.reactMod.ReactNode | java.lang.String
    ]
  ] = js.undefined
  /** color of selected icons */
  var starColor: js.UndefOr[java.lang.String] = js.undefined
  /** number of icons in rating, default `5` */
  var starCount: js.UndefOr[scala.Double] = js.undefined
  /** the value of the star rating to display. i.e. the number of filled stars */
  var value: scala.Double
}

object StarRatingComponentProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    value: scala.Double,
    editing: js.UndefOr[scala.Boolean] = js.undefined,
    emptyStarColor: java.lang.String = null,
    onStarClick: (/* nextValue */ scala.Double, /* prevValue */ scala.Double, /* name */ java.lang.String) => scala.Unit = null,
    onStarHover: (/* nextValue */ scala.Double, /* prevValue */ scala.Double, /* name */ java.lang.String) => scala.Unit = null,
    onStarHoverOut: (/* nextValue */ scala.Double, /* prevValue */ scala.Double, /* name */ java.lang.String) => scala.Unit = null,
    renderStarIcon: (/* nextValue */ scala.Double, /* prevValue */ scala.Double, /* name */ java.lang.String) => reactLib.reactMod.ReactNode | java.lang.String = null,
    renderStarIconHalf: (/* nextValue */ scala.Double, /* prevValue */ scala.Double, /* name */ java.lang.String) => reactLib.reactMod.ReactNode | java.lang.String = null,
    starColor: java.lang.String = null,
    starCount: scala.Int | scala.Double = null
  ): StarRatingComponentProps = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing)
    if (emptyStarColor != null) __obj.updateDynamic("emptyStarColor")(emptyStarColor)
    if (onStarClick != null) __obj.updateDynamic("onStarClick")(js.Any.fromFunction3(onStarClick))
    if (onStarHover != null) __obj.updateDynamic("onStarHover")(js.Any.fromFunction3(onStarHover))
    if (onStarHoverOut != null) __obj.updateDynamic("onStarHoverOut")(js.Any.fromFunction3(onStarHoverOut))
    if (renderStarIcon != null) __obj.updateDynamic("renderStarIcon")(js.Any.fromFunction3(renderStarIcon))
    if (renderStarIconHalf != null) __obj.updateDynamic("renderStarIconHalf")(js.Any.fromFunction3(renderStarIconHalf))
    if (starColor != null) __obj.updateDynamic("starColor")(starColor)
    if (starCount != null) __obj.updateDynamic("starCount")(starCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarRatingComponentProps]
  }
}

