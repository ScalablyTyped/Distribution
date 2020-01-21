package typings.sparqlHttpClient.mod

import typings.sparqlHttpClient.AnonBindings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectBindings extends js.Object {
  var results: AnonBindings
}

object SelectBindings {
  @scala.inline
  def apply(results: AnonBindings): SelectBindings = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectBindings]
  }
}

