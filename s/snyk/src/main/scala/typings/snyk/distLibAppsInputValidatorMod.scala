package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibAppsInputValidatorMod {
  
  @JSImport("snyk/dist/lib/apps/input-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validInput(input: String): String | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validInput")(input.asInstanceOf[js.Any]).asInstanceOf[String | Boolean]
  
  inline def validURL(input: String): Boolean | String = ^.asInstanceOf[js.Dynamic].applyDynamic("validURL")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean | String]
  
  inline def validateAllURL(input: String): String | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAllURL")(input.asInstanceOf[js.Any]).asInstanceOf[String | Boolean]
  
  inline def validateUUID(input: String): Boolean | String = ^.asInstanceOf[js.Dynamic].applyDynamic("validateUUID")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean | String]
}
