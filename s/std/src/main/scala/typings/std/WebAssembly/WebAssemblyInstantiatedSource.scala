package typings.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAssemblyInstantiatedSource extends js.Object {
  var instance: Instance
  var module: Module
}

object WebAssemblyInstantiatedSource {
  @scala.inline
  def apply(instance: Instance, module: Module): WebAssemblyInstantiatedSource = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAssemblyInstantiatedSource]
  }
}

