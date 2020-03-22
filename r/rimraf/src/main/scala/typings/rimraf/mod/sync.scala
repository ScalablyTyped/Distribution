package typings.rimraf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rimraf", "sync")
@js.native
object sync extends js.Object {
  /**
    * It can remove stuff synchronously, too.
    * But that's not so good. Use the async API.
    * It's better.
    */
  def apply(path: String): Unit = js.native
  def apply(path: String, options: Options): Unit = js.native
}

