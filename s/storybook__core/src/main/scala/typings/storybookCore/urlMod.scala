package typings.storybookCore

import typings.qs.mod.ParsedQs
import typings.storybookClientApi.typesMod.StoreSelection
import typings.storybookClientApi.typesMod.StoreSelectionSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("@storybook/core/dist/client/preview/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSelectionSpecifierFromPath(): StoreSelectionSpecifier = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectionSpecifierFromPath")().asInstanceOf[StoreSelectionSpecifier]
  
  inline def parseQueryParameters(search: String): String | (js.Array[ParsedQs | String]) | ParsedQs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseQueryParameters")(search.asInstanceOf[js.Any]).asInstanceOf[String | (js.Array[ParsedQs | String]) | ParsedQs]
  
  inline def pathToId(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToId")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setPath(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPath")().asInstanceOf[Unit]
  inline def setPath(selection: StoreSelection): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPath")(selection.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
