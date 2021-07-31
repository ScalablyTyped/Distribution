package typings.recompose

import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#componentfromprop
object componentFromPropMod {
  
  @JSImport("recompose/componentFromProp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(propName: String): StatelessComponent[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(propName.asInstanceOf[js.Any]).asInstanceOf[StatelessComponent[js.Any]]
}
