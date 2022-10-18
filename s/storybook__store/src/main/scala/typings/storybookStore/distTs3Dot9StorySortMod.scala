package typings.storybookStore

import typings.storybookAddons.distTs3Dot9TypesMod.StorySortComparatorV7
import typings.storybookAddons.distTs3Dot9TypesMod.StorySortObjectParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9StorySortMod {
  
  @JSImport("@storybook/store/dist/ts3.9/storySort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def storySort(): StorySortComparatorV7 = ^.asInstanceOf[js.Dynamic].applyDynamic("storySort")().asInstanceOf[StorySortComparatorV7]
  inline def storySort(options: StorySortObjectParameter): StorySortComparatorV7 = ^.asInstanceOf[js.Dynamic].applyDynamic("storySort")(options.asInstanceOf[js.Any]).asInstanceOf[StorySortComparatorV7]
}
