package typings.reTemplateTag

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("re-template-tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def quoteText(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quoteText")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def re(strs: TemplateStringsArray, substs: (String | js.RegExp)*): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("re")(List(strs.asInstanceOf[js.Any]).`++`(substs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.RegExp]
}
