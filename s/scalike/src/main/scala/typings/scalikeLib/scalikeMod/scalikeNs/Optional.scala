package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Optional[A] extends js.Object {
  var isEmpty: scala.Boolean
  var nonEmpty: scala.Boolean
  def apply1[B, C](ob: Optional[B], f: js.Function2[/* a */ A, /* b */ B, C]): Optional[C]
  def apply2[B, C, D](ob: Optional[B], oc: Optional[C], f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Optional[D]
  def chain[B](ob: Optional[B]): OptionalBuilder1[A, B]
  def contains[B /* <: A */](b: B): scala.Boolean
  def exists(f: js.Function1[/* a */ A, scala.Boolean]): scala.Boolean
  def filter(f: js.Function1[/* a */ A, scala.Boolean]): Optional[A]
  def flatMap[B](f: js.Function1[/* a */ A, Optional[B]]): Optional[B]
  def flatten(): Optional[A]
  def fold[B](ifEmpty: B, f: js.Function1[/* a */ A, B]): B
  def forall(f: js.Function1[/* a */ A, scala.Boolean]): scala.Boolean
  def foreach(f: js.Function1[/* a */ A, scala.Unit]): scala.Unit
  def get(): A
  def getOrElse[B /* <: A */](a: B): A
  def map[B](f: js.Function1[/* a */ A, B]): Optional[B]
  def orElse[B /* <: A */](ob: Optional[B]): Optional[A]
}

