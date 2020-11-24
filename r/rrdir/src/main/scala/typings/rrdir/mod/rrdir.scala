package typings.rrdir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait rrdir extends js.Object {
  
  def apply(dir: String): js.Promise[js.Array[entry]] = js.native
  def apply(dir: String, options: options): js.Promise[js.Array[entry]] = js.native
  
  def async(dir: String): js.Promise[js.Array[entry]] = js.native
  def async(dir: String, options: options): js.Promise[js.Array[entry]] = js.native
  
  def sync(dir: String): js.Array[entry] = js.native
  def sync(dir: String, options: options): js.Array[entry] = js.native
}
