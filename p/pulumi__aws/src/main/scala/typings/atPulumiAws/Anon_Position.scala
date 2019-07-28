package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Position extends js.Object {
  var position: Double
  var topicArn: String
}

object Anon_Position {
  @scala.inline
  def apply(position: Double, topicArn: String): Anon_Position = {
    val __obj = js.Dynamic.literal(position = position, topicArn = topicArn)
  
    __obj.asInstanceOf[Anon_Position]
  }
}

