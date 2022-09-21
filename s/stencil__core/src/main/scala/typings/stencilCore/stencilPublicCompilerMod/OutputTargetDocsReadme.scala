package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.`docs-readme`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetDocsReadme
  extends StObject
     with OutputTargetBase
     with OutputTarget {
  
  var dependencies: js.UndefOr[Boolean] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
  var footer: js.UndefOr[String] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_OutputTargetDocsReadme: `docs-readme`
}
object OutputTargetDocsReadme {
  
  inline def apply(): OutputTargetDocsReadme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("docs-readme")
    __obj.asInstanceOf[OutputTargetDocsReadme]
  }
  
  extension [Self <: OutputTargetDocsReadme](x: Self) {
    
    inline def setDependencies(value: Boolean): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setType(value: `docs-readme`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
