package typings.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object stylesMod {
  
  type GetStyles = js.Function2[
    /* a */ java.lang.String, 
    /* b */ typings.reactSelect.stylesMod.Props, 
    typings.react.mod.CSSProperties
  ]
  
  type Props = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type StylesConfigFunction[Props] = js.Function2[
    /* base */ typings.react.mod.CSSProperties, 
    /* props */ Props, 
    typings.react.mod.CSSProperties
  ]
}
