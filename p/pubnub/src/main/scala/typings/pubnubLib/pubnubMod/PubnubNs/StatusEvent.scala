package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StatusEvent extends js.Object {
  var affectedChannelGroups: js.Array[java.lang.String]
   // see Pubnub.Operations
  var affectedChannels: js.Array[java.lang.String]
  var category: java.lang.String
  var currentTimetoken: scala.Double | java.lang.String
  var lastTimetoken: scala.Double | java.lang.String
   // see Pubnub.Categories
  var operation: java.lang.String
  var subscribedChannels: js.Array[java.lang.String]
}

