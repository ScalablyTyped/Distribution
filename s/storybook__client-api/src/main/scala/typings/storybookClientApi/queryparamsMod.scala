package typings.storybookClientApi

import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryparamsMod {
  
  @JSImport("@storybook/client-api/dist/queryparams", "getQueryParam")
  @js.native
  def getQueryParam(key: String): String | (js.Array[ParsedQs | String]) | ParsedQs = js.native
  
  @JSImport("@storybook/client-api/dist/queryparams", "getQueryParams")
  @js.native
  def getQueryParams(): ParsedQs = js.native
}
