package typings.requireAll.mod

import typings.requireAll.requireAllBooleans.`false`
import typings.requireAll.requireAllBooleans.`true`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var dirname: String = js.native
  var excludeDirs: js.UndefOr[RegExp] = js.native
  var filter: js.UndefOr[
    (js.Function2[/* name */ String, /* path */ String, js.UndefOr[String | `false`]]) | RegExp
  ] = js.native
  var map: js.UndefOr[js.Function2[/* name */ String, /* path */ String, String]] = js.native
  var recursive: js.UndefOr[`true` | `false`] = js.native
  var resolve: js.UndefOr[js.Function1[/* module */ js.Any, _]] = js.native
}

object Options {
  @scala.inline
  def apply(dirname: String): Options = {
    val __obj = js.Dynamic.literal(dirname = dirname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDirname(value: String): Self = this.set("dirname", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludeDirs(value: RegExp): Self = this.set("excludeDirs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeDirs: Self = this.set("excludeDirs", js.undefined)
    @scala.inline
    def setFilterFunction2(value: (/* name */ String, /* path */ String) => js.UndefOr[String | `false`]): Self = this.set("filter", js.Any.fromFunction2(value))
    @scala.inline
    def setFilter(value: (js.Function2[/* name */ String, /* path */ String, js.UndefOr[String | `false`]]) | RegExp): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setMap(value: (/* name */ String, /* path */ String) => String): Self = this.set("map", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setRecursive(value: `true` | `false`): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    @scala.inline
    def setResolve(value: /* module */ js.Any => _): Self = this.set("resolve", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
  }
  
}

