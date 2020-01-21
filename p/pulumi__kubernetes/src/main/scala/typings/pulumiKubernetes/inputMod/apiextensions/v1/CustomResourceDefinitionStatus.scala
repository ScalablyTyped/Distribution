package typings.pulumiKubernetes.inputMod.apiextensions.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
  */
trait CustomResourceDefinitionStatus extends js.Object {
  /**
    * acceptedNames are the names that are actually being used to serve discovery. They may be
    * different than the names in spec.
    */
  var acceptedNames: Input[CustomResourceDefinitionNames]
  /**
    * conditions indicate state for particular aspects of a CustomResourceDefinition
    */
  var conditions: js.UndefOr[Input[js.Array[Input[CustomResourceDefinitionCondition]]]] = js.undefined
  /**
    * storedVersions lists all versions of CustomResources that were ever persisted. Tracking
    * these versions allows a migration path for stored versions in etcd. The field is mutable so
    * a migration controller can finish a migration to another version (ensuring no old objects
    * are left in storage), and then remove the rest of the versions from this list. Versions may
    * not be removed from `spec.versions` while they exist in this list.
    */
  var storedVersions: Input[js.Array[Input[String]]]
}

object CustomResourceDefinitionStatus {
  @scala.inline
  def apply(
    acceptedNames: Input[CustomResourceDefinitionNames],
    storedVersions: Input[js.Array[Input[String]]],
    conditions: Input[js.Array[Input[CustomResourceDefinitionCondition]]] = null
  ): CustomResourceDefinitionStatus = {
    val __obj = js.Dynamic.literal(acceptedNames = acceptedNames.asInstanceOf[js.Any], storedVersions = storedVersions.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionStatus]
  }
}

