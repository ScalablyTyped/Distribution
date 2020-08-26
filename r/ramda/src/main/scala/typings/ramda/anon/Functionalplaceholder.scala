package typings.ramda.anon

import typings.ramda.ramdaBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Functionalplaceholder extends js.Object {
  @JSName("@@functional/placeholder")
  var `@@functionalSlashplaceholder`: `true` = js.native
}

object Functionalplaceholder {
  @scala.inline
  def apply(`@@functionalSlashplaceholder`: `true`): Functionalplaceholder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@functional/placeholder")(`@@functionalSlashplaceholder`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Functionalplaceholder]
  }
  @scala.inline
  implicit class FunctionalplaceholderOps[Self <: Functionalplaceholder] (val x: Self) extends AnyVal {
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
    def `set@@functionalSlashplaceholder`(value: `true`): Self = this.set("@@functional/placeholder", value.asInstanceOf[js.Any])
  }
  
}

