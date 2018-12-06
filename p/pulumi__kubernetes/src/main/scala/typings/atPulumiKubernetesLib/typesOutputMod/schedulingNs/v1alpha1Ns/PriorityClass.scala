package typings
package atPulumiKubernetesLib.typesOutputMod.schedulingNs.v1alpha1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * PriorityClass defines mapping from a priority class name to the priority integer value. The
         * value can be any valid integer.
         */

trait PriorityClass extends js.Object {
  /**
               * APIVersion defines the versioned schema of this representation of an object. Servers should
               * convert recognized schemas to the latest internal value, and may reject unrecognized
               * values. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
               */
  val apiVersion: java.lang.String
  /**
               * description is an arbitrary string that usually provides guidelines on when this priority
               * class should be used.
               */
  val description: java.lang.String
  /**
               * globalDefault specifies whether this PriorityClass should be considered as the default
               * priority for pods that do not have any priority class. Only one PriorityClass can be marked
               * as `globalDefault`. However, if more than one PriorityClasses exists with their
               * `globalDefault` field set to true, the smallest value of such global default
               * PriorityClasses will be used as the default priority.
               */
  val globalDefault: scala.Boolean
  /**
               * Kind is a string value representing the REST resource this object represents. Servers may
               * infer this from the endpoint the client submits requests to. Cannot be updated. In
               * CamelCase. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
               */
  val kind: java.lang.String
  /**
               * Standard object's metadata. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
               */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
               * The value of this priority class. This is the actual priority that pods receive when they
               * have the name of this class in their pod spec.
               */
  val value: scala.Double
}

