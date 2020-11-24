package typings.reactLazyLoadImageComponent.mod

import typings.react.mod.ComponentType
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.scrollPosition
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-lazy-load-image-component", "trackWindowScroll")
@js.native
object trackWindowScroll extends js.Object {
  
  def apply[P /* <: LazyComponentProps */](BaseComponent: ComponentType[P]): ComponentType[Omit[P, scrollPosition]] = js.native
}
