package typings.reactRelay

import typings.reactRelay.entryPointTypesMod.PreloadFetchPolicy
import typings.reactRelay.mod.FetchPolicy
import typings.reactRelay.useLoadMoreFunctionMod.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactRelayStrings {
  
  @js.native
  sealed trait MappedFragmentProps extends StObject
  inline def MappedFragmentProps: MappedFragmentProps = "MappedFragmentProps".asInstanceOf[MappedFragmentProps]
  
  @js.native
  sealed trait PreloadableConcreteRequest extends StObject
  inline def PreloadableConcreteRequest: PreloadableConcreteRequest = "PreloadableConcreteRequest".asInstanceOf[PreloadableConcreteRequest]
  
  @js.native
  sealed trait PreloadedEntryPoints extends StObject
  inline def PreloadedEntryPoints: PreloadedEntryPoints = "PreloadedEntryPoints".asInstanceOf[PreloadedEntryPoints]
  
  @js.native
  sealed trait PreloadedQueries extends StObject
  inline def PreloadedQueries: PreloadedQueries = "PreloadedQueries".asInstanceOf[PreloadedQueries]
  
  @js.native
  sealed trait PreloadedQuery extends StObject
  inline def PreloadedQuery: PreloadedQuery = "PreloadedQuery".asInstanceOf[PreloadedQuery]
  
  @js.native
  sealed trait ThinNestedEntryPointParamsObject extends StObject
  inline def ThinNestedEntryPointParamsObject: ThinNestedEntryPointParamsObject = "ThinNestedEntryPointParamsObject".asInstanceOf[ThinNestedEntryPointParamsObject]
  
  @js.native
  sealed trait ThinQueryParamsObject extends StObject
  inline def ThinQueryParamsObject: ThinQueryParamsObject = "ThinQueryParamsObject".asInstanceOf[ThinQueryParamsObject]
  
  @js.native
  sealed trait backward
    extends StObject
       with Direction
  inline def backward: backward = "backward".asInstanceOf[backward]
  
  @js.native
  sealed trait cache extends StObject
  inline def cache: cache = "cache".asInstanceOf[cache]
  
  @js.native
  sealed trait forward
    extends StObject
       with Direction
  inline def forward: forward = "forward".asInstanceOf[forward]
  
  @js.native
  sealed trait network extends StObject
  inline def network: network = "network".asInstanceOf[network]
  
  @js.native
  sealed trait `network-only`
    extends StObject
       with FetchPolicy
       with PreloadFetchPolicy
  inline def `network-only`: `network-only` = "network-only".asInstanceOf[`network-only`]
  
  @js.native
  sealed trait refetch extends StObject
  inline def refetch: refetch = "refetch".asInstanceOf[refetch]
  
  @js.native
  sealed trait relay extends StObject
  inline def relay: relay = "relay".asInstanceOf[relay]
  
  @js.native
  sealed trait reset extends StObject
  inline def reset: reset = "reset".asInstanceOf[reset]
  
  @js.native
  sealed trait `store-and-network`
    extends StObject
       with FetchPolicy
       with PreloadFetchPolicy
  inline def `store-and-network`: `store-and-network` = "store-and-network".asInstanceOf[`store-and-network`]
  
  @js.native
  sealed trait `store-or-network`
    extends StObject
       with PreloadFetchPolicy
  inline def `store-or-network`: `store-or-network` = "store-or-network".asInstanceOf[`store-or-network`]
}
