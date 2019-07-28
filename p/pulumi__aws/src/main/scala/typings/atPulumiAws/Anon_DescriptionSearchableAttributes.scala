package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionSearchableAttributes extends js.Object {
  var description: js.UndefOr[Input[String]] = js.undefined
  var searchableAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object Anon_DescriptionSearchableAttributes {
  @scala.inline
  def apply(description: Input[String] = null, searchableAttributes: Input[js.Array[Input[String]]] = null): Anon_DescriptionSearchableAttributes = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (searchableAttributes != null) __obj.updateDynamic("searchableAttributes")(searchableAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DescriptionSearchableAttributes]
  }
}

