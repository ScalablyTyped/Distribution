package typings.squareConnect.mod

import typings.squareConnect.squareConnectStrings.EXCLUDE
import typings.squareConnect.squareConnectStrings.INCLUDE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CustomerCreationSourceFilter")
@js.native
open class CustomerCreationSourceFilter () extends StObject {
  
  /**
    * Indicates whether a customer profile matching the filter criteria should be included in the result or excluded
    * from the result. Default: `INCLUDE`.
    * See [CustomerInclusionExclusion](#type-customerinclusionexclusion) for possible values.
    */
  var rule: js.UndefOr[INCLUDE | EXCLUDE] = js.native
  
  /**
    * The list of creation sources used as filtering criteria.
    * See [CustomerCreationSource](#type-customercreationsource) for possible values.
    */
  var values: js.UndefOr[js.Array[CustomerSourceType]] = js.native
}
