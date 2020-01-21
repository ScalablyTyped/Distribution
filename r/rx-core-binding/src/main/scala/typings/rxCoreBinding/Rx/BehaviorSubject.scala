package typings.rxCoreBinding.Rx

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BehaviorSubject[T] extends ISubject[T] {
  def getValue(): T = js.native
}

@JSGlobal("Rx.BehaviorSubject")
@js.native
object BehaviorSubject extends TopLevel[BehaviorSubjectStatic]

