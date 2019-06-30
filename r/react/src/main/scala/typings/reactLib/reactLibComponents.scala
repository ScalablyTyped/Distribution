package typings
package reactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactLibComponents extends reactLibProps {
  @scala.inline
  def Fragment: reactLib.reactMod.ComponentType[Anon_Children] = reactLib.reactMod.^.Fragment.asInstanceOf[reactLib.reactMod.ComponentType[reactLib.Anon_Children]]
  @scala.inline
  def PureComponent[P, S, SS]: reactLib.reactMod.ComponentType[P] = js.constructorOf[reactLib.reactMod.PureComponent[P, S, SS]].asInstanceOf[reactLib.reactMod.ComponentType[P]]
  @scala.inline
  def StrictMode: reactLib.reactMod.ComponentType[Anon_Children] = reactLib.reactMod.^.StrictMode.asInstanceOf[reactLib.reactMod.ComponentType[reactLib.Anon_Children]]
  @scala.inline
  def Suspense: reactLib.reactMod.ComponentType[reactLib.reactMod.SuspenseProps] = reactLib.reactMod.^.Suspense.asInstanceOf[reactLib.reactMod.ComponentType[reactLib.reactMod.SuspenseProps]]
  @scala.inline
  def unstable_Profiler: reactLib.reactMod.ComponentType[reactLib.reactMod.ProfilerProps] = reactLib.reactMod.^.unstable_Profiler.asInstanceOf[reactLib.reactMod.ComponentType[reactLib.reactMod.ProfilerProps]]
}

