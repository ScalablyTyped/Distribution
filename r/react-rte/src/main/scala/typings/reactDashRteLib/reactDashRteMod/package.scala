package typings
package reactDashRteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRteMod {
  type BlockRenderer = js.Function1[/* block */ draftDashJsLib.draftDashJsMod.ContentBlock, java.lang.String]
  type BlockStyleFn = js.Function1[/* block */ draftDashJsLib.draftDashJsMod.ContentBlock, RenderConfig]
  type ChangeHandler = js.Function1[/* value */ EditorValue, js.Any]
  type CustControlFunc = js.Function3[
    /* set */ SetControlState, 
    /* get */ GetControlState, 
    /* state */ draftDashJsLib.draftDashJsMod.EditorState, 
    reactLib.reactMod.ReactNode
  ]
  type CustomBlockFn = js.Function1[/* element */ stdLib.Element, js.UndefOr[scala.Null | CustomBlockObject]]
  type CustomControl = reactLib.reactMod.ReactNode | CustControlFunc
  type CustomInlineFn = js.Function2[
    /* element */ stdLib.Element, 
    /* inlineCreators */ InlineCreators, 
    js.UndefOr[
      scala.Null | Style | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ js.Any)
    ]
  ]
  type EntityStyleFn = js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ js.Any, 
    RenderConfig
  ]
  type GetControlState = js.Function1[/* key */ java.lang.String, js.UndefOr[java.lang.String]]
  type RichTextEditor = reactLib.reactMod.Component[Props, js.Any, js.Any]
  type SetControlState = js.Function2[/* key */ java.lang.String, /* value */ java.lang.String, scala.Unit]
  type StringMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
