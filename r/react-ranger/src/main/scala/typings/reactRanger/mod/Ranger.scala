package typings.reactRanger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ranger extends js.Object {
  
  var activeHandleIndex: Double | Null = js.native
  
  def getTrackProps[T](): T with TrackProps = js.native
  def getTrackProps[T](props: T): T with TrackProps = js.native
  
  var handles: js.Array[RangerHandle] = js.native
  
  var segments: js.Array[RangerSegment] = js.native
  
  var ticks: js.Array[RangerTick] = js.native
}
