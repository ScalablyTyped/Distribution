package typings
package sqlite3Lib.sqlite3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait sqlite3 extends js.Object {
  var Database: ScalablyTyped.runtime.Instantiable2[
    /* filename */ java.lang.String, 
    /* callback */ js.UndefOr[/* callback */ js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]], 
    Database
  ]
  var OPEN_CREATE: scala.Double
  var OPEN_READONLY: scala.Double
  var OPEN_READWRITE: scala.Double
  var RunResult: RunResult
  var Statement: ScalablyTyped.runtime.Instantiable0[Statement]
  var cached: sqlite3Lib.Anon_Database
  def verbose(): this.type
}

