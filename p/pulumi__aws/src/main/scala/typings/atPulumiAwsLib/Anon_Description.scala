package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var searchableAttributes: js.Array[java.lang.String]
}

object Anon_Description {
  @scala.inline
  def apply(searchableAttributes: js.Array[java.lang.String], description: java.lang.String = null): Anon_Description = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("searchableAttributes")(searchableAttributes)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[Anon_Description]
  }
}

