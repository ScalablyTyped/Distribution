package typings
package roxDashReactDashNativeLib.roxDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoxExperiment extends js.Object {
  var identifier: java.lang.String
  var isArchived: scala.Boolean
  var labels: js.Array[java.lang.String]
   //  experiment id
  var name: java.lang.String
}

object RoxExperiment {
  @scala.inline
  def apply(
    identifier: java.lang.String,
    isArchived: scala.Boolean,
    labels: js.Array[java.lang.String],
    name: java.lang.String
  ): RoxExperiment = {
    val __obj = js.Dynamic.literal(identifier = identifier, isArchived = isArchived, labels = labels, name = name)
  
    __obj.asInstanceOf[RoxExperiment]
  }
}

