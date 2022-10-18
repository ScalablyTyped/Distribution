package typings.schematicsAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilityValidationMod {
  
  @JSImport("@schematics/angular/utility/validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@schematics/angular/utility/validation", "htmlSelectorRe")
  @js.native
  val htmlSelectorRe: js.RegExp = js.native
  
  inline def validateClassName(className: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateClassName")(className.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateHtmlSelector(selector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateHtmlSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
