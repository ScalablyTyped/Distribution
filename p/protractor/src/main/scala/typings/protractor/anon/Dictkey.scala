package typings.protractor.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var browserName: js.UndefOr[String] = js.native
  /**
    * Number of times to run this set of capabilities (in parallel, unless
    * limited by maxSessions). Default is 1.
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * Spec files to be excluded on this capability only.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * User defined name for the capability that will display in the results
    * log. Defaults to the browser name
    */
  var logName: js.UndefOr[String] = js.native
  /**
    * Maximum number of browser instances that can run in parallel for this
    * set of capabilities. This is only needed if shardTestFiles is true.
    * Default is 1.
    */
  var maxInstances: js.UndefOr[Double] = js.native
  /**
    * Name of the process executing this capability.  Not used directly by
    * protractor or the browser, but instead pass directly to third parties
    * like BrowserStack and SauceLabs as the name of the job running this
    * test
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional: override global seleniumAddress on this capability only.
    */
  var seleniumAddress: js.UndefOr[String] = js.native
  /**
    * If this is set to be true, specs will be sharded by file (i.e. all
    * files to be run by this set of capabilities will run in parallel).
    * Default is false.
    */
  var shardTestFiles: js.UndefOr[Boolean] = js.native
  /**
    * Additional spec files to be run on this capability only.
    */
  var specs: js.UndefOr[js.Array[String]] = js.native
}

object Dictkey {
  @scala.inline
  def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
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
    def setBrowserName(value: String): Self = this.set("browserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserName: Self = this.set("browserName", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setLogName(value: String): Self = this.set("logName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogName: Self = this.set("logName", js.undefined)
    @scala.inline
    def setMaxInstances(value: Double): Self = this.set("maxInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxInstances: Self = this.set("maxInstances", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSeleniumAddress(value: String): Self = this.set("seleniumAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeleniumAddress: Self = this.set("seleniumAddress", js.undefined)
    @scala.inline
    def setShardTestFiles(value: Boolean): Self = this.set("shardTestFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShardTestFiles: Self = this.set("shardTestFiles", js.undefined)
    @scala.inline
    def setSpecsVarargs(value: String*): Self = this.set("specs", js.Array(value :_*))
    @scala.inline
    def setSpecs(value: js.Array[String]): Self = this.set("specs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecs: Self = this.set("specs", js.undefined)
  }
  
}

