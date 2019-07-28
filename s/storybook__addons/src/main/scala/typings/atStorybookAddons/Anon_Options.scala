package typings.atStorybookAddons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options[Options, Parameters] extends js.Object {
  var options: Options
  var parameters: Parameters
}

object Anon_Options {
  @scala.inline
  def apply[Options, Parameters](options: Options, parameters: Parameters): Anon_Options[Options, Parameters] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Options[Options, Parameters]]
  }
}

