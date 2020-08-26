package typings.reactMarkdown.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.reactMarkdown.anon.PartialRemarkParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactMarkdownProps extends js.Object {
  val allowNode: js.UndefOr[
    js.Function3[
      /* node */ MarkdownAbstractSyntaxTree, 
      /* index */ Double, 
      /* parent */ NodeType, 
      Boolean
    ]
  ] = js.native
  val allowedTypes: js.UndefOr[js.Array[NodeType]] = js.native
  val astPlugins: js.UndefOr[js.Array[MdastPlugin]] = js.native
  val className: js.UndefOr[String] = js.native
  val disallowedTypes: js.UndefOr[js.Array[NodeType]] = js.native
  val escapeHtml: js.UndefOr[Boolean] = js.native
  val includeNodeIndex: js.UndefOr[Boolean] = js.native
  val linkTarget: js.UndefOr[String | LinkTargetResolver] = js.native
  val parserOptions: js.UndefOr[PartialRemarkParseOptions] = js.native
  val plugins: js.UndefOr[js.Array[_] | js.Function0[Unit]] = js.native
  val rawSourcePos: js.UndefOr[Boolean] = js.native
  val renderers: js.UndefOr[StringDictionary[ReactType[_]]] = js.native
  val skipHtml: js.UndefOr[Boolean] = js.native
  val source: js.UndefOr[String] = js.native
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

object ReactMarkdownProps {
  @scala.inline
  def apply(): ReactMarkdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactMarkdownProps]
  }
  @scala.inline
  implicit class ReactMarkdownPropsOps[Self <: ReactMarkdownProps] (val x: Self) extends AnyVal {
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
    def setAllowNode(
      value: (/* node */ MarkdownAbstractSyntaxTree, /* index */ Double, /* parent */ NodeType) => Boolean
    ): Self = this.set("allowNode", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAllowNode: Self = this.set("allowNode", js.undefined)
    @scala.inline
    def setAllowedTypesVarargs(value: NodeType*): Self = this.set("allowedTypes", js.Array(value :_*))
    @scala.inline
    def setAllowedTypes(value: js.Array[NodeType]): Self = this.set("allowedTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedTypes: Self = this.set("allowedTypes", js.undefined)
    @scala.inline
    def setAstPluginsVarargs(value: MdastPlugin*): Self = this.set("astPlugins", js.Array(value :_*))
    @scala.inline
    def setAstPlugins(value: js.Array[MdastPlugin]): Self = this.set("astPlugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAstPlugins: Self = this.set("astPlugins", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisallowedTypesVarargs(value: NodeType*): Self = this.set("disallowedTypes", js.Array(value :_*))
    @scala.inline
    def setDisallowedTypes(value: js.Array[NodeType]): Self = this.set("disallowedTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisallowedTypes: Self = this.set("disallowedTypes", js.undefined)
    @scala.inline
    def setEscapeHtml(value: Boolean): Self = this.set("escapeHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscapeHtml: Self = this.set("escapeHtml", js.undefined)
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
    def setParserOptions(value: PartialRemarkParseOptions): Self = this.set("parserOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParserOptions: Self = this.set("parserOptions", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: js.Any*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPluginsFunction0(value: () => Unit): Self = this.set("plugins", js.Any.fromFunction0(value))
    @scala.inline
    def setPlugins(value: js.Array[_] | js.Function0[Unit]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setRawSourcePos(value: Boolean): Self = this.set("rawSourcePos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawSourcePos: Self = this.set("rawSourcePos", js.undefined)
    @scala.inline
    def setRenderers(value: StringDictionary[ReactType[_]]): Self = this.set("renderers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderers: Self = this.set("renderers", js.undefined)
    @scala.inline
    def setSkipHtml(value: Boolean): Self = this.set("skipHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipHtml: Self = this.set("skipHtml", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
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

