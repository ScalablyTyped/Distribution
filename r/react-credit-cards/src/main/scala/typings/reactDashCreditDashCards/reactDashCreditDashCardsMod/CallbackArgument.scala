package typings.reactDashCreditDashCards.reactDashCreditDashCardsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackArgument extends js.Object {
  var issuer: String
  var maxLength: Double
}

object CallbackArgument {
  @scala.inline
  def apply(issuer: String, maxLength: Double): CallbackArgument = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CallbackArgument]
  }
}

