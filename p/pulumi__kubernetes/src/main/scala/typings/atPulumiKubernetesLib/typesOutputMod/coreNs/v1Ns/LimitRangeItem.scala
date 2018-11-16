package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
         */

trait LimitRangeItem extends js.Object {
  /**
               * Default resource requirement limit value by resource name if resource limit is omitted.
               */
  val default: js.Object
  /**
               * DefaultRequest is the default resource requirement request value by resource name if
               * resource request is omitted.
               */
  val defaultRequest: js.Object
  /**
               * Max usage constraints on this kind by resource name.
               */
  val max: js.Object
  /**
               * MaxLimitRequestRatio if specified, the named resource must have a request and limit that
               * are both non-zero where limit divided by request is less than or equal to the enumerated
               * value; this represents the max burst for the named resource.
               */
  val maxLimitRequestRatio: js.Object
  /**
               * Min usage constraints on this kind by resource name.
               */
  val min: js.Object
  /**
               * Type of resource that this limit applies to.
               */
  val `type`: java.lang.String
}

