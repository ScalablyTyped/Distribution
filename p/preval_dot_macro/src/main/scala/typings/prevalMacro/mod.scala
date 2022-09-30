package typings.prevalMacro

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(strings: TemplateStringsArray, values: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  @JSImport("preval.macro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
