package typings
package pubnubLib.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pubnub", JSImport.Namespace)
@js.native
class namespaced protected () extends Pubnub {
  def this(config: pubnubLib.pubnubMod.PubnubNs.PubnubConfig) = this()
}

@JSImport("pubnub", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var CATEGORIES: pubnubLib.pubnubMod.PubnubNs.Categories = js.native
  var OPERATIONS: pubnubLib.pubnubMod.PubnubNs.Operations = js.native
  def generateUUID(): java.lang.String = js.native
}

