package typings.resourceLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilitiesMod {
  
  @JSImport("resource-loader/dist/utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertNever(x: scala.Nothing): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNever")(x.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def getExtension(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type Overwrite[T1, T2] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in std.Exclude<keyof T1, keyof T2> ]: T1[P]} */ js.Any) & T2
}
