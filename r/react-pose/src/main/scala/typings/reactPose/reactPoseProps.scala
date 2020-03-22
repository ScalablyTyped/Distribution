package typings.reactPose

import typings.react.mod.ConsumerProps
import typings.reactPose.transitionTypesMod.Props
import typings.reactPose.typesMod.PoseElementInternalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactPoseProps {
  @scala.inline
  def PoseElementProps: PoseElementInternalProps.type = typings.reactPose.typesMod.PoseElementInternalProps
  type PoseElementProps = PoseElementInternalProps
  @scala.inline
  def PoseGroupProps: Props.type = typings.reactPose.transitionTypesMod.Props
  type PoseGroupProps = Props
  type PoseParentConsumerProps[T] = ConsumerProps[T]
  @scala.inline
  def TransitionProps: Props.type = typings.reactPose.transitionTypesMod.Props
  type TransitionProps = Props
}

