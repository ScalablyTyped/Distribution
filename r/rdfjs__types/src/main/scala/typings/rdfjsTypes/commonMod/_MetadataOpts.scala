package typings.rdfjsTypes.commonMod

import typings.rdfjsTypes.rdfjsTypesStrings.estimate
import typings.rdfjsTypes.rdfjsTypesStrings.exact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _MetadataOpts[SupportedMetadataType] extends StObject
object _MetadataOpts {
  
  inline def AvailableOrdersMetadataOpts(): typings.rdfjsTypes.commonMod.AvailableOrdersMetadataOpts = {
    val __obj = js.Dynamic.literal(availableOrders = true)
    __obj.asInstanceOf[typings.rdfjsTypes.commonMod.AvailableOrdersMetadataOpts]
  }
  
  inline def CardinalityMetadataOpts(cardinality: estimate | exact): typings.rdfjsTypes.commonMod.CardinalityMetadataOpts = {
    val __obj = js.Dynamic.literal(cardinality = cardinality.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rdfjsTypes.commonMod.CardinalityMetadataOpts]
  }
  
  inline def OrderMetadataOpts(): typings.rdfjsTypes.commonMod.OrderMetadataOpts = {
    val __obj = js.Dynamic.literal(order = true)
    __obj.asInstanceOf[typings.rdfjsTypes.commonMod.OrderMetadataOpts]
  }
}
