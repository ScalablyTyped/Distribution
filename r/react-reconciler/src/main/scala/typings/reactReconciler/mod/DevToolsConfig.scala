package typings.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevToolsConfig[Instance, TextInstance] extends js.Object {
  var bundleType: BundleType = js.native
  // Note: this actually *does* depend on Fiber internal fields.
  // Used by "inspect clicked DOM element" in React DevTools.
  var findFiberByHostInstance: js.UndefOr[js.Function1[/* instance */ Instance | TextInstance, Fiber]] = js.native
  // Used by RN in-app inspector.
  // This API is unfortunately RN-specific.
  // TODO: Change it to accept Fiber instead and type it properly.
  var getInspectorDataForViewTag: js.UndefOr[js.Function1[/* tag */ Double, js.Object]] = js.native
  var rendererPackageName: String = js.native
  var version: String = js.native
}

object DevToolsConfig {
  @scala.inline
  def apply[Instance, TextInstance](bundleType: BundleType, rendererPackageName: String, version: String): DevToolsConfig[Instance, TextInstance] = {
    val __obj = js.Dynamic.literal(bundleType = bundleType.asInstanceOf[js.Any], rendererPackageName = rendererPackageName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevToolsConfig[Instance, TextInstance]]
  }
  @scala.inline
  implicit class DevToolsConfigOps[Self <: DevToolsConfig[_, _], Instance, TextInstance] (val x: Self with (DevToolsConfig[Instance, TextInstance])) extends AnyVal {
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
    def setBundleType(value: BundleType): Self = this.set("bundleType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRendererPackageName(value: String): Self = this.set("rendererPackageName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindFiberByHostInstance(value: /* instance */ Instance | TextInstance => Fiber): Self = this.set("findFiberByHostInstance", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFindFiberByHostInstance: Self = this.set("findFiberByHostInstance", js.undefined)
    @scala.inline
    def setGetInspectorDataForViewTag(value: /* tag */ Double => js.Object): Self = this.set("getInspectorDataForViewTag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetInspectorDataForViewTag: Self = this.set("getInspectorDataForViewTag", js.undefined)
  }
  
}

