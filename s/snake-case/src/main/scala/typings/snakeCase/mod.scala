package typings.snakeCase

import typings.noCase.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snake-case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def snakeCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("snakeCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def snakeCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("snakeCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
