package typings.qunit

import typings.qunit.anon.Id
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var altertitle: Boolean = js.native
  var autostart: Boolean = js.native
  var collapse: Boolean = js.native
  var current: js.Any = js.native
  var filter: String | RegExp = js.native
  var fixture: String = js.native
  var hidepassed: Boolean = js.native
  var maxDepth: Double = js.native
  var module: String = js.native
  var moduleId: js.Array[String] = js.native
  var noglobals: Boolean = js.native
  var notrycatch: Boolean = js.native
  var reorder: Boolean = js.native
  var requireExpects: Boolean = js.native
  var scrolltop: Boolean = js.native
  var seed: String = js.native
  var testId: js.Array[String] = js.native
  var testTimeout: Double = js.native
  var urlConfig: js.Array[Id] = js.native
}

object Config {
  @scala.inline
  def apply(
    altertitle: Boolean,
    autostart: Boolean,
    collapse: Boolean,
    current: js.Any,
    filter: String | RegExp,
    fixture: String,
    hidepassed: Boolean,
    maxDepth: Double,
    module: String,
    moduleId: js.Array[String],
    noglobals: Boolean,
    notrycatch: Boolean,
    reorder: Boolean,
    requireExpects: Boolean,
    scrolltop: Boolean,
    seed: String,
    testId: js.Array[String],
    testTimeout: Double,
    urlConfig: js.Array[Id]
  ): Config = {
    val __obj = js.Dynamic.literal(altertitle = altertitle.asInstanceOf[js.Any], autostart = autostart.asInstanceOf[js.Any], collapse = collapse.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], fixture = fixture.asInstanceOf[js.Any], hidepassed = hidepassed.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], noglobals = noglobals.asInstanceOf[js.Any], notrycatch = notrycatch.asInstanceOf[js.Any], reorder = reorder.asInstanceOf[js.Any], requireExpects = requireExpects.asInstanceOf[js.Any], scrolltop = scrolltop.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any], urlConfig = urlConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setAltertitle(value: Boolean): Self = this.set("altertitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutostart(value: Boolean): Self = this.set("autostart", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollapse(value: Boolean): Self = this.set("collapse", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrent(value: js.Any): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: String | RegExp): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixture(value: String): Self = this.set("fixture", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidepassed(value: Boolean): Self = this.set("hidepassed", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setModule(value: String): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleIdVarargs(value: String*): Self = this.set("moduleId", js.Array(value :_*))
    @scala.inline
    def setModuleId(value: js.Array[String]): Self = this.set("moduleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoglobals(value: Boolean): Self = this.set("noglobals", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotrycatch(value: Boolean): Self = this.set("notrycatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setReorder(value: Boolean): Self = this.set("reorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequireExpects(value: Boolean): Self = this.set("requireExpects", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrolltop(value: Boolean): Self = this.set("scrolltop", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeed(value: String): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestIdVarargs(value: String*): Self = this.set("testId", js.Array(value :_*))
    @scala.inline
    def setTestId(value: js.Array[String]): Self = this.set("testId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestTimeout(value: Double): Self = this.set("testTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlConfigVarargs(value: Id*): Self = this.set("urlConfig", js.Array(value :_*))
    @scala.inline
    def setUrlConfig(value: js.Array[Id]): Self = this.set("urlConfig", value.asInstanceOf[js.Any])
  }
  
}

