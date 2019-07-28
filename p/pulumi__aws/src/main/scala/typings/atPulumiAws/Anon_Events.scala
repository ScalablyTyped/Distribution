package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Events extends js.Object {
  var events: js.Array[String]
  var snsTopic: String
}

object Anon_Events {
  @scala.inline
  def apply(events: js.Array[String], snsTopic: String): Anon_Events = {
    val __obj = js.Dynamic.literal(events = events, snsTopic = snsTopic)
  
    __obj.asInstanceOf[Anon_Events]
  }
}

