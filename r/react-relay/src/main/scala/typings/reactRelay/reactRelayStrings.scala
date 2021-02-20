package typings.reactRelay

import typings.reactRelay.entryPointTypesMod.PreloadFetchPolicy
import typings.reactRelay.mod.FetchPolicy
import typings.reactRelay.useLoadMoreFunctionMod.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactRelayStrings {
  
  @js.native
  sealed trait MappedFragmentProps extends StObject
  @scala.inline
  def MappedFragmentProps: MappedFragmentProps = "MappedFragmentProps".asInstanceOf[MappedFragmentProps]
  
  @js.native
  sealed trait PreloadableConcreteRequest extends StObject
  @scala.inline
  def PreloadableConcreteRequest: PreloadableConcreteRequest = "PreloadableConcreteRequest".asInstanceOf[PreloadableConcreteRequest]
  
  @js.native
  sealed trait PreloadedEntryPoints extends StObject
  @scala.inline
  def PreloadedEntryPoints: PreloadedEntryPoints = "PreloadedEntryPoints".asInstanceOf[PreloadedEntryPoints]
  
  @js.native
  sealed trait PreloadedQueries extends StObject
  @scala.inline
  def PreloadedQueries: PreloadedQueries = "PreloadedQueries".asInstanceOf[PreloadedQueries]
  
  @js.native
  sealed trait PreloadedQuery extends StObject
  @scala.inline
  def PreloadedQuery: PreloadedQuery = "PreloadedQuery".asInstanceOf[PreloadedQuery]
  
  @js.native
  sealed trait ThinNestedEntryPointParamsObject extends StObject
  @scala.inline
  def ThinNestedEntryPointParamsObject: ThinNestedEntryPointParamsObject = "ThinNestedEntryPointParamsObject".asInstanceOf[ThinNestedEntryPointParamsObject]
  
  @js.native
  sealed trait ThinQueryParamsObject extends StObject
  @scala.inline
  def ThinQueryParamsObject: ThinQueryParamsObject = "ThinQueryParamsObject".asInstanceOf[ThinQueryParamsObject]
  
  @js.native
  sealed trait backward extends Direction
  @scala.inline
  def backward: backward = "backward".asInstanceOf[backward]
  
  @js.native
  sealed trait cache extends StObject
  @scala.inline
  def cache: cache = "cache".asInstanceOf[cache]
  
  @js.native
  sealed trait forward extends Direction
  @scala.inline
  def forward: forward = "forward".asInstanceOf[forward]
  
  @js.native
  sealed trait network extends StObject
  @scala.inline
  def network: network = "network".asInstanceOf[network]
  
  @js.native
  sealed trait `network-only`
    extends FetchPolicy
       with PreloadFetchPolicy
  @scala.inline
  def `network-only`: `network-only` = "network-only".asInstanceOf[`network-only`]
  
  @js.native
  sealed trait refetch extends StObject
  @scala.inline
  def refetch: refetch = "refetch".asInstanceOf[refetch]
  
  @js.native
  sealed trait relay extends StObject
  @scala.inline
  def relay: relay = "relay".asInstanceOf[relay]
  
  @js.native
  sealed trait reset extends StObject
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  
  @js.native
  sealed trait `store-and-network`
    extends FetchPolicy
       with PreloadFetchPolicy
  @scala.inline
  def `store-and-network`: `store-and-network` = "store-and-network".asInstanceOf[`store-and-network`]
  
  @js.native
  sealed trait `store-or-network` extends PreloadFetchPolicy
  @scala.inline
  def `store-or-network`: `store-or-network` = "store-or-network".asInstanceOf[`store-or-network`]
}
