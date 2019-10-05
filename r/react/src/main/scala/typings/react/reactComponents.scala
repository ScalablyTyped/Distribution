package typings.react

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactComponents extends reactProps {
  @scala.inline
  def CloneElement[P]: ComponentType[ReactElement] = typings.react.reactMod.cloneElement.asInstanceOf[js.Dynamic].selectDynamic("<apply>").asInstanceOf[typings.react.reactMod.ComponentType[typings.react.reactMod.ReactElement]]
  @scala.inline
  def CreateElement[P /* <: js.Object */]: ComponentType[String] = typings.react.reactMod.createElement.asInstanceOf[js.Dynamic].selectDynamic("<apply>").asInstanceOf[typings.react.reactMod.ComponentType[java.lang.String]]
  @scala.inline
  def Fragment: ComponentType[Anon_Children] = typings.react.reactMod.Fragment.asInstanceOf[typings.react.reactMod.ComponentType[typings.react.Anon_Children]]
  @scala.inline
  def Profiler: ComponentType[typings.react.reactMod.ProfilerProps] = typings.react.reactMod.Profiler.asInstanceOf[typings.react.reactMod.ComponentType[typings.react.reactMod.ProfilerProps]]
  @scala.inline
  def PureComponent[P, S, SS]: ComponentType[P] = js.constructorOf[typings.react.reactMod.PureComponent[P, S, SS]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def StrictMode: ComponentType[Anon_Children] = typings.react.reactMod.StrictMode.asInstanceOf[typings.react.reactMod.ComponentType[typings.react.Anon_Children]]
  @scala.inline
  def Suspense: ComponentType[typings.react.reactMod.SuspenseProps] = typings.react.reactMod.Suspense.asInstanceOf[typings.react.reactMod.ComponentType[typings.react.reactMod.SuspenseProps]]
}

