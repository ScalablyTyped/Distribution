package typings.ramlTypesystem

import typings.ramlJsonValidation.mod.JSONValidator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcJsonUtilMod {
  
  @JSImport("raml-typesystem/dist/src/jsonUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getValidator(): JSONValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("getValidator")().asInstanceOf[JSONValidator]
}
