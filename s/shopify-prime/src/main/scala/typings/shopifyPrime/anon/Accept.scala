package typings.shopifyPrime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accept extends js.Object {
  var Accept: String = js.native
  var `User-Agent`: String = js.native
}

object Accept {
  @scala.inline
  def apply(Accept: String, `User-Agent`: String): Accept = {
    val __obj = js.Dynamic.literal(Accept = Accept.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
  @scala.inline
  implicit class AcceptOps[Self <: Accept] (val x: Self) extends AnyVal {
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
    def setAccept(value: String): Self = this.set("Accept", value.asInstanceOf[js.Any])
    @scala.inline
    def `setUser-Agent`(value: String): Self = this.set("User-Agent", value.asInstanceOf[js.Any])
  }
  
}

