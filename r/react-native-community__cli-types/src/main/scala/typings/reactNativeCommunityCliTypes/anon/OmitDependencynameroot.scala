package typings.reactNativeCommunityCliTypes.anon

import typings.reactNativeCommunityCliTypes.mod.InquirerPrompt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@react-native-community/cli-types.@react-native-community/cli-types.Dependency, 'name' | 'root'> */
trait OmitDependencynameroot extends StObject {
  
  var assets: js.Array[String]
  
  var hooks: Postlink
  
  var params: js.Array[InquirerPrompt]
  
  var platforms: Dictkey
}
object OmitDependencynameroot {
  
  @scala.inline
  def apply(assets: js.Array[String], hooks: Postlink, params: js.Array[InquirerPrompt], platforms: Dictkey): OmitDependencynameroot = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitDependencynameroot]
  }
  
  @scala.inline
  implicit class OmitDependencynamerootMutableBuilder[Self <: OmitDependencynameroot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssets(value: js.Array[String]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsVarargs(value: String*): Self = StObject.set(x, "assets", js.Array(value :_*))
    
    @scala.inline
    def setHooks(value: Postlink): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Array[InquirerPrompt]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: InquirerPrompt*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setPlatforms(value: Dictkey): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
  }
}
