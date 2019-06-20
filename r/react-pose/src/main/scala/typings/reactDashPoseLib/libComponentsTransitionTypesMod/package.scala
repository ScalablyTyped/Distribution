package typings
package reactDashPoseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsTransitionTypesMod {
  type TransitionChild[T] = reactLib.reactMod.ReactElement | reactDashPoseLib.reactDashPoseLibNumbers.`false` | scala.Unit
  type TransitionChildren[T] = TransitionChild[T] | js.Array[TransitionChild[T]]
}
