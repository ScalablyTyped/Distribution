package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyProgramAccrualRule")
@js.native
class LoyaltyProgramAccrualRule () extends StObject {
  
  /**
    * The type of the accrual rule that defines how buyers can earn points.
    * See [LoyaltyProgramAccrualRuleType](#type-loyaltyprogramaccrualruletype) for possible values.
    */
  var accrual_type: String = js.native
  
  /**
    * The ID of the `catalog object` to purchase to earn the number of points defined by the rule.
    * This is either an item variation or a category, depending on the type. This is defined on `ITEM_VARIATION` rules and `CATEGORY` rules.
    */
  var catalog_object_id: js.UndefOr[String] = js.native
  
  /**
    * The number of points that  buyers earn based on the `accrual_type`.
    */
  var points: js.UndefOr[Double] = js.native
  
  /**
    * When the accrual rule is spend-based (`accrual_type` is `SPEND`), this field indicates the amount that a buyer must spend
    * to earn the points. For example, suppose the accrual rule is \"earn 1 point for every $10 you spend\".
    * Then, buyer earns a point for every $10 they spend. If  buyer spends $105, the buyer earns 10 points.
    */
  var spend_amount_money: js.UndefOr[Money] = js.native
  
  /**
    * When the accrual rule is visit-based (`accrual_type` is `VISIT`), this field indicates the minimum purchase
    * required during the visit to  quality for the reward.
    */
  var visit_minimum_amount_money: js.UndefOr[Money] = js.native
}
