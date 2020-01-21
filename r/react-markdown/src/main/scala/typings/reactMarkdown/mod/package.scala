package typings.reactMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.reactMarkdown.reactMarkdownStrings.left
    - typings.reactMarkdown.reactMarkdownStrings.right
    - typings.reactMarkdown.reactMarkdownStrings.center
    - scala.Null
  */
  type AlignType = typings.reactMarkdown.mod._AlignType | scala.Null
  type LinkTargetResolver = js.Function3[
    /* uri */ java.lang.String, 
    /* text */ java.lang.String, 
    /* title */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type MdastPlugin = js.Function2[
    /* node */ typings.reactMarkdown.mod.MarkdownAbstractSyntaxTree, 
    /* renderProps */ js.UndefOr[typings.reactMarkdown.mod.RenderProps], 
    typings.reactMarkdown.mod.MarkdownAbstractSyntaxTree
  ]
  type ReactMarkdown = typings.react.mod.Component[typings.reactMarkdown.mod.ReactMarkdownProps, js.Object, js.Any]
  type Renderer[T] = js.Function1[/* props */ T, typings.react.mod.ReactElement]
  type Renderers_ = org.scalablytyped.runtime.StringDictionary[java.lang.String | typings.reactMarkdown.mod.Renderer[js.Any]]
}
