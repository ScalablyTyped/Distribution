package typings
package reactDashRelayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Refetch extends js.Object {
  def refetch(
    refetchVariables: js.Function1[
      /* fragmentVariables */ relayDashRuntimeLib.relayDashRuntimeMod.Variables, 
      relayDashRuntimeLib.relayDashRuntimeMod.Variables
    ]
  ): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[
      /* fragmentVariables */ relayDashRuntimeLib.relayDashRuntimeMod.Variables, 
      relayDashRuntimeLib.relayDashRuntimeMod.Variables
    ],
    renderVariables: relayDashRuntimeLib.relayDashRuntimeMod.Variables
  ): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[
      /* fragmentVariables */ relayDashRuntimeLib.relayDashRuntimeMod.Variables, 
      relayDashRuntimeLib.relayDashRuntimeMod.Variables
    ],
    renderVariables: relayDashRuntimeLib.relayDashRuntimeMod.Variables,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[
      /* fragmentVariables */ relayDashRuntimeLib.relayDashRuntimeMod.Variables, 
      relayDashRuntimeLib.relayDashRuntimeMod.Variables
    ],
    renderVariables: relayDashRuntimeLib.relayDashRuntimeMod.Variables,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit],
    options: reactDashRelayLib.reactDashRelayMod.RefetchOptions
  ): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
  def refetch(refetchVariables: relayDashRuntimeLib.relayDashRuntimeMod.Variables): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
  def refetch(
    refetchVariables: relayDashRuntimeLib.relayDashRuntimeMod.Variables,
    renderVariables: relayDashRuntimeLib.relayDashRuntimeMod.Variables
  ): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
  def refetch(
    refetchVariables: relayDashRuntimeLib.relayDashRuntimeMod.Variables,
    renderVariables: relayDashRuntimeLib.relayDashRuntimeMod.Variables,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
  def refetch(
    refetchVariables: relayDashRuntimeLib.relayDashRuntimeMod.Variables,
    renderVariables: relayDashRuntimeLib.relayDashRuntimeMod.Variables,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit],
    options: reactDashRelayLib.reactDashRelayMod.RefetchOptions
  ): relayDashRuntimeLib.relayDashRuntimeMod.Disposable = js.native
}

