package typings
package atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DeleteOptions may be provided when deleting an API object.
  */
trait DeleteOptions extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: java.lang.String
  /**
    * When present, indicates that modifications should not be persisted. An invalid or
    * unrecognized dryRun directive will result in an error response and no further processing of
    * the request. Valid values are: - All: all dry run stages will be processed
    */
  val dryRun: js.Array[java.lang.String]
  /**
    * The duration in seconds before the object should be deleted. Value must be non-negative
    * integer. The value zero indicates delete immediately. If this value is nil, the default
    * grace period for the specified type will be used. Defaults to a per object value if not
    * specified. zero means delete immediately.
    */
  val gracePeriodSeconds: scala.Double
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: java.lang.String
  /**
    * Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should
    * the dependent objects be orphaned. If true/false, the "orphan" finalizer will be added
    * to/removed from the object's finalizers list. Either this field or PropagationPolicy may be
    * set, but not both.
    */
  val orphanDependents: scala.Boolean
  /**
    * Must be fulfilled before a deletion is carried out. If not possible, a 409 Conflict status
    * will be returned.
    */
  val preconditions: Preconditions
  /**
    * Whether and how garbage collection will be performed. Either this field or OrphanDependents
    * may be set, but not both. The default policy is decided by the existing finalizer set in
    * the metadata.finalizers and the resource-specific default policy. Acceptable values are:
    * 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the
    * dependents in the background; 'Foreground' - a cascading policy that deletes all dependents
    * in the foreground.
    */
  val propagationPolicy: java.lang.String
}

object DeleteOptions {
  @scala.inline
  def apply(
    apiVersion: java.lang.String,
    dryRun: js.Array[java.lang.String],
    gracePeriodSeconds: scala.Double,
    kind: java.lang.String,
    orphanDependents: scala.Boolean,
    preconditions: Preconditions,
    propagationPolicy: java.lang.String
  ): DeleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiVersion")(apiVersion)
    __obj.updateDynamic("dryRun")(dryRun)
    __obj.updateDynamic("gracePeriodSeconds")(gracePeriodSeconds)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("orphanDependents")(orphanDependents)
    __obj.updateDynamic("preconditions")(preconditions)
    __obj.updateDynamic("propagationPolicy")(propagationPolicy)
    __obj.asInstanceOf[DeleteOptions]
  }
}

