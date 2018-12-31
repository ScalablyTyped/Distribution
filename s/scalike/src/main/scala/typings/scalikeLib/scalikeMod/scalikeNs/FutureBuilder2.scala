package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FutureBuilder2[A, B, C] extends js.Object {
  var oa: js.Any
  var ob: js.Any
  var oc: js.Any
  def chain[D](od: Future[D]): FutureBuilder3[A, B, C, D]
  def run[D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Future[D]
}

