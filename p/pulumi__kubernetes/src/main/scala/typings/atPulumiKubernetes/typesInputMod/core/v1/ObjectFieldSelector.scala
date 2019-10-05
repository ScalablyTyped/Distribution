package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * Path of the field to select in the specified API version.
    */
  var fieldPath: Input[String]
}

object ObjectFieldSelector {
  @scala.inline
  def apply(fieldPath: Input[String], apiVersion: Input[String] = null): ObjectFieldSelector = {
    val __obj = js.Dynamic.literal(fieldPath = fieldPath.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectFieldSelector]
  }
}

