package typings.sortJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sort-json", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Sorts the keys on objects
    * @param old An object to sort the keys of, if not object just returns whatever
    * was given
    */
  def apply[T](old: T): T = js.native
  def apply[T](old: T, options: VisitOptions): T = js.native
}
