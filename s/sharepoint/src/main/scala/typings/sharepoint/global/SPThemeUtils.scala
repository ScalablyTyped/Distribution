package typings.sharepoint.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object SPThemeUtils {
  
  @JSGlobal("SPThemeUtils.ApplyCurrentTheme")
  @js.native
  def ApplyCurrentTheme(): Unit = js.native
  
  @JSGlobal("SPThemeUtils.Suspend")
  @js.native
  def Suspend(): Unit = js.native
  
  @JSGlobal("SPThemeUtils.UseClientSideTheming")
  @js.native
  def UseClientSideTheming(): Boolean = js.native
  
  @JSGlobal("SPThemeUtils.WithCurrentTheme")
  @js.native
  def WithCurrentTheme(resultCallback: js.Function1[/* themesCache */ js.Any, Unit]): Unit = js.native
}
