package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvFormat extends js.Object {
  var bit_rate: java.lang.String
  var duration: java.lang.String
  var format_long_name: java.lang.String
  var format_name: java.lang.String
  var nb_streams: scala.Double
  var size: java.lang.String
  var start_time: java.lang.String
  var tags: qiniuDashJsLib.Anon_Creationtime
}

object AvFormat {
  @scala.inline
  def apply(
    bit_rate: java.lang.String,
    duration: java.lang.String,
    format_long_name: java.lang.String,
    format_name: java.lang.String,
    nb_streams: scala.Double,
    size: java.lang.String,
    start_time: java.lang.String,
    tags: qiniuDashJsLib.Anon_Creationtime
  ): AvFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bit_rate")(bit_rate)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("format_long_name")(format_long_name)
    __obj.updateDynamic("format_name")(format_name)
    __obj.updateDynamic("nb_streams")(nb_streams)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("start_time")(start_time)
    __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[AvFormat]
  }
}

