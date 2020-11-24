package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CustomerTextFilter")
@js.native
class CustomerTextFilter () extends js.Object {
  
  /**
    * Use the exact filter to select customers whose attributes match exactly the specified query.
    */
  var exact: js.UndefOr[String] = js.native
  
  /**
    * Use the fuzzy filter to select customers whose attributes match the specified query in a fuzzy manner.
    * When the fuzzy option is used, search queries are tokenized, and then each query token must be matched somewhere in the searched attribute.
    * For single token queries, this is effectively the same behavior as a partial match operation.
    */
  var fuzzy: js.UndefOr[String] = js.native
}
