package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for Model.upsert method
  */
@js.native
trait UpsertOptions
  extends FieldsOptions
     with LoggingOptions
     with SearchPathOptions
     with ReturningOptions
object UpsertOptions {
  
  @scala.inline
  def apply(): UpsertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpsertOptions]
  }
}
