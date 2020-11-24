package typings.storybookCore

import typings.node.NodeModule
import typings.storybookCore.anon.ClientApi
import typings.storybookCore.typesMod.Loadable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/core/dist/client/preview/loadCsf", JSImport.Namespace)
@js.native
object loadCsfMod extends js.Object {
  
  def loadCsf(hasClientApiStoryStoreConfigApi: ClientApi): js.Function4[
    /* framework */ String, 
    /* loadable */ Loadable, 
    /* m */ NodeModule, 
    /* showDeprecationWarning */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
}
