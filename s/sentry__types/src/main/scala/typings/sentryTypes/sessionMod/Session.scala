package typings.sentryTypes.sessionMod

import typings.sentryTypes.anon.Attrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends SessionContext {
  
  /** JSDoc */
  def close(): Unit = js.native
  def close(status: SessionStatus): Unit = js.native
  
  /** JSDoc */
  def toJSON(): Attrs = js.native
  
  /** JSDoc */
  def update(): Unit = js.native
  def update(context: SessionContext): Unit = js.native
}
