package typings.slateReact.mod

import typings.slate.mod.Controller
import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugins[T /* <: Controller */]
  extends Array[PluginOrPlugins[T]]
     with PluginOrPlugins[T]

