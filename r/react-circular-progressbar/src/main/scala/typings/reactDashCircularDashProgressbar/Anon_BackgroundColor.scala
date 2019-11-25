package typings.reactDashCircularDashProgressbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var pathColor: js.UndefOr[String] = js.undefined
  var pathTransition: js.UndefOr[String] = js.undefined
  var pathTransitionDuration: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var strokeLinecap: js.UndefOr[js.Any] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
  var textSize: js.UndefOr[String | Double] = js.undefined
  var trailColor: js.UndefOr[String] = js.undefined
}

object Anon_BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    pathColor: String = null,
    pathTransition: String = null,
    pathTransitionDuration: Int | Double = null,
    rotation: Int | Double = null,
    strokeLinecap: js.Any = null,
    textColor: String = null,
    textSize: String | Double = null,
    trailColor: String = null
  ): Anon_BackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (pathColor != null) __obj.updateDynamic("pathColor")(pathColor.asInstanceOf[js.Any])
    if (pathTransition != null) __obj.updateDynamic("pathTransition")(pathTransition.asInstanceOf[js.Any])
    if (pathTransitionDuration != null) __obj.updateDynamic("pathTransitionDuration")(pathTransitionDuration.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    if (trailColor != null) __obj.updateDynamic("trailColor")(trailColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundColor]
  }
}

