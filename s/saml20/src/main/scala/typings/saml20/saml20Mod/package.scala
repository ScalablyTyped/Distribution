package typings.saml20

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object saml20Mod {
  import typings.std.Error

  type ParseCallback = js.Function3[/* err */ Error | Null, /* profile */ Profile, /* version */ String, Unit]
}
