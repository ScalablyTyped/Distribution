package typings.reactPose

import typings.react.mod.ConsumerProps
import typings.reactPose.transitionTypesMod.Props
import typings.reactPose.typesMod.PoseElementInternalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactPoseProps {
  type PoseElementProps = PoseElementInternalProps
  @scala.inline
  def PoseGroupProps: Props.type = typings.reactPose.transitionTypesMod.Props
  type PoseGroupProps = Props
  @scala.inline
  def PoseParentConsumerProps: ConsumerProps.type = typings.react.mod.ConsumerProps
  type PoseParentConsumerProps[T] = ConsumerProps[T]
  @scala.inline
  def TransitionProps: Props.type = typings.reactPose.transitionTypesMod.Props
  type TransitionProps = Props
}

