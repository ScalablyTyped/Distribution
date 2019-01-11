package typings
package sassLib.sassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sass", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def render(
    options: sassLib.sassMod.Options,
    callback: js.Function2[
      /* exception */ sassLib.sassMod.SassException, 
      /* result */ sassLib.sassMod.Result, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def renderSync(options: sassLib.sassMod.Options): sassLib.sassMod.Result = js.native
}

