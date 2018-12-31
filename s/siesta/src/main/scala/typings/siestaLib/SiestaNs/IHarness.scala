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

