package typings.puppeteer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeUtilMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/node/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tmpdir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpdir")().asInstanceOf[String]
}
