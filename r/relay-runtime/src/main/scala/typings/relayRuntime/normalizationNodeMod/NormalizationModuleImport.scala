package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationModuleImport
  extends StObject
     with NormalizationSelection {
  
  var documentName: String
  
  var fragmentName: String
  
  var fragmentPropName: String
  
  var kind: String
}
object NormalizationModuleImport {
  
  @scala.inline
  def apply(documentName: String, fragmentName: String, fragmentPropName: String, kind: String): NormalizationModuleImport = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], fragmentName = fragmentName.asInstanceOf[js.Any], fragmentPropName = fragmentPropName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationModuleImport]
  }
  
  @scala.inline
  implicit class NormalizationModuleImportMutableBuilder[Self <: NormalizationModuleImport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentName(value: String): Self = StObject.set(x, "documentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentName(value: String): Self = StObject.set(x, "fragmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentPropName(value: String): Self = StObject.set(x, "fragmentPropName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
