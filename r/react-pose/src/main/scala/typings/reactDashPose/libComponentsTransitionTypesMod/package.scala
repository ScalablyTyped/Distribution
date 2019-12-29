package typings.reactDashPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsTransitionTypesMod {
  import typings.react.reactMod.ReactElement
  import typings.reactDashPose.reactDashPoseBooleans.`false`

  type TransitionChild[T] = ReactElement | `false` | Unit
  type TransitionChildren[T] = TransitionChild[T] | js.Array[TransitionChild[T]]
}
