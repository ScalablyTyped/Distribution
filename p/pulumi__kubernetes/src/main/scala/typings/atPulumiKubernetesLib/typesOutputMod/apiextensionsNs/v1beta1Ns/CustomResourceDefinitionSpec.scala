package typings
package atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * CustomResourceDefinitionSpec describes how a user wants their resource to appear
         */

trait CustomResourceDefinitionSpec extends js.Object {
  /**
               * Group is the group this resource belongs in
               */
  val group: java.lang.String
  /**
               * Names are the names used to describe this custom resource
               */
  val names: CustomResourceDefinitionNames
  /**
               * Scope indicates whether this resource is cluster or namespace scoped.  Default is
               * namespaced
               */
  val scope: java.lang.String
  /**
               * Validation describes the validation methods for CustomResources
               */
  val validation: CustomResourceValidation
  /**
               * Version is the version this resource belongs in
               */
  val version: java.lang.String
}

