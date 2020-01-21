package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DatabaseOwner...
  */
trait IDatabaseOwner extends js.Object {
  /**
    * Name of the owner
    */
  var qName: String
}

object IDatabaseOwner {
  @scala.inline
  def apply(qName: String): IDatabaseOwner = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDatabaseOwner]
  }
}

