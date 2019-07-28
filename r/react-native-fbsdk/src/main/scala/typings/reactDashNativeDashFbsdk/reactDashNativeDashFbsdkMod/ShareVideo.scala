package typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareVideo extends js.Object {
  /**
    * The URL to the video. Must point to the location of the video on disk.
    */
  var localUrl: String
}

object ShareVideo {
  @scala.inline
  def apply(localUrl: String): ShareVideo = {
    val __obj = js.Dynamic.literal(localUrl = localUrl)
  
    __obj.asInstanceOf[ShareVideo]
  }
}

