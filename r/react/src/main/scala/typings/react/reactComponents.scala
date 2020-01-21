package typings.react

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactComponents extends reactProps {
  @scala.inline
  def Fragment: ComponentType[FragmentProps] = typings.react.mod.Fragment.asInstanceOf[typings.react.mod.ComponentType[FragmentProps]]
  @scala.inline
  def Profiler: ComponentType[ProfilerProps] = typings.react.mod.Profiler.asInstanceOf[typings.react.mod.ComponentType[ProfilerProps]]
  @scala.inline
  def StrictMode: ComponentType[StrictModeProps] = typings.react.mod.StrictMode.asInstanceOf[typings.react.mod.ComponentType[StrictModeProps]]
  @scala.inline
  def Suspense: ComponentType[SuspenseProps] = typings.react.mod.Suspense.asInstanceOf[typings.react.mod.ComponentType[SuspenseProps]]
  @scala.inline
  def SuspenseList: ComponentType[SuspenseListProps] = typings.react.experimentalMod.reactAugmentingMod.SuspenseList.asInstanceOf[typings.react.mod.ComponentType[SuspenseListProps]]
}

