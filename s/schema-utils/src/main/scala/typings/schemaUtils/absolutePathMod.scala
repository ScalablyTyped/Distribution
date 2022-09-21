package typings.schemaUtils

import typings.ajv.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object absolutePathMod {
  
  @JSImport("schema-utils/declarations/keywords/absolutePath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * @param {Ajv} ajv
    * @returns {Ajv}
    */
  inline def default(ajv: Ajv): Ajv = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ajv.asInstanceOf[js.Any]).asInstanceOf[Ajv]
  
  type Ajv = default
  
  type AnySchemaObject = typings.ajv.distTypesMod.AnySchemaObject
  
  type SchemaUtilErrorObject = typings.schemaUtils.validateMod.SchemaUtilErrorObject
  
  type SchemaValidateFunction = typings.ajv.distTypesMod.SchemaValidateFunction
}
