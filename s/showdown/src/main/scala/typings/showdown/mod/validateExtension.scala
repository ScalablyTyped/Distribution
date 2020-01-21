package typings.showdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("showdown", "validateExtension")
@js.native
object validateExtension extends js.Object {
  /**
    * Checks if the given `ext` is a valid showdown extension.
    *
    * @param ext - The extension to checks.
    * @returns Returns `true` if the extension is valid showdown extension, otherwise `false`.
    */
  def apply(ext: js.Array[ShowdownExtension]): Boolean = js.native
  def apply(ext: ShowdownExtension): Boolean = js.native
}

