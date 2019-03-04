package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Events extends js.Object {
  var events: js.Array[java.lang.String]
  var snsTopic: java.lang.String
}

object Anon_Events {
  @scala.inline
  def apply(events: js.Array[java.lang.String], snsTopic: java.lang.String): Anon_Events = {
    val __obj = js.Dynamic.literal(events = events, snsTopic = snsTopic)
  
    __obj.asInstanceOf[Anon_Events]
  }
}

