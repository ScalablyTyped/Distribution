package typings.serviceworkerWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceWorkerDefaultOption extends js.Object {
  var assets: js.Array[String]
}

object ServiceWorkerDefaultOption {
  @scala.inline
  def apply(assets: js.Array[String]): ServiceWorkerDefaultOption = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerDefaultOption]
  }
}

