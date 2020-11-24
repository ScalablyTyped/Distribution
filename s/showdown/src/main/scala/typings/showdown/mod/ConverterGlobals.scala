package typings.showdown.mod

import org.scalablytyped.runtime.StringDictionary
import typings.showdown.anon.Codeblock
import typings.showdown.anon.Format
import typings.showdown.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConverterGlobals extends js.Object {
  
  var converter: js.UndefOr[Converter] = js.native
  
  var gDimensions: js.UndefOr[Height] = js.native
  
  var gHtmlBlocks: js.UndefOr[js.Array[String]] = js.native
  
  var gHtmlMdBlocks: js.UndefOr[js.Array[String]] = js.native
  
  var gHtmlSpans: js.UndefOr[js.Array[String]] = js.native
  
  var gListLevel: js.UndefOr[Double] = js.native
  
  var gTitles: js.UndefOr[StringDictionary[String]] = js.native
  
  var gUrls: js.UndefOr[StringDictionary[String]] = js.native
  
  var ghCodeBlocks: js.UndefOr[js.Array[Codeblock]] = js.native
  
  var hashLinkCounts: js.UndefOr[StringDictionary[Double]] = js.native
  
  var langExtensions: js.UndefOr[js.Array[ShowdownExtension]] = js.native
  
  var metadata: js.UndefOr[Format] = js.native
  
  var outputModifiers: js.UndefOr[js.Array[ShowdownExtension]] = js.native
}
object ConverterGlobals {
  
  @scala.inline
  def apply(): ConverterGlobals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConverterGlobals]
  }
  
  @scala.inline
  implicit class ConverterGlobalsOps[Self <: ConverterGlobals] (val x: Self) extends AnyVal {
    
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
    def setConverter(value: Converter): Self = this.set("converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConverter: Self = this.set("converter", js.undefined)
    
    @scala.inline
    def setGDimensions(value: Height): Self = this.set("gDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGDimensions: Self = this.set("gDimensions", js.undefined)
    
    @scala.inline
    def setGHtmlBlocksVarargs(value: String*): Self = this.set("gHtmlBlocks", js.Array(value :_*))
    
    @scala.inline
    def setGHtmlBlocks(value: js.Array[String]): Self = this.set("gHtmlBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGHtmlBlocks: Self = this.set("gHtmlBlocks", js.undefined)
    
    @scala.inline
    def setGHtmlMdBlocksVarargs(value: String*): Self = this.set("gHtmlMdBlocks", js.Array(value :_*))
    
    @scala.inline
    def setGHtmlMdBlocks(value: js.Array[String]): Self = this.set("gHtmlMdBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGHtmlMdBlocks: Self = this.set("gHtmlMdBlocks", js.undefined)
    
    @scala.inline
    def setGHtmlSpansVarargs(value: String*): Self = this.set("gHtmlSpans", js.Array(value :_*))
    
    @scala.inline
    def setGHtmlSpans(value: js.Array[String]): Self = this.set("gHtmlSpans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGHtmlSpans: Self = this.set("gHtmlSpans", js.undefined)
    
    @scala.inline
    def setGListLevel(value: Double): Self = this.set("gListLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGListLevel: Self = this.set("gListLevel", js.undefined)
    
    @scala.inline
    def setGTitles(value: StringDictionary[String]): Self = this.set("gTitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGTitles: Self = this.set("gTitles", js.undefined)
    
    @scala.inline
    def setGUrls(value: StringDictionary[String]): Self = this.set("gUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGUrls: Self = this.set("gUrls", js.undefined)
    
    @scala.inline
    def setGhCodeBlocksVarargs(value: Codeblock*): Self = this.set("ghCodeBlocks", js.Array(value :_*))
    
    @scala.inline
    def setGhCodeBlocks(value: js.Array[Codeblock]): Self = this.set("ghCodeBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGhCodeBlocks: Self = this.set("ghCodeBlocks", js.undefined)
    
    @scala.inline
    def setHashLinkCounts(value: StringDictionary[Double]): Self = this.set("hashLinkCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashLinkCounts: Self = this.set("hashLinkCounts", js.undefined)
    
    @scala.inline
    def setLangExtensionsVarargs(value: ShowdownExtension*): Self = this.set("langExtensions", js.Array(value :_*))
    
    @scala.inline
    def setLangExtensions(value: js.Array[ShowdownExtension]): Self = this.set("langExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLangExtensions: Self = this.set("langExtensions", js.undefined)
    
    @scala.inline
    def setMetadata(value: Format): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setOutputModifiersVarargs(value: ShowdownExtension*): Self = this.set("outputModifiers", js.Array(value :_*))
    
    @scala.inline
    def setOutputModifiers(value: js.Array[ShowdownExtension]): Self = this.set("outputModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputModifiers: Self = this.set("outputModifiers", js.undefined)
  }
}
