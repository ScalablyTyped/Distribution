package typings
package ratyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryRatyOptions extends js.Object {
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  var cancelClass: js.UndefOr[java.lang.String] = js.undefined
  var cancelHint: js.UndefOr[java.lang.String] = js.undefined
  var cancelOff: js.UndefOr[java.lang.String] = js.undefined
  var cancelOn: js.UndefOr[java.lang.String] = js.undefined
  var cancelPlace: js.UndefOr[java.lang.String] = js.undefined
  var click: js.UndefOr[
    js.Function2[/* score */ scala.Double, /* event */ jqueryLib.JQueryEventObject, scala.Unit]
  ] = js.undefined
  var half: js.UndefOr[scala.Boolean] = js.undefined
  var halfShow: js.UndefOr[scala.Boolean] = js.undefined
  var hints: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var iconRange: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  var mouseout: js.UndefOr[
    js.Function2[/* score */ scala.Double, /* event */ jqueryLib.JQueryEventObject, scala.Unit]
  ] = js.undefined
  var mouseover: js.UndefOr[
    js.Function2[/* score */ scala.Double, /* event */ jqueryLib.JQueryEventObject, scala.Unit]
  ] = js.undefined
  var noRatedMsg: js.UndefOr[java.lang.String] = js.undefined
  var number: js.UndefOr[scala.Double] = js.undefined
  var numberMax: js.UndefOr[scala.Double] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var precision: js.UndefOr[scala.Boolean] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var round: js.UndefOr[JQueryRatyRoundingOptions] = js.undefined
  var score: js.UndefOr[scala.Double] = js.undefined
  var scoreName: js.UndefOr[java.lang.String] = js.undefined
  var single: js.UndefOr[scala.Boolean] = js.undefined
  var space: js.UndefOr[scala.Boolean] = js.undefined
  var starHalf: js.UndefOr[java.lang.String] = js.undefined
  var starOff: js.UndefOr[java.lang.String] = js.undefined
  var starOn: js.UndefOr[java.lang.String] = js.undefined
  var starType: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var targetFormat: js.UndefOr[java.lang.String] = js.undefined
  var targetKeep: js.UndefOr[scala.Boolean] = js.undefined
  var targetScore: js.UndefOr[java.lang.String] = js.undefined
  var targetText: js.UndefOr[java.lang.String] = js.undefined
  var targetType: js.UndefOr[java.lang.String] = js.undefined
}

object JQueryRatyOptions {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cancelClass: java.lang.String = null,
    cancelHint: java.lang.String = null,
    cancelOff: java.lang.String = null,
    cancelOn: java.lang.String = null,
    cancelPlace: java.lang.String = null,
    click: (/* score */ scala.Double, /* event */ jqueryLib.JQueryEventObject) => scala.Unit = null,
    half: js.UndefOr[scala.Boolean] = js.undefined,
    halfShow: js.UndefOr[scala.Boolean] = js.undefined,
    hints: js.Array[java.lang.String] = null,
    iconRange: js.Array[js.Array[_]] = null,
    mouseout: (/* score */ scala.Double, /* event */ jqueryLib.JQueryEventObject) => scala.Unit = null,
    mouseover: (/* score */ scala.Double, /* event */ jqueryLib.JQueryEventObject) => scala.Unit = null,
    noRatedMsg: java.lang.String = null,
    number: scala.Int | scala.Double = null,
    numberMax: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    precision: js.UndefOr[scala.Boolean] = js.undefined,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    round: JQueryRatyRoundingOptions = null,
    score: scala.Int | scala.Double = null,
    scoreName: java.lang.String = null,
    single: js.UndefOr[scala.Boolean] = js.undefined,
    space: js.UndefOr[scala.Boolean] = js.undefined,
    starHalf: java.lang.String = null,
    starOff: java.lang.String = null,
    starOn: java.lang.String = null,
    starType: java.lang.String = null,
    target: java.lang.String = null,
    targetFormat: java.lang.String = null,
    targetKeep: js.UndefOr[scala.Boolean] = js.undefined,
    targetScore: java.lang.String = null,
    targetText: java.lang.String = null,
    targetType: java.lang.String = null
  ): JQueryRatyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cancelClass != null) __obj.updateDynamic("cancelClass")(cancelClass)
    if (cancelHint != null) __obj.updateDynamic("cancelHint")(cancelHint)
    if (cancelOff != null) __obj.updateDynamic("cancelOff")(cancelOff)
    if (cancelOn != null) __obj.updateDynamic("cancelOn")(cancelOn)
    if (cancelPlace != null) __obj.updateDynamic("cancelPlace")(cancelPlace)
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction2(click))
    if (!js.isUndefined(half)) __obj.updateDynamic("half")(half)
    if (!js.isUndefined(halfShow)) __obj.updateDynamic("halfShow")(halfShow)
    if (hints != null) __obj.updateDynamic("hints")(hints)
    if (iconRange != null) __obj.updateDynamic("iconRange")(iconRange)
    if (mouseout != null) __obj.updateDynamic("mouseout")(js.Any.fromFunction2(mouseout))
    if (mouseover != null) __obj.updateDynamic("mouseover")(js.Any.fromFunction2(mouseover))
    if (noRatedMsg != null) __obj.updateDynamic("noRatedMsg")(noRatedMsg)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (numberMax != null) __obj.updateDynamic("numberMax")(numberMax.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (round != null) __obj.updateDynamic("round")(round)
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (scoreName != null) __obj.updateDynamic("scoreName")(scoreName)
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single)
    if (!js.isUndefined(space)) __obj.updateDynamic("space")(space)
    if (starHalf != null) __obj.updateDynamic("starHalf")(starHalf)
    if (starOff != null) __obj.updateDynamic("starOff")(starOff)
    if (starOn != null) __obj.updateDynamic("starOn")(starOn)
    if (starType != null) __obj.updateDynamic("starType")(starType)
    if (target != null) __obj.updateDynamic("target")(target)
    if (targetFormat != null) __obj.updateDynamic("targetFormat")(targetFormat)
    if (!js.isUndefined(targetKeep)) __obj.updateDynamic("targetKeep")(targetKeep)
    if (targetScore != null) __obj.updateDynamic("targetScore")(targetScore)
    if (targetText != null) __obj.updateDynamic("targetText")(targetText)
    if (targetType != null) __obj.updateDynamic("targetType")(targetType)
    __obj.asInstanceOf[JQueryRatyOptions]
  }
}

