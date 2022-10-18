package typings.storybookCsfTools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/csf-tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readCsfOrMdx(
    fileName: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CsfOptions */ Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CsfFile */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("readCsfOrMdx")(fileName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CsfFile */ Any
  ]]
}
