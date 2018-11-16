package typings
package atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * APIGroupList is a list of APIGroup, to allow clients to discover the API at /apis.
         */

trait APIGroupList extends js.Object {
  /**
               * APIVersion defines the versioned schema of this representation of an object. Servers should
               * convert recognized schemas to the latest internal value, and may reject unrecognized
               * values. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
               */
  val apiVersion: java.lang.String
  /**
               * groups is a list of APIGroup.
               */
  val groups: js.Array[APIGroup]
  /**
               * Kind is a string value representing the REST resource this object represents. Servers may
               * infer this from the endpoint the client submits requests to. Cannot be updated. In
               * CamelCase. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
               */
  val kind: java.lang.String
}

