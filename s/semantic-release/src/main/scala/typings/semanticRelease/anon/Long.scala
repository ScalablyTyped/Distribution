package typings.semanticRelease.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Long extends js.Object {
  /**
    * The commit tree hash.
    */
  var long: String = js.native
  /**
    * The commit abbreviated tree hash.
    */
  var short: String = js.native
}

object Long {
  @scala.inline
  def apply(long: String, short: String): Long = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Long]
  }
  @scala.inline
  implicit class LongOps[Self <: Long] (val x: Self) extends AnyVal {
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
    def setLong(value: String): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort(value: String): Self = this.set("short", value.asInstanceOf[js.Any])
  }
  
}

