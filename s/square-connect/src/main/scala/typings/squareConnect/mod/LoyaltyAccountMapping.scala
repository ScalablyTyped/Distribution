package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyAccountMapping")
@js.native
open class LoyaltyAccountMapping () extends StObject {
  
  /**
    * The timestamp when the mapping was created, in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * The Square-assigned ID of the mapping.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The type of mapping. See [LoyaltyAccountMappingType](#type-loyaltyaccountmappingtype) for possible values.
    */
  var `type`: String = js.native
  
  /**
    * The phone number, in E.164 format. For example, \"+14155551111\".
    */
  var value: String = js.native
}
