package typings.reactSelect

import org.scalablytyped.runtime.Shortcut
import typings.emotionReact.mod.jsx.JSX.Element
import typings.memoizeOne.mod.MemoizedFn
import typings.reactSelect.anon.PartialClearIndicatorOpti
import typings.reactSelect.distDeclarationsSrcComponentsContainersMod.ValueContainerProps
import typings.reactSelect.distDeclarationsSrcComponentsInputMod.InputProps
import typings.reactSelect.distDeclarationsSrcComponentsMultiValueMod.MultiValueProps
import typings.reactSelect.distDeclarationsSrcComponentsPlaceholderMod.PlaceholderProps
import typings.reactSelect.distDeclarationsSrcComponentsSingleValueMod.SingleValueProps
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimatedMod extends Shortcut {
  
  @JSImport("react-select/dist/declarations/src/animated", JSImport.Default)
  @js.native
  val default: MemoizedFn[
    js.Function1[
      /* externalComponents */ js.UndefOr[PartialClearIndicatorOpti], 
      PartialClearIndicatorOpti
    ]
  ] = js.native
  
  @JSImport("react-select/dist/declarations/src/animated", "Input")
  @js.native
  val Input: js.UndefOr[js.Function1[/* props */ InputProps[Any, Boolean, GroupBase[Any]], Element]] = js.native
  
  @JSImport("react-select/dist/declarations/src/animated", "MultiValue")
  @js.native
  val MultiValue: js.UndefOr[js.Function1[/* props */ MultiValueProps[Any, Boolean, GroupBase[Any]], Element]] = js.native
  
  @JSImport("react-select/dist/declarations/src/animated", "Placeholder")
  @js.native
  val Placeholder: js.UndefOr[
    js.Function1[/* props */ PlaceholderProps[Any, Boolean, GroupBase[Any]], Element]
  ] = js.native
  
  @JSImport("react-select/dist/declarations/src/animated", "SingleValue")
  @js.native
  val SingleValue: js.UndefOr[
    js.Function1[/* props */ SingleValueProps[Any, Boolean, GroupBase[Any]], Element]
  ] = js.native
  
  @JSImport("react-select/dist/declarations/src/animated", "ValueContainer")
  @js.native
  val ValueContainer: js.UndefOr[
    js.Function1[/* props */ ValueContainerProps[Any, Boolean, GroupBase[Any]], Element]
  ] = js.native
  
  type _To = MemoizedFn[
    js.Function1[
      /* externalComponents */ js.UndefOr[PartialClearIndicatorOpti], 
      PartialClearIndicatorOpti
    ]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `distDeclarationsSrcAnimatedMod.foo` */
  override def _to: MemoizedFn[
    js.Function1[
      /* externalComponents */ js.UndefOr[PartialClearIndicatorOpti], 
      PartialClearIndicatorOpti
    ]
  ] = default
}
