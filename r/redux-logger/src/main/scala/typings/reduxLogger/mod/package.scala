package typings.reduxLogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionToString = js.Function1[/* action */ js.Any, java.lang.String]
  type ErrorToString = js.Function2[/* error */ js.Any, /* prevState */ js.Any, java.lang.String]
  type LoggerPredicate = js.Function3[
    /* getState */ js.Function0[js.Any], 
    /* action */ js.Any, 
    /* logEntry */ js.UndefOr[typings.reduxLogger.mod.LogEntryObject], 
    scala.Boolean
  ]
  type StateToString = js.Function1[/* state */ js.Any, java.lang.String]
}
