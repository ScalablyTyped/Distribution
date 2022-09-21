package typings.propertyInformation

import typings.propertyInformation.infoMod.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findMod {
  
  @JSImport("property-information/lib/find", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def find(schema: Schema, value: String): Info = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(schema.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Info]
  
  type Schema = typings.propertyInformation.schemaMod.Schema
}
