package typings.std

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var message: java.lang.String
  var name: java.lang.String
  var stack: js.UndefOr[java.lang.String] = js.undefined
}

@JSGlobal("Error")
@js.native
object Error extends TopLevel[ErrorConstructor]

