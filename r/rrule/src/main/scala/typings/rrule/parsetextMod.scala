package typings.rrule

import typings.rrule.anon.PartialOptions
import typings.rrule.i18nMod.Language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parsetextMod {
  
  @JSImport("rrule/dist/esm/src/nlp/parsetext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(text: String): PartialOptions | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any]).asInstanceOf[PartialOptions | Null]
  inline def default(text: String, language: Language): PartialOptions | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[PartialOptions | Null]
}
