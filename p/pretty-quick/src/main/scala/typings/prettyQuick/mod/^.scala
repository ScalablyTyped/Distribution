package typings.prettyQuick.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-quick", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Runs Prettier on your changed files.
    * Supported source control managers:
    * * Git
    * * Mercurial
    */
  def apply(currentDirectory: String): Results = js.native
  def apply(currentDirectory: String, options: Options): Results = js.native
}

