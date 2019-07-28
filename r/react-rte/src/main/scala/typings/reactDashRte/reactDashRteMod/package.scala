package typings.reactDashRte

import org.scalablytyped.runtime.StringDictionary
import typings.draftDashJs.draftDashJsMod.ContentBlock
import typings.draftDashJs.draftDashJsMod.EditorState
import typings.react.reactMod.Component
import typings.react.reactMod.ReactNode
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRteMod {
  type BlockRenderer = js.Function1[/* block */ ContentBlock, String]
  type BlockStyleFn = js.Function1[/* block */ ContentBlock, RenderConfig]
  type ChangeHandler = js.Function1[/* value */ EditorValue, js.Any]
  type CustControlFunc = js.Function3[
    /* set */ SetControlState, 
    /* get */ GetControlState, 
    /* state */ EditorState, 
    ReactNode
  ]
  type CustomBlockFn = js.Function1[/* element */ Element, js.UndefOr[Null | CustomBlockObject]]
  type CustomControl = ReactNode | CustControlFunc
  type CustomInlineFn = js.Function2[
    /* element */ Element, 
    /* inlineCreators */ InlineCreators, 
    js.UndefOr[
      Null | Style | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ js.Any)
    ]
  ]
  type EntityStyleFn = js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ js.Any, 
    RenderConfig
  ]
  type GetControlState = js.Function1[/* key */ String, js.UndefOr[String]]
  type RichTextEditor = Component[Props, js.Any, js.Any]
  type SetControlState = js.Function2[/* key */ String, /* value */ String, Unit]
  type StringMap = StringDictionary[String]
}
