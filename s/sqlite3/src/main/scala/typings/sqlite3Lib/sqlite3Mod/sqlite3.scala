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
  var OPEN_PRIVATECACHE: scala.Double
  var OPEN_READONLY: scala.Double
  var OPEN_READWRITE: scala.Double
  var OPEN_SHAREDCACHE: scala.Double
  var OPEN_URI: scala.Double
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
    OPEN_PRIVATECACHE: scala.Double,
    OPEN_READONLY: scala.Double,
    OPEN_READWRITE: scala.Double,
    OPEN_SHAREDCACHE: scala.Double,
    OPEN_URI: scala.Double,
    RunResult: RunResult,
    Statement: org.scalablytyped.runtime.Instantiable0[Statement],
    cached: sqlite3Lib.Anon_Callback,
    verbose: js.Function0[sqlite3]
  ): sqlite3 = {
    val __obj = js.Dynamic.literal(Database = Database, OPEN_CREATE = OPEN_CREATE, OPEN_PRIVATECACHE = OPEN_PRIVATECACHE, OPEN_READONLY = OPEN_READONLY, OPEN_READWRITE = OPEN_READWRITE, OPEN_SHAREDCACHE = OPEN_SHAREDCACHE, OPEN_URI = OPEN_URI, RunResult = RunResult, Statement = Statement, cached = cached, verbose = verbose)
  
    __obj.asInstanceOf[sqlite3]
  }
}

