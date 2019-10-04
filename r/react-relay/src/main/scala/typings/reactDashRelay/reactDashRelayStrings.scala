package typings.reactDashRelay

import typings.reactDashRelay.reactDashRelayMod.FetchPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashRelayStrings {
  @js.native
  sealed trait MappedFragmentProps extends js.Object
  
  @js.native
  sealed trait backward extends js.Object
  
  @js.native
  sealed trait forward extends js.Object
  
  @js.native
  sealed trait `network-only` extends FetchPolicy
  
  @js.native
  sealed trait relay extends js.Object
  
  @js.native
  sealed trait `store-and-network` extends FetchPolicy
  
  @js.native
  sealed trait `store-or-network` extends js.Object
  
  @scala.inline
  def MappedFragmentProps: MappedFragmentProps = "MappedFragmentProps".asInstanceOf[MappedFragmentProps]
  @scala.inline
  def backward: backward = "backward".asInstanceOf[backward]
  @scala.inline
  def forward: forward = "forward".asInstanceOf[forward]
  @scala.inline
  def `network-only`: `network-only` = "network-only".asInstanceOf[`network-only`]
  @scala.inline
  def relay: relay = "relay".asInstanceOf[relay]
  @scala.inline
  def `store-and-network`: `store-and-network` = "store-and-network".asInstanceOf[`store-and-network`]
  @scala.inline
  def `store-or-network`: `store-or-network` = "store-or-network".asInstanceOf[`store-or-network`]
}

