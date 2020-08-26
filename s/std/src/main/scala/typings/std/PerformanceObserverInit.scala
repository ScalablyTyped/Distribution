package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerformanceObserverInit extends js.Object {
  var buffered: js.UndefOr[scala.Boolean] = js.native
  var entryTypes: js.UndefOr[js.Array[java.lang.String]] = js.native
  var `type`: js.UndefOr[java.lang.String] = js.native
}

object PerformanceObserverInit {
  @scala.inline
  def apply(): PerformanceObserverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceObserverInit]
  }
  @scala.inline
  implicit class PerformanceObserverInitOps[Self <: PerformanceObserverInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuffered(value: scala.Boolean): Self = this.set("buffered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffered: Self = this.set("buffered", js.undefined)
    @scala.inline
    def setEntryTypesVarargs(value: java.lang.String*): Self = this.set("entryTypes", js.Array(value :_*))
    @scala.inline
    def setEntryTypes(value: js.Array[java.lang.String]): Self = this.set("entryTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntryTypes: Self = this.set("entryTypes", js.undefined)
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

