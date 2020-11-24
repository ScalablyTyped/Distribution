package typings.sortJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sort-json", "overwrite")
@js.native
object overwrite extends js.Object {
  
  /**
    * Sorts the JSON files with the `visit()` function and then overwrites the
    * file with sorted JSON
    * @param absolutePaths
    * * String: Absolute path to JSON file to sort and overwrite
    * * Array: Absolute paths to JSON files to sort and overwrite
    */
  def apply(absolutePaths: String): js.Any = js.native
  def apply(absolutePaths: String, options: OverwriteOptions): js.Any = js.native
  def apply(absolutePaths: js.Array[String]): js.Any = js.native
  def apply(absolutePaths: js.Array[String], options: OverwriteOptions): js.Any = js.native
}
