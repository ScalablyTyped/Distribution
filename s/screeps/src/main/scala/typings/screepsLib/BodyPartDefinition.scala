package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * An array describing the creep’s body. Each element contains the following properties:
 */

trait BodyPartDefinition extends js.Object {
  /**
       * One of the `RESOURCE_*` constants.
       *
       * If the body part is boosted, this property specifies the mineral type which is used for boosting.
       */
  var boost: js.UndefOr[ResourceConstant] = js.undefined
  /**
       * The remaining amount of hit points of this body part.
       */
  var hits: scala.Double
  /**
       * One of the body part types constants.
       */
  var `type`: BodyPartConstant
}

