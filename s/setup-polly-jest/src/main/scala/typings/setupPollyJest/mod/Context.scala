package typings.setupPollyJest.mod

import typings.pollyjsCore.mod.Polly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  val polly: Polly
}

object Context {
  @scala.inline
  def apply(polly: Polly): Context = {
    val __obj = js.Dynamic.literal(polly = polly.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Context]
  }
}

