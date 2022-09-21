package typings.sauronjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastMod {
  
  @JSImport("sauronjs/src/core/broadcast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachSubject(`object`: typings.sauronjs.serviceMod.^): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("attachSubject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def next(channels: js.Array[String], event: String, data: Any, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(channels.asInstanceOf[js.Any], event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
