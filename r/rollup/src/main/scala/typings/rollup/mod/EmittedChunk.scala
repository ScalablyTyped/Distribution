package typings.rollup.mod

import typings.rollup.rollupStrings.chunk
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
  implicit class EmittedChunkOps[Self <: EmittedChunk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: chunk): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setImplicitlyLoadedAfterOneOfVarargs(value: String*): Self = this.set("implicitlyLoadedAfterOneOf", js.Array(value :_*))
    
    @scala.inline
    def setImplicitlyLoadedAfterOneOf(value: js.Array[String]): Self = this.set("implicitlyLoadedAfterOneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplicitlyLoadedAfterOneOf: Self = this.set("implicitlyLoadedAfterOneOf", js.undefined)
    
    @scala.inline
    def setImporter(value: String): Self = this.set("importer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImporter: Self = this.set("importer", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPreserveSignature(value: PreserveEntrySignaturesOption): Self = this.set("preserveSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveSignature: Self = this.set("preserveSignature", js.undefined)
  }
}
