package typings.atPulumiKubernetes.typesOutputMod.apiextensionsNs.v1beta1Ns

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
  val acceptedNames: CustomResourceDefinitionNames
  /**
    * conditions indicate state for particular aspects of a CustomResourceDefinition
    */
  val conditions: js.Array[CustomResourceDefinitionCondition]
  /**
    * storedVersions lists all versions of CustomResources that were ever persisted. Tracking
    * these versions allows a migration path for stored versions in etcd. The field is mutable so
    * a migration controller can finish a migration to another version (ensuring no old objects
    * are left in storage), and then remove the rest of the versions from this list. Versions may
    * not be removed from `spec.versions` while they exist in this list.
    */
  val storedVersions: js.Array[String]
}

object CustomResourceDefinitionStatus {
  @scala.inline
  def apply(
    acceptedNames: CustomResourceDefinitionNames,
    conditions: js.Array[CustomResourceDefinitionCondition],
    storedVersions: js.Array[String]
  ): CustomResourceDefinitionStatus = {
    val __obj = js.Dynamic.literal(acceptedNames = acceptedNames, conditions = conditions, storedVersions = storedVersions)
  
    __obj.asInstanceOf[CustomResourceDefinitionStatus]
  }
}

