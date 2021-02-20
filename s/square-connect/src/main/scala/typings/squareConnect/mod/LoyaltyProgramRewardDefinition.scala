package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyProgramRewardDefinition")
@js.native
class LoyaltyProgramRewardDefinition () extends StObject {
  
  /**
    * A list of `catalog object` ids to which this reward can be applied.
    * They are either all item-variation ids or category ids, depending on the `type` field.
    */
  var catalog_object_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The type of discount the reward tier offers.
    * See [LoyaltyProgramRewardDefinitionType](#type-loyaltyprogramrewarddefinitiontype) for possible values.
    */
  var discount_type: String = js.native
  
  /**
    * Present if `discount_type` is `FIXED_AMOUNT`. For example, $5 off.
    */
  var fixed_discount_money: js.UndefOr[Money] = js.native
  
  /**
    * When `discount_type` is `FIXED_PERCENTAGE`, the maximum discount amount that can be applied.
    */
  var max_discount_money: js.UndefOr[Money] = js.native
  
  /**
    * Present if `discount_type` is `FIXED_PERCENTAGE`. For example, a 7.25% off discount will be represented as \"7.25\".
    */
  var percentage_discount: js.UndefOr[String] = js.native
  
  /**
    * Indicates the scope of the reward tier.
    * See [LoyaltyProgramRewardDefinitionScope](#type-loyaltyprogramrewarddefinitionscope) for possible values.
    */
  var scope: String = js.native
}
