package typings
package atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
         */

trait CustomResourceDefinitionStatus extends js.Object {
  /**
               * AcceptedNames are the names that are actually being used to serve discovery They may be
               * different than the names in spec.
               */
  val acceptedNames: CustomResourceDefinitionNames
  /**
               * Conditions indicate state for particular aspects of a CustomResourceDefinition
               */
  val conditions: js.Array[CustomResourceDefinitionCondition]
  /**
               * StoredVersions are all versions of CustomResources that were ever persisted. Tracking these
               * versions allows a migration path for stored versions in etcd. The field is mutable so the
               * migration controller can first finish a migration to another version (i.e. that no old
               * objects are left in the storage), and then remove the rest of the versions from this list.
               * None of the versions in this list can be removed from the spec.Versions field.
               */
  val storedVersions: js.Array[java.lang.String]
}

