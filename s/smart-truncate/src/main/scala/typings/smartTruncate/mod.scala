package typings.smartTruncate

import typings.smartTruncate.anon.Mark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(text: String, length: Double): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(text: String, length: Double, options: Mark): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], length.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("smart-truncate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
