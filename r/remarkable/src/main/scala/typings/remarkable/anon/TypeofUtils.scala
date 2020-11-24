package typings.remarkable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofUtils extends js.Object {
  
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  
  def escapeHtml(str: String): String = js.native
  
  def fromCodePoint(c: Double): String = js.native
  
  def has(`object`: js.Any, key: String): Boolean = js.native
  
  def isString(): Boolean = js.native
  def isString(obj: js.Any): Boolean = js.native
  
  def isValidEntityCode(c: Double): Boolean = js.native
  
  def replaceEntities(str: String): String = js.native
  
  def unescapeMd(str: String): String = js.native
}
