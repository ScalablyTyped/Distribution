package typings.atPulumiAws.ramGetResourceShareMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_NameValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceShareResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  val arn: String
  val filters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  val id: String
  val name: String
  val resourceOwner: String
  /**
    * The Status of the RAM share.
    */
  val status: String
  /**
    * The Tags attached to the RAM share
    */
  val tags: StringDictionary[js.Any]
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
    filters: js.Array[Anon_NameValues] = null
  ): GetResourceShareResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id, name = name, resourceOwner = resourceOwner, status = status, tags = tags)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetResourceShareResult]
  }
}

