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

