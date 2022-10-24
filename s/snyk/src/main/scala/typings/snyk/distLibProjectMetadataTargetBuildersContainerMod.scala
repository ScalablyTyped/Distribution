package typings.snyk

import typings.snyk.anon.IsFromContainer
import typings.snyk.distLibProjectMetadataTypesMod.ContainerTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibProjectMetadataTargetBuildersContainerMod {
  
  @JSImport("snyk/dist/lib/project-metadata/target-builders/container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInfo(param0: IsFromContainer): js.Promise[ContainerTarget | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ContainerTarget | Null]]
}
