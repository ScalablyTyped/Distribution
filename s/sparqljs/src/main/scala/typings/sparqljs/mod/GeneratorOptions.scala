package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneratorOptions extends js.Object {
  
  var allPrefixes: js.UndefOr[Boolean] = js.native
  
  var indent: js.UndefOr[String] = js.native
  
  var newline: js.UndefOr[String] = js.native
  
  var prefixes: js.UndefOr[StringDictionary[String]] = js.native
  
  var sparqlStar: js.UndefOr[Boolean] = js.native
}
object GeneratorOptions {
  
  @scala.inline
  def apply(): GeneratorOptions = {
    val __obj = js.Dynamic.literal()
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
    def setAllPrefixes(value: Boolean): Self = this.set("allPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllPrefixes: Self = this.set("allPrefixes", js.undefined)
    
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setNewline(value: String): Self = this.set("newline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewline: Self = this.set("newline", js.undefined)
    
    @scala.inline
    def setPrefixes(value: StringDictionary[String]): Self = this.set("prefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixes: Self = this.set("prefixes", js.undefined)
    
    @scala.inline
    def setSparqlStar(value: Boolean): Self = this.set("sparqlStar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSparqlStar: Self = this.set("sparqlStar", js.undefined)
  }
}
