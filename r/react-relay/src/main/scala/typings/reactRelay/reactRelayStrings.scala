package typings.reactRelay

import typings.reactRelay.entryPointTypesMod.PreloadFetchPolicy
import typings.reactRelay.mod.FetchPolicy
import typings.reactRelay.useLoadMoreFunctionMod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactRelayStrings {
  
  @scala.inline
  def MappedFragmentProps: MappedFragmentProps = "MappedFragmentProps".asInstanceOf[MappedFragmentProps]
  
  @scala.inline
  def PreloadableConcreteRequest: PreloadableConcreteRequest = "PreloadableConcreteRequest".asInstanceOf[PreloadableConcreteRequest]
  
  @scala.inline
  def PreloadedEntryPoints: PreloadedEntryPoints = "PreloadedEntryPoints".asInstanceOf[PreloadedEntryPoints]
  
  @scala.inline
  def PreloadedQueries: PreloadedQueries = "PreloadedQueries".asInstanceOf[PreloadedQueries]
  
  @scala.inline
  def PreloadedQuery: PreloadedQuery = "PreloadedQuery".asInstanceOf[PreloadedQuery]
  
  @scala.inline
  def ThinNestedEntryPointParamsObject: ThinNestedEntryPointParamsObject = "ThinNestedEntryPointParamsObject".asInstanceOf[ThinNestedEntryPointParamsObject]
  
  @scala.inline
  def ThinQueryParamsObject: ThinQueryParamsObject = "ThinQueryParamsObject".asInstanceOf[ThinQueryParamsObject]
  
  @scala.inline
  def backward: backward = "backward".asInstanceOf[backward]
  
  @scala.inline
  def cache: cache = "cache".asInstanceOf[cache]
  
  @scala.inline
  def forward: forward = "forward".asInstanceOf[forward]
  
  @scala.inline
  def network: network = "network".asInstanceOf[network]
  
  @scala.inline
  def `network-only`: `network-only` = "network-only".asInstanceOf[`network-only`]
  
  @scala.inline
  def refetch: refetch = "refetch".asInstanceOf[refetch]
  
  @scala.inline
  def relay: relay = "relay".asInstanceOf[relay]
  
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  
  @scala.inline
  def `store-and-network`: `store-and-network` = "store-and-network".asInstanceOf[`store-and-network`]
  
  @scala.inline
  def `store-or-network`: `store-or-network` = "store-or-network".asInstanceOf[`store-or-network`]
  
  @js.native
  sealed trait MappedFragmentProps extends js.Object
  
  @js.native
  sealed trait PreloadableConcreteRequest extends js.Object
  
  @js.native
  sealed trait PreloadedEntryPoints extends js.Object
  
  @js.native
  sealed trait PreloadedQueries extends js.Object
  
  @js.native
  sealed trait PreloadedQuery extends js.Object
  
  @js.native
  sealed trait ThinNestedEntryPointParamsObject extends js.Object
  
  @js.native
  sealed trait ThinQueryParamsObject extends js.Object
  
  @js.native
  sealed trait backward extends Direction
  
  @js.native
  sealed trait cache extends js.Object
  
  @js.native
  sealed trait forward extends Direction
  
  @js.native
  sealed trait network extends js.Object
  
  @js.native
  sealed trait `network-only`
    extends FetchPolicy
       with PreloadFetchPolicy
  
  @js.native
  sealed trait refetch extends js.Object
  
  @js.native
  sealed trait relay extends js.Object
  
  @js.native
  sealed trait reset extends js.Object
  
  @js.native
  sealed trait `store-and-network`
    extends FetchPolicy
       with PreloadFetchPolicy
  
  @js.native
  sealed trait `store-or-network` extends PreloadFetchPolicy
}
