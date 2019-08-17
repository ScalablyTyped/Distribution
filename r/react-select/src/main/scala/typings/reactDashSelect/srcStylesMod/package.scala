package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcStylesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.CSSProperties
  import typings.std.Partial

  type GetStyles = js.Function2[/* a */ String, /* b */ Props, CSSProperties]
  type Props = StringDictionary[js.Any]
  type StylesConfig = Partial[Styles]
  type styleFn = js.Function2[/* base */ CSSProperties, /* state */ js.Any, CSSProperties]
}
