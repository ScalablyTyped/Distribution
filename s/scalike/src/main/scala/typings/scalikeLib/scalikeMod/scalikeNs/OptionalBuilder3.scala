package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OptionalBuilder3[A, B, C, D] extends js.Object {
  var oa: js.Any
  var ob: js.Any
  var oc: js.Any
  var od: js.Any
  def chain[E](oe: Optional[E]): OptionalBuilder4[A, B, C, D, E]
  def run[E](f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): Optional[E]
}

