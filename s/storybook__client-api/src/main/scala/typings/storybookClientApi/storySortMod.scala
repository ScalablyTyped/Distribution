package typings.storybookClientApi

import typings.storybookAddons.typesMod.StorySortComparator
import typings.storybookAddons.typesMod.StorySortObjectParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storySortMod {
  
  @JSImport("@storybook/client-api/dist/storySort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def storySort(): StorySortComparator = ^.asInstanceOf[js.Dynamic].applyDynamic("storySort")().asInstanceOf[StorySortComparator]
  @scala.inline
  def storySort(options: StorySortObjectParameter): StorySortComparator = ^.asInstanceOf[js.Dynamic].applyDynamic("storySort")(options.asInstanceOf[js.Any]).asInstanceOf[StorySortComparator]
}
