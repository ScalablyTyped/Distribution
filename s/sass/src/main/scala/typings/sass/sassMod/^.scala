package typings.sass.sassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sass", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def render(options: Options, callback: js.Function2[/* exception */ SassException, /* result */ Result, Unit]): Unit = js.native
  def renderSync(options: Options): Result = js.native
}

