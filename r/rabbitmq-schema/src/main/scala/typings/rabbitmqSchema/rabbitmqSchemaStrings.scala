package typings.rabbitmqSchema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rabbitmqSchemaStrings {
  
  @scala.inline
  def direct: direct = "direct".asInstanceOf[direct]
  
  @scala.inline
  def fanout: fanout = "fanout".asInstanceOf[fanout]
  
  @scala.inline
  def topic: topic = "topic".asInstanceOf[topic]
  
  @js.native
  sealed trait direct extends js.Object
  
  @js.native
  sealed trait fanout extends js.Object
  
  @js.native
  sealed trait topic extends js.Object
}
