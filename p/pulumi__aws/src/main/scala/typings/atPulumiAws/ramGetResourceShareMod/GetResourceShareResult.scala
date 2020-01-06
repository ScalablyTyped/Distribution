package typings.atPulumiAws.ramGetResourceShareMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ram.GetResourceShareFilter
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
    * The Amazon Resource Name (ARN) of the resource share.
    */
  val id: String = js.native
  val name: String = js.native
  val resourceOwner: String = js.native
  /**
    * The Status of the RAM share.
    */
  val status: String = js.native
  /**
    * The Tags attached to the RAM share
    */
  val tags: StringDictionary[js.Any] = js.native
}

object GetResourceShareResult {
  @scala.inline
  def apply(
    arn: String,
    id: String,
    name: String,
    resourceOwner: String,
    status: String,
    tags: StringDictionary[js.Any],
    filters: js.Array[GetResourceShareFilter] = null
  ): GetResourceShareResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceOwner = resourceOwner.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceShareResult]
  }
}

