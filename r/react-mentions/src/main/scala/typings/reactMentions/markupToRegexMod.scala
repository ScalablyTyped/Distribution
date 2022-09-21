package typings.reactMentions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markupToRegexMod {
  
  @JSImport("react-mentions/lib/utils/markupToRegex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def markupToRegex(markup: String): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("markupToRegex")(markup.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
}
