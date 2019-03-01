package typings
package reactDashMarkdownLib.reactDashMarkdownMod.ReactMarkdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends ReactMarkdownProps {
  val definitions: js.UndefOr[js.Object] = js.undefined
}

object RenderProps {
  @scala.inline
  def apply(
    allowNode: js.Function3[
      /* node */ MarkdownAbstractSyntaxTree, 
      /* index */ scala.Double, 
      /* parent */ NodeType, 
      scala.Boolean
    ] = null,
    allowedTypes: js.Array[NodeType] = null,
    astPlugins: js.Array[MdastPlugin] = null,
    className: java.lang.String = null,
    definitions: js.Object = null,
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
    transformImageUri: js.Function4[
      /* uri */ java.lang.String, 
      /* children */ js.UndefOr[reactLib.reactMod.ReactNs.ReactNode], 
      /* title */ js.UndefOr[java.lang.String], 
      /* alt */ js.UndefOr[java.lang.String], 
      java.lang.String
    ] = null,
    transformLinkUri: js.Function3[
      /* uri */ java.lang.String, 
      /* children */ js.UndefOr[reactLib.reactMod.ReactNs.ReactNode], 
      /* title */ js.UndefOr[java.lang.String], 
      java.lang.String
    ] = null,
    unwrapDisallowed: js.UndefOr[scala.Boolean] = js.undefined
  ): RenderProps = {
    val __obj = js.Dynamic.literal()
    if (allowNode != null) __obj.updateDynamic("allowNode")(allowNode)
    if (allowedTypes != null) __obj.updateDynamic("allowedTypes")(allowedTypes)
    if (astPlugins != null) __obj.updateDynamic("astPlugins")(astPlugins)
    if (className != null) __obj.updateDynamic("className")(className)
    if (definitions != null) __obj.updateDynamic("definitions")(definitions)
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
    if (transformImageUri != null) __obj.updateDynamic("transformImageUri")(transformImageUri)
    if (transformLinkUri != null) __obj.updateDynamic("transformLinkUri")(transformLinkUri)
    if (!js.isUndefined(unwrapDisallowed)) __obj.updateDynamic("unwrapDisallowed")(unwrapDisallowed)
    __obj.asInstanceOf[RenderProps]
  }
}

