package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libStylesMod {
  type GetStyles = js.Function2[/* a */ java.lang.String, /* b */ Props, reactLib.reactMod.ReactNs.CSSProperties]
  type StylesConfig = stdLib.Partial[Styles]
  type styleFn = js.Function2[
    /* base */ reactLib.reactMod.ReactNs.CSSProperties, 
    /* state */ js.Any, 
    reactLib.reactMod.ReactNs.CSSProperties
  ]
}
