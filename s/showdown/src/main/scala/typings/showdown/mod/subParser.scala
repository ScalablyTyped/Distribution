package typings.showdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("showdown", "subParser")
@js.native
object subParser extends js.Object {
  
  /**
    * Get a registered subParser.
    *
    * @param name - The parser name.
    * @returns Returns the parser of the given `name`.
    * @throws Throws if `name` is not of type string.
    * @throws Throws if the parser is not exists.
    */
  def apply(name: String): SubParser_ = js.native
  /**
    * Register a subParser.
    *
    * @param name - The name of the new parser.
    * @param func - The handler function of the new parser.
    * @throws Throws if `name` is not of type string.
    */
  def apply(name: String, func: SubParser_): Unit = js.native
}
