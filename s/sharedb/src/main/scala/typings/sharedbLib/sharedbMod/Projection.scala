package typings
package sharedbLib.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  var fields: ProjectionFields
  var target: java.lang.String
}

object Projection {
  @scala.inline
  def apply(fields: ProjectionFields, target: java.lang.String): Projection = {
    val __obj = js.Dynamic.literal(fields = fields, target = target)
  
    __obj.asInstanceOf[Projection]
  }
}

