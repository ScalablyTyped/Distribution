package typings.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheFrom extends js.Object {
  /**
    * An optional list of build stages to use for caching. Each build stage in this list will be built explicitly and
    * pushed to the target repository. A given stage's image will be tagged as "[stage-name]".
    */
  var stages: js.UndefOr[js.Array[String]] = js.native
}

object CacheFrom {
  @scala.inline
  def apply(): CacheFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheFrom]
  }
  @scala.inline
  implicit class CacheFromOps[Self <: CacheFrom] (val x: Self) extends AnyVal {
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
    def setStagesVarargs(value: String*): Self = this.set("stages", js.Array(value :_*))
    @scala.inline
    def setStages(value: js.Array[String]): Self = this.set("stages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStages: Self = this.set("stages", js.undefined)
  }
  
}

