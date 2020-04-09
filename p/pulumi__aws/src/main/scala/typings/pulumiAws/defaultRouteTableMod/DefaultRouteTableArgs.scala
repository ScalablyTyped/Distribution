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
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object DefaultRouteTableArgs {
  @scala.inline
  def apply(
    defaultRouteTableId: Input[String],
    propagatingVgws: Input[js.Array[Input[String]]] = null,
    routes: Input[js.Array[Input[DefaultRouteTableRoute]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): DefaultRouteTableArgs = {
    val __obj = js.Dynamic.literal(defaultRouteTableId = defaultRouteTableId.asInstanceOf[js.Any])
    if (propagatingVgws != null) __obj.updateDynamic("propagatingVgws")(propagatingVgws.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultRouteTableArgs]
  }
}

