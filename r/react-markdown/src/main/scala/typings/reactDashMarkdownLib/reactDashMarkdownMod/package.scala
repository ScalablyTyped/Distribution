package typings
package reactDashMarkdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMarkdownMod {
  /* Rewritten from type alias, can be one of: 
    - reactDashMarkdownLib.reactDashMarkdownLibStrings.left
    - reactDashMarkdownLib.reactDashMarkdownLibStrings.right
    - reactDashMarkdownLib.reactDashMarkdownLibStrings.center
    - scala.Null
  */
  type AlignType = _AlignType | scala.Null
  type LinkTargetResolver = js.Function3[
    /* uri */ java.lang.String, 
    /* text */ java.lang.String, 
    /* title */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type MdastPlugin = js.Function2[
    /* node */ MarkdownAbstractSyntaxTree, 
    /* renderProps */ js.UndefOr[RenderProps], 
    MarkdownAbstractSyntaxTree
  ]
  type ReactMarkdown = reactLib.reactMod.Component[ReactMarkdownProps, js.Object, js.Any]
  type Renderer[T] = js.Function1[/* props */ T, reactLib.reactMod.ReactElement[T]]
  type Renderers = org.scalablytyped.runtime.StringDictionary[java.lang.String | Renderer[js.Any]]
}
