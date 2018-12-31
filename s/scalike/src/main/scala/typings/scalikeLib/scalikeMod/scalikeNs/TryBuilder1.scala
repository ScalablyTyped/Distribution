package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TryBuilder1[A, B] extends js.Object {
  var oa: js.Any
  var ob: js.Any
  def chain[C](oc: Try[C]): TryBuilder2[A, B, C]
  def run[C](f: js.Function2[/* a */ A, /* b */ B, C]): Try[C]
}

