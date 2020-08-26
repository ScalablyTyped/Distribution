package typings.ramda.toolsMod

import typings.ramda.ramdaBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reduced[A] extends js.Object {
  @JSName("@@transducer/reduced")
  var `@@transducerSlashreduced`: `true` = js.native
  @JSName("@@transducer/value")
  var `@@transducerSlashvalue`: A = js.native
}

object Reduced {
  @scala.inline
  def apply[A](`@@transducerSlashreduced`: `true`, `@@transducerSlashvalue`: A): Reduced[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@transducer/reduced")(`@@transducerSlashreduced`.asInstanceOf[js.Any])
    __obj.updateDynamic("@@transducer/value")(`@@transducerSlashvalue`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reduced[A]]
  }
  @scala.inline
  implicit class ReducedOps[Self <: Reduced[_], A] (val x: Self with Reduced[A]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `set@@transducerSlashreduced`(value: `true`): Self = this.set("@@transducer/reduced", value.asInstanceOf[js.Any])
    @scala.inline
    def `set@@transducerSlashvalue`(value: A): Self = this.set("@@transducer/value", value.asInstanceOf[js.Any])
  }
  
}

