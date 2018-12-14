package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#fromrenderprops
@JSImport("recompose/fromRenderProps", JSImport.Namespace)
@js.native
object fromRenderPropsMod extends js.Object {
  def default[TInner, TOutter, TRenderProps](
    RenderPropsComponent: reactLib.reactMod.ReactNs.ComponentType[_],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner]
  ): recomposeLib.recomposeMod.ComponentEnhancer[TInner with TOutter, TOutter] = js.native
  def default[TInner, TOutter, TRenderProps](
    RenderPropsComponent: reactLib.reactMod.ReactNs.ComponentType[_],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner],
    renderPropName: java.lang.String
  ): recomposeLib.recomposeMod.ComponentEnhancer[TInner with TOutter, TOutter] = js.native
}

