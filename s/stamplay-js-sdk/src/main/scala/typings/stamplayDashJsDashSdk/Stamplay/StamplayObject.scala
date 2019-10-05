package typings.stamplayDashJsDashSdk.Stamplay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StamplayObject extends js.Object {
  var Collection: js.Any
  var Model: typings.stamplayDashJsDashSdk.Stamplay.Model
}

object StamplayObject {
  @scala.inline
  def apply(Collection: js.Any, Model: Model): StamplayObject = {
    val __obj = js.Dynamic.literal(Collection = Collection, Model = Model)
  
    __obj.asInstanceOf[StamplayObject]
  }
}

