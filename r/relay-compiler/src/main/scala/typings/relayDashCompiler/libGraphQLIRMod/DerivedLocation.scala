package typings.relayDashCompiler.libGraphQLIRMod

import typings.relayDashCompiler.relayDashCompilerStrings.Derived
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
    val __obj = js.Dynamic.literal(kind = kind, source = source)
  
    __obj.asInstanceOf[DerivedLocation]
  }
}

