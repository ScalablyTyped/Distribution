package typings.reactPlaidLink.indexUmdMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plaid extends StObject {
  
  def create(config: PlaidLinkOptions): Plaid = js.native
  
  def destroy(): Unit = js.native
  
  def exit(): Unit = js.native
  def exit(force: Boolean): Unit = js.native
  
  def open(): Unit = js.native
}
