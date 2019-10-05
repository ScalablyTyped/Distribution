package typings.atPulumiKubernetes.typesInputMod.meta.v1

import typings.atPulumiPulumi.outputMod.Input
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
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * When present, indicates that modifications should not be persisted. An invalid or
    * unrecognized dryRun directive will result in an error response and no further processing of
    * the request. Valid values are: - All: all dry run stages will be processed
    */
  var dryRun: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The duration in seconds before the object should be deleted. Value must be non-negative
    * integer. The value zero indicates delete immediately. If this value is nil, the default
    * grace period for the specified type will be used. Defaults to a per object value if not
    * specified. zero means delete immediately.
    */
  var gracePeriodSeconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[String]] = js.undefined
  /**
    * Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should
    * the dependent objects be orphaned. If true/false, the "orphan" finalizer will be added
    * to/removed from the object's finalizers list. Either this field or PropagationPolicy may be
    * set, but not both.
    */
  var orphanDependents: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Must be fulfilled before a deletion is carried out. If not possible, a 409 Conflict status
    * will be returned.
    */
  var preconditions: js.UndefOr[Input[Preconditions]] = js.undefined
  /**
    * Whether and how garbage collection will be performed. Either this field or OrphanDependents
    * may be set, but not both. The default policy is decided by the existing finalizer set in
    * the metadata.finalizers and the resource-specific default policy. Acceptable values are:
    * 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the
    * dependents in the background; 'Foreground' - a cascading policy that deletes all dependents
    * in the foreground.
    */
  var propagationPolicy: js.UndefOr[Input[String]] = js.undefined
}

object DeleteOptions {
  @scala.inline
  def apply(
    apiVersion: Input[String] = null,
    dryRun: Input[js.Array[Input[String]]] = null,
    gracePeriodSeconds: Input[Double] = null,
    kind: Input[String] = null,
    orphanDependents: Input[Boolean] = null,
    preconditions: Input[Preconditions] = null,
    propagationPolicy: Input[String] = null
  ): DeleteOptions = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (dryRun != null) __obj.updateDynamic("dryRun")(dryRun.asInstanceOf[js.Any])
    if (gracePeriodSeconds != null) __obj.updateDynamic("gracePeriodSeconds")(gracePeriodSeconds.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (orphanDependents != null) __obj.updateDynamic("orphanDependents")(orphanDependents.asInstanceOf[js.Any])
    if (preconditions != null) __obj.updateDynamic("preconditions")(preconditions.asInstanceOf[js.Any])
    if (propagationPolicy != null) __obj.updateDynamic("propagationPolicy")(propagationPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOptions]
  }
}

