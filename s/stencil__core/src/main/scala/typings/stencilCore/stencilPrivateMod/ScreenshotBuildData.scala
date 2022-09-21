package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotBuildData extends StObject {
  
  var allowableMismatchedPixels: Double
  
  var allowableMismatchedRatio: Double
  
  var buildId: String
  
  var buildsDir: String
  
  var cache: StringDictionary[Double]
  
  var currentBuildDir: String
  
  var imagesDir: String
  
  var masterScreenshots: StringDictionary[String]
  
  var pixelmatchModulePath: String
  
  var pixelmatchThreshold: Double
  
  var rootDir: String
  
  var screenshotDir: String
  
  var timeoutBeforeScreenshot: Double
  
  var updateMaster: Boolean
}
object ScreenshotBuildData {
  
  inline def apply(
    allowableMismatchedPixels: Double,
    allowableMismatchedRatio: Double,
    buildId: String,
    buildsDir: String,
    cache: StringDictionary[Double],
    currentBuildDir: String,
    imagesDir: String,
    masterScreenshots: StringDictionary[String],
    pixelmatchModulePath: String,
    pixelmatchThreshold: Double,
    rootDir: String,
    screenshotDir: String,
    timeoutBeforeScreenshot: Double,
    updateMaster: Boolean
  ): ScreenshotBuildData = {
    val __obj = js.Dynamic.literal(allowableMismatchedPixels = allowableMismatchedPixels.asInstanceOf[js.Any], allowableMismatchedRatio = allowableMismatchedRatio.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], buildsDir = buildsDir.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], currentBuildDir = currentBuildDir.asInstanceOf[js.Any], imagesDir = imagesDir.asInstanceOf[js.Any], masterScreenshots = masterScreenshots.asInstanceOf[js.Any], pixelmatchModulePath = pixelmatchModulePath.asInstanceOf[js.Any], pixelmatchThreshold = pixelmatchThreshold.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], screenshotDir = screenshotDir.asInstanceOf[js.Any], timeoutBeforeScreenshot = timeoutBeforeScreenshot.asInstanceOf[js.Any], updateMaster = updateMaster.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotBuildData]
  }
  
  extension [Self <: ScreenshotBuildData](x: Self) {
    
    inline def setAllowableMismatchedPixels(value: Double): Self = StObject.set(x, "allowableMismatchedPixels", value.asInstanceOf[js.Any])
    
    inline def setAllowableMismatchedRatio(value: Double): Self = StObject.set(x, "allowableMismatchedRatio", value.asInstanceOf[js.Any])
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setBuildsDir(value: String): Self = StObject.set(x, "buildsDir", value.asInstanceOf[js.Any])
    
    inline def setCache(value: StringDictionary[Double]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCurrentBuildDir(value: String): Self = StObject.set(x, "currentBuildDir", value.asInstanceOf[js.Any])
    
    inline def setImagesDir(value: String): Self = StObject.set(x, "imagesDir", value.asInstanceOf[js.Any])
    
    inline def setMasterScreenshots(value: StringDictionary[String]): Self = StObject.set(x, "masterScreenshots", value.asInstanceOf[js.Any])
    
    inline def setPixelmatchModulePath(value: String): Self = StObject.set(x, "pixelmatchModulePath", value.asInstanceOf[js.Any])
    
    inline def setPixelmatchThreshold(value: Double): Self = StObject.set(x, "pixelmatchThreshold", value.asInstanceOf[js.Any])
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    
    inline def setScreenshotDir(value: String): Self = StObject.set(x, "screenshotDir", value.asInstanceOf[js.Any])
    
    inline def setTimeoutBeforeScreenshot(value: Double): Self = StObject.set(x, "timeoutBeforeScreenshot", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaster(value: Boolean): Self = StObject.set(x, "updateMaster", value.asInstanceOf[js.Any])
  }
}
