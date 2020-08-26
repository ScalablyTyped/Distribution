package typings.rdflib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flags extends js.Object {
  /**
    * A string of letters, each of which set an options
    * e.g. `deinprstux`
    */
  var flags: String = js.native
}

object Flags {
  @scala.inline
  def apply(flags: String): Flags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
  @scala.inline
  implicit class FlagsOps[Self <: Flags] (val x: Self) extends AnyVal {
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
    def setFlags(value: String): Self = this.set("flags", value.asInstanceOf[js.Any])
  }
  
}

