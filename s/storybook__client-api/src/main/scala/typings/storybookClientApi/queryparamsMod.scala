package typings.storybookClientApi

import typings.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/client-api/dist/queryparams", JSImport.Namespace)
@js.native
object queryparamsMod extends js.Object {
  
  def getQueryParam(key: String): String | (js.Array[ParsedQs | String]) | ParsedQs = js.native
  
  def getQueryParams(): ParsedQs = js.native
}
