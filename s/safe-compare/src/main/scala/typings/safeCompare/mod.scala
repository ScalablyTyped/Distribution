package typings.safeCompare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("safe-compare", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Do a constant time string comparison. Always compare the complete strings
    * against each other to get a constant time. This method does not short-cut
    * if the two string's length differs.
    */
  def apply(a: String, b: String): Boolean = js.native
}
