package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogQuickAmount")
@js.native
open class CatalogQuickAmount () extends StObject {
  
  /**
    * Represents the actual amount of the Quick Amount with Money type.
    */
  var amount: Money = js.native
  
  /**
    * The order in which this Quick Amount should be displayed.
    */
  var ordinal: js.UndefOr[Double] = js.native
  
  /**
    * Describes the ranking of the Quick Amount provided by machine learning model, in the range [0, 100].
    * MANUAL type amount will always have score = 100.
    */
  var score: js.UndefOr[Double] = js.native
  
  /**
    * Represents the type of the Quick Amount. See [CatalogQuickAmountType](#type-catalogquickamounttype) for possible values.
    */
  var `type`: String = js.native
}
