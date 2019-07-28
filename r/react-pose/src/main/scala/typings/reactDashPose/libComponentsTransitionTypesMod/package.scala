package typings.reactDashPose

import typings.react.reactMod.ReactElement
import typings.reactDashPose.reactDashPoseNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsTransitionTypesMod {
  type TransitionChild[T] = ReactElement | `false` | Unit
  type TransitionChildren[T] = TransitionChild[T] | js.Array[TransitionChild[T]]
}
