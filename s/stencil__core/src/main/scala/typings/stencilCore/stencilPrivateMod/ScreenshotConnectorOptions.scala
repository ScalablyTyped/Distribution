package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilPublicCompilerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotConnectorOptions extends StObject {
  
  var allowableMismatchedPixels: js.UndefOr[Double] = js.undefined
  
  var allowableMismatchedRatio: js.UndefOr[Double] = js.undefined
  
  var appNamespace: String
  
  var buildAuthor: js.UndefOr[String] = js.undefined
  
  var buildId: String
  
  var buildMessage: String
  
  var buildTimestamp: Double
  
  var buildUrl: js.UndefOr[String] = js.undefined
  
  var buildsDirName: js.UndefOr[String] = js.undefined
  
  var cacheDir: String
  
  var currentBuildDir: js.UndefOr[String] = js.undefined
  
  var imagesDirName: js.UndefOr[String] = js.undefined
  
  var logger: Logger
  
  var packageDir: String
  
  var pixelmatchModulePath: js.UndefOr[String] = js.undefined
  
  var pixelmatchThreshold: js.UndefOr[Double] = js.undefined
  
  var previewUrl: js.UndefOr[String] = js.undefined
  
  var rootDir: String
  
  var screenshotDirName: js.UndefOr[String] = js.undefined
  
  var updateMaster: js.UndefOr[Boolean] = js.undefined
  
  var waitBeforeScreenshot: js.UndefOr[Double] = js.undefined
}
object ScreenshotConnectorOptions {
  
  inline def apply(
    appNamespace: String,
    buildId: String,
    buildMessage: String,
    buildTimestamp: Double,
    cacheDir: String,
    logger: Logger,
    packageDir: String,
    rootDir: String
  ): ScreenshotConnectorOptions = {
    val __obj = js.Dynamic.literal(appNamespace = appNamespace.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], buildMessage = buildMessage.asInstanceOf[js.Any], buildTimestamp = buildTimestamp.asInstanceOf[js.Any], cacheDir = cacheDir.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], packageDir = packageDir.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotConnectorOptions]
  }
  
  extension [Self <: ScreenshotConnectorOptions](x: Self) {
    
    inline def setAllowableMismatchedPixels(value: Double): Self = StObject.set(x, "allowableMismatchedPixels", value.asInstanceOf[js.Any])
    
    inline def setAllowableMismatchedPixelsUndefined: Self = StObject.set(x, "allowableMismatchedPixels", js.undefined)
    
    inline def setAllowableMismatchedRatio(value: Double): Self = StObject.set(x, "allowableMismatchedRatio", value.asInstanceOf[js.Any])
    
    inline def setAllowableMismatchedRatioUndefined: Self = StObject.set(x, "allowableMismatchedRatio", js.undefined)
    
    inline def setAppNamespace(value: String): Self = StObject.set(x, "appNamespace", value.asInstanceOf[js.Any])
    
    inline def setBuildAuthor(value: String): Self = StObject.set(x, "buildAuthor", value.asInstanceOf[js.Any])
    
    inline def setBuildAuthorUndefined: Self = StObject.set(x, "buildAuthor", js.undefined)
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setBuildMessage(value: String): Self = StObject.set(x, "buildMessage", value.asInstanceOf[js.Any])
    
    inline def setBuildTimestamp(value: Double): Self = StObject.set(x, "buildTimestamp", value.asInstanceOf[js.Any])
    
    inline def setBuildUrl(value: String): Self = StObject.set(x, "buildUrl", value.asInstanceOf[js.Any])
    
    inline def setBuildUrlUndefined: Self = StObject.set(x, "buildUrl", js.undefined)
    
    inline def setBuildsDirName(value: String): Self = StObject.set(x, "buildsDirName", value.asInstanceOf[js.Any])
    
    inline def setBuildsDirNameUndefined: Self = StObject.set(x, "buildsDirName", js.undefined)
    
    inline def setCacheDir(value: String): Self = StObject.set(x, "cacheDir", value.asInstanceOf[js.Any])
    
    inline def setCurrentBuildDir(value: String): Self = StObject.set(x, "currentBuildDir", value.asInstanceOf[js.Any])
    
    inline def setCurrentBuildDirUndefined: Self = StObject.set(x, "currentBuildDir", js.undefined)
    
    inline def setImagesDirName(value: String): Self = StObject.set(x, "imagesDirName", value.asInstanceOf[js.Any])
    
    inline def setImagesDirNameUndefined: Self = StObject.set(x, "imagesDirName", js.undefined)
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setPackageDir(value: String): Self = StObject.set(x, "packageDir", value.asInstanceOf[js.Any])
    
    inline def setPixelmatchModulePath(value: String): Self = StObject.set(x, "pixelmatchModulePath", value.asInstanceOf[js.Any])
    
    inline def setPixelmatchModulePathUndefined: Self = StObject.set(x, "pixelmatchModulePath", js.undefined)
    
    inline def setPixelmatchThreshold(value: Double): Self = StObject.set(x, "pixelmatchThreshold", value.asInstanceOf[js.Any])
    
    inline def setPixelmatchThresholdUndefined: Self = StObject.set(x, "pixelmatchThreshold", js.undefined)
    
    inline def setPreviewUrl(value: String): Self = StObject.set(x, "previewUrl", value.asInstanceOf[js.Any])
    
    inline def setPreviewUrlUndefined: Self = StObject.set(x, "previewUrl", js.undefined)
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    
    inline def setScreenshotDirName(value: String): Self = StObject.set(x, "screenshotDirName", value.asInstanceOf[js.Any])
    
    inline def setScreenshotDirNameUndefined: Self = StObject.set(x, "screenshotDirName", js.undefined)
    
    inline def setUpdateMaster(value: Boolean): Self = StObject.set(x, "updateMaster", value.asInstanceOf[js.Any])
    
    inline def setUpdateMasterUndefined: Self = StObject.set(x, "updateMaster", js.undefined)
    
    inline def setWaitBeforeScreenshot(value: Double): Self = StObject.set(x, "waitBeforeScreenshot", value.asInstanceOf[js.Any])
    
    inline def setWaitBeforeScreenshotUndefined: Self = StObject.set(x, "waitBeforeScreenshot", js.undefined)
  }
}
