package typings.recompose

import typings.react.mod.ComponentType
import typings.recompose.mod.ComponentEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#fromrenderprops
object fromRenderPropsMod {
  
  @JSImport("recompose/fromRenderProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TInner, TOutter, TRenderProps](
    RenderPropsComponent: ComponentType[js.Any],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner]
  ): ComponentEnhancer[TInner & TOutter, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(RenderPropsComponent.asInstanceOf[js.Any], propsMapper.asInstanceOf[js.Any])).asInstanceOf[ComponentEnhancer[TInner & TOutter, TOutter]]
  inline def default[TInner, TOutter, TRenderProps](
    RenderPropsComponent: ComponentType[js.Any],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner],
    renderPropName: String
  ): ComponentEnhancer[TInner & TOutter, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(RenderPropsComponent.asInstanceOf[js.Any], propsMapper.asInstanceOf[js.Any], renderPropName.asInstanceOf[js.Any])).asInstanceOf[ComponentEnhancer[TInner & TOutter, TOutter]]
}
