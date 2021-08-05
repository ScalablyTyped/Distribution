package typings.raspi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raspi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(cb: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
