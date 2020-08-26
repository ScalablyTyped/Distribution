package typings.sharepoint.SP.DateTimeUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleDate extends js.Object {
  def get_day(): Double = js.native
  def get_era(): Double = js.native
  def get_month(): Double = js.native
  def get_year(): Double = js.native
  def set_day(value: Double): Unit = js.native
  def set_era(value: Double): Unit = js.native
  def set_month(value: Double): Unit = js.native
  def set_year(value: Double): Unit = js.native
}

object SimpleDate {
  @scala.inline
  def apply(
    get_day: () => Double,
    get_era: () => Double,
    get_month: () => Double,
    get_year: () => Double,
    set_day: Double => Unit,
    set_era: Double => Unit,
    set_month: Double => Unit,
    set_year: Double => Unit
  ): SimpleDate = {
    val __obj = js.Dynamic.literal(get_day = js.Any.fromFunction0(get_day), get_era = js.Any.fromFunction0(get_era), get_month = js.Any.fromFunction0(get_month), get_year = js.Any.fromFunction0(get_year), set_day = js.Any.fromFunction1(set_day), set_era = js.Any.fromFunction1(set_era), set_month = js.Any.fromFunction1(set_month), set_year = js.Any.fromFunction1(set_year))
    __obj.asInstanceOf[SimpleDate]
  }
  @scala.inline
  implicit class SimpleDateOps[Self <: SimpleDate] (val x: Self) extends AnyVal {
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
    def setGet_day(value: () => Double): Self = this.set("get_day", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_era(value: () => Double): Self = this.set("get_era", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_month(value: () => Double): Self = this.set("get_month", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_year(value: () => Double): Self = this.set("get_year", js.Any.fromFunction0(value))
    @scala.inline
    def setSet_day(value: Double => Unit): Self = this.set("set_day", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_era(value: Double => Unit): Self = this.set("set_era", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_month(value: Double => Unit): Self = this.set("set_month", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_year(value: Double => Unit): Self = this.set("set_year", js.Any.fromFunction1(value))
  }
  
}

