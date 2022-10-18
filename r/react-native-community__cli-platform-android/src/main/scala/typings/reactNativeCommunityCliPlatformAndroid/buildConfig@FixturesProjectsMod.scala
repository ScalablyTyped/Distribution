package typings.reactNativeCommunityCliPlatformAndroid

import typings.reactNativeCommunityCliPlatformAndroid.anon.Android
import typings.reactNativeCommunityCliPlatformAndroid.anon.App
import typings.reactNativeCommunityCliPlatformAndroid.anon.Buildgradle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `buildConfig@FixturesProjectsMod` {
  
  object flat {
    
    @JSImport("@react-native-community/cli-platform-android/build/config/@/fixtures/projects", "flat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-platform-android/build/config/@/fixtures/projects", "flat.android")
    @js.native
    def android: Buildgradle = js.native
    inline def android_=(x: Buildgradle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("android")(x.asInstanceOf[js.Any])
  }
  
  object nested {
    
    @JSImport("@react-native-community/cli-platform-android/build/config/@/fixtures/projects", "nested")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-platform-android/build/config/@/fixtures/projects", "nested.android")
    @js.native
    def android: App = js.native
    inline def android_=(x: App): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("android")(x.asInstanceOf[js.Any])
  }
  
  object withExamples {
    
    @JSImport("@react-native-community/cli-platform-android/build/config/@/fixtures/projects", "withExamples")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-platform-android/build/config/@/fixtures/projects", "withExamples.Examples")
    @js.native
    def Examples: Android = js.native
    inline def Examples_=(x: Android): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Examples")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-platform-android/build/config/@/fixtures/projects", "withExamples.android")
    @js.native
    def android: Buildgradle = js.native
    inline def android_=(x: Buildgradle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("android")(x.asInstanceOf[js.Any])
  }
}
