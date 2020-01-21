package typings.reactNativeMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeMaps.reactNativeMapsStrings.standard
  - typings.reactNativeMaps.reactNativeMapsStrings.satellite
  - typings.reactNativeMaps.reactNativeMapsStrings.hybrid
  - typings.reactNativeMaps.reactNativeMapsStrings.terrain
  - typings.reactNativeMaps.reactNativeMapsStrings.none
  - typings.reactNativeMaps.reactNativeMapsStrings.mutedStandard
*/
trait MapTypes extends js.Object

object MapTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hybrid: typings.reactNativeMaps.reactNativeMapsStrings.hybrid = this.cast("hybrid")
  @scala.inline
  def mutedStandard: typings.reactNativeMaps.reactNativeMapsStrings.mutedStandard = this.cast("mutedStandard")
  @scala.inline
  def none: typings.reactNativeMaps.reactNativeMapsStrings.none = this.cast("none")
  @scala.inline
  def satellite: typings.reactNativeMaps.reactNativeMapsStrings.satellite = this.cast("satellite")
  @scala.inline
  def standard: typings.reactNativeMaps.reactNativeMapsStrings.standard = this.cast("standard")
  @scala.inline
  def terrain: typings.reactNativeMaps.reactNativeMapsStrings.terrain = this.cast("terrain")
}

