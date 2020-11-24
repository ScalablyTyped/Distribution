package typings.reactMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AlignType = typings.mdast.mod.AlignType
  
  type LinkTargetResolver = js.Function3[
    /* uri */ java.lang.String, 
    /* text */ java.lang.String, 
    /* title */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  
  type MutuallyExclusive[T, U] = (T with typings.reactMarkdown.mod.Not[U]) | (U with typings.reactMarkdown.mod.Not[T])
  
  type Not[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? never}
    */ typings.reactMarkdown.reactMarkdownStrings.Not with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type Point = typings.unist.mod.Point
  
  type Position = typings.unist.mod.Position
  
  type ReactMarkdownProps = typings.reactMarkdown.mod.ReactMarkdownPropsBase with (typings.reactMarkdown.mod.MutuallyExclusive[typings.reactMarkdown.mod.ChildrenProp, typings.reactMarkdown.mod.SourceProp]) with (typings.reactMarkdown.mod.MutuallyExclusive[
    typings.reactMarkdown.mod.AllowedTypesProp, 
    typings.reactMarkdown.mod.DisallowedTypesProp
  ]) with (typings.reactMarkdown.mod.MutuallyExclusive[
    typings.reactMarkdown.mod.EscapeHtmlProp, 
    typings.reactMarkdown.mod.MutuallyExclusive[
      typings.reactMarkdown.mod.SkipHtmlProp, 
      typings.reactMarkdown.mod.AllowDangerousHtmlProp
    ]
  ])
  
  type ReferenceType = typings.mdast.mod.ReferenceType
  
  type Renderer[T] = js.Function1[/* props */ T, typings.react.mod.ElementType[T]]
  
  type Renderers_ = org.scalablytyped.runtime.StringDictionary[java.lang.String | typings.reactMarkdown.mod.Renderer[js.Any]]
}
