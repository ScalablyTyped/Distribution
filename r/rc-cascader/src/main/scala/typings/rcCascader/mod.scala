package typings.rcCascader

import org.scalablytyped.runtime.Shortcut
import typings.rcCascader.anon.DisplayName
import typings.rcCascader.anon.Ref
import typings.rcCascader.cascaderMod.CascaderProps
import typings.rcCascader.cascaderMod.DefaultOptionType
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-cascader", JSImport.Default)
  @js.native
  val default: (js.Function1[
    /* props */ PropsWithChildren[CascaderProps[DefaultOptionType]] & Ref, 
    ReactElement
  ]) & DisplayName = js.native
  
  type _To = (js.Function1[
    /* props */ PropsWithChildren[CascaderProps[DefaultOptionType]] & Ref, 
    ReactElement
  ]) & DisplayName
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (js.Function1[
    /* props */ PropsWithChildren[CascaderProps[DefaultOptionType]] & Ref, 
    ReactElement
  ]) & DisplayName = default
}
