package typings.rcVirtualList

import typings.rcVirtualList.interfaceMod.GetKey
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useHeightsMod {
  
  @JSImport("rc-virtual-list/es/hooks/useHeights", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](getKey: GetKey[T]): js.Tuple4[
    js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    js.Function0[Unit], 
    typings.rcVirtualList.cacheMapMod.default, 
    Double
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(getKey.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[
    js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    js.Function0[Unit], 
    typings.rcVirtualList.cacheMapMod.default, 
    Double
  ]]
  inline def default[T](getKey: GetKey[T], onItemAdd: js.Function1[/* item */ T, Unit]): js.Tuple4[
    js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    js.Function0[Unit], 
    typings.rcVirtualList.cacheMapMod.default, 
    Double
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getKey.asInstanceOf[js.Any], onItemAdd.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[
    js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    js.Function0[Unit], 
    typings.rcVirtualList.cacheMapMod.default, 
    Double
  ]]
  inline def default[T](
    getKey: GetKey[T],
    onItemAdd: js.Function1[/* item */ T, Unit],
    onItemRemove: js.Function1[/* item */ T, Unit]
  ): js.Tuple4[
    js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    js.Function0[Unit], 
    typings.rcVirtualList.cacheMapMod.default, 
    Double
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getKey.asInstanceOf[js.Any], onItemAdd.asInstanceOf[js.Any], onItemRemove.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[
    js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    js.Function0[Unit], 
    typings.rcVirtualList.cacheMapMod.default, 
    Double
  ]]
  inline def default[T](getKey: GetKey[T], onItemAdd: Unit, onItemRemove: js.Function1[/* item */ T, Unit]): js.Tuple4[
    js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    js.Function0[Unit], 
    typings.rcVirtualList.cacheMapMod.default, 
    Double
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getKey.asInstanceOf[js.Any], onItemAdd.asInstanceOf[js.Any], onItemRemove.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[
    js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    js.Function0[Unit], 
    typings.rcVirtualList.cacheMapMod.default, 
    Double
  ]]
}
