package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectFieldSelector selects an APIVersioned field of an object.
  */
trait ObjectFieldSelector extends js.Object {
  /**
    * Version of the schema the FieldPath is written in terms of, defaults to "v1".
    */
  val apiVersion: java.lang.String
  /**
    * Path of the field to select in the specified API version.
    */
  val fieldPath: java.lang.String
}

object ObjectFieldSelector {
  @scala.inline
  def apply(apiVersion: java.lang.String, fieldPath: java.lang.String): ObjectFieldSelector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiVersion")(apiVersion)
    __obj.updateDynamic("fieldPath")(fieldPath)
    __obj.asInstanceOf[ObjectFieldSelector]
  }
}

