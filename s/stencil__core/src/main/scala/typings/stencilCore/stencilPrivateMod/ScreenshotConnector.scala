package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotConnector extends StObject {
  
  def completeBuild(masterBuild: ScreenshotBuild): js.Promise[ScreenshotBuildResults]
  
  def generateJsonpDataUris(build: ScreenshotBuild): js.Promise[Unit]
  
  def getMasterBuild(): js.Promise[ScreenshotBuild]
  
  def getScreenshotCache(): js.Promise[ScreenshotCache]
  
  def initBuild(opts: ScreenshotConnectorOptions): js.Promise[Unit]
  
  def publishBuild(buildResults: ScreenshotBuildResults): js.Promise[ScreenshotBuildResults]
  
  def pullMasterBuild(): js.Promise[Unit]
  
  def sortScreenshots(screenshots: js.Array[Screenshot]): js.Array[Screenshot]
  
  def toJson(masterBuild: ScreenshotBuild, screenshotCache: ScreenshotCache): String
  
  def updateScreenshotCache(screenshotCache: ScreenshotCache, buildResults: ScreenshotBuildResults): js.Promise[ScreenshotCache]
}
object ScreenshotConnector {
  
  inline def apply(
    completeBuild: ScreenshotBuild => js.Promise[ScreenshotBuildResults],
    generateJsonpDataUris: ScreenshotBuild => js.Promise[Unit],
    getMasterBuild: () => js.Promise[ScreenshotBuild],
    getScreenshotCache: () => js.Promise[ScreenshotCache],
    initBuild: ScreenshotConnectorOptions => js.Promise[Unit],
    publishBuild: ScreenshotBuildResults => js.Promise[ScreenshotBuildResults],
    pullMasterBuild: () => js.Promise[Unit],
    sortScreenshots: js.Array[Screenshot] => js.Array[Screenshot],
    toJson: (ScreenshotBuild, ScreenshotCache) => String,
    updateScreenshotCache: (ScreenshotCache, ScreenshotBuildResults) => js.Promise[ScreenshotCache]
  ): ScreenshotConnector = {
    val __obj = js.Dynamic.literal(completeBuild = js.Any.fromFunction1(completeBuild), generateJsonpDataUris = js.Any.fromFunction1(generateJsonpDataUris), getMasterBuild = js.Any.fromFunction0(getMasterBuild), getScreenshotCache = js.Any.fromFunction0(getScreenshotCache), initBuild = js.Any.fromFunction1(initBuild), publishBuild = js.Any.fromFunction1(publishBuild), pullMasterBuild = js.Any.fromFunction0(pullMasterBuild), sortScreenshots = js.Any.fromFunction1(sortScreenshots), toJson = js.Any.fromFunction2(toJson), updateScreenshotCache = js.Any.fromFunction2(updateScreenshotCache))
    __obj.asInstanceOf[ScreenshotConnector]
  }
  
  extension [Self <: ScreenshotConnector](x: Self) {
    
    inline def setCompleteBuild(value: ScreenshotBuild => js.Promise[ScreenshotBuildResults]): Self = StObject.set(x, "completeBuild", js.Any.fromFunction1(value))
    
    inline def setGenerateJsonpDataUris(value: ScreenshotBuild => js.Promise[Unit]): Self = StObject.set(x, "generateJsonpDataUris", js.Any.fromFunction1(value))
    
    inline def setGetMasterBuild(value: () => js.Promise[ScreenshotBuild]): Self = StObject.set(x, "getMasterBuild", js.Any.fromFunction0(value))
    
    inline def setGetScreenshotCache(value: () => js.Promise[ScreenshotCache]): Self = StObject.set(x, "getScreenshotCache", js.Any.fromFunction0(value))
    
    inline def setInitBuild(value: ScreenshotConnectorOptions => js.Promise[Unit]): Self = StObject.set(x, "initBuild", js.Any.fromFunction1(value))
    
    inline def setPublishBuild(value: ScreenshotBuildResults => js.Promise[ScreenshotBuildResults]): Self = StObject.set(x, "publishBuild", js.Any.fromFunction1(value))
    
    inline def setPullMasterBuild(value: () => js.Promise[Unit]): Self = StObject.set(x, "pullMasterBuild", js.Any.fromFunction0(value))
    
    inline def setSortScreenshots(value: js.Array[Screenshot] => js.Array[Screenshot]): Self = StObject.set(x, "sortScreenshots", js.Any.fromFunction1(value))
    
    inline def setToJson(value: (ScreenshotBuild, ScreenshotCache) => String): Self = StObject.set(x, "toJson", js.Any.fromFunction2(value))
    
    inline def setUpdateScreenshotCache(value: (ScreenshotCache, ScreenshotBuildResults) => js.Promise[ScreenshotCache]): Self = StObject.set(x, "updateScreenshotCache", js.Any.fromFunction2(value))
  }
}
