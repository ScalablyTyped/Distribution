package typings.storybookCore

import typings.node.NodeModule
import typings.storybookCore.anon.ClientApi
import typings.storybookCore.typesMod.Loadable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadCsfMod {
  
  @JSImport("@storybook/core/dist/client/preview/loadCsf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def loadCsf(hasClientApiStoryStoreConfigApi: ClientApi): js.Function4[
    /* framework */ String, 
    /* loadable */ Loadable, 
    /* m */ NodeModule, 
    /* showDeprecationWarning */ js.UndefOr[Boolean], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCsf")(hasClientApiStoryStoreConfigApi.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* framework */ String, 
    /* loadable */ Loadable, 
    /* m */ NodeModule, 
    /* showDeprecationWarning */ js.UndefOr[Boolean], 
    Unit
  ]]
}
