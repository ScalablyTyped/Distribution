package typings
package reduxDashLoggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashLoggerMod {
  type ActionToString = js.Function1[/* action */ js.Any, java.lang.String]
  type ErrorToString = js.Function2[/* error */ js.Any, /* prevState */ js.Any, java.lang.String]
  type LoggerPredicate = js.Function3[
    /* getState */ js.Function0[js.Any], 
    /* action */ js.Any, 
    /* logEntry */ js.UndefOr[LogEntryObject], 
    scala.Boolean
  ]
  type StateToString = js.Function1[/* state */ js.Any, java.lang.String]
}
