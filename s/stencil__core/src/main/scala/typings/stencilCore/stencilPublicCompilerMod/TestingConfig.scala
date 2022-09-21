package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.domcontentloaded
import typings.stencilCore.stencilCoreStrings.load
import typings.stencilCore.stencilCoreStrings.networkidle0
import typings.stencilCore.stencilCoreStrings.networkidle2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestingConfig
  extends StObject
     with JestConfig {
  
  /**
    * The `allowableMismatchedPixels` value is used to determine an acceptable
    * number of pixels that can be mismatched before the image is considered
    * to have changes. Realistically, two screenshots representing the same
    * content may have a small number of pixels that are not identical due to
    * anti-aliasing, which is perfectly normal. If the `allowableMismatchedRatio`
    * is provided it will take precedence, otherwise `allowableMismatchedPixels`
    * will be used.
    */
  var allowableMismatchedPixels: js.UndefOr[Double] = js.undefined
  
  /**
    * The `allowableMismatchedRatio` ranges from `0` to `1` and is used to
    * determine an acceptable ratio of pixels that can be mismatched before
    * the image is considered to have changes. Realistically, two screenshots
    * representing the same content may have a small number of pixels that
    * are not identical due to anti-aliasing, which is perfectly normal. The
    * `allowableMismatchedRatio` is the number of pixels that were mismatched,
    * divided by the total number of pixels in the screenshot. For example,
    * a ratio value of `0.06` means 6% of the pixels can be mismatched before
    * the image is considered to have changes. If the `allowableMismatchedRatio`
    * is provided it will take precedence, otherwise `allowableMismatchedPixels`
    * will be used.
    */
  var allowableMismatchedRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * Additional arguments to pass to the browser instance.
    */
  var browserArgs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether to auto-open a DevTools panel for each tab.
    * If this option is true, the headless option will be set false
    */
  var browserDevtools: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Path to a Chromium or Chrome executable to run instead of the bundled Chromium.
    */
  var browserExecutablePath: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to run browser e2e tests in headless mode. Defaults to true.
    */
  var browserHeadless: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Slows down e2e browser operations by the specified amount of milliseconds.
    * Useful so that you can see what is going on.
    */
  var browserSlowMo: js.UndefOr[Double] = js.undefined
  
  /**
    * Url of remote Chrome instance to use instead of local Chrome.
    */
  var browserWSEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * By default, all E2E pages wait until the "load" event, this global setting can be used
    * to change the default `waitUntil` behavior.
    */
  var browserWaitUntil: js.UndefOr[load | domcontentloaded | networkidle0 | networkidle2] = js.undefined
  
  /**
    * Array of browser emulations to be using during e2e tests. A full e2e
    * test is ran for each emulation.
    */
  var emulate: js.UndefOr[js.Array[EmulateConfig]] = js.undefined
  
  /**
    * Matching threshold while comparing two screenshots. Value ranges from `0` to `1`.
    * Smaller values make the comparison more sensitive. The `pixelmatchThreshold`
    * value helps to ignore anti-aliasing. Default: `0.1`
    */
  var pixelmatchThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Path to the Screenshot Connector module.
    */
  var screenshotConnector: js.UndefOr[String] = js.undefined
  
  /**
    * Amount of time in milliseconds to wait before a screenshot is taken.
    */
  var waitBeforeScreenshot: js.UndefOr[Double] = js.undefined
}
object TestingConfig {
  
  inline def apply(): TestingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestingConfig]
  }
  
  extension [Self <: TestingConfig](x: Self) {
    
    inline def setAllowableMismatchedPixels(value: Double): Self = StObject.set(x, "allowableMismatchedPixels", value.asInstanceOf[js.Any])
    
    inline def setAllowableMismatchedPixelsUndefined: Self = StObject.set(x, "allowableMismatchedPixels", js.undefined)
    
    inline def setAllowableMismatchedRatio(value: Double): Self = StObject.set(x, "allowableMismatchedRatio", value.asInstanceOf[js.Any])
    
    inline def setAllowableMismatchedRatioUndefined: Self = StObject.set(x, "allowableMismatchedRatio", js.undefined)
    
    inline def setBrowserArgs(value: js.Array[String]): Self = StObject.set(x, "browserArgs", value.asInstanceOf[js.Any])
    
    inline def setBrowserArgsUndefined: Self = StObject.set(x, "browserArgs", js.undefined)
    
    inline def setBrowserArgsVarargs(value: String*): Self = StObject.set(x, "browserArgs", js.Array(value*))
    
    inline def setBrowserDevtools(value: Boolean): Self = StObject.set(x, "browserDevtools", value.asInstanceOf[js.Any])
    
    inline def setBrowserDevtoolsUndefined: Self = StObject.set(x, "browserDevtools", js.undefined)
    
    inline def setBrowserExecutablePath(value: String): Self = StObject.set(x, "browserExecutablePath", value.asInstanceOf[js.Any])
    
    inline def setBrowserExecutablePathUndefined: Self = StObject.set(x, "browserExecutablePath", js.undefined)
    
    inline def setBrowserHeadless(value: Boolean): Self = StObject.set(x, "browserHeadless", value.asInstanceOf[js.Any])
    
    inline def setBrowserHeadlessUndefined: Self = StObject.set(x, "browserHeadless", js.undefined)
    
    inline def setBrowserSlowMo(value: Double): Self = StObject.set(x, "browserSlowMo", value.asInstanceOf[js.Any])
    
    inline def setBrowserSlowMoUndefined: Self = StObject.set(x, "browserSlowMo", js.undefined)
    
    inline def setBrowserWSEndpoint(value: String): Self = StObject.set(x, "browserWSEndpoint", value.asInstanceOf[js.Any])
    
    inline def setBrowserWSEndpointUndefined: Self = StObject.set(x, "browserWSEndpoint", js.undefined)
    
    inline def setBrowserWaitUntil(value: load | domcontentloaded | networkidle0 | networkidle2): Self = StObject.set(x, "browserWaitUntil", value.asInstanceOf[js.Any])
    
    inline def setBrowserWaitUntilUndefined: Self = StObject.set(x, "browserWaitUntil", js.undefined)
    
    inline def setEmulate(value: js.Array[EmulateConfig]): Self = StObject.set(x, "emulate", value.asInstanceOf[js.Any])
    
    inline def setEmulateUndefined: Self = StObject.set(x, "emulate", js.undefined)
    
    inline def setEmulateVarargs(value: EmulateConfig*): Self = StObject.set(x, "emulate", js.Array(value*))
    
    inline def setPixelmatchThreshold(value: Double): Self = StObject.set(x, "pixelmatchThreshold", value.asInstanceOf[js.Any])
    
    inline def setPixelmatchThresholdUndefined: Self = StObject.set(x, "pixelmatchThreshold", js.undefined)
    
    inline def setScreenshotConnector(value: String): Self = StObject.set(x, "screenshotConnector", value.asInstanceOf[js.Any])
    
    inline def setScreenshotConnectorUndefined: Self = StObject.set(x, "screenshotConnector", js.undefined)
    
    inline def setWaitBeforeScreenshot(value: Double): Self = StObject.set(x, "waitBeforeScreenshot", value.asInstanceOf[js.Any])
    
    inline def setWaitBeforeScreenshotUndefined: Self = StObject.set(x, "waitBeforeScreenshot", js.undefined)
  }
}
