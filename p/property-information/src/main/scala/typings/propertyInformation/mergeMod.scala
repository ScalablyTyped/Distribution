package typings.propertyInformation

import typings.propertyInformation.schemaMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeMod {
  
  @JSImport("property-information/lib/util/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def merge(definitions: js.Array[Schema]): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(definitions.asInstanceOf[js.Any]).asInstanceOf[Schema]
  inline def merge(definitions: js.Array[Schema], space: String): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(definitions.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Schema]
  
  type Normal = typings.propertyInformation.schemaMod.Normal
  
  type Properties = typings.propertyInformation.schemaMod.Properties
}
