package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TryBuilder2[A, B, C] extends js.Object {
  var oa: js.Any
  var ob: js.Any
  var oc: js.Any
  def chain[D](od: Try[D]): TryBuilder3[A, B, C, D]
  def run[D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Try[D]
}

