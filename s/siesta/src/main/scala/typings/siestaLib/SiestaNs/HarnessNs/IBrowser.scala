package typings
package siestaLib.SiestaNs.HarnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * @singleton
         */

trait IBrowser
  extends siestaLib.SiestaNs.IHarness {
  var autoRun: scala.Boolean
  var autoScrollElementsIntoView: scala.Boolean
  var breakOnFail: scala.Boolean
  var coverageUnit: java.lang.String
  var disableCaching: scala.Boolean
  var enableCodeCoverage: scala.Boolean
  var excludeCoverageUnits: stdLib.RegExp
  var hostPageUrl: java.lang.String
  var includeCoverageUnits: stdLib.RegExp
  var maintainViewportSize: scala.Boolean
  var separateContext: scala.Boolean
  var simulateEventsWith: java.lang.String
  var speedRun: scala.Boolean
  var useStrictMode: scala.Boolean
  var viewDOM: scala.Boolean
  var viewportHeight: scala.Double
  var viewportWidth: scala.Double
}

