package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateOrderRequest")
@js.native
open class CreateOrderRequest () extends StObject {
  
  /**
    * A value you specify that uniquely identifies this order among orders you've created.
    * If you're unsure whether a particular order was created successfully, you can reattempt it with the same idempotency
    * key without worrying about creating duplicate orders.
    * See [Idempotency](https://developer.squareup.com/docs/basics/api101/idempotency) for more information.
    */
  var idempotency_key: js.UndefOr[String] = js.native
  
  /**
    * The ID of the business location to associate the order with.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * The order to create. If this field is set, then the only other top-level field that can be set is the idempotency_key.
    */
  var order: js.UndefOr[Order] = js.native
}
