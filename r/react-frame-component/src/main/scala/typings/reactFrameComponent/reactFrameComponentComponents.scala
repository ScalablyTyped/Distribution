package typings.reactFrameComponent

import typings.react.mod.ComponentType
import typings.reactFrameComponent.mod.FrameContextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactFrameComponentComponents extends reactFrameComponentProps {
  @scala.inline
  def FrameContextConsumer: ComponentType[FrameContextConsumerProps[FrameContextProps]] = typings.reactFrameComponent.mod.FrameContextConsumer.asInstanceOf[typings.react.mod.ComponentType[FrameContextConsumerProps[typings.reactFrameComponent.mod.FrameContextProps]]]
  @scala.inline
  def FrameContextProvider: ComponentType[FrameContextProviderProps[FrameContextProps]] = typings.reactFrameComponent.mod.FrameContextProvider.asInstanceOf[typings.react.mod.ComponentType[FrameContextProviderProps[typings.reactFrameComponent.mod.FrameContextProps]]]
  @scala.inline
  def ReactFrameComponent: ComponentType[ReactFrameComponentProps] = js.constructorOf[typings.reactFrameComponent.mod.default].asInstanceOf[typings.react.mod.ComponentType[ReactFrameComponentProps]]
}

