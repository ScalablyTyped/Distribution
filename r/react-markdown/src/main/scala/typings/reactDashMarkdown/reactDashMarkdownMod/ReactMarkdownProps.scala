package typings.reactDashMarkdown.reactDashMarkdownMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactType
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactMarkdownProps extends js.Object {
  val allowNode: js.UndefOr[
    js.Function3[
      /* node */ MarkdownAbstractSyntaxTree, 
      /* index */ Double, 
      /* parent */ NodeType, 
      Boolean
    ]
  ] = js.undefined
  val allowedTypes: js.UndefOr[js.Array[NodeType]] = js.undefined
  val astPlugins: js.UndefOr[js.Array[MdastPlugin]] = js.undefined
  val className: js.UndefOr[String] = js.undefined
  val disallowedTypes: js.UndefOr[js.Array[NodeType]] = js.undefined
  val escapeHtml: js.UndefOr[Boolean] = js.undefined
  val includeNodeIndex: js.UndefOr[Boolean] = js.undefined
  val linkTarget: js.UndefOr[String | LinkTargetResolver] = js.undefined
  val parserOptions: js.UndefOr[Partial[RemarkParseOptions]] = js.undefined
  val plugins: js.UndefOr[js.Array[_] | js.Function0[Unit]] = js.undefined
  val rawSourcePos: js.UndefOr[Boolean] = js.undefined
  val renderers: js.UndefOr[StringDictionary[ReactType[_]]] = js.undefined
  val skipHtml: js.UndefOr[Boolean] = js.undefined
  val source: js.UndefOr[String] = js.undefined
  val sourcePos: js.UndefOr[Boolean] = js.undefined
  val transformImageUri: js.UndefOr[
    (js.Function4[
      /* uri */ String, 
      /* children */ js.UndefOr[ReactNode], 
      /* title */ js.UndefOr[String], 
      /* alt */ js.UndefOr[String], 
      String
    ]) | Null
  ] = js.undefined
  val transformLinkUri: js.UndefOr[
    (js.Function3[
      /* uri */ String, 
      /* children */ js.UndefOr[ReactNode], 
      /* title */ js.UndefOr[String], 
      String
    ]) | Null
  ] = js.undefined
  val unwrapDisallowed: js.UndefOr[Boolean] = js.undefined
}

object ReactMarkdownProps {
  @scala.inline
  def apply(
    allowNode: (/* node */ MarkdownAbstractSyntaxTree, /* index */ Double, /* parent */ NodeType) => Boolean = null,
    allowedTypes: js.Array[NodeType] = null,
    astPlugins: js.Array[MdastPlugin] = null,
    className: String = null,
    disallowedTypes: js.Array[NodeType] = null,
    escapeHtml: js.UndefOr[Boolean] = js.undefined,
    includeNodeIndex: js.UndefOr[Boolean] = js.undefined,
    linkTarget: String | LinkTargetResolver = null,
    parserOptions: Partial[RemarkParseOptions] = null,
    plugins: js.Array[_] | js.Function0[Unit] = null,
    rawSourcePos: js.UndefOr[Boolean] = js.undefined,
    renderers: StringDictionary[ReactType[_]] = null,
    skipHtml: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    sourcePos: js.UndefOr[Boolean] = js.undefined,
    transformImageUri: (/* uri */ String, /* children */ js.UndefOr[ReactNode], /* title */ js.UndefOr[String], /* alt */ js.UndefOr[String]) => String = null,
    transformLinkUri: (/* uri */ String, /* children */ js.UndefOr[ReactNode], /* title */ js.UndefOr[String]) => String = null,
    unwrapDisallowed: js.UndefOr[Boolean] = js.undefined
  ): ReactMarkdownProps = {
    val __obj = js.Dynamic.literal()
    if (allowNode != null) __obj.updateDynamic("allowNode")(js.Any.fromFunction3(allowNode))
    if (allowedTypes != null) __obj.updateDynamic("allowedTypes")(allowedTypes.asInstanceOf[js.Any])
    if (astPlugins != null) __obj.updateDynamic("astPlugins")(astPlugins.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (disallowedTypes != null) __obj.updateDynamic("disallowedTypes")(disallowedTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeHtml)) __obj.updateDynamic("escapeHtml")(escapeHtml.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNodeIndex)) __obj.updateDynamic("includeNodeIndex")(includeNodeIndex.asInstanceOf[js.Any])
    if (linkTarget != null) __obj.updateDynamic("linkTarget")(linkTarget.asInstanceOf[js.Any])
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(rawSourcePos)) __obj.updateDynamic("rawSourcePos")(rawSourcePos.asInstanceOf[js.Any])
    if (renderers != null) __obj.updateDynamic("renderers")(renderers.asInstanceOf[js.Any])
    if (!js.isUndefined(skipHtml)) __obj.updateDynamic("skipHtml")(skipHtml.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(sourcePos)) __obj.updateDynamic("sourcePos")(sourcePos.asInstanceOf[js.Any])
    if (transformImageUri != null) __obj.updateDynamic("transformImageUri")(js.Any.fromFunction4(transformImageUri))
    if (transformLinkUri != null) __obj.updateDynamic("transformLinkUri")(js.Any.fromFunction3(transformLinkUri))
    if (!js.isUndefined(unwrapDisallowed)) __obj.updateDynamic("unwrapDisallowed")(unwrapDisallowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactMarkdownProps]
  }
}

