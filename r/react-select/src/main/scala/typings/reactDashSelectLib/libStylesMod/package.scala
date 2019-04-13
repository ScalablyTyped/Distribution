package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libStylesMod {
  type GetStyles = js.Function2[/* a */ java.lang.String, /* b */ Props, reactLib.reactMod.CSSProperties]
  type Props = org.scalablytyped.runtime.StringDictionary[js.Any]
  type StylesConfig = stdLib.Partial[Styles]
  type styleFn = js.Function2[
    /* base */ reactLib.reactMod.CSSProperties, 
    /* state */ js.Any, 
    reactLib.reactMod.CSSProperties
  ]
}
