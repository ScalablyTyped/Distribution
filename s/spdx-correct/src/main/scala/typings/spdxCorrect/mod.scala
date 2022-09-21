package typings.spdxCorrect

import typings.spdxCorrect.anon.Upgrade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(identifier: String): String | Null = ^.asInstanceOf[js.Dynamic].apply(identifier.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def apply(identifier: String, options: Upgrade): String | Null = (^.asInstanceOf[js.Dynamic].apply(identifier.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @JSImport("spdx-correct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
