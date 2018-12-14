package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Key
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var browserName: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Number of times to run this set of capabilities (in parallel, unless
           * limited by maxSessions). Default is 1.
           */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
           * Spec files to be excluded on this capability only.
           */
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * User defined name for the capability that will display in the results
           * log. Defaults to the browser name
           */
  var logName: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Maximum number of browser instances that can run in parallel for this
           * set of capabilities. This is only needed if shardTestFiles is true.
           * Default is 1.
           */
  var maxInstances: js.UndefOr[scala.Double] = js.undefined
  /**
           * Name of the process executing this capability.  Not used directly by
           * protractor or the browser, but instead pass directly to third parties
           * like BrowserStack and SauceLabs as the name of the job running this
           * test
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Optional: override global seleniumAddress on this capability only.
           */
  var seleniumAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
           * If this is set to be true, specs will be sharded by file (i.e. all
           * files to be run by this set of capabilities will run in parallel).
           * Default is false.
           */
  var shardTestFiles: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Additional spec files to be run on this capability only.
           */
  var specs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

