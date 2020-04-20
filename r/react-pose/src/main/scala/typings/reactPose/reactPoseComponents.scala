package typings.reactPose

import typings.react.mod.ComponentType
import typings.reactPose.poseGroupMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactPoseComponents extends reactPoseProps {
  @scala.inline
  def PoseElement: ComponentType[PoseElementProps] = js.constructorOf[typings.reactPose.poseElementMod.PoseElement].asInstanceOf[ComponentType[PoseElementProps]]
  @scala.inline
  def PoseGroup: ComponentType[PoseGroupProps] = js.constructorOf[default].asInstanceOf[ComponentType[PoseGroupProps]]
  @scala.inline
  def PoseParentConsumer: ComponentType[PoseParentConsumerProps[js.Object]] = typings.reactPose.poseElementMod.PoseParentConsumer.asInstanceOf[ComponentType[PoseParentConsumerProps[js.Object]]]
  @scala.inline
  def Transition: ComponentType[TransitionProps] = js.constructorOf[typings.reactPose.transitionMod.default].asInstanceOf[ComponentType[TransitionProps]]
}

