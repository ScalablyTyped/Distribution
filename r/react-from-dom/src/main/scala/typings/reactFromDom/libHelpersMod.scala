package typings.reactFromDom

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersMod {
  
  @JSImport("react-from-dom/lib/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-from-dom/lib/helpers", "noTextChildNodes")
  @js.native
  val noTextChildNodes: js.Array[String] = js.native
  
  @JSImport("react-from-dom/lib/helpers", "possibleStandardNames")
  @js.native
  val possibleStandardNames: Record[String, Any] = js.native
  
  inline def randomString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomString")().asInstanceOf[String]
  inline def randomString(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomString")(length.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def styleToObject(input: String): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleToObject")(input.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
}
