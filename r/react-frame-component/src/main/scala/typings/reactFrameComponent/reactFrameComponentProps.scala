package typings.reactFrameComponent

import typings.react.mod.ConsumerProps
import typings.react.mod.ProviderProps
import typings.reactFrameComponent.mod.FrameComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactFrameComponentProps {
  @scala.inline
  def FrameContextConsumerProps: ConsumerProps.type = typings.react.mod.ConsumerProps
  type FrameContextConsumerProps[T] = ConsumerProps[T]
  @scala.inline
  def FrameContextProviderProps: ProviderProps.type = typings.react.mod.ProviderProps
  type FrameContextProviderProps[T] = ProviderProps[T]
  @scala.inline
  def ReactFrameComponentProps: FrameComponentProps.type = typings.reactFrameComponent.mod.FrameComponentProps
  type ReactFrameComponentProps = FrameComponentProps
}

