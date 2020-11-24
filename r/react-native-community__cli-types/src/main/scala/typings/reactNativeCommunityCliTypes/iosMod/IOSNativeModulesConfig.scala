package typings.reactNativeCommunityCliTypes.iosMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCliTypes.anon.Ios
import typings.reactNativeCommunityCliTypes.anon.Platforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOSNativeModulesConfig extends js.Object {
  
  var dependencies: StringDictionary[Platforms] = js.native
  
  var project: Ios = js.native
  
  var reactNativePath: String = js.native
}
object IOSNativeModulesConfig {
  
  @scala.inline
  def apply(dependencies: StringDictionary[Platforms], project: Ios, reactNativePath: String): IOSNativeModulesConfig = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reactNativePath = reactNativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOSNativeModulesConfig]
  }
  
  @scala.inline
  implicit class IOSNativeModulesConfigOps[Self <: IOSNativeModulesConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDependencies(value: StringDictionary[Platforms]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: Ios): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactNativePath(value: String): Self = this.set("reactNativePath", value.asInstanceOf[js.Any])
  }
}
