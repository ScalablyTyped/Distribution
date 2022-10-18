package typings.storybookPreviewWeb

import typings.qs.mod.ParsedQs
import typings.storybookStore.distTs3Dot9TypesMod.Selection
import typings.storybookStore.distTs3Dot9TypesMod.SelectionSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UrlStoreMod {
  
  @JSImport("@storybook/preview-web/dist/ts3.9/UrlStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/preview-web/dist/ts3.9/UrlStore", "UrlStore")
  @js.native
  open class UrlStore () extends StObject {
    
    var selection: Selection = js.native
    
    var selectionSpecifier: SelectionSpecifier = js.native
    
    def setQueryParams(queryParams: ParsedQs): Unit = js.native
    
    def setSelection(selection: Selection): Unit = js.native
  }
  
  inline def getSelectionSpecifierFromPath(): SelectionSpecifier = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectionSpecifierFromPath")().asInstanceOf[SelectionSpecifier]
  
  inline def pathToId(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToId")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setPath(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPath")().asInstanceOf[Unit]
  inline def setPath(selection: Selection): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPath")(selection.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
