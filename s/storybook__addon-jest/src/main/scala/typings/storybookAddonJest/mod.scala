package typings.storybookAddonJest

import typings.storybookAddonJest.anon.FilesExt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/addon-jest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def withTests(userOptions: FilesExt): js.Function1[/* repeated */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTests")(userOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, js.Any]]
}
