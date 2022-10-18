package typings.stringifyEntities

import typings.stringifyEntities.libCoreMod.CoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stringify-entities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringifyEntities(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyEntities")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifyEntities(value: String, options: typings.stringifyEntities.libMod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyEntities")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringifyEntitiesLight(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyEntitiesLight")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifyEntitiesLight(value: String, options: CoreOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyEntitiesLight")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type LightOptions = typings.stringifyEntities.libMod.LightOptions
  
  type Options = typings.stringifyEntities.libMod.Options
}
