package typings.sanitizeFilename

import typings.sanitizeFilename.anon.Replacement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(input: String): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(input: String, options: Replacement): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("sanitize-filename", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
