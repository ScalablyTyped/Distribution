package typings.promClient.mod.Histogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
  		 * Buckets used in the histogram
  		 */
  var buckets: js.UndefOr[js.Array[Double]] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setBucketsVarargs(value: Double*): Self = this.set("buckets", js.Array(value :_*))
    @scala.inline
    def setBuckets(value: js.Array[Double]): Self = this.set("buckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuckets: Self = this.set("buckets", js.undefined)
  }
  
}

