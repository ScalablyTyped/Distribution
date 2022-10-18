package typings.rrule

import typings.rrule.anon.PartialOptions
import typings.rrule.distEsmNlpI18nMod.Language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmNlpParsetextMod {
  
  @JSImport("rrule/dist/esm/nlp/parsetext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(text: String): PartialOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any]).asInstanceOf[PartialOptions]
  inline def default(text: String, language: Language): PartialOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[PartialOptions]
}
