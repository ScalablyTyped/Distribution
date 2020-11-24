package typings.reactRanger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangerSegment extends js.Object {
  
  def getSegmentProps[T](): T with SegmentProps = js.native
  def getSegmentProps[T](props: T): T with SegmentProps = js.native
  
  var value: Double = js.native
}
