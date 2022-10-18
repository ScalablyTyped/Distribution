package typings.storybookStore

import typings.storybookStore.distTs3Dot9TypesMod.CSFFile
import typings.storybookStore.distTs3Dot9TypesMod.ModuleExports
import typings.storybookStore.distTs3Dot9TypesMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9CsfProcessCSFFileMod {
  
  @JSImport("@storybook/store/dist/ts3.9/csf/processCSFFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def processCSFFile[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    moduleExports: ModuleExports,
    importPath: Path,
    title: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentTitle */ Any
  ): CSFFile[TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("processCSFFile")(moduleExports.asInstanceOf[js.Any], importPath.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[CSFFile[TFramework]]
}
