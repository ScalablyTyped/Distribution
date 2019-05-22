package typings
package atPulumiAwsLib.ramGetResourceShareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceShareResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  val arn: java.lang.String
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  val id: java.lang.String
  val name: java.lang.String
  val resourceOwner: java.lang.String
  /**
    * The Status of the RAM share.
    */
  val status: java.lang.String
  /**
    * The Tags attached to the RAM share
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object GetResourceShareResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    resourceOwner: java.lang.String,
    status: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null
  ): GetResourceShareResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id, name = name, resourceOwner = resourceOwner, status = status, tags = tags)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetResourceShareResult]
  }
}

