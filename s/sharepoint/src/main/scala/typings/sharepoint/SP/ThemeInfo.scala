package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeInfo
  extends StObject
     with ClientObject {
  
  def getThemeFontByName(name: String, lcid: Double): StringResult = js.native
  
  def getThemeShadeByName(name: String): StringResult = js.native
  
  def get_accessibleDescription(): String = js.native
  
  def get_themeBackgroundImageUri(): String = js.native
}
