package typings.rsocketFlowable.singleMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-flowable/Single", JSImport.Default)
@js.native
class default[T] protected () extends Single[T] {
  def this(source: Source[T]) = this()
}
/* static members */
@JSImport("rsocket-flowable/Single", JSImport.Default)
@js.native
object default extends js.Object {
  
  def error(error: Error): Single[scala.Nothing] = js.native
  
  def never(): Single[scala.Nothing] = js.native
  
  def of[U](value: U): Single[U] = js.native
}
