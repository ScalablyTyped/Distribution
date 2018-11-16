package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReactElement[P] extends js.Object {
  var key: Key | scala.Null
  var props: P
  var `type`: java.lang.String | (ComponentClass[P, ComponentState]) | FunctionComponent[P]
}

