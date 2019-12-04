package typings.reactDashPose

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashPoseComponents extends reactDashPoseProps {
  @scala.inline
  def PoseElement: ComponentType[PoseElementProps] = js.constructorOf[typings.reactDashPose.libComponentsPoseElementMod.PoseElement].asInstanceOf[typings.react.reactMod.ComponentType[PoseElementProps]]
  @scala.inline
  def PoseGroup: ComponentType[PoseGroupProps] = js.constructorOf[typings.reactDashPose.libComponentsTransitionPoseGroupMod.default].asInstanceOf[typings.react.reactMod.ComponentType[PoseGroupProps]]
  @scala.inline
  def PoseParentConsumer: ComponentType[PoseParentConsumerProps[js.Object]] = typings.reactDashPose.libComponentsPoseElementMod.PoseParentConsumer.asInstanceOf[typings.react.reactMod.ComponentType[PoseParentConsumerProps[js.Object]]]
  @scala.inline
  def Transition: ComponentType[TransitionProps] = js.constructorOf[typings.reactDashPose.libComponentsTransitionMod.default].asInstanceOf[typings.react.reactMod.ComponentType[TransitionProps]]
}

