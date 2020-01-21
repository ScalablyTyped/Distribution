package typings.protractor

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBrowserName
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

object AnonBrowserName {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    browserName: String = null,
    count: Int | Double = null,
    exclude: js.Array[String] = null,
    logName: String = null,
    maxInstances: Int | Double = null,
    name: String = null,
    seleniumAddress: String = null,
    shardTestFiles: js.UndefOr[Boolean] = js.undefined,
    specs: js.Array[String] = null
  ): AnonBrowserName = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (browserName != null) __obj.updateDynamic("browserName")(browserName.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (logName != null) __obj.updateDynamic("logName")(logName.asInstanceOf[js.Any])
    if (maxInstances != null) __obj.updateDynamic("maxInstances")(maxInstances.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (seleniumAddress != null) __obj.updateDynamic("seleniumAddress")(seleniumAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(shardTestFiles)) __obj.updateDynamic("shardTestFiles")(shardTestFiles.asInstanceOf[js.Any])
    if (specs != null) __obj.updateDynamic("specs")(specs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBrowserName]
  }
}

