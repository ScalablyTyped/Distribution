package typings.storybookAddonStoryshots.frameworksLoaderMod

import typings.storybookAddonStoryshots.anon.Framework
import typings.storybookAddonStoryshots.storyshotsOptionsMod.StoryshotsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loader extends js.Object {
  
  def load(options: StoryshotsOptions): Framework = js.native
  
  def test(options: StoryshotsOptions): Boolean = js.native
}
object Loader {
  
  @scala.inline
  def apply(load: StoryshotsOptions => Framework, test: StoryshotsOptions => Boolean): Loader = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[Loader]
  }
  
  @scala.inline
  implicit class LoaderOps[Self <: Loader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoad(value: StoryshotsOptions => Framework): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTest(value: StoryshotsOptions => Boolean): Self = this.set("test", js.Any.fromFunction1(value))
  }
}
