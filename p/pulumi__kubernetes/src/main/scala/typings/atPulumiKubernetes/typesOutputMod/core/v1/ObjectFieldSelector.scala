package typings.atPulumiKubernetes.typesOutputMod.core.v1

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
  val apiVersion: String
  /**
    * Path of the field to select in the specified API version.
    */
  val fieldPath: String
}

object ObjectFieldSelector {
  @scala.inline
  def apply(apiVersion: String, fieldPath: String): ObjectFieldSelector = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, fieldPath = fieldPath)
  
    __obj.asInstanceOf[ObjectFieldSelector]
  }
}

