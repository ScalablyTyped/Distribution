package typings.snyk

import typings.snyk.distLibTypesMod.MonitorMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibContainerMod {
  
  @JSImport("snyk/dist/lib/container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/lib/container", "IMAGE_SAVE_PATH_ENV_VAR")
  @js.native
  val IMAGE_SAVE_PATH_ENV_VAR: /* "SNYK_IMAGE_SAVE_PATH" */ String = js.native
  
  @JSImport("snyk/dist/lib/container", "IMAGE_SAVE_PATH_OPT")
  @js.native
  val IMAGE_SAVE_PATH_OPT: /* "imageSavePath" */ String = js.native
  
  inline def getContainerImageSavePath(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContainerImageSavePath")().asInstanceOf[js.UndefOr[String]]
  
  inline def getContainerName(
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    meta: MonitorMeta
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getContainerName")(scannedProject.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getContainerProjectName(
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any,
    meta: MonitorMeta
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getContainerProjectName")(scannedProject.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getContainerTargetFile(
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any
  ): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContainerTargetFile")(scannedProject.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def isContainer(
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContainer")(scannedProject.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
