package typings.sharepoint.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object SPThemeUtils {
  
  @JSGlobal("SPThemeUtils")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ApplyCurrentTheme(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ApplyCurrentTheme")().asInstanceOf[Unit]
  
  @scala.inline
  def Suspend(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Suspend")().asInstanceOf[Unit]
  
  @scala.inline
  def UseClientSideTheming(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("UseClientSideTheming")().asInstanceOf[Boolean]
  
  @scala.inline
  def WithCurrentTheme(resultCallback: js.Function1[/* themesCache */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("WithCurrentTheme")(resultCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
