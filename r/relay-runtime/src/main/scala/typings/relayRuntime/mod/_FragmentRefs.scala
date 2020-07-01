package typings.relayRuntime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _FragmentRefs[Refs /* <: String */] extends js.Object {
  @JSName(" $fragmentRefs")
  var Space$fragmentRefs: FragmentRefs[Refs]
}

object _FragmentRefs {
  @scala.inline
  def apply[/* <: java.lang.String */ Refs](Space$fragmentRefs: FragmentRefs[Refs]): _FragmentRefs[Refs] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(" $fragmentRefs")(Space$fragmentRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FragmentRefs[Refs]]
  }
}

