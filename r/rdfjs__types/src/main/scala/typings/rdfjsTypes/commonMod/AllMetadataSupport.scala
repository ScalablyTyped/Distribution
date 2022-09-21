package typings.rdfjsTypes.commonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllMetadataSupport
  extends StObject
     with CardinalityMetadataSupport
     with OrderMetadataSupport
     with AvailableOrdersMetadataSupport
object AllMetadataSupport {
  
  inline def apply(): AllMetadataSupport = {
    val __obj = js.Dynamic.literal(availableOrders = true, cardinality = true, order = true)
    __obj.asInstanceOf[AllMetadataSupport]
  }
}
