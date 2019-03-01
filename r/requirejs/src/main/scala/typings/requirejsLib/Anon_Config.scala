package typings
package requirejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var id: java.lang.String
  var uri: java.lang.String
  def config(): js.Any
}

object Anon_Config {
  @scala.inline
  def apply(config: js.Function0[js.Any], id: java.lang.String, uri: java.lang.String): Anon_Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_Config]
  }
}

