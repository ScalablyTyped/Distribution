package typings.reduxDashLogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashLoggerMod {
  type ActionToString = js.Function1[/* action */ js.Any, String]
  type ErrorToString = js.Function2[/* error */ js.Any, /* prevState */ js.Any, String]
  type LoggerPredicate = js.Function3[
    /* getState */ js.Function0[js.Any], 
    /* action */ js.Any, 
    /* logEntry */ js.UndefOr[LogEntryObject], 
    Boolean
  ]
  type StateToString = js.Function1[/* state */ js.Any, String]
}
