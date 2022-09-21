package typings.slate

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepEqualMod {
  
  @JSImport("slate/dist/utils/deep-equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDeepEqual(node: Record[String, Any], another: Record[String, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeepEqual")(node.asInstanceOf[js.Any], another.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
