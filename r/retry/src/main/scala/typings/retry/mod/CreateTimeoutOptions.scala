package typings.retry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTimeoutOptions extends js.Object {
  /**
    * The exponential factor to use.
    * @default 2
    */
  var factor: js.UndefOr[Double] = js.native
  /**
    * The maximum number of milliseconds between two retries.
    * @default Infinity
    */
  var maxTimeout: js.UndefOr[Double] = js.native
  /**
    * The number of milliseconds before starting the first retry.
    * @default 1000
    */
  var minTimeout: js.UndefOr[Double] = js.native
  /**
    * Randomizes the timeouts by multiplying a factor between 1-2.
    * @default false
    */
  var randomize: js.UndefOr[Boolean] = js.native
}

object CreateTimeoutOptions {
  @scala.inline
  def apply(): CreateTimeoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTimeoutOptions]
  }
  @scala.inline
  implicit class CreateTimeoutOptionsOps[Self <: CreateTimeoutOptions] (val x: Self) extends AnyVal {
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
    def setFactor(value: Double): Self = this.set("factor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactor: Self = this.set("factor", js.undefined)
    @scala.inline
    def setMaxTimeout(value: Double): Self = this.set("maxTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTimeout: Self = this.set("maxTimeout", js.undefined)
    @scala.inline
    def setMinTimeout(value: Double): Self = this.set("minTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTimeout: Self = this.set("minTimeout", js.undefined)
    @scala.inline
    def setRandomize(value: Boolean): Self = this.set("randomize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandomize: Self = this.set("randomize", js.undefined)
  }
  
}

