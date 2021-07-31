package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderModuleImport extends StObject {
  
  val documentName: String
  
  val fragmentName: String
  
  val fragmentPropName: String
  
  val kind: String
}
object ReaderModuleImport {
  
  @scala.inline
  def apply(documentName: String, fragmentName: String, fragmentPropName: String, kind: String): ReaderModuleImport = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], fragmentName = fragmentName.asInstanceOf[js.Any], fragmentPropName = fragmentPropName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderModuleImport]
  }
  
  @scala.inline
  implicit class ReaderModuleImportMutableBuilder[Self <: ReaderModuleImport] (val x: Self) extends AnyVal {
    
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
