package typings.raygun.typesMod

import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transport extends StObject {
  
  def send(message: String): Unit = js.native
  def send(message: String, callback: Callback[IncomingMessage]): Unit = js.native
}
