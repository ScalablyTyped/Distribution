package typings
package scDashBrokerLib.scbrokerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscriptions
  extends /* socketId */ org.scalablytyped.runtime.NumberDictionary[
      org.scalablytyped.runtime.StringDictionary[socketclusterDashServerLib.socketclusterDashServerMod.SCServerSocket]
    ]

object Subscriptions {
  @scala.inline
  def apply(
    NumberDictionary: /* socketId */ org.scalablytyped.runtime.NumberDictionary[
      org.scalablytyped.runtime.StringDictionary[socketclusterDashServerLib.socketclusterDashServerMod.SCServerSocket]
    ] = null
  ): Subscriptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Subscriptions]
  }
}

