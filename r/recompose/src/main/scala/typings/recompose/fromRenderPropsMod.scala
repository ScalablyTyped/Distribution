package typings.recompose

import typings.react.mod.ComponentType
import typings.recompose.mod.ComponentEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#fromrenderprops
object fromRenderPropsMod {
  
  @JSImport("recompose/fromRenderProps", JSImport.Default)
  @js.native
  def default[TInner, TOutter, TRenderProps](
    RenderPropsComponent: ComponentType[_],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner]
  ): ComponentEnhancer[TInner with TOutter, TOutter] = js.native
  @JSImport("recompose/fromRenderProps", JSImport.Default)
  @js.native
  def default[TInner, TOutter, TRenderProps](
    RenderPropsComponent: ComponentType[_],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner],
    renderPropName: String
  ): ComponentEnhancer[TInner with TOutter, TOutter] = js.native
}
