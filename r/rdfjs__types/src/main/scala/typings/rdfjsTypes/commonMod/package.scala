package typings.rdfjsTypes.commonMod

import typings.rdfjsTypes.anon.AvailableOrders
import typings.rdfjsTypes.anon.Cardinality
import typings.rdfjsTypes.anon.Order
import typings.rdfjsTypes.dataModelMod.Variable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ConditionalMetadataType[AdditionalMetadataType, M, OrderItemsType /* <: QuadTermName | Variable */] = AdditionalMetadataType & ((Record[String, Any]) | Cardinality) & ((Record[String, Any]) | Order[OrderItemsType]) & ((Record[String, Any]) | AvailableOrders[OrderItemsType])

/* Rewritten from type alias, can be one of: 
  - scala.Any
  - typings.rdfjsTypes.commonMod.CardinalityMetadataOpts
  - typings.rdfjsTypes.commonMod.OrderMetadataOpts
  - typings.rdfjsTypes.commonMod.AvailableOrdersMetadataOpts
*/
type MetadataOpts[SupportedMetadataType] = _MetadataOpts[SupportedMetadataType] | Any
