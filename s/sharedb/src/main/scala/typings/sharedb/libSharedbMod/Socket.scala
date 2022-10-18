package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Socket extends StObject {
  
  def close(): Unit = js.native
  def close(reason: Double): Unit = js.native
  
  def onclose(event: Any): Unit = js.native
  
  def onerror(event: Any): Unit = js.native
  
  def onmessage(event: Any): Unit = js.native
  
  def onopen(event: Any): Unit = js.native
  
  var readyState: Double = js.native
  
  def send(data: Any): Unit = js.native
}
