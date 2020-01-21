package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceBufferListEventMap extends js.Object {
  var addsourcebuffer: Event_
  var removesourcebuffer: Event_
}

object SourceBufferListEventMap {
  @scala.inline
  def apply(addsourcebuffer: Event_, removesourcebuffer: Event_): SourceBufferListEventMap = {
    val __obj = js.Dynamic.literal(addsourcebuffer = addsourcebuffer.asInstanceOf[js.Any], removesourcebuffer = removesourcebuffer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceBufferListEventMap]
  }
}

