package typings
package reduxDashLoggerLib.reduxDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReduxLoggerOptions extends js.Object {
  var actionTransformer: js.UndefOr[js.Function1[/* action */ js.Any, _]] = js.undefined
  var collapsed: js.UndefOr[scala.Boolean | LoggerPredicate] = js.undefined
  var colors: js.UndefOr[ColorsObject | reduxDashLoggerLib.reduxDashLoggerLibNumbers.`false`] = js.undefined
  var diff: js.UndefOr[scala.Boolean] = js.undefined
  var diffPredicate: js.UndefOr[LoggerPredicate] = js.undefined
  var duration: js.UndefOr[scala.Boolean] = js.undefined
  var errorTransformer: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.undefined
  var level: js.UndefOr[java.lang.String | ActionToString | LevelObject] = js.undefined
  var logErrors: js.UndefOr[scala.Boolean] = js.undefined
  var logger: js.UndefOr[js.Any] = js.undefined
  var predicate: js.UndefOr[LoggerPredicate] = js.undefined
  var stateTransformer: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.undefined
  var timestamp: js.UndefOr[scala.Boolean] = js.undefined
  var titleFormatter: js.UndefOr[
    js.Function3[
      /* formattedAction */ js.Any, 
      /* formattedTime */ java.lang.String, 
      /* took */ scala.Double, 
      java.lang.String
    ]
  ] = js.undefined
}

object ReduxLoggerOptions {
  @scala.inline
  def apply(
    actionTransformer: js.Function1[/* action */ js.Any, _] = null,
    collapsed: scala.Boolean | LoggerPredicate = null,
    colors: ColorsObject | reduxDashLoggerLib.reduxDashLoggerLibNumbers.`false` = null,
    diff: js.UndefOr[scala.Boolean] = js.undefined,
    diffPredicate: LoggerPredicate = null,
    duration: js.UndefOr[scala.Boolean] = js.undefined,
    errorTransformer: js.Function1[/* error */ js.Any, _] = null,
    level: java.lang.String | ActionToString | LevelObject = null,
    logErrors: js.UndefOr[scala.Boolean] = js.undefined,
    logger: js.Any = null,
    predicate: LoggerPredicate = null,
    stateTransformer: js.Function1[/* state */ js.Any, _] = null,
    timestamp: js.UndefOr[scala.Boolean] = js.undefined,
    titleFormatter: js.Function3[
      /* formattedAction */ js.Any, 
      /* formattedTime */ java.lang.String, 
      /* took */ scala.Double, 
      java.lang.String
    ] = null
  ): ReduxLoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (actionTransformer != null) __obj.updateDynamic("actionTransformer")(actionTransformer)
    if (collapsed != null) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(diff)) __obj.updateDynamic("diff")(diff)
    if (diffPredicate != null) __obj.updateDynamic("diffPredicate")(diffPredicate)
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration)
    if (errorTransformer != null) __obj.updateDynamic("errorTransformer")(errorTransformer)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(logErrors)) __obj.updateDynamic("logErrors")(logErrors)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (predicate != null) __obj.updateDynamic("predicate")(predicate)
    if (stateTransformer != null) __obj.updateDynamic("stateTransformer")(stateTransformer)
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp)
    if (titleFormatter != null) __obj.updateDynamic("titleFormatter")(titleFormatter)
    __obj.asInstanceOf[ReduxLoggerOptions]
  }
}

