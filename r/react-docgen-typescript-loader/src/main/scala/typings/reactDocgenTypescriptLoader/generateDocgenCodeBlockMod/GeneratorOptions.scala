package typings.reactDocgenTypescriptLoader.generateDocgenCodeBlockMod

import typings.reactDocgenTypescript.parserMod.ComponentDoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneratorOptions extends js.Object {
  
  var componentDocs: js.Array[ComponentDoc] = js.native
  
  var docgenCollectionName: String | Null = js.native
  
  var filename: String = js.native
  
  var setDisplayName: Boolean = js.native
  
  var source: String = js.native
  
  var typePropName: String = js.native
}
object GeneratorOptions {
  
  @scala.inline
  def apply(
    componentDocs: js.Array[ComponentDoc],
    filename: String,
    setDisplayName: Boolean,
    source: String,
    typePropName: String
  ): GeneratorOptions = {
    val __obj = js.Dynamic.literal(componentDocs = componentDocs.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], setDisplayName = setDisplayName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], typePropName = typePropName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratorOptions]
  }
  
  @scala.inline
  implicit class GeneratorOptionsOps[Self <: GeneratorOptions] (val x: Self) extends AnyVal {
    
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
    def setComponentDocsVarargs(value: ComponentDoc*): Self = this.set("componentDocs", js.Array(value :_*))
    
    @scala.inline
    def setComponentDocs(value: js.Array[ComponentDoc]): Self = this.set("componentDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDisplayName(value: Boolean): Self = this.set("setDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypePropName(value: String): Self = this.set("typePropName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocgenCollectionName(value: String): Self = this.set("docgenCollectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocgenCollectionNameNull: Self = this.set("docgenCollectionName", null)
  }
}
