package typings.reactRanger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangerHandle extends js.Object {
  
  var active: Boolean = js.native
  
  def getHandleProps[T](): T with HandleProps = js.native
  def getHandleProps[T](props: T): T with HandleProps = js.native
  
  var value: Double = js.native
}
