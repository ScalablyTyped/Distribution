package typings
package reactDashCreditDashCardsLib.reactDashCreditDashCardsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackArgument extends js.Object {
  var issuer: java.lang.String
  var maxLength: scala.Double
}

object CallbackArgument {
  @scala.inline
  def apply(issuer: java.lang.String, maxLength: scala.Double): CallbackArgument = {
    val __obj = js.Dynamic.literal(issuer = issuer, maxLength = maxLength)
  
    __obj.asInstanceOf[CallbackArgument]
  }
}

