package typings.storybookCore

import typings.qs.mod.ParsedQs
import typings.storybookClientApi.typesMod.StoreSelection
import typings.storybookClientApi.typesMod.StoreSelectionSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/core/dist/client/preview/url", JSImport.Namespace)
@js.native
object urlMod extends js.Object {
  
  def getSelectionSpecifierFromPath(): StoreSelectionSpecifier = js.native
  
  def parseQueryParameters(search: String): String | (js.Array[ParsedQs | String]) | ParsedQs = js.native
  
  def pathToId(path: String): String = js.native
  
  def setPath(): Unit = js.native
  def setPath(selection: StoreSelection): Unit = js.native
}
