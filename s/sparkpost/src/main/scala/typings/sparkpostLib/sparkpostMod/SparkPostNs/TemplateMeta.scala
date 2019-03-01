package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateMeta extends js.Object {
  /** Template description */
  var description: java.lang.String
  /** Unique template ID */
  var id: java.lang.String
  /** Template name */
  var name: java.lang.String
  /** Published state of the template (true = published, false = draft) */
  var published: scala.Boolean
}

object TemplateMeta {
  @scala.inline
  def apply(
    description: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    published: scala.Boolean
  ): TemplateMeta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("published")(published)
    __obj.asInstanceOf[TemplateMeta]
  }
}

