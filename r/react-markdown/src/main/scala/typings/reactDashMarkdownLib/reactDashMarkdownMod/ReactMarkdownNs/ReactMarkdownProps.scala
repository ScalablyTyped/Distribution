package typings
package reactDashMarkdownLib.reactDashMarkdownMod.ReactMarkdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactMarkdownProps extends js.Object {
  val allowNode: js.UndefOr[
    js.Function3[
      /* node */ MarkdownAbstractSyntaxTree, 
      /* index */ scala.Double, 
      /* parent */ NodeType, 
      scala.Boolean
    ]
  ] = js.undefined
  val allowedTypes: js.UndefOr[js.Array[NodeType]] = js.undefined
  val astPlugins: js.UndefOr[js.Array[MdastPlugin]] = js.undefined
  val className: js.UndefOr[java.lang.String] = js.undefined
  val disallowedTypes: js.UndefOr[js.Array[NodeType]] = js.undefined
  val escapeHtml: js.UndefOr[scala.Boolean] = js.undefined
  val includeNodeIndex: js.UndefOr[scala.Boolean] = js.undefined
  val linkTarget: js.UndefOr[java.lang.String | LinkTargetResolver] = js.undefined
  val plugins: js.UndefOr[js.Array[_] | js.Function0[scala.Unit]] = js.undefined
  val rawSourcePos: js.UndefOr[scala.Boolean] = js.undefined
  val renderers: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ReactType[_]]
  ] = js.undefined
  val skipHtml: js.UndefOr[scala.Boolean] = js.undefined
  val source: js.UndefOr[java.lang.String] = js.undefined
  val sourcePos: js.UndefOr[scala.Boolean] = js.undefined
  val transformImageUri: js.UndefOr[
    js.Function4[
      /* uri */ java.lang.String, 
      /* children */ js.UndefOr[reactLib.reactMod.ReactNs.ReactNode], 
      /* title */ js.UndefOr[java.lang.String], 
      /* alt */ js.UndefOr[java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  val transformLinkUri: js.UndefOr[
    js.Function3[
      /* uri */ java.lang.String, 
      /* children */ js.UndefOr[reactLib.reactMod.ReactNs.ReactNode], 
      /* title */ js.UndefOr[java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  val unwrapDisallowed: js.UndefOr[scala.Boolean] = js.undefined
}

object ReactMarkdownProps {
  @scala.inline
  def apply(
    allowNode: (/* node */ MarkdownAbstractSyntaxTree, /* index */ scala.Double, /* parent */ NodeType) => scala.Boolean = null,
    allowedTypes: js.Array[NodeType] = null,
    astPlugins: js.Array[MdastPlugin] = null,
    className: java.lang.String = null,
    disallowedTypes: js.Array[NodeType] = null,
    escapeHtml: js.UndefOr[scala.Boolean] = js.undefined,
    includeNodeIndex: js.UndefOr[scala.Boolean] = js.undefined,
    linkTarget: java.lang.String | LinkTargetResolver = null,
    plugins: js.Array[_] | js.Function0[scala.Unit] = null,
    rawSourcePos: js.UndefOr[scala.Boolean] = js.undefined,
    renderers: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ReactType[_]] = null,
    skipHtml: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    sourcePos: js.UndefOr[scala.Boolean] = js.undefined,
    transformImageUri: (/* uri */ java.lang.String, /* children */ js.UndefOr[reactLib.reactMod.ReactNs.ReactNode], /* title */ js.UndefOr[java.lang.String], /* alt */ js.UndefOr[java.lang.String]) => java.lang.String = null,
    transformLinkUri: (/* uri */ java.lang.String, /* children */ js.UndefOr[reactLib.reactMod.ReactNs.ReactNode], /* title */ js.UndefOr[java.lang.String]) => java.lang.String = null,
    unwrapDisallowed: js.UndefOr[scala.Boolean] = js.undefined
  ): ReactMarkdownProps = {
    val __obj = js.Dynamic.literal()
    if (allowNode != null) __obj.updateDynamic("allowNode")(js.Any.fromFunction3(allowNode))
    if (allowedTypes != null) __obj.updateDynamic("allowedTypes")(allowedTypes)
    if (astPlugins != null) __obj.updateDynamic("astPlugins")(astPlugins)
    if (className != null) __obj.updateDynamic("className")(className)
    if (disallowedTypes != null) __obj.updateDynamic("disallowedTypes")(disallowedTypes)
    if (!js.isUndefined(escapeHtml)) __obj.updateDynamic("escapeHtml")(escapeHtml)
    if (!js.isUndefined(includeNodeIndex)) __obj.updateDynamic("includeNodeIndex")(includeNodeIndex)
    if (linkTarget != null) __obj.updateDynamic("linkTarget")(linkTarget.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(rawSourcePos)) __obj.updateDynamic("rawSourcePos")(rawSourcePos)
    if (renderers != null) __obj.updateDynamic("renderers")(renderers)
    if (!js.isUndefined(skipHtml)) __obj.updateDynamic("skipHtml")(skipHtml)
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(sourcePos)) __obj.updateDynamic("sourcePos")(sourcePos)
    if (transformImageUri != null) __obj.updateDynamic("transformImageUri")(js.Any.fromFunction4(transformImageUri))
    if (transformLinkUri != null) __obj.updateDynamic("transformLinkUri")(js.Any.fromFunction3(transformLinkUri))
    if (!js.isUndefined(unwrapDisallowed)) __obj.updateDynamic("unwrapDisallowed")(unwrapDisallowed)
    __obj.asInstanceOf[ReactMarkdownProps]
  }
}

