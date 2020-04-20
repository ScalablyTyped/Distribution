package typings.qiniuJs.mod

import typings.qiniuJs.AnonDictkey
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
  var tags: AnonDictkey
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
    tags: AnonDictkey
  ): AvFormat = {
    val __obj = js.Dynamic.literal(bit_rate = bit_rate.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], format_long_name = format_long_name.asInstanceOf[js.Any], format_name = format_name.asInstanceOf[js.Any], nb_streams = nb_streams.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvFormat]
  }
}

