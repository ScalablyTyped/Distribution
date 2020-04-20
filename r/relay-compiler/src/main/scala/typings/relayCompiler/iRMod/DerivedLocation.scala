package typings.relayCompiler.iRMod

import typings.relayCompiler.relayCompilerStrings.Derived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DerivedLocation extends Location {
  var kind: Derived
  var source: Location
}

object DerivedLocation {
  @scala.inline
  def apply(kind: Derived, source: Location): DerivedLocation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DerivedLocation]
  }
}

