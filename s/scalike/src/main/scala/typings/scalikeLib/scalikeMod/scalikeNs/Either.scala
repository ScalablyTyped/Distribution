package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Either[A, B] extends js.Object {
  var isLeft: scala.Boolean
  var isRight: scala.Boolean
  var value: A | B
  def fold[X](fa: js.Function1[/* a */ A, X], fb: js.Function1[/* b */ B, X]): X
  def left(): LeftProjection[A, B]
  def right(): RightProjection[A, B]
  def swap(): Either[B, A]
}

