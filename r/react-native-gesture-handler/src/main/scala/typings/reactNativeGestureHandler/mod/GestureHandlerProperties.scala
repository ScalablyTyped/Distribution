package typings.reactNativeGestureHandler.mod

import typings.react.mod.Ref
import typings.reactNativeGestureHandler.anon.Bottom
import typings.reactNativeGestureHandler.anon.BottomHeight
import typings.reactNativeGestureHandler.anon.Height
import typings.reactNativeGestureHandler.anon.Left
import typings.reactNativeGestureHandler.anon.Right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GestureHandlerProperties extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var hitSlop: js.UndefOr[Double | Bottom | Left | Right | Height | BottomHeight] = js.native
  var id: js.UndefOr[String] = js.native
  var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.native
  var simultaneousHandlers: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.native
  var waitFor: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.native
}

object GestureHandlerProperties {
  @scala.inline
  def apply(): GestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureHandlerProperties]
  }
  @scala.inline
  implicit class GestureHandlerPropertiesOps[Self <: GestureHandlerProperties] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setHitSlop(value: Double | Bottom | Left | Right | Height | BottomHeight): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setShouldCancelWhenOutside(value: Boolean): Self = this.set("shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldCancelWhenOutside: Self = this.set("shouldCancelWhenOutside", js.undefined)
    @scala.inline
    def setSimultaneousHandlersVarargs(value: Ref[js.Any]*): Self = this.set("simultaneousHandlers", js.Array(value :_*))
    @scala.inline
    def setSimultaneousHandlersFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("simultaneousHandlers", js.Any.fromFunction1(value))
    @scala.inline
    def setSimultaneousHandlers(value: Ref[_] | js.Array[Ref[_]]): Self = this.set("simultaneousHandlers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimultaneousHandlers: Self = this.set("simultaneousHandlers", js.undefined)
    @scala.inline
    def setSimultaneousHandlersNull: Self = this.set("simultaneousHandlers", null)
    @scala.inline
    def setWaitForVarargs(value: Ref[js.Any]*): Self = this.set("waitFor", js.Array(value :_*))
    @scala.inline
    def setWaitForFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("waitFor", js.Any.fromFunction1(value))
    @scala.inline
    def setWaitFor(value: Ref[_] | js.Array[Ref[_]]): Self = this.set("waitFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitFor: Self = this.set("waitFor", js.undefined)
    @scala.inline
    def setWaitForNull: Self = this.set("waitFor", null)
  }
  
}

