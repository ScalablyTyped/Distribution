package typings.schemaUtils

import typings.schemaUtils.validateMod.Schema
import typings.schemaUtils.validateMod.ValidationErrorConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schema-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * @param {Schema} schema
    * @param {Array<object> | object} options
    * @param {ValidationErrorConfiguration=} configuration
    * @returns {void}
    */
  def apply(schema: Schema, options: js.Array[js.Object]): Unit = js.native
  def apply(schema: Schema, options: js.Array[js.Object], configuration: ValidationErrorConfiguration): Unit = js.native
  def apply(schema: Schema, options: js.Object): Unit = js.native
  def apply(schema: Schema, options: js.Object, configuration: ValidationErrorConfiguration): Unit = js.native
}

