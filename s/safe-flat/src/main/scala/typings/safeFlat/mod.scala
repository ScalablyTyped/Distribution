package typings.safeFlat

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("safe-flat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flatten(a: Record[String | Double, Any]): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(a.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  inline def flatten(a: Record[String | Double, Any], delimiter: String): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(a.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def unflatten(`object`: Record[String, Any]): Record[String | Double, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("unflatten")(`object`.asInstanceOf[js.Any]).asInstanceOf[Record[String | Double, Any]]
  inline def unflatten(`object`: Record[String, Any], delimiter: String): Record[String | Double, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unflatten")(`object`.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[Record[String | Double, Any]]
}
