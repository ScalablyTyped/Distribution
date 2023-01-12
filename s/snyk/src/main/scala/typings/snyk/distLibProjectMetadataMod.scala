package typings.snyk

import typings.snyk.distLibProjectMetadataTypesMod.ContainerTarget
import typings.snyk.distLibProjectMetadataTypesMod.GitTarget
import typings.snyk.distLibTypesMod.DepTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibProjectMetadataMod {
  
  @JSImport("snyk/dist/lib/project-metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInfo(
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options
  ): js.Promise[GitTarget | ContainerTarget | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GitTarget | ContainerTarget | Null]]
  inline def getInfo(
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    options: Options,
    packageInfo: DepTree
  ): js.Promise[GitTarget | ContainerTarget | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(scannedProject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], packageInfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GitTarget | ContainerTarget | Null]]
  
  trait Options extends StObject {
    
    var docker: js.UndefOr[Boolean] = js.undefined
    
    var isDocker: js.UndefOr[Boolean] = js.undefined
    
    var `remote-repo-url`: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDocker(value: Boolean): Self = StObject.set(x, "docker", value.asInstanceOf[js.Any])
      
      inline def setDockerUndefined: Self = StObject.set(x, "docker", js.undefined)
      
      inline def setIsDocker(value: Boolean): Self = StObject.set(x, "isDocker", value.asInstanceOf[js.Any])
      
      inline def setIsDockerUndefined: Self = StObject.set(x, "isDocker", js.undefined)
      
      inline def `setRemote-repo-url`(value: String): Self = StObject.set(x, "remote-repo-url", value.asInstanceOf[js.Any])
      
      inline def `setRemote-repo-urlUndefined`: Self = StObject.set(x, "remote-repo-url", js.undefined)
    }
  }
}
