package typings
package sqlite3Lib.sqlite3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sqlite3 extends js.Object {
  var Database: org.scalablytyped.runtime.Instantiable2[
    /* filename */ java.lang.String, 
    /* callback */ js.UndefOr[/* callback */ js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]], 
    Database
  ]
  var OPEN_CREATE: scala.Double
  var OPEN_READONLY: scala.Double
  var OPEN_READWRITE: scala.Double
  var RunResult: RunResult
  var Statement: org.scalablytyped.runtime.Instantiable0[Statement]
  var cached: sqlite3Lib.Anon_Callback
  def verbose(): this.type
}

object sqlite3 {
  @scala.inline
  def apply(
    Database: org.scalablytyped.runtime.Instantiable2[
      /* filename */ java.lang.String, 
      /* callback */ js.UndefOr[/* callback */ js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]], 
      Database
    ],
    OPEN_CREATE: scala.Double,
    OPEN_READONLY: scala.Double,
    OPEN_READWRITE: scala.Double,
    RunResult: RunResult,
    Statement: org.scalablytyped.runtime.Instantiable0[Statement],
    cached: sqlite3Lib.Anon_Callback,
    verbose: js.Function0[sqlite3]
  ): sqlite3 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Database")(Database)
    __obj.updateDynamic("OPEN_CREATE")(OPEN_CREATE)
    __obj.updateDynamic("OPEN_READONLY")(OPEN_READONLY)
    __obj.updateDynamic("OPEN_READWRITE")(OPEN_READWRITE)
    __obj.updateDynamic("RunResult")(RunResult)
    __obj.updateDynamic("Statement")(Statement)
    __obj.updateDynamic("cached")(cached)
    __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[sqlite3]
  }
}

