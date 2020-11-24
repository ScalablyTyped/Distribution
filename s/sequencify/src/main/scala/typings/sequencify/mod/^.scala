package typings.sequencify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sequencify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[T /* <: TaskMap */](tasks: T, names: js.Array[/* keyof T */ String], results: js.Array[/* keyof T */ String]): Unit = js.native
  def apply[T /* <: TaskMap */](
    tasks: T,
    names: js.Array[/* keyof T */ String],
    results: js.Array[/* keyof T */ String],
    nest: js.Array[String]
  ): Unit = js.native
}
