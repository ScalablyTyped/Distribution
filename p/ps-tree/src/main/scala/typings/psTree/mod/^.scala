package typings.psTree.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ps-tree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(pid: Double, callback: js.Function2[/* error */ Error, /* children */ js.Array[PS], Unit]): Unit = js.native
}
