package typings
package rabbitmqDashSchemaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rabbitmqDashSchemaLibStrings {
  @js.native
  sealed trait direct extends js.Object
  
  @js.native
  sealed trait fanout extends js.Object
  
  @js.native
  sealed trait topic extends js.Object
  
  def direct: direct = "direct".asInstanceOf[direct]
  def fanout: fanout = "fanout".asInstanceOf[fanout]
  def topic: topic = "topic".asInstanceOf[topic]
}

