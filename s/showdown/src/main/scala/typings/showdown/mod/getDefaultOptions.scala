package typings.showdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("showdown", "getDefaultOptions")
@js.native
object getDefaultOptions extends js.Object {
  /**
    * Get the default options.
    *
    * @param [simple=true] - If to returns the default showdown options or the showdown options schema.
    * @returns Returns the options schema if `simple` is `false`, otherwise the default showdown options.
    */
  def apply(): ShowdownOptionsSchema | ShowdownOptions = js.native
  def apply(simple: Boolean): ShowdownOptionsSchema | ShowdownOptions = js.native
}

