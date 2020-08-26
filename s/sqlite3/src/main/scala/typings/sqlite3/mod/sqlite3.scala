package typings.sqlite3.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait sqlite3 extends js.Object {
  var Database: Instantiable2[
    /* filename */ String, 
    /* callback */ js.UndefOr[js.Function1[/* err */ Error | Null, Unit]], 
    typings.sqlite3.mod.Database
  ] = js.native
  var OPEN_CREATE: Double = js.native
  var OPEN_PRIVATECACHE: Double = js.native
  var OPEN_READONLY: Double = js.native
  var OPEN_READWRITE: Double = js.native
  var OPEN_SHAREDCACHE: Double = js.native
  var OPEN_URI: Double = js.native
  var RunResult: typings.sqlite3.mod.RunResult = js.native
  var Statement: Instantiable0[typings.sqlite3.mod.Statement] = js.native
  var cached: typings.sqlite3.anon.Database = js.native
  def verbose(): this.type = js.native
}

object sqlite3 {
  @scala.inline
  def apply(
    Database: Instantiable2[
      /* filename */ String, 
      /* callback */ js.UndefOr[js.Function1[/* err */ Error | Null, Unit]], 
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
    cached: typings.sqlite3.anon.Database,
    verbose: () => sqlite3
  ): sqlite3 = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], OPEN_CREATE = OPEN_CREATE.asInstanceOf[js.Any], OPEN_PRIVATECACHE = OPEN_PRIVATECACHE.asInstanceOf[js.Any], OPEN_READONLY = OPEN_READONLY.asInstanceOf[js.Any], OPEN_READWRITE = OPEN_READWRITE.asInstanceOf[js.Any], OPEN_SHAREDCACHE = OPEN_SHAREDCACHE.asInstanceOf[js.Any], OPEN_URI = OPEN_URI.asInstanceOf[js.Any], RunResult = RunResult.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], cached = cached.asInstanceOf[js.Any], verbose = js.Any.fromFunction0(verbose))
    __obj.asInstanceOf[sqlite3]
  }
  @scala.inline
  implicit class sqlite3Ops[Self <: sqlite3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDatabase(
      value: Instantiable2[
          /* filename */ String, 
          /* callback */ js.UndefOr[js.Function1[/* err */ Error | Null, Unit]], 
          Database
        ]
    ): Self = this.set("Database", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPEN_CREATE(value: Double): Self = this.set("OPEN_CREATE", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPEN_PRIVATECACHE(value: Double): Self = this.set("OPEN_PRIVATECACHE", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPEN_READONLY(value: Double): Self = this.set("OPEN_READONLY", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPEN_READWRITE(value: Double): Self = this.set("OPEN_READWRITE", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPEN_SHAREDCACHE(value: Double): Self = this.set("OPEN_SHAREDCACHE", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPEN_URI(value: Double): Self = this.set("OPEN_URI", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunResult(value: RunResult): Self = this.set("RunResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatement(value: Instantiable0[Statement]): Self = this.set("Statement", value.asInstanceOf[js.Any])
    @scala.inline
    def setCached(value: typings.sqlite3.anon.Database): Self = this.set("cached", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbose(value: () => sqlite3): Self = this.set("verbose", js.Any.fromFunction0(value))
  }
  
}

