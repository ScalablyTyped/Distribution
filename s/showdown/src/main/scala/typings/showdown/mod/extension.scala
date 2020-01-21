package typings.showdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("showdown", "extension")
@js.native
object extension extends js.Object {
  /**
    * Get a registered extension.
    *
    * @param name - The extension name.
    * @returns Returns the extension of the given `name`.
    * @throws Throws if `name` is not of type string.
    * @throws Throws if the extension is not exists.
    */
  def apply(name: String): js.Array[ShowdownExtension] = js.native
  def apply(name: String, ext: js.Array[ShowdownExtension]): Unit = js.native
  /**
    * Register a extension.
    *
    * @param name - The name of the new extension.
    * @param ext - The extension.
    * @throws Throws if `name` is not of type string.
    */
  def apply(name: String, ext: js.Function0[js.Array[ShowdownExtension] | ShowdownExtension]): Unit = js.native
  def apply(name: String, ext: ShowdownExtension): Unit = js.native
}

