package typings
package reactDashMarkdownLib.reactDashMarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactMarkdownNs {
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
  type Renderer[T] = js.Function1[/* props */ T, reactLib.reactMod.ReactNs.ReactElement[T]]
}
