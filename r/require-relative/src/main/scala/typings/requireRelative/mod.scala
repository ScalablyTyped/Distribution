package typings.requireRelative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(id: String): js.Any = ^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def apply(id: String, relativeTo: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("require-relative", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolve(id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(id.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def resolve(id: String, relativeTo: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(id.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[String]
}
