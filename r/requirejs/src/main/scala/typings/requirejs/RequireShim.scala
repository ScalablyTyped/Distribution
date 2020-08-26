package typings.requirejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequireShim extends js.Object {
  /**
    * List of dependencies.
    **/
  var deps: js.UndefOr[js.Array[String]] = js.native
  /**
    * Name the module will be exported as.
    **/
  var exports: js.UndefOr[String] = js.native
  /**
    * Initialize function with all dependcies passed in,
    * if the function returns a value then that value is used
    * as the module export value instead of the object
    * found via the 'exports' string.
    * @param dependencies
    * @return
    **/
  var init: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object RequireShim {
  @scala.inline
  def apply(): RequireShim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequireShim]
  }
  @scala.inline
  implicit class RequireShimOps[Self <: RequireShim] (val x: Self) extends AnyVal {
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
    def setDepsVarargs(value: String*): Self = this.set("deps", js.Array(value :_*))
    @scala.inline
    def setDeps(value: js.Array[String]): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeps: Self = this.set("deps", js.undefined)
    @scala.inline
    def setExports(value: String): Self = this.set("exports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExports: Self = this.set("exports", js.undefined)
    @scala.inline
    def setInit(value: /* repeated */ js.Any => _): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
  }
  
}

