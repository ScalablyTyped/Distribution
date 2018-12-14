package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * ConfigMap holds configuration data for pods to consume.
         */

trait ConfigMap extends js.Object {
  /**
               * APIVersion defines the versioned schema of this representation of an object. Servers should
               * convert recognized schemas to the latest internal value, and may reject unrecognized
               * values. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
               */
  val apiVersion: java.lang.String
  /**
               * BinaryData contains the binary data. Each key must consist of alphanumeric characters, '-',
               * '_' or '.'. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys
               * stored in BinaryData must not overlap with the ones in the Data field, this is enforced
               * during validation process. Using this field will require 1.10+ apiserver and kubelet.
               */
  val binaryData: js.Object
  /**
               * Data contains the configuration data. Each key must consist of alphanumeric characters,
               * '-', '_' or '.'. Values with non-UTF-8 byte sequences must use the BinaryData field. The
               * keys stored in Data must not overlap with the keys in the BinaryData field, this is
               * enforced during validation process.
               */
  val data: org.scalablytyped.runtime.StringDictionary[java.lang.String]
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
}

