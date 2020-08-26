package typings.pulumiAws.outputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionCustomErrorResponse extends js.Object {
  /**
    * The minimum amount of time you want
    * HTTP error codes to stay in CloudFront caches before CloudFront queries your
    * origin to see whether the object has been updated.
    */
  var errorCachingMinTtl: js.UndefOr[Double] = js.native
  /**
    * The 4xx or 5xx HTTP status code that you want to
    * customize.
    */
  var errorCode: Double = js.native
  /**
    * The HTTP status code that you want CloudFront
    * to return with the custom error page to the viewer.
    */
  var responseCode: js.UndefOr[Double] = js.native
  /**
    * The path of the custom error page (for
    * example, `/custom_404.html`).
    */
  var responsePagePath: js.UndefOr[String] = js.native
}

object DistributionCustomErrorResponse {
  @scala.inline
  def apply(errorCode: Double): DistributionCustomErrorResponse = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionCustomErrorResponse]
  }
  @scala.inline
  implicit class DistributionCustomErrorResponseOps[Self <: DistributionCustomErrorResponse] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorCachingMinTtl(value: Double): Self = this.set("errorCachingMinTtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCachingMinTtl: Self = this.set("errorCachingMinTtl", js.undefined)
    @scala.inline
    def setResponseCode(value: Double): Self = this.set("responseCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseCode: Self = this.set("responseCode", js.undefined)
    @scala.inline
    def setResponsePagePath(value: String): Self = this.set("responsePagePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsePagePath: Self = this.set("responsePagePath", js.undefined)
  }
  
}

