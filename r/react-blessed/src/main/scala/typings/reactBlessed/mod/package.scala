package typings.reactBlessed.mod

import typings.blessed.mod.Widgets.BlessedElement
import typings.blessed.mod.Widgets.Events.IKeyEventArg
import typings.blessed.mod.Widgets.Events.IMouseEventArg
import typings.blessed.mod.Widgets.Log
import typings.blessed.mod.Widgets.NodeGenericEventType
import typings.blessed.mod.Widgets.NodeMouseEventType
import typings.blessed.mod.Widgets.NodeScreenEventType
import typings.blessed.mod.Widgets.Screen
import typings.react.mod.ClassAttributes
import typings.react.mod.Component
import typings.reactBlessed.anon.Children
import typings.reactBlessed.anon.Class
import typings.reactBlessed.mod.^
import typings.reactBlessed.reactBlessedBooleans.`false`
import typings.reactBlessed.reactBlessedStrings.Space
import typings.reactBlessed.reactBlessedStrings.children
import typings.reactBlessed.reactBlessedStrings.content
import typings.reactBlessed.reactBlessedStrings.element
import typings.reactBlessed.reactBlessedStrings.keypress
import typings.reactBlessed.reactBlessedStrings.style
import typings.reactBlessed.reactBlessedStrings.warning
import typings.std.Capitalize
import typings.std.Exclude
import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createBlessedRenderer(bls: Any): renderer = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlessedRenderer")(bls.asInstanceOf[js.Any]).asInstanceOf[renderer]

inline def render(c: typings.react.mod.global.JSX.Element, s: Screen): (Component[js.Object, js.Object, Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(c.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[(Component[js.Object, js.Object, Any]) | Null]
inline def render(c: typings.react.mod.global.JSX.Element, s: Screen, callback: Callback): (Component[js.Object, js.Object, Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(c.asInstanceOf[js.Any], s.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[(Component[js.Object, js.Object, Any]) | Null]

type BigTextElement = typings.blessed.mod.Widgets.BigTextElement

type BlessedAttributes[E /* <: Element */] = WithClassProp[
(ModifiedBlessedOptions[
  /* import warning: importer.ImportType#apply Failed type conversion: E['options'] */ js.Any
]) & ProgressBarProps[E] & ListProps[E] & LayoutProps[E], 
js.UndefOr[
  ((ModifiedBlessedOptions[
    /* import warning: importer.ImportType#apply Failed type conversion: E['options'] */ js.Any
  ]) & ProgressBarProps[E] & ListProps[E] & LayoutProps[E]) | `false` | Null
]]

type BoxElement = typings.blessed.mod.Widgets.BoxElement

type ButtonElement = typings.blessed.mod.Widgets.ButtonElement

type Callback = js.Function0[js.UndefOr[Unit | Null]]

type CamelCasedGenericEventNames = Prefix[GenericContentPrefix, Capitalize[GenericContent]]

type CamelCasedScreenEventNames = Prefix[ScreenElementPrefix, Capitalize[ScreenElement]]

type CheckboxElement = typings.blessed.mod.Widgets.CheckboxElement

type DetailedBlessedProps[E /* <: Element */] = BlessedAttributes[E] & ClassAttributes[E]

type Element = BlessedElement

type EventHandler[T] = js.Function1[
/* args */ SpreadableArgs[
  T, 
  /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<unknown> ? T : [T] */ js.Any
], 
Unit]

type ExludedGenericEventNames = Prefix[GenericContentPrefix, Prefix[Space, GenericContent]]

type ExludedScreenEventNames = Prefix[ScreenElementPrefix, Prefix[Space, ScreenElement]]

type FileManagerElement = typings.blessed.mod.Widgets.FileManagerElement

// remove {[key: string]: any} indexer defined in Blessed.Widgets.IOptions.
// 'blessed' doesn't exist in a DOM so it probably doesn't make sense to allow any property
type FilterOptions[T /* <: Record[Any, Any] */] = Partial[Omit[KnownKeys[T], style | children]]

type GenericContent = content

type GenericEvent = Unit

type GenericEventHandler = EventHandler[GenericEvent]

type GenericEventNames = (Exclude[NodeGenericEventType, ExludedGenericEventNames]) | CamelCasedGenericEventNames

type GenericEventProps = EventHandlerProp[GenericEventNames, GenericEventHandler]

type InputElement = typings.blessed.mod.Widgets.InputElement

type KeyPressEvent = js.Tuple2[/* key */ Any, /* event */ IKeyEventArg]

type KeyPressEventHandler = EventHandler[KeyPressEvent]

type KeyPressEventProps = EventHandlerProp[keypress, KeyPressEventHandler]

type LayoutElement = typings.blessed.mod.Widgets.LayoutElement

type LineElement = typings.blessed.mod.Widgets.LineElement

type ListElement = typings.blessed.mod.Widgets.ListElement

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends react-blessed.react-blessed.ListElement ? react-blessed.react-blessed.ProgressBarEventProps & {  style :react-blessed.react-blessed.ListStyle | undefined,   selected :number | undefined} : {}
  }}}
  */
type ListProps[T] = ProgressBarEventProps & (/* import warning: importer.ImportType#apply Failed type conversion: {  style :react-blessed.react-blessed.ListStyle | undefined,   selected :number | undefined} */ js.Any)

type ListTableElement = typings.blessed.mod.Widgets.ListTableElement

type ListbarElement = typings.blessed.mod.Widgets.ListbarElement

type LoadingElement = typings.blessed.mod.Widgets.LoadingElement

type LogElement = Log

type MessageElement = typings.blessed.mod.Widgets.MessageElement

type ModifiedBlessedOptions[T /* <: Record[Any, Any] */] = FilterOptions[T] & Children & EventProps

type MouseEvent = IMouseEventArg

type MouseEventHandler = EventHandler[MouseEvent]

type MouseEventProps = EventHandlerProp[NodeMouseEventType, MouseEventHandler]

/* EVENTS *******************************************************************/
type Prefix[T /* <: String */, P /* <: String */] = /* template literal string: ${T}${P} */ String

type ProgressBarElement = typings.blessed.mod.Widgets.ProgressBarElement

type ProgressBarEvent = Unit

type ProgressBarEventHandler = EventHandler[ProgressBarEvent]

type ProgressBarEventNames = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-blessed.anon.FnCall>[0] */ js.Any

type ProgressBarEventProps = EventHandlerProp[ProgressBarEventNames, ProgressBarEventHandler]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends react-blessed.react-blessed.ProgressBarElement ? react-blessed.react-blessed.ProgressBarEventProps & {  style :react-blessed.react-blessed.ProgressBarStyle | undefined} : {}
  }}}
  */
type ProgressBarProps[T] = ProgressBarEventProps & (/* import warning: importer.ImportType#apply Failed type conversion: {  style :react-blessed.react-blessed.ProgressBarStyle | undefined} */ js.Any)

type PromptElement = typings.blessed.mod.Widgets.PromptElement

type QuestionElement = typings.blessed.mod.Widgets.QuestionElement

type RadioButtonElement = typings.blessed.mod.Widgets.RadioButtonElement

type RadioSetElement = typings.blessed.mod.Widgets.RadioSetElement

type ScreenElementPrefix = element

type ScreenEvent = Screen

type ScreenEventHandler = EventHandler[ScreenEvent]

type ScreenEventNames = (Exclude[NodeScreenEventType, ExludedScreenEventNames]) | CamelCasedScreenEventNames

type ScreenEventProps = EventHandlerProp[ScreenEventNames, ScreenEventHandler]

type ScrollableBoxElement = typings.blessed.mod.Widgets.ScrollableBoxElement

type ScrollableTextElement = typings.blessed.mod.Widgets.ScrollableTextElement

type SpreadableArgs[T, K] = K

type TableElement = typings.blessed.mod.Widgets.TableElement

type TerminalElement = typings.blessed.mod.Widgets.TerminalElement

type TextElement = typings.blessed.mod.Widgets.TextElement

type TextareaElement = typings.blessed.mod.Widgets.TextareaElement

type TextboxElement = typings.blessed.mod.Widgets.TextboxElement

type WarningEvent = String

type WarningEventHandler = EventHandler[WarningEvent]

type WarningEventProps = EventHandlerProp[warning, WarningEventHandler]

type WithClassProp[T, K] = T & Class[K]

type renderer = js.Function3[
/* c */ typings.react.mod.global.JSX.Element, 
/* s */ Screen, 
/* callback */ js.UndefOr[Callback], 
(Component[js.Object, js.Object, Any]) | Null]
