package typings.reactPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transitionTypesMod {
  type TransitionChild[T] = typings.react.mod.ReactElement | typings.reactPose.reactPoseBooleans.`false` | scala.Unit
  type TransitionChildren[T] = typings.reactPose.transitionTypesMod.TransitionChild[T] | js.Array[typings.reactPose.transitionTypesMod.TransitionChild[T]]
}
