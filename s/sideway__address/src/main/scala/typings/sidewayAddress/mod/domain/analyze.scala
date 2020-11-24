package typings.sidewayAddress.mod.domain

import typings.sidewayAddress.mod.Analysis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sideway/address", "domain.analyze")
@js.native
object analyze extends js.Object {
  
  /**
    * Analyzes a string to verify it is a valid domain name.
    * 
    * @param domain - the domain name to validate.
    * @param options - optional settings.
    * 
    * @return - undefined when valid, otherwise an object with single error key with a string message value.
    */
  def apply(domain: String): Analysis | Null = js.native
  def apply(domain: String, options: Options): Analysis | Null = js.native
}
