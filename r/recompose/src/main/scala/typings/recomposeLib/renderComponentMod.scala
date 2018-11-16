package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#rendercomponent
@JSImport("recompose/renderComponent", JSImport.Namespace)
@js.native
object renderComponentMod extends js.Object {
  def default[TProps](component: java.lang.String): recomposeLib.recomposeMod.ComponentEnhancer[_, _] = js.native
  def default[TProps](component: reactLib.reactMod.ReactNs.ComponentType[TProps]): recomposeLib.recomposeMod.ComponentEnhancer[_, _] = js.native
}

