package typings.reactFns.mediaMediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaProps extends js.Object {
  var matches: Boolean = js.native
}

object MediaProps {
  @scala.inline
  def apply(matches: Boolean): MediaProps = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaProps]
  }
  @scala.inline
  implicit class MediaPropsOps[Self <: MediaProps] (val x: Self) extends AnyVal {
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
    def setMatches(value: Boolean): Self = this.set("matches", value.asInstanceOf[js.Any])
  }
  
}

