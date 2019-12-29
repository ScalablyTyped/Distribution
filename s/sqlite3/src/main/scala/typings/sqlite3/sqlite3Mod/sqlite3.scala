package typings.sqlite3.sqlite3Mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.sqlite3.Anon_Callback
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sqlite3 extends js.Object {
  var Database: Instantiable2[
    /* filename */ String, 
    js.UndefOr[/* callback */ js.Function1[/* err */ Error | Null, Unit]], 
    typings.sqlite3.sqlite3Mod.Database
  ]
  var OPEN_CREATE: Double
  var OPEN_PRIVATECACHE: Double
  var OPEN_READONLY: Double
  var OPEN_READWRITE: Double
  var OPEN_SHAREDCACHE: Double
  var OPEN_URI: Double
  var RunResult: typings.sqlite3.sqlite3Mod.RunResult
  var Statement: Instantiable0[typings.sqlite3.sqlite3Mod.Statement]
  var cached: Anon_Callback
  def verbose(): this.type
}

object sqlite3 {
  @scala.inline
  def apply(
    Database: Instantiable2[
      /* filename */ String, 
      js.UndefOr[/* callback */ js.Function1[/* err */ Error | Null, Unit]], 
      Database
    ],
    OPEN_CREATE: Double,
    OPEN_PRIVATECACHE: Double,
    OPEN_READONLY: Double,
    OPEN_READWRITE: Double,
    OPEN_SHAREDCACHE: Double,
    OPEN_URI: Double,
    RunResult: RunResult,
    Statement: Instantiable0[Statement],
    cached: Anon_Callback,
    verbose: () => sqlite3
  ): sqlite3 = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], OPEN_CREATE = OPEN_CREATE.asInstanceOf[js.Any], OPEN_PRIVATECACHE = OPEN_PRIVATECACHE.asInstanceOf[js.Any], OPEN_READONLY = OPEN_READONLY.asInstanceOf[js.Any], OPEN_READWRITE = OPEN_READWRITE.asInstanceOf[js.Any], OPEN_SHAREDCACHE = OPEN_SHAREDCACHE.asInstanceOf[js.Any], OPEN_URI = OPEN_URI.asInstanceOf[js.Any], RunResult = RunResult.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], cached = cached.asInstanceOf[js.Any], verbose = js.Any.fromFunction0(verbose))
  
    __obj.asInstanceOf[sqlite3]
  }
}

