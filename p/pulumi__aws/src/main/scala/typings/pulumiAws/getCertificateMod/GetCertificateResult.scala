package typings.pulumiAws.getCertificateMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateResult extends js.Object {
  /**
    * Set to the ARN of the found certificate, suitable for referencing in other resources that support ACM certificates.
    */
  val arn: String = js.native
  val domain: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val keyTypes: js.UndefOr[js.Array[String]] = js.native
  val mostRecent: js.UndefOr[Boolean] = js.native
  val statuses: js.UndefOr[js.Array[String]] = js.native
  /**
    * A mapping of tags for the resource.
    */
  val tags: StringDictionary[String] = js.native
  val types: js.UndefOr[js.Array[String]] = js.native
}

object GetCertificateResult {
  @scala.inline
  def apply(arn: String, domain: String, id: String, tags: StringDictionary[String]): GetCertificateResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateResult]
  }
  @scala.inline
  implicit class GetCertificateResultOps[Self <: GetCertificateResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyTypesVarargs(value: String*): Self = this.set("keyTypes", js.Array(value :_*))
    @scala.inline
    def setKeyTypes(value: js.Array[String]): Self = this.set("keyTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyTypes: Self = this.set("keyTypes", js.undefined)
    @scala.inline
    def setMostRecent(value: Boolean): Self = this.set("mostRecent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMostRecent: Self = this.set("mostRecent", js.undefined)
    @scala.inline
    def setStatusesVarargs(value: String*): Self = this.set("statuses", js.Array(value :_*))
    @scala.inline
    def setStatuses(value: js.Array[String]): Self = this.set("statuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatuses: Self = this.set("statuses", js.undefined)
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}

