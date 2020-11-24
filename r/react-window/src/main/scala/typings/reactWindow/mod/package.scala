package typings.reactWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GridItemKeySelector = js.Function1[/* params */ typings.reactWindow.anon.ColumnIndex, typings.react.mod.Key]
  
  type ListItemKeySelector = js.Function2[/* index */ scala.Double, /* data */ js.Any, typings.react.mod.Key]
  
  type ReactElementType = typings.react.mod.FunctionComponent[js.Any] | (typings.react.mod.ComponentClass[js.Any, typings.react.mod.ComponentState]) | java.lang.String
}
