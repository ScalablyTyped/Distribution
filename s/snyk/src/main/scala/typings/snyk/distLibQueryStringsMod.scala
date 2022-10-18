package typings.snyk

import typings.snyk.distCliArgsMod.ArgsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibQueryStringsMod {
  
  @JSImport("snyk/dist/lib/query-strings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getQueryParamsAsString(args: js.Array[ArgsOptions]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryParamsAsString")(args.asInstanceOf[js.Any]).asInstanceOf[String]
}
