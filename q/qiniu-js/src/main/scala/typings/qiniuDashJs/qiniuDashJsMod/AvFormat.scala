package typings.qiniuDashJs.qiniuDashJsMod

import typings.qiniuDashJs.Anon_Creationtime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvFormat extends js.Object {
  var bit_rate: String
  var duration: String
  var format_long_name: String
  var format_name: String
  var nb_streams: Double
  var size: String
  var start_time: String
  var tags: Anon_Creationtime
}

object AvFormat {
  @scala.inline
  def apply(
    bit_rate: String,
    duration: String,
    format_long_name: String,
    format_name: String,
    nb_streams: Double,
    size: String,
    start_time: String,
    tags: Anon_Creationtime
  ): AvFormat = {
    val __obj = js.Dynamic.literal(bit_rate = bit_rate, duration = duration, format_long_name = format_long_name, format_name = format_name, nb_streams = nb_streams, size = size, start_time = start_time, tags = tags)
  
    __obj.asInstanceOf[AvFormat]
  }
}

