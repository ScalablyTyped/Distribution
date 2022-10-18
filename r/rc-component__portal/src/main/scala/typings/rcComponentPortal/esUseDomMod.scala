package typings.rcComponentPortal

import typings.rcComponentPortal.esContextMod.QueueCreate
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUseDomMod {
  
  @JSImport("@rc-component/portal/es/useDom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(render: Boolean): js.Tuple2[HTMLDivElement, QueueCreate] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(render.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[HTMLDivElement, QueueCreate]]
  inline def default(render: Boolean, debug: String): js.Tuple2[HTMLDivElement, QueueCreate] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(render.asInstanceOf[js.Any], debug.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[HTMLDivElement, QueueCreate]]
}
