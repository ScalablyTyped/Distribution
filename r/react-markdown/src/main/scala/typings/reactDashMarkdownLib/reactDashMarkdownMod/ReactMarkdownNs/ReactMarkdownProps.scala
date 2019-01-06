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

