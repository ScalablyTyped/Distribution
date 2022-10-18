package typings.stringifyEntities

import typings.stringifyEntities.libCoreMod.CoreOptions
import typings.stringifyEntities.libUtilFormatSmartMod.FormatSmartOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("stringify-entities/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringifyEntities(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyEntities")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifyEntities(value: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyEntities")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringifyEntitiesLight(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyEntitiesLight")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifyEntitiesLight(value: String, options: CoreOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyEntitiesLight")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type LightOptions = CoreOptions
  
  trait Options
    extends StObject
       with CoreOptions
       with FormatSmartOptions
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
}
