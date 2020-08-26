package typings.pulumiAws.appmeshRouteMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.appmesh.RouteSpec
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteState extends js.Object {
  /**
    * The ARN of the route.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The creation date of the route.
    */
  val createdDate: js.UndefOr[Input[String]] = js.native
  /**
    * The last update date of the route.
    */
  val lastUpdatedDate: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the service mesh in which to create the route.
    */
  val meshName: js.UndefOr[Input[String]] = js.native
  /**
    * The name to use for the route.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The route specification to apply.
    */
  val spec: js.UndefOr[Input[RouteSpec]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The name of the virtual router in which to create the route.
    */
  val virtualRouterName: js.UndefOr[Input[String]] = js.native
}

object RouteState {
  @scala.inline
  def apply(): RouteState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteState]
  }
  @scala.inline
  implicit class RouteStateOps[Self <: RouteState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCreatedDate(value: Input[String]): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    @scala.inline
    def setLastUpdatedDate(value: Input[String]): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("lastUpdatedDate", js.undefined)
    @scala.inline
    def setMeshName(value: Input[String]): Self = this.set("meshName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeshName: Self = this.set("meshName", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSpec(value: Input[RouteSpec]): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVirtualRouterName(value: Input[String]): Self = this.set("virtualRouterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualRouterName: Self = this.set("virtualRouterName", js.undefined)
  }
  
}

