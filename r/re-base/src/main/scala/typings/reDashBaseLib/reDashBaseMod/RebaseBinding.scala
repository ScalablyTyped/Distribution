package typings
package reDashBaseLib.reDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebaseBinding extends js.Object {
  var context: js.Object
  var endpoint: java.lang.String
  var id: scala.Double
  var method: java.lang.String
}

object RebaseBinding {
  @scala.inline
  def apply(context: js.Object, endpoint: java.lang.String, id: scala.Double, method: java.lang.String): RebaseBinding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("endpoint")(endpoint)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[RebaseBinding]
  }
}

