package typings.reactNativeMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeMaps.reactNativeMapsStrings.miter
  - typings.reactNativeMaps.reactNativeMapsStrings.round
  - typings.reactNativeMaps.reactNativeMapsStrings.bevel
*/
trait LineJoinType extends js.Object

object LineJoinType {
  @scala.inline
  def bevel: typings.reactNativeMaps.reactNativeMapsStrings.bevel = this.cast("bevel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def miter: typings.reactNativeMaps.reactNativeMapsStrings.miter = this.cast("miter")
  @scala.inline
  def round: typings.reactNativeMaps.reactNativeMapsStrings.round = this.cast("round")
}

