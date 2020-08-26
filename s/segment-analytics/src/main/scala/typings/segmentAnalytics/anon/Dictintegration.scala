package typings.segmentAnalytics.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictintegration
  extends /* integration */ StringDictionary[js.UndefOr[Boolean]] {
  var All: js.UndefOr[Boolean] = js.native
}

object Dictintegration {
  @scala.inline
  def apply(): Dictintegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictintegration]
  }
  @scala.inline
  implicit class DictintegrationOps[Self <: Dictintegration] (val x: Self) extends AnyVal {
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
    def setAll(value: Boolean): Self = this.set("All", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("All", js.undefined)
  }
  
}

