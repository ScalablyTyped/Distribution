package typings.sidewayAddress.mod.ip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sideway/address", "ip.regex")
@js.native
object regex extends js.Object {
  
  /**
    * Generates a regular expression used to validate IP addresses.
    * 
    * @param options - optional settings.
    * 
    * @returns an object with the regular expression and meta data.
    */
  def apply(): Expression = js.native
  def apply(options: Options): Expression = js.native
}
