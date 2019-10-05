package typings.ractive.Ractive

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeInfo extends js.Object {
  var index: StringDictionary[Double]
  var keypath: String
  var ractive: typings.ractive.Ractive.Ractive
}

object NodeInfo {
  @scala.inline
  def apply(index: StringDictionary[Double], keypath: String, ractive: typings.ractive.Ractive.Ractive): NodeInfo = {
    val __obj = js.Dynamic.literal(index = index, keypath = keypath, ractive = ractive)
  
    __obj.asInstanceOf[NodeInfo]
  }
}

