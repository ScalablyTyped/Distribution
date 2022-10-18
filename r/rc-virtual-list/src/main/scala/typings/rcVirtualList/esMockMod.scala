package typings.rcVirtualList

import typings.rcVirtualList.anon.Children
import typings.rcVirtualList.esListMod.ListProps
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMockMod {
  
  @JSImport("rc-virtual-list/es/mock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Item](props: Children & ListProps[Item]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
}
