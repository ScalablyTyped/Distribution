package typings.pulumiAws.getResourceShareMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ram.GetResourceShareFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceShareResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  val arn: String = js.native
  val filters: js.UndefOr[js.Array[GetResourceShareFilter]] = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * The ID of the AWS account that owns the resource share.
    */
  val owningAccountId: String = js.native
  val resourceOwner: String = js.native
  /**
    * The Status of the RAM share.
    */
  val status: String = js.native
  /**
    * The Tags attached to the RAM share
    */
  val tags: StringDictionary[String] = js.native
}

object GetResourceShareResult {
  @scala.inline
  def apply(
    arn: String,
    id: String,
    name: String,
    owningAccountId: String,
    resourceOwner: String,
    status: String,
    tags: StringDictionary[String]
  ): GetResourceShareResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owningAccountId = owningAccountId.asInstanceOf[js.Any], resourceOwner = resourceOwner.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceShareResult]
  }
  @scala.inline
  implicit class GetResourceShareResultOps[Self <: GetResourceShareResult] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwningAccountId(value: String): Self = this.set("owningAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceOwner(value: String): Self = this.set("resourceOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetResourceShareFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetResourceShareFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
  
}

