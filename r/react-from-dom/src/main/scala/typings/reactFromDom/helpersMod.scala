package typings.reactFromDom

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("react-from-dom/lib/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-from-dom/lib/helpers", "noTextChildNodes")
  @js.native
  val noTextChildNodes: js.Array[String] = js.native
  
  @JSImport("react-from-dom/lib/helpers", "possibleStandardNames")
  @js.native
  val possibleStandardNames: Record[String, js.Any] = js.native
  
  @scala.inline
  def styleToObject(input: String): Record[String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleToObject")(input.asInstanceOf[js.Any]).asInstanceOf[Record[String, js.Any]]
}
