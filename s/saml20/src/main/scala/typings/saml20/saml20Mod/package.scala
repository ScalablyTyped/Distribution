package typings.saml20

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object saml20Mod {
  type ParseCallback = js.Function3[/* err */ Error | Null, /* profile */ Profile, /* version */ String, Unit]
}
