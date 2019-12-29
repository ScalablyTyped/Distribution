package typings.ramda.toolsMod

import typings.ramda.ramdaBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reduced[A] extends js.Object {
  @JSName("@@transducer/reduced")
  var `@@transducerSlashreduced`: `true`
  @JSName("@@transducer/value")
  var `@@transducerSlashvalue`: A
}

object Reduced {
  @scala.inline
  def apply[A](`@@transducerSlashreduced`: `true`, `@@transducerSlashvalue`: A): Reduced[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@transducer/reduced")(`@@transducerSlashreduced`.asInstanceOf[js.Any])
    __obj.updateDynamic("@@transducer/value")(`@@transducerSlashvalue`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reduced[A]]
  }
}

