package typings
package reactDashMarkdownLib.reactDashMarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactMarkdownNs {
  type AlignType = reactDashMarkdownLib.reactDashMarkdownLibStrings.left | reactDashMarkdownLib.reactDashMarkdownLibStrings.right | reactDashMarkdownLib.reactDashMarkdownLibStrings.center | scala.Null
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
  type NodeType = reactDashMarkdownLib.reactDashMarkdownLibStrings.root | reactDashMarkdownLib.reactDashMarkdownLibStrings.text | reactDashMarkdownLib.reactDashMarkdownLibStrings.break | reactDashMarkdownLib.reactDashMarkdownLibStrings.paragraph | reactDashMarkdownLib.reactDashMarkdownLibStrings.emphasis | reactDashMarkdownLib.reactDashMarkdownLibStrings.strong | reactDashMarkdownLib.reactDashMarkdownLibStrings.thematicBreak | reactDashMarkdownLib.reactDashMarkdownLibStrings.blockquote | reactDashMarkdownLib.reactDashMarkdownLibStrings.delete | reactDashMarkdownLib.reactDashMarkdownLibStrings.link | reactDashMarkdownLib.reactDashMarkdownLibStrings.image | reactDashMarkdownLib.reactDashMarkdownLibStrings.linkReference | reactDashMarkdownLib.reactDashMarkdownLibStrings.imageReference | reactDashMarkdownLib.reactDashMarkdownLibStrings.table | reactDashMarkdownLib.reactDashMarkdownLibStrings.tableHead | reactDashMarkdownLib.reactDashMarkdownLibStrings.tableBody | reactDashMarkdownLib.reactDashMarkdownLibStrings.tableRow | reactDashMarkdownLib.reactDashMarkdownLibStrings.tableCell | reactDashMarkdownLib.reactDashMarkdownLibStrings.list | reactDashMarkdownLib.reactDashMarkdownLibStrings.listItem | reactDashMarkdownLib.reactDashMarkdownLibStrings.definition | reactDashMarkdownLib.reactDashMarkdownLibStrings.heading | reactDashMarkdownLib.reactDashMarkdownLibStrings.inlineCode | reactDashMarkdownLib.reactDashMarkdownLibStrings.code | reactDashMarkdownLib.reactDashMarkdownLibStrings.html | reactDashMarkdownLib.reactDashMarkdownLibStrings.virtualHtml
  type ReferenceType = reactDashMarkdownLib.reactDashMarkdownLibStrings.shortcut | reactDashMarkdownLib.reactDashMarkdownLibStrings.collapsed | reactDashMarkdownLib.reactDashMarkdownLibStrings.full
  type Renderer[T] = js.Function1[/* props */ T, reactLib.reactMod.ReactNs.ReactElement]
}
