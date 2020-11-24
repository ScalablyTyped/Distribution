package typings.reactMarkdown.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mdast.mod.Content
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.unified.mod.Pluggable
import typings.unified.mod.PluggableList
import typings.unified.mod.Settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactMarkdownPropsBase extends js.Object {
  
  val allowNode: js.UndefOr[
    js.Function3[/* node */ Content, /* index */ Double, /* parent */ NodeType, Boolean]
  ] = js.native
  
  val astPlugins: js.UndefOr[PluggableList[Settings]] = js.native
  
  val className: js.UndefOr[String] = js.native
  
  val includeNodeIndex: js.UndefOr[Boolean] = js.native
  
  val linkTarget: js.UndefOr[String | LinkTargetResolver] = js.native
  
  val plugins: js.UndefOr[PluggableList[Settings]] = js.native
  
  val rawSourcePos: js.UndefOr[Boolean] = js.native
  
  val renderers: js.UndefOr[StringDictionary[ElementType[_]]] = js.native
  
  val sourcePos: js.UndefOr[Boolean] = js.native
  
  val transformImageUri: js.UndefOr[
    (js.Function4[
      /* uri */ String, 
      /* children */ js.UndefOr[ReactNode], 
      /* title */ js.UndefOr[String], 
      /* alt */ js.UndefOr[String], 
      String
    ]) | Null
  ] = js.native
  
  val transformLinkUri: js.UndefOr[
    (js.Function3[
      /* uri */ String, 
      /* children */ js.UndefOr[ReactNode], 
      /* title */ js.UndefOr[String], 
      String
    ]) | Null
  ] = js.native
  
  val unwrapDisallowed: js.UndefOr[Boolean] = js.native
}
object ReactMarkdownPropsBase {
  
  @scala.inline
  def apply(): ReactMarkdownPropsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactMarkdownPropsBase]
  }
  
  @scala.inline
  implicit class ReactMarkdownPropsBaseOps[Self <: ReactMarkdownPropsBase] (val x: Self) extends AnyVal {
    
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
    def setAllowNode(value: (/* node */ Content, /* index */ Double, /* parent */ NodeType) => Boolean): Self = this.set("allowNode", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAllowNode: Self = this.set("allowNode", js.undefined)
    
    @scala.inline
    def setAstPluginsVarargs(value: (Pluggable[js.Array[js.UndefOr[js.Any]], Settings])*): Self = this.set("astPlugins", js.Array(value :_*))
    
    @scala.inline
    def setAstPlugins(value: PluggableList[Settings]): Self = this.set("astPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAstPlugins: Self = this.set("astPlugins", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setIncludeNodeIndex(value: Boolean): Self = this.set("includeNodeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNodeIndex: Self = this.set("includeNodeIndex", js.undefined)
    
    @scala.inline
    def setLinkTargetFunction3(value: (/* uri */ String, /* text */ String, /* title */ js.UndefOr[String]) => String): Self = this.set("linkTarget", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLinkTarget(value: String | LinkTargetResolver): Self = this.set("linkTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkTarget: Self = this.set("linkTarget", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: (Pluggable[js.Array[js.UndefOr[js.Any]], Settings])*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: PluggableList[Settings]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setRawSourcePos(value: Boolean): Self = this.set("rawSourcePos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawSourcePos: Self = this.set("rawSourcePos", js.undefined)
    
    @scala.inline
    def setRenderers(value: StringDictionary[ElementType[_]]): Self = this.set("renderers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderers: Self = this.set("renderers", js.undefined)
    
    @scala.inline
    def setSourcePos(value: Boolean): Self = this.set("sourcePos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePos: Self = this.set("sourcePos", js.undefined)
    
    @scala.inline
    def setTransformImageUri(
      value: (/* uri */ String, /* children */ js.UndefOr[ReactNode], /* title */ js.UndefOr[String], /* alt */ js.UndefOr[String]) => String
    ): Self = this.set("transformImageUri", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteTransformImageUri: Self = this.set("transformImageUri", js.undefined)
    
    @scala.inline
    def setTransformImageUriNull: Self = this.set("transformImageUri", null)
    
    @scala.inline
    def setTransformLinkUri(
      value: (/* uri */ String, /* children */ js.UndefOr[ReactNode], /* title */ js.UndefOr[String]) => String
    ): Self = this.set("transformLinkUri", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTransformLinkUri: Self = this.set("transformLinkUri", js.undefined)
    
    @scala.inline
    def setTransformLinkUriNull: Self = this.set("transformLinkUri", null)
    
    @scala.inline
    def setUnwrapDisallowed(value: Boolean): Self = this.set("unwrapDisallowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnwrapDisallowed: Self = this.set("unwrapDisallowed", js.undefined)
  }
}
