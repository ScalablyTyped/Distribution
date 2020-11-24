package typings.reactHotLoader.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-hot-loader", "hot")
@js.native
object hot extends js.Object {
  
  def apply(module: js.Any): js.Function2[
    /* Component */ ComponentType[_], 
    /* props */ js.UndefOr[AppContainerProps], 
    ComponentType[_]
  ] = js.native
}
