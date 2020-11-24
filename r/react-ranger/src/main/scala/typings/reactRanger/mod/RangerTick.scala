package typings.reactRanger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangerTick extends js.Object {
  
  def getTickProps[T](): T with TickProps = js.native
  def getTickProps[T](props: T): T with TickProps = js.native
  
  var value: Double = js.native
}
