package typings.raygun.typesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raygun/build/types", "callVariadicCallback")
@js.native
object callVariadicCallback extends js.Object {
  
  def apply[T](callback: Callback[T]): Unit = js.native
  def apply[T](callback: Callback[T], error: Null, result: T): Unit = js.native
  def apply[T](callback: Callback[T], error: Error): Unit = js.native
  def apply[T](callback: Callback[T], error: Error, result: T): Unit = js.native
}
