package typings.reactRelay

import typings.reactRelay.entryPointTypesMod.PreloadFetchPolicy
import typings.reactRelay.queryResourceMod.FetchPolicy
import typings.reactRelay.queryResourceMod.RenderPolicy
import typings.reactRelay.useLoadMoreFunctionMod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactRelayStrings {
  @js.native
  sealed trait Anon_EntryPointsExtraProps extends js.Object
  
  @js.native
  sealed trait MappedFragmentProps extends js.Object
  
  @js.native
  sealed trait backward extends Direction
  
  @js.native
  sealed trait entryPoints extends js.Object
  
  @js.native
  sealed trait extraProps extends js.Object
  
  @js.native
  sealed trait forward extends Direction
  
  @js.native
  sealed trait full extends RenderPolicy
  
  @js.native
  sealed trait `network-only`
    extends FetchPolicy
       with typings.reactRelay.mod.FetchPolicy
       with PreloadFetchPolicy
  
  @js.native
  sealed trait partial extends RenderPolicy
  
  @js.native
  sealed trait props extends js.Object
  
  @js.native
  sealed trait queries extends js.Object
  
  @js.native
  sealed trait relay extends js.Object
  
  @js.native
  sealed trait `store-and-network`
    extends FetchPolicy
       with typings.reactRelay.mod.FetchPolicy
       with PreloadFetchPolicy
  
  @js.native
  sealed trait `store-only` extends FetchPolicy
  
  @js.native
  sealed trait `store-or-network`
    extends FetchPolicy
       with PreloadFetchPolicy
  
  @scala.inline
  def Anon_EntryPointsExtraProps: Anon_EntryPointsExtraProps = "Anon_EntryPointsExtraProps".asInstanceOf[Anon_EntryPointsExtraProps]
  @scala.inline
  def MappedFragmentProps: MappedFragmentProps = "MappedFragmentProps".asInstanceOf[MappedFragmentProps]
  @scala.inline
  def backward: backward = "backward".asInstanceOf[backward]
  @scala.inline
  def entryPoints: entryPoints = "entryPoints".asInstanceOf[entryPoints]
  @scala.inline
  def extraProps: extraProps = "extraProps".asInstanceOf[extraProps]
  @scala.inline
  def forward: forward = "forward".asInstanceOf[forward]
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  @scala.inline
  def `network-only`: `network-only` = "network-only".asInstanceOf[`network-only`]
  @scala.inline
  def partial: partial = "partial".asInstanceOf[partial]
  @scala.inline
  def props: props = "props".asInstanceOf[props]
  @scala.inline
  def queries: queries = "queries".asInstanceOf[queries]
  @scala.inline
  def relay: relay = "relay".asInstanceOf[relay]
  @scala.inline
  def `store-and-network`: `store-and-network` = "store-and-network".asInstanceOf[`store-and-network`]
  @scala.inline
  def `store-only`: `store-only` = "store-only".asInstanceOf[`store-only`]
  @scala.inline
  def `store-or-network`: `store-or-network` = "store-or-network".asInstanceOf[`store-or-network`]
}

