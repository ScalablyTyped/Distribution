package typings.react

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactComponents extends reactProps {
  @scala.inline
  def Fragment: ComponentType[FragmentProps] = typings.react.mod.Fragment.asInstanceOf[ComponentType[FragmentProps]]
  @scala.inline
  def Profiler: ComponentType[ProfilerProps] = typings.react.mod.Profiler.asInstanceOf[ComponentType[ProfilerProps]]
  @scala.inline
  def StrictMode: ComponentType[StrictModeProps] = typings.react.mod.StrictMode.asInstanceOf[ComponentType[StrictModeProps]]
  @scala.inline
  def Suspense: ComponentType[SuspenseProps] = typings.react.mod.Suspense.asInstanceOf[ComponentType[SuspenseProps]]
  @scala.inline
  def SuspenseList: ComponentType[SuspenseListProps] = typings.react.experimentalMod.reactAugmentingMod.SuspenseList.asInstanceOf[ComponentType[SuspenseListProps]]
}

