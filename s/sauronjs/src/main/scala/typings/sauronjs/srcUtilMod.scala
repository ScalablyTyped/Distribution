package typings.sauronjs

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilMod {
  
  @JSImport("sauronjs/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def insert(params: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def ready(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
