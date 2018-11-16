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
      reactLib.reactMod.ReactNs.ReactNode | java.lang.String
    ]
  ] = js.undefined
  /** render method for the half-star icon */
  var renderStarIconHalf: js.UndefOr[
    js.Function3[
      /* nextValue */ scala.Double, 
      /* prevValue */ scala.Double, 
      /* name */ java.lang.String, 
      reactLib.reactMod.ReactNs.ReactNode | java.lang.String
    ]
  ] = js.undefined
  /** color of selected icons */
  var starColor: js.UndefOr[java.lang.String] = js.undefined
  /** number of icons in rating, default `5` */
  var starCount: js.UndefOr[scala.Double] = js.undefined
  /** the value of the star rating to display. i.e. the number of filled stars */
  var value: scala.Double
}

