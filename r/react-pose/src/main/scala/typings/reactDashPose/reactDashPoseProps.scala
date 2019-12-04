package typings.reactDashPose

import typings.react.reactMod.ConsumerProps
import typings.reactDashPose.libComponentsPoseElementTypesMod.PoseElementInternalProps
import typings.reactDashPose.libComponentsTransitionTypesMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactDashPoseProps {
  type PoseElementProps = PoseElementInternalProps
  @scala.inline
  def PoseGroupProps: Props.type = typings.reactDashPose.libComponentsTransitionTypesMod.Props
  type PoseGroupProps = Props
  @scala.inline
  def PoseParentConsumerProps: ConsumerProps.type = typings.react.reactMod.ConsumerProps
  type PoseParentConsumerProps[T] = ConsumerProps[T]
  @scala.inline
  def TransitionProps: Props.type = typings.reactDashPose.libComponentsTransitionTypesMod.Props
  type TransitionProps = Props
}

