package typings.recompose

import typings.recompose.mod.ComponentEnhancer
import typings.recompose.mod.ObservableConfig
import typings.recompose.mod.Subscribable
import typings.recompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#mappropsstream
object mapPropsStreamMod {
  
  @JSImport("recompose/mapPropsStream", JSImport.Default)
  @js.native
  def default[TInner, TOutter](transform: mapper[Subscribable[TOutter], Subscribable[TInner]]): ComponentEnhancer[TInner, TOutter] = js.native
  
  @JSImport("recompose/mapPropsStream", "mapPropsStreamWithConfig")
  @js.native
  def mapPropsStreamWithConfig(config: ObservableConfig): js.Function1[/* transform */ mapper[Subscribable[_], Subscribable[_]], ComponentEnhancer[_, _]] = js.native
}
