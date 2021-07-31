package typings.rest

import org.scalablytyped.runtime.Shortcut
import typings.rest.mod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod extends Shortcut {
  
  @JSImport("rest/client/node", JSImport.Namespace)
  @js.native
  val ^ : Client = js.native
  
  type _To = Client
  
  /* This means you don't have to write `^`, but can instead just say `nodeMod.foo` */
  override def _to: Client = ^
}
