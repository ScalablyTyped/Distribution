package typings.pulumiAws.defaultRouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.DefaultRouteTableRoute
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultRouteTableArgs extends js.Object {
  /**
    * The ID of the Default Routing Table.
    */
  val defaultRouteTableId: Input[String] = js.native
  /**
    * A list of virtual gateways for propagation.
    */
  val propagatingVgws: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of route objects. Their keys are documented below.
    */
  val routes: js.UndefOr[Input[js.Array[Input[DefaultRouteTableRoute]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object DefaultRouteTableArgs {
  @scala.inline
  def apply(defaultRouteTableId: Input[String]): DefaultRouteTableArgs = {
    val __obj = js.Dynamic.literal(defaultRouteTableId = defaultRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultRouteTableArgs]
  }
  @scala.inline
  implicit class DefaultRouteTableArgsOps[Self <: DefaultRouteTableArgs] (val x: Self) extends AnyVal {
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
    def setDefaultRouteTableId(value: Input[String]): Self = this.set("defaultRouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropagatingVgwsVarargs(value: Input[String]*): Self = this.set("propagatingVgws", js.Array(value :_*))
    @scala.inline
    def setPropagatingVgws(value: Input[js.Array[Input[String]]]): Self = this.set("propagatingVgws", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropagatingVgws: Self = this.set("propagatingVgws", js.undefined)
    @scala.inline
    def setRoutesVarargs(value: Input[DefaultRouteTableRoute]*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: Input[js.Array[Input[DefaultRouteTableRoute]]]): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

