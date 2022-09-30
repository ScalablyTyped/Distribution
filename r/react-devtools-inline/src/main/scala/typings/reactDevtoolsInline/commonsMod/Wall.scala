package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wall extends StObject {
  
  def listen(fn: AnyFn): AnyFn = js.native
  
  def send(event: String, payload: Any): Unit = js.native
  def send(event: String, payload: Any, transferable: js.Array[Any]): Unit = js.native
}
