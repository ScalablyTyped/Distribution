package typings.atStorybookApi.distModulesShortcutsMod

import typings.atStorybookApi.Anon_ApiHasApi
import typings.atStorybookApi.atStorybookApiStrings.control
import typings.atStorybookApi.atStorybookApiStrings.meta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/api/dist/modules/shortcuts", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val defaultShortcuts: Shortcuts = js.native
  def controlOrMetaKey(): meta | control = js.native
  def default(
    hasStore: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Module */ js.Any
  ): Anon_ApiHasApi = js.native
  def isMacLike(): Boolean = js.native
  def keys[O](o: O): js.Array[String] = js.native
}

