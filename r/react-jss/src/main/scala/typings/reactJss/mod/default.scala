package typings.reactJss.mod

import typings.jss.mod.Styles
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.reactJss.anon.InnerRef
import typings.reactJss.reactJssStrings.classes
import typings.std.Omit
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-jss", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S): js.Function1[
    /* comp */ js.Any, 
    ComponentType[
      LibraryManagedAttributes[_, (Omit[GetProps[_], classes]) with Partial[WithStylesProps[S]] with InnerRef]
    ]
  ] = js.native
  def apply[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S, options: WithStylesOptions): js.Function1[
    /* comp */ js.Any, 
    ComponentType[
      LibraryManagedAttributes[_, (Omit[GetProps[_], classes]) with Partial[WithStylesProps[S]] with InnerRef]
    ]
  ] = js.native
}
