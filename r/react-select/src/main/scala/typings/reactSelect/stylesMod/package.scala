package typings.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stylesMod {
  type GetStyles = js.Function2[
    /* a */ java.lang.String, 
    /* b */ typings.reactSelect.stylesMod.Props, 
    typings.react.mod.CSSProperties
  ]
  type Props = org.scalablytyped.runtime.StringDictionary[js.Any]
  type styleFn = js.Function2[
    /* base */ typings.react.mod.CSSProperties, 
    /* state */ js.Any, 
    typings.react.mod.CSSProperties
  ]
}
