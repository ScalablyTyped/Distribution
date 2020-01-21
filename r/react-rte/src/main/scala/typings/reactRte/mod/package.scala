package typings.reactRte

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BlockRenderer = js.Function1[/* block */ typings.draftJs.mod.ContentBlock, java.lang.String]
  type BlockStyleFn = js.Function1[/* block */ typings.draftJs.mod.ContentBlock, typings.reactRte.mod.RenderConfig]
  type ChangeHandler = js.Function1[/* value */ typings.reactRte.mod.EditorValue, js.Any]
  type CustControlFunc = js.Function3[
    /* set */ typings.reactRte.mod.SetControlState, 
    /* get */ typings.reactRte.mod.GetControlState, 
    /* state */ typings.draftJs.mod.EditorState, 
    typings.react.mod.ReactNode
  ]
  type CustomBlockFn = js.Function1[
    /* element */ typings.std.Element, 
    js.UndefOr[scala.Null | typings.reactRte.mod.CustomBlockObject]
  ]
  type CustomControl = typings.react.mod.ReactNode | typings.reactRte.mod.CustControlFunc
  type CustomInlineFn = js.Function2[
    /* element */ typings.std.Element, 
    /* inlineCreators */ typings.reactRte.mod.InlineCreators, 
    js.UndefOr[
      scala.Null | typings.reactRte.mod.Style | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ js.Any)
    ]
  ]
  type EntityStyleFn = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ js.Any, 
    typings.reactRte.mod.RenderConfig
  ]
  type GetControlState = js.Function1[/* key */ java.lang.String, js.UndefOr[java.lang.String]]
  type RichTextEditor = typings.react.mod.Component[typings.reactRte.mod.Props, js.Any, js.Any]
  type SetControlState = js.Function2[/* key */ java.lang.String, /* value */ java.lang.String, scala.Unit]
  type StringMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type StyleConfigList = js.Array[typings.reactRte.mod.StyleConfig]
}
