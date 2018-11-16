package typings
package rxjsLib.internalOperatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Operator[T, R] extends js.Object {
  def call(subscriber: rxjsLib.internalSubscriberMod.Subscriber[R], source: js.Any): rxjsLib.internalTypesMod.TeardownLogic
}

