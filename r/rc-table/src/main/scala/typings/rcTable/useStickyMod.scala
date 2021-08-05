package typings.rcTable

import typings.rcTable.anon.Container
import typings.rcTable.interfaceMod.TableSticky
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStickyMod {
  
  @JSImport("rc-table/lib/hooks/useSticky", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(sticky: Boolean, prefixCls: String): Container = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sticky.asInstanceOf[js.Any], prefixCls.asInstanceOf[js.Any])).asInstanceOf[Container]
  inline def default(sticky: TableSticky, prefixCls: String): Container = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sticky.asInstanceOf[js.Any], prefixCls.asInstanceOf[js.Any])).asInstanceOf[Container]
}
