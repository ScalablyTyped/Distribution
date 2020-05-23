package typings.protractor.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var browserName: js.UndefOr[String] = js.undefined
  /**
    * Number of times to run this set of capabilities (in parallel, unless
    * limited by maxSessions). Default is 1.
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * Spec files to be excluded on this capability only.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * User defined name for the capability that will display in the results
    * log. Defaults to the browser name
    */
  var logName: js.UndefOr[String] = js.undefined
  /**
    * Maximum number of browser instances that can run in parallel for this
    * set of capabilities. This is only needed if shardTestFiles is true.
    * Default is 1.
    */
  var maxInstances: js.UndefOr[Double] = js.undefined
  /**
    * Name of the process executing this capability.  Not used directly by
    * protractor or the browser, but instead pass directly to third parties
    * like BrowserStack and SauceLabs as the name of the job running this
    * test
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Optional: override global seleniumAddress on this capability only.
    */
  var seleniumAddress: js.UndefOr[String] = js.undefined
  /**
    * If this is set to be true, specs will be sharded by file (i.e. all
    * files to be run by this set of capabilities will run in parallel).
    * Default is false.
    */
  var shardTestFiles: js.UndefOr[Boolean] = js.undefined
  /**
    * Additional spec files to be run on this capability only.
    */
  var specs: js.UndefOr[js.Array[String]] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    browserName: String = null,
    count: js.UndefOr[Double] = js.undefined,
    exclude: js.Array[String] = null,
    logName: String = null,
    maxInstances: js.UndefOr[Double] = js.undefined,
    name: String = null,
    seleniumAddress: String = null,
    shardTestFiles: js.UndefOr[Boolean] = js.undefined,
    specs: js.Array[String] = null
  ): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (browserName != null) __obj.updateDynamic("browserName")(browserName.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (logName != null) __obj.updateDynamic("logName")(logName.asInstanceOf[js.Any])
    if (!js.isUndefined(maxInstances)) __obj.updateDynamic("maxInstances")(maxInstances.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (seleniumAddress != null) __obj.updateDynamic("seleniumAddress")(seleniumAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(shardTestFiles)) __obj.updateDynamic("shardTestFiles")(shardTestFiles.get.asInstanceOf[js.Any])
    if (specs != null) __obj.updateDynamic("specs")(specs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

