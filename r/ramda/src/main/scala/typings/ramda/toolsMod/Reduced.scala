package typings.ramda.toolsMod

import typings.ramda.ramdaNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reduced[A] extends js.Object {
  var `@@transducer/reduced`: `true`
  var `@@transducer/value`: A
}

object Reduced {
  @scala.inline
  def apply[A](`@@transducer/reduced`: `true`, `@@transducer/value`: A): Reduced[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@transducer/reduced")(`@@transducer/reduced`.asInstanceOf[js.Any])
    __obj.updateDynamic("@@transducer/value")(`@@transducer/value`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reduced[A]]
  }
}

