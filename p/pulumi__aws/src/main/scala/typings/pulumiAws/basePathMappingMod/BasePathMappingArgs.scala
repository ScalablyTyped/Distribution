package typings.pulumiAws.basePathMappingMod

import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasePathMappingArgs extends js.Object {
  /**
    * Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
    */
  val basePath: js.UndefOr[Input[String]] = js.native
  /**
    * The already-registered domain name to connect the API to.
    */
  val domainName: Input[String] = js.native
  /**
    * The id of the API to connect.
    */
  val restApi: Input[String | RestApi] = js.native
  /**
    * The name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
    */
  val stageName: js.UndefOr[Input[String]] = js.native
}

object BasePathMappingArgs {
  @scala.inline
  def apply(domainName: Input[String], restApi: Input[String | RestApi]): BasePathMappingArgs = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePathMappingArgs]
  }
  @scala.inline
  implicit class BasePathMappingArgsOps[Self <: BasePathMappingArgs] (val x: Self) extends AnyVal {
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
    def setDomainName(value: Input[String]): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApi(value: Input[String | RestApi]): Self = this.set("restApi", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasePath(value: Input[String]): Self = this.set("basePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    @scala.inline
    def setStageName(value: Input[String]): Self = this.set("stageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageName: Self = this.set("stageName", js.undefined)
  }
  
}

