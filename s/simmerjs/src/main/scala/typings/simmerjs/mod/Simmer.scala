package typings.simmerjs.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Simmer extends js.Object {
  
  /**
    * Analyze an element and produce a unique CSS selector for it.
    */
  def apply(element: Element): String = js.native
  
  /**
    * If you have an existing instance of Simmer, you can use its configure
    * method to instanciate a new Simmer which has the same scope and
    * configuration as the existing one, with any new configuration you wish to
    * apply.
    */
  def configure(options: Options): Simmer = js.native
}
