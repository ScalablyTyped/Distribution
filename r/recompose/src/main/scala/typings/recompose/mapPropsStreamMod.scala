package typings.recompose

import typings.recompose.mod.ComponentEnhancer
import typings.recompose.mod.ObservableConfig
import typings.recompose.mod.Subscribable
import typings.recompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#mappropsstream
object mapPropsStreamMod {
  
  @JSImport("recompose/mapPropsStream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TInner, TOutter](transform: mapper[Subscribable[TOutter], Subscribable[TInner]]): ComponentEnhancer[TInner, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(transform.asInstanceOf[js.Any]).asInstanceOf[ComponentEnhancer[TInner, TOutter]]
  
  inline def mapPropsStreamWithConfig(config: ObservableConfig): js.Function1[
    /* transform */ mapper[Subscribable[js.Any], Subscribable[js.Any]], 
    ComponentEnhancer[js.Any, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapPropsStreamWithConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* transform */ mapper[Subscribable[js.Any], Subscribable[js.Any]], 
    ComponentEnhancer[js.Any, js.Any]
  ]]
}
