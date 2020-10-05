package typings.reactNavigationStack.vendorTypesMod

import typings.reactNavigationStack.anon.Current
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scene[T] extends js.Object {
  /**
    * Descriptor object for the route containing options and navigation object.
    */
  var descriptor: StackDescriptor = js.native
  /**
    * Animated nodes representing the progress of the animation.
    */
  var progress: Current = js.native
  /**
    * Current route object,
    */
  var route: T = js.native
}

object Scene {
  @scala.inline
  def apply[T](descriptor: StackDescriptor, progress: Current, route: T): Scene[T] = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene[T]]
  }
  @scala.inline
  implicit class SceneOps[Self <: Scene[_], T] (val x: Self with Scene[T]) extends AnyVal {
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
    def setDescriptor(value: StackDescriptor): Self = this.set("descriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgress(value: Current): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoute(value: T): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

