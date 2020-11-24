package typings.storybookClientApi

import typings.storybookAddons.typesMod.StorySortComparator
import typings.storybookAddons.typesMod.StorySortObjectParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/client-api/dist/storySort", JSImport.Namespace)
@js.native
object storySortMod extends js.Object {
  
  def storySort(): StorySortComparator = js.native
  def storySort(options: StorySortObjectParameter): StorySortComparator = js.native
}
