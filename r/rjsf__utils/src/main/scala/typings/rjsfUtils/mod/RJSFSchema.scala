package typings.rjsfUtils.mod

import typings.jsonSchema.mod.JSONSchema7
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allow for more flexible schemas (i.e. draft-2019) than the strict JSONSchema7
  */
trait RJSFSchema
  extends StObject
     with JSONSchema7
     with GenericObjectType
object RJSFSchema {
  
  inline def apply(): RJSFSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RJSFSchema]
  }
}
