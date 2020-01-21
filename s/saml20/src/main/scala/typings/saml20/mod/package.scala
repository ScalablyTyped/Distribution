package typings.saml20

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ParseCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* profile */ typings.saml20.mod.Profile, 
    /* version */ java.lang.String, 
    scala.Unit
  ]
}
