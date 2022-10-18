package typings.reactNativeCommunityCliPlatformIos

import typings.reactNativeCommunityCliPlatformIos.anon.DemoProjectxcodeproj
import typings.reactNativeCommunityCliPlatformIos.anon.ExampleProjectxcodeproj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `buildConfig@FixturesProjectsMod` {
  
  object project {
    
    @JSImport("@react-native-community/cli-platform-ios/build/config/@/fixtures/projects", "project")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-platform-ios/build/config/@/fixtures/projects", "project.ios")
    @js.native
    def ios: DemoProjectxcodeproj = js.native
    inline def ios_=(x: DemoProjectxcodeproj): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ios")(x.asInstanceOf[js.Any])
  }
  
  object withExamples {
    
    @JSImport("@react-native-community/cli-platform-ios/build/config/@/fixtures/projects", "withExamples")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-platform-ios/build/config/@/fixtures/projects", "withExamples.Examples")
    @js.native
    def Examples: ExampleProjectxcodeproj = js.native
    inline def Examples_=(x: ExampleProjectxcodeproj): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Examples")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-platform-ios/build/config/@/fixtures/projects", "withExamples.ios")
    @js.native
    def ios: DemoProjectxcodeproj = js.native
    inline def ios_=(x: DemoProjectxcodeproj): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ios")(x.asInstanceOf[js.Any])
  }
}
