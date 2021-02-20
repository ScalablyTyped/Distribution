package typings.reactNavigationStack

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.reactNavigationStack.vendorTypesMod.StackCardInterpolationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardAnimationContextMod extends Shortcut {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/utils/CardAnimationContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[StackCardInterpolationProps]] = js.native
  
  type _To = Context[js.UndefOr[StackCardInterpolationProps]]
  
  /* This means you don't have to write `default`, but can instead just say `cardAnimationContextMod.foo` */
  override def _to: Context[js.UndefOr[StackCardInterpolationProps]] = default
}
