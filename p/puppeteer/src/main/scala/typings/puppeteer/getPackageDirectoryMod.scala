package typings.puppeteer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPackageDirectoryMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/util/getPackageDirectory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPackageDirectory(from: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageDirectory")(from.asInstanceOf[js.Any]).asInstanceOf[String]
}
