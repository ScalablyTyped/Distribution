package typings.storybookCore

import typings.qs.mod.ParsedQs
import typings.storybookClientApi.typesMod.StoreSelection
import typings.storybookClientApi.typesMod.StoreSelectionSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("@storybook/core/dist/client/preview/url", "getSelectionSpecifierFromPath")
  @js.native
  def getSelectionSpecifierFromPath(): StoreSelectionSpecifier = js.native
  
  @JSImport("@storybook/core/dist/client/preview/url", "parseQueryParameters")
  @js.native
  def parseQueryParameters(search: String): String | (js.Array[ParsedQs | String]) | ParsedQs = js.native
  
  @JSImport("@storybook/core/dist/client/preview/url", "pathToId")
  @js.native
  def pathToId(path: String): String = js.native
  
  @JSImport("@storybook/core/dist/client/preview/url", "setPath")
  @js.native
  def setPath(): Unit = js.native
  @JSImport("@storybook/core/dist/client/preview/url", "setPath")
  @js.native
  def setPath(selection: StoreSelection): Unit = js.native
}
