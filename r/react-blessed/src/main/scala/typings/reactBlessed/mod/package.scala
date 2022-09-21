package typings.reactBlessed.mod

import org.scalablytyped.runtime.TopLevel
import typings.blessed.mod.Widgets.BlessedElement
import typings.blessed.mod.Widgets.Events.IKeyEventArg
import typings.blessed.mod.Widgets.Events.IMouseEventArg
import typings.blessed.mod.Widgets.Log
import typings.blessed.mod.Widgets.Screen
import typings.react.mod.ClassAttributes
import typings.react.mod.Component
import typings.reactBlessed.anon.Children
import typings.reactBlessed.anon.Class
import typings.reactBlessed.anon.PartialLayoutOptions
import typings.reactBlessed.anon.ProgressBarEventPropsstyl
import typings.reactBlessed.anon.ProgressBarEventPropsstylOnCapitalizeT
import typings.reactBlessed.mod.^
import typings.reactBlessed.reactBlessedBooleans.`false`
import typings.reactBlessed.reactBlessedStrings.DollarLeftcurlybracketTRightcurlybracketDollarLeftcurlybracketPRightcurlybracket
import typings.reactBlessed.reactBlessedStrings.Space
import typings.reactBlessed.reactBlessedStrings.children
import typings.reactBlessed.reactBlessedStrings.content
import typings.reactBlessed.reactBlessedStrings.element
import typings.reactBlessed.reactBlessedStrings.style
import typings.std.Capitalize
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

type EventHandler[T] = js.Function1[/* args */ SpreadableArgs[T, js.Array[T] | T], Unit]

type ExludedGenericEventNames = Prefix[GenericContentPrefix, Prefix[Space, GenericContent]]

type ExludedScreenEventNames = Prefix[ScreenElementPrefix, Prefix[Space, ScreenElement]]

type FileManagerElement = typings.blessed.mod.Widgets.FileManagerElement

// remove {[key: string]: any} indexer defined in Blessed.Widgets.IOptions.
// 'blessed' doesn't exist in a DOM so it probably doesn't make sense to allow any property
type FilterOptions[T /* <: Record[Any, Any] */] = Partial[Omit[KnownKeys[T], style | children]]

type GenericContent = content

type GenericEvent = Unit

type GenericEventHandler = EventHandler[GenericEvent]

type InputElement = typings.blessed.mod.Widgets.InputElement

type KeyPressEvent = js.Tuple2[/* key */ Any, /* event */ IKeyEventArg]

type KeyPressEventHandler = EventHandler[KeyPressEvent]

// remove indexers
// https://stackoverflow.com/questions/51465182/how-to-remove-index-signature-using-mapped-types
type KnownKeys[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T as string extends K? never : number extends K? never : K ]: T[K]}
  */ typings.reactBlessed.reactBlessedStrings.KnownKeys & TopLevel[T]

type LayoutElement = typings.blessed.mod.Widgets.LayoutElement

// layout does not require prop 'layout' in Blessed.Widgets.LayoutOptions--make it optional
type LayoutProps[T] = js.Object | PartialLayoutOptions

type LineElement = typings.blessed.mod.Widgets.LineElement

type ListElement = typings.blessed.mod.Widgets.ListElement

type ListProps[T] = js.Object | ProgressBarEventPropsstylOnCapitalizeT

type ListTableElement = typings.blessed.mod.Widgets.ListTableElement

type ListbarElement = typings.blessed.mod.Widgets.ListbarElement

type LoadingElement = typings.blessed.mod.Widgets.LoadingElement

type LogElement = Log

type MessageElement = typings.blessed.mod.Widgets.MessageElement

type ModifiedBlessedOptions[T /* <: Record[Any, Any] */] = FilterOptions[T] & Children & EventProps

type MouseEvent = IMouseEventArg

type MouseEventHandler = EventHandler[MouseEvent]

/* EVENTS *******************************************************************/
type Prefix[T /* <: String */, P /* <: String */] = DollarLeftcurlybracketTRightcurlybracketDollarLeftcurlybracketPRightcurlybracket

type ProgressBarElement = typings.blessed.mod.Widgets.ProgressBarElement

type ProgressBarEvent = Unit

type ProgressBarEventHandler = EventHandler[ProgressBarEvent]

type ProgressBarEventNames = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-blessed.anon.FnCall>[0] */ js.Any

type ProgressBarProps[T] = js.Object | ProgressBarEventPropsstyl

type PromptElement = typings.blessed.mod.Widgets.PromptElement

type QuestionElement = typings.blessed.mod.Widgets.QuestionElement

type RadioButtonElement = typings.blessed.mod.Widgets.RadioButtonElement

type RadioSetElement = typings.blessed.mod.Widgets.RadioSetElement

type ScreenElementPrefix = element

type ScreenEvent = Screen

type ScreenEventHandler = EventHandler[ScreenEvent]

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

type WithClassProp[T, K] = T & Class[K]

type renderer = js.Function3[
/* c */ typings.react.mod.global.JSX.Element, 
/* s */ Screen, 
/* callback */ js.UndefOr[Callback], 
(Component[js.Object, js.Object, Any]) | Null]
