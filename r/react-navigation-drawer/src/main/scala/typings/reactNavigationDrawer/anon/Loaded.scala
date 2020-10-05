package typings.reactNavigationDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loaded extends js.Object {
  var loaded: js.Array[Double] = js.native
}

object Loaded {
  @scala.inline
  def apply(loaded: js.Array[Double]): Loaded = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loaded]
  }
  @scala.inline
  implicit class LoadedOps[Self <: Loaded] (val x: Self) extends AnyVal {
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
    def setLoadedVarargs(value: Double*): Self = this.set("loaded", js.Array(value :_*))
    @scala.inline
    def setLoaded(value: js.Array[Double]): Self = this.set("loaded", value.asInstanceOf[js.Any])
  }
  
}

