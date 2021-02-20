package typings.rollup.mod

import typings.rollup.rollupStrings.chunk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmittedChunk extends EmittedFile {
  
  var fileName: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var implicitlyLoadedAfterOneOf: js.UndefOr[js.Array[String]] = js.native
  
  var importer: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var preserveSignature: js.UndefOr[PreserveEntrySignaturesOption] = js.native
  
  var `type`: chunk = js.native
}
object EmittedChunk {
  
  @scala.inline
  def apply(id: String, `type`: chunk): EmittedChunk = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmittedChunk]
  }
  
  @scala.inline
  implicit class EmittedChunkMutableBuilder[Self <: EmittedChunk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitlyLoadedAfterOneOf(value: js.Array[String]): Self = StObject.set(x, "implicitlyLoadedAfterOneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitlyLoadedAfterOneOfUndefined: Self = StObject.set(x, "implicitlyLoadedAfterOneOf", js.undefined)
    
    @scala.inline
    def setImplicitlyLoadedAfterOneOfVarargs(value: String*): Self = StObject.set(x, "implicitlyLoadedAfterOneOf", js.Array(value :_*))
    
    @scala.inline
    def setImporter(value: String): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImporterUndefined: Self = StObject.set(x, "importer", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPreserveSignature(value: PreserveEntrySignaturesOption): Self = StObject.set(x, "preserveSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveSignatureUndefined: Self = StObject.set(x, "preserveSignature", js.undefined)
    
    @scala.inline
    def setType(value: chunk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
