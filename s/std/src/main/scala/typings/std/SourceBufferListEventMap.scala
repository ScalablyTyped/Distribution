package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceBufferListEventMap extends js.Object {
  var addsourcebuffer: Event
  var removesourcebuffer: Event
}

object SourceBufferListEventMap {
  @scala.inline
  def apply(addsourcebuffer: Event, removesourcebuffer: Event): SourceBufferListEventMap = {
    val __obj = js.Dynamic.literal(addsourcebuffer = addsourcebuffer, removesourcebuffer = removesourcebuffer)
  
    __obj.asInstanceOf[SourceBufferListEventMap]
  }
}

