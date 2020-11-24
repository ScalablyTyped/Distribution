package typings.season.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("season", "readFile")
@js.native
object readFile extends js.Object {
  
  def apply(objectPath: String, callback: js.Function2[/* err */ Error | Null, /* object */ js.Any, Unit]): Unit = js.native
  def apply(
    objectPath: String,
    options: ParseOptions,
    callback: js.Function2[/* err */ Error | Null, /* object */ js.Any, Unit]
  ): Unit = js.native
}
