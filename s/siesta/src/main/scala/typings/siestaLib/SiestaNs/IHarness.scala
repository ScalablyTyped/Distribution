package typings
package siestaLib.SiestaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @abstract
  */
trait IHarness extends js.Object {
  var alsoPreload: js.Array[_]
  var autoCheckGlobals: scala.Boolean
  var cachePreload: scala.Boolean
  var defaultTimeout: scala.Boolean
  var disableColoring: scala.Boolean
  var expectedGlobals: js.Array[java.lang.String]
  var isReadyTimeout: scala.Double
  var keepNLastResults: scala.Double
  var keepResults: scala.Boolean
  var listenters: org.scalablytyped.runtime.StringDictionary[js.Function2[/* event */ stdLib.Event, /* repeated */ js.Any, scala.Unit]]
  var maxThreads: scala.Double
  var needDone: scala.Boolean
  var overrideSetTimeout: scala.Boolean
  var pauseBetweenTests: scala.Double
  var preload: js.Array[_]
  var runCore: java.lang.String
  var subTestTimeout: scala.Double
  var testClass: ITest
  var title: java.lang.String
  var transparentEx: scala.Boolean
  var waitForTimeout: scala.Double
  def configure(config: js.Any): scala.Unit
  def start(descriptors: js.Any*): scala.Unit
}

object IHarness {
  @scala.inline
  def apply(
    alsoPreload: js.Array[_],
    autoCheckGlobals: scala.Boolean,
    cachePreload: scala.Boolean,
    configure: js.Function1[js.Any, scala.Unit],
    defaultTimeout: scala.Boolean,
    disableColoring: scala.Boolean,
    expectedGlobals: js.Array[java.lang.String],
    isReadyTimeout: scala.Double,
    keepNLastResults: scala.Double,
    keepResults: scala.Boolean,
    listenters: org.scalablytyped.runtime.StringDictionary[js.Function2[/* event */ stdLib.Event, /* repeated */ js.Any, scala.Unit]],
    maxThreads: scala.Double,
    needDone: scala.Boolean,
    overrideSetTimeout: scala.Boolean,
    pauseBetweenTests: scala.Double,
    preload: js.Array[_],
    runCore: java.lang.String,
    start: js.Function1[/* repeated */ js.Any, scala.Unit],
    subTestTimeout: scala.Double,
    testClass: ITest,
    title: java.lang.String,
    transparentEx: scala.Boolean,
    waitForTimeout: scala.Double
  ): IHarness = {
    val __obj = js.Dynamic.literal(alsoPreload = alsoPreload, autoCheckGlobals = autoCheckGlobals, cachePreload = cachePreload, configure = configure, defaultTimeout = defaultTimeout, disableColoring = disableColoring, expectedGlobals = expectedGlobals, isReadyTimeout = isReadyTimeout, keepNLastResults = keepNLastResults, keepResults = keepResults, listenters = listenters, maxThreads = maxThreads, needDone = needDone, overrideSetTimeout = overrideSetTimeout, pauseBetweenTests = pauseBetweenTests, preload = preload, runCore = runCore, start = start, subTestTimeout = subTestTimeout, testClass = testClass, title = title, transparentEx = transparentEx, waitForTimeout = waitForTimeout)
  
    __obj.asInstanceOf[IHarness]
  }
}

