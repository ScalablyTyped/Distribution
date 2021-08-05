package typings.storybookUi

import typings.storybookUi.anon.GetLastViewed
import typings.storybookUi.sidebarTypesMod.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLastViewedMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/useLastViewed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useLastViewed(selection: Selection): GetLastViewed = ^.asInstanceOf[js.Dynamic].applyDynamic("useLastViewed")(selection.asInstanceOf[js.Any]).asInstanceOf[GetLastViewed]
}
