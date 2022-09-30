package typings.storybookClientApi

import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryparamsMod {
  
  @JSImport("@storybook/client-api/dist/ts3.9/queryparams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getQueryParam(key: String): String | (js.Array[ParsedQs | String]) | ParsedQs = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryParam")(key.asInstanceOf[js.Any]).asInstanceOf[String | (js.Array[ParsedQs | String]) | ParsedQs]
  
  inline def getQueryParams(): ParsedQs = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryParams")().asInstanceOf[ParsedQs]
}
