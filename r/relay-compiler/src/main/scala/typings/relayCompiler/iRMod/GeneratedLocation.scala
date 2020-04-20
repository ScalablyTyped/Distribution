package typings.relayCompiler.iRMod

import typings.relayCompiler.relayCompilerStrings.Generated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratedLocation extends Location {
  var kind: Generated
}

object GeneratedLocation {
  @scala.inline
  def apply(kind: Generated): GeneratedLocation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedLocation]
  }
}

