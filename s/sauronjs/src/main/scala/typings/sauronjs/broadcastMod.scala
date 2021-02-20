package typings.sauronjs

import typings.sauronjs.serviceMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastMod {
  
  @JSImport("sauronjs/src/core/broadcast", "attachSubject")
  @js.native
  def attachSubject(`object`: ^): js.Any = js.native
  
  @JSImport("sauronjs/src/core/broadcast", "next")
  @js.native
  def next(channels: js.Array[String], event: String, data: js.Any, id: String): Unit = js.native
}
