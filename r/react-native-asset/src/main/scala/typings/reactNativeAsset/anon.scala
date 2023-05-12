package typings.reactNativeAsset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Android extends StObject {
    
    var android: Assets
    
    var ios: Assets
  }
  object Android {
    
    inline def apply(android: Assets, ios: Assets): Android = {
      val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any])
      __obj.asInstanceOf[Android]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Android] (val x: Self) extends AnyVal {
      
      inline def setAndroid(value: Assets): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setIos(value: Assets): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    }
  }
  
  trait Assets extends StObject {
    
    /** Array of folder paths that point to the location of assets  */
    var assets: js.Array[String]
    
    var enabled: Boolean
  }
  object Assets {
    
    inline def apply(assets: js.Array[String], enabled: Boolean): Assets = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assets]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Assets] (val x: Self) extends AnyVal {
      
      inline def setAssets(value: js.Array[String]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsVarargs(value: String*): Self = StObject.set(x, "assets", js.Array(value*))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait Platforms extends StObject {
    
    var platforms: Android
    
    /**
      * Root path of where to search for the `assets` folders
      * @default process.cwd()
      */
    var rootPath: js.UndefOr[String] = js.undefined
    
    /**
      * @default true
      */
    var shouldUnlink: js.UndefOr[Boolean] = js.undefined
  }
  object Platforms {
    
    inline def apply(platforms: Android): Platforms = {
      val __obj = js.Dynamic.literal(platforms = platforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[Platforms]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Platforms] (val x: Self) extends AnyVal {
      
      inline def setPlatforms(value: Android): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
      
      inline def setRootPathUndefined: Self = StObject.set(x, "rootPath", js.undefined)
      
      inline def setShouldUnlink(value: Boolean): Self = StObject.set(x, "shouldUnlink", value.asInstanceOf[js.Any])
      
      inline def setShouldUnlinkUndefined: Self = StObject.set(x, "shouldUnlink", js.undefined)
    }
  }
}
