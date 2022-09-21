package typings.schemaUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hintsMod {
  
  @JSImport("schema-utils/declarations/util/hints", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def numberHints(schema: Schema, logic: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("numberHints")(schema.asInstanceOf[js.Any], logic.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def stringHints(schema: Schema, logic: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringHints")(schema.asInstanceOf[js.Any], logic.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  type Schema = typings.schemaUtils.validateMod.Schema
}
