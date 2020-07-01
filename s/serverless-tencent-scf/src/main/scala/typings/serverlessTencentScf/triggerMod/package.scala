package typings.serverlessTencentScf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object triggerMod {
  type APIGatewayHandler[T] = typings.serverlessTencentScf.handlerMod.Handler[typings.serverlessTencentScf.triggerMod.APIGatewayEvent, T]
  type CKafkaHandler[T] = typings.serverlessTencentScf.handlerMod.Handler[typings.serverlessTencentScf.triggerMod.CKafkaEvent, T]
  type CMQTopicHandler[T] = typings.serverlessTencentScf.handlerMod.Handler[typings.serverlessTencentScf.triggerMod.CMQTopicEvent, T]
  type COSHandler[T] = typings.serverlessTencentScf.handlerMod.Handler[typings.serverlessTencentScf.triggerMod.COSEvent, T]
  type TimerHandler[T] = typings.serverlessTencentScf.handlerMod.Handler[typings.serverlessTencentScf.triggerMod.TimerEvent, T]
}
