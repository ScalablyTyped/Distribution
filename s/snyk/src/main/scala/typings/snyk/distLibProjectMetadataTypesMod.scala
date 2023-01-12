package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibProjectMetadataTypesMod {
  
  @JSImport("snyk/dist/lib/project-metadata/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isGitTarget(target: Any): /* is snyk.snyk/dist/lib/project-metadata/types.GitTarget */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGitTarget")(target.asInstanceOf[js.Any]).asInstanceOf[/* is snyk.snyk/dist/lib/project-metadata/types.GitTarget */ Boolean]
  
  trait ContainerTarget extends StObject {
    
    var image: js.UndefOr[String] = js.undefined
  }
  object ContainerTarget {
    
    inline def apply(): ContainerTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerTarget]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContainerTarget] (val x: Self) extends AnyVal {
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    }
  }
  
  trait GitTarget extends StObject {
    
    var branch: js.UndefOr[String] = js.undefined
    
    var remoteUrl: js.UndefOr[String] = js.undefined
  }
  object GitTarget {
    
    inline def apply(): GitTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GitTarget]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GitTarget] (val x: Self) extends AnyVal {
      
      inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      inline def setRemoteUrl(value: String): Self = StObject.set(x, "remoteUrl", value.asInstanceOf[js.Any])
      
      inline def setRemoteUrlUndefined: Self = StObject.set(x, "remoteUrl", js.undefined)
    }
  }
}
