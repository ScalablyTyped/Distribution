package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * ResourceQuotaSpec defines the desired hard limits to enforce for Quota.
         */

trait ResourceQuotaSpec extends js.Object {
  /**
               * Hard is the set of desired hard limits for each named resource. More info:
               * https://kubernetes.io/docs/concepts/policy/resource-quotas/
               */
  val hard: js.Object
  /**
               * A collection of filters that must match each object tracked by a quota. If not specified,
               * the quota matches all objects.
               */
  val scopes: js.Array[java.lang.String]
}

