package typings.safeRegex

import typings.safeRegex.anon.Limit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(re: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(re.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(re: String, opts: Limit): Boolean = (^.asInstanceOf[js.Dynamic].apply(re.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(re: js.RegExp): Boolean = ^.asInstanceOf[js.Dynamic].apply(re.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(re: js.RegExp, opts: Limit): Boolean = (^.asInstanceOf[js.Dynamic].apply(re.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("safe-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
