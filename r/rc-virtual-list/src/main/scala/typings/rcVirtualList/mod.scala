package typings.rcVirtualList

import typings.rcVirtualList.anon.Children
import typings.rcVirtualList.listMod.ListProps
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-virtual-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Item](props: Children & ListProps[Item]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
}
