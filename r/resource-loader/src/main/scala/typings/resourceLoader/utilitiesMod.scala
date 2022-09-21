package typings.resourceLoader

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilitiesMod {
  
  @JSImport("resource-loader/dist/utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertNever(x: scala.Nothing): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNever")(x.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def getExtension(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type Overwrite[T1, T2] = typings.resourceLoader.resourceLoaderStrings.Overwrite & TopLevel[T1] & T2
}
