package typings.reactWindow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GridItemKeySelector = js.Function1[/* params */ typings.reactWindow.anon.ColumnIndex, typings.react.mod.Key]
  
  type ListItemKeySelector = js.Function2[/* index */ scala.Double, /* data */ js.Any, typings.react.mod.Key]
  
  type ReactElementType = typings.react.mod.FunctionComponent[js.Any] | (typings.react.mod.ComponentClass[js.Any, typings.react.mod.ComponentState]) | java.lang.String
  
  @scala.inline
  def areEqual(prevProps: js.Object, nextProps: js.Object): scala.Boolean = (typings.reactWindow.mod.^.asInstanceOf[js.Dynamic].applyDynamic("areEqual")(prevProps.asInstanceOf[js.Any], nextProps.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def shouldComponentUpdate[P, S](nextProps: P, nextState: S): scala.Boolean = (typings.reactWindow.mod.^.asInstanceOf[js.Dynamic].applyDynamic("shouldComponentUpdate")(nextProps.asInstanceOf[js.Any], nextState.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
}
