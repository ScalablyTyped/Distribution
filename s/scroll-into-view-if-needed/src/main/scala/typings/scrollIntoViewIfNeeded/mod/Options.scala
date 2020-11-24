package typings.scrollIntoViewIfNeeded.mod

import typings.scrollIntoViewIfNeeded.typesMod.CustomScrollAction
import typings.scrollIntoViewIfNeeded.typesMod.CustomScrollBehaviorCallback
import typings.scrollIntoViewIfNeeded.typesMod.ScrollBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[T]
  extends typings.scrollIntoViewIfNeeded.typesMod.Options {
  
  var behavior: js.UndefOr[ScrollBehavior | CustomScrollBehaviorCallback[T]] = js.native
}
object Options {
  
  @scala.inline
  def apply[T](): Options[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[T]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
    
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
    def setBehaviorFunction1(value: /* actions */ js.Array[CustomScrollAction] => T): Self = this.set("behavior", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBehavior(value: ScrollBehavior | CustomScrollBehaviorCallback[T]): Self = this.set("behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehavior: Self = this.set("behavior", js.undefined)
  }
}
