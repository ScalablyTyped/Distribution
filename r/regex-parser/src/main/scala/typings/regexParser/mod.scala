package typings.regexParser

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(regexString: String): RegExp = ^.asInstanceOf[js.Dynamic].apply(regexString.asInstanceOf[js.Any]).asInstanceOf[RegExp]
  
  @JSImport("regex-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
