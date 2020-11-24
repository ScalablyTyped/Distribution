package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Guid extends js.Object {
  
  def ToSerialized(): String = js.native
  
  def equals(uuid: Guid): Boolean = js.native
  
  def toString(format: String): String = js.native
}
