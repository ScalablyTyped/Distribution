package typings.reactMdAutocomplete.typesMod

import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.`additions removals`
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.`additions text`
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.`inline`
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.`removals additions`
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.`removals text`
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.`text additions`
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.`text removals`
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.additions
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.all
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.ascending
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.assertive
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.both
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.copy
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.date
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.decimal
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.descending
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.dialog
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.done
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.email
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.enter
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.execute
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.go
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.grammar
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.grid
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.horizontal
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.inherit
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.link
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.list
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.listbox
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.location
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.menu
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.mixed
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.move
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.next
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.no
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.none
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.numeric
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.off
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.on
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.other
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.page
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.polite
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.popup
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.previous
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.removals
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.search
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.send
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.spelling
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.step
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.tel
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.text
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.time
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.tree
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.url
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.vertical
import typings.reactMdAutocomplete.reactMdAutocompleteStrings.yes
import typings.reactMdForm.anon.OmitHTMLAttributesHTMLDiv
import typings.reactMdForm.formThemeProviderMod.FormTheme
import typings.reactMdForm.formThemeProviderMod.FormUnderlineDirection
import typings.reactMdPortal.getContainerMod.PortalInto
import typings.reactMdUtils.anon.PartialPositionAnchor
import typings.reactMdUtils.typesMod.PositionWidth
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<@react-md/form.@react-md/form.TextFieldProps, 'type'> */
/* Inlined parent @react-md/portal.@react-md/portal.RenderConditionalPortalProps */
/* Inlined parent @react-md/autocomplete.@react-md/autocomplete/types/types.AutoCompleteListboxPositionOptions */
@js.native
trait AutoCompleteProps extends js.Object {
  
  var about: js.UndefOr[String] = js.native
  
  var accept: js.UndefOr[String] = js.native
  
  var accessKey: js.UndefOr[String] = js.native
  
  /**
    * Any optional children to display after the matched results in the
    * autocomplete's menu. This should normally be for any presentational data or
    * things that should not be searchable.
    *
    * @since 2.1.0
    */
  var afterResultsChildren: js.UndefOr[ReactNode] = js.native
  
  var alt: js.UndefOr[String] = js.native
  
  var anchor: js.UndefOr[PartialPositionAnchor] = js.native
  
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  
  var `aria-colcount`: js.UndefOr[Double] = js.native
  
  var `aria-colindex`: js.UndefOr[Double] = js.native
  
  var `aria-colspan`: js.UndefOr[Double] = js.native
  
  var `aria-controls`: js.UndefOr[String] = js.native
  
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  
  var `aria-describedby`: js.UndefOr[String] = js.native
  
  var `aria-details`: js.UndefOr[String] = js.native
  
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  
  var `aria-errormessage`: js.UndefOr[String] = js.native
  
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  
  var `aria-flowto`: js.UndefOr[String] = js.native
  
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  
  var `aria-label`: js.UndefOr[String] = js.native
  
  var `aria-labelledby`: js.UndefOr[String] = js.native
  
  var `aria-level`: js.UndefOr[Double] = js.native
  
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  
  var `aria-owns`: js.UndefOr[String] = js.native
  
  var `aria-placeholder`: js.UndefOr[String] = js.native
  
  var `aria-posinset`: js.UndefOr[Double] = js.native
  
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  
  var `aria-relevant`: js.UndefOr[
    additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
  ] = js.native
  
  var `aria-required`: js.UndefOr[Boolean] = js.native
  
  var `aria-roledescription`: js.UndefOr[String] = js.native
  
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  
  var `aria-setsize`: js.UndefOr[Double] = js.native
  
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  
  var `aria-valuetext`: js.UndefOr[String] = js.native
  
  var autoCapitalize: js.UndefOr[String] = js.native
  
  /**
    * @see AutoCompletion
    */
  var autoComplete: js.UndefOr[AutoCompletion] = js.native
  
  var autoCorrect: js.UndefOr[String] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var autoSave: js.UndefOr[String] = js.native
  
  /**
    * Any optional children to display before the matched results in the
    * autocomplete's menu. This should normally be for any presentational data or
    * things that should not be searchable.
    *
    * @since 2.1.0
    */
  var beforeResultsChildren: js.UndefOr[ReactNode] = js.native
  
  var capture: js.UndefOr[Boolean | String] = js.native
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  /**
    * Boolean if the text field's value should be cleared when the value is
    * autocompleted. This is useful when also adding custom `onAutoComplete`
    * behavior.
    */
  var clearOnAutoComplete: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the select's listbox should not hide if the user resizes the
    * browser while it is visible.
    */
  var closeOnResize: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the select's listbox should not hide if the user scrolls the
    * page while it is visible.
    */
  var closeOnScroll: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var containerProps: js.UndefOr[OmitHTMLAttributesHTMLDiv] = js.native
  
  var containerRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
  
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  
  var contextMenu: js.UndefOr[String] = js.native
  
  var crossOrigin: js.UndefOr[String] = js.native
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  
  /**
    * The list of data that should be autocompleted based on the provided filter.
    */
  var data: js.Array[AutoCompleteData] = js.native
  
  var datatype: js.UndefOr[String] = js.native
  
  var defaultChecked: js.UndefOr[Boolean] = js.native
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var dense: js.UndefOr[Boolean] = js.native
  
  var dir: js.UndefOr[String] = js.native
  
  /**
    * Boolean if the list of suggestions should no longer appear immediately once
    * the text field is focused and there is at least one item in the `data`
    * list. If this is set to `false`, the menu will only be shown when:
    *
    * - a letter is added or removed from the text field
    * - the user clicks it again
    * - using the alt+arrow-down keyboard shortcut
    *
    * If this prop is omitted, the show on focus behavior will be disabled on
    * touch devices since touch device's soft keyboards do a lot of funky things
    * with the viewport and scroll behavior. This makes it so the native viewport
    * and scroll behavior actions are normally finished before the suggestions
    * appear.
    */
  var disableShowOnFocus: js.UndefOr[Boolean] = js.native
  
  var disableSwapping: js.UndefOr[Boolean] = js.native
  
  var disableVHBounds: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var draggable: js.UndefOr[Booleanish] = js.native
  
  var enterKeyHint: js.UndefOr[enter | done | go | next | previous | search | send] = js.native
  
  var error: js.UndefOr[Boolean] = js.native
  
  /**
    * @see AutoCompleteFilterFunction
    */
  var filter: js.UndefOr[AutoCompleteFilterFunction[js.Object]] = js.native
  
  /**
    * Boolean if the filter function should still be called when there is no
    * value in the text field. This normally defaults to `false` so that the
    * `data` is just returned, but it can be useful with a custom filter function
    * that returns different data while there is no value.
    */
  var filterOnNoValue: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional object of options to provide to the filter function. This will
    * be defaulted to work with the fuzzy filter and case-insensitive filter
    * functions to trim whitespace before doing the comparisons.
    */
  var filterOptions: js.UndefOr[typings.reactMdAutocomplete.anon.FilterFunctionOptions] = js.native
  
  var form: js.UndefOr[String] = js.native
  
  var formAction: js.UndefOr[String] = js.native
  
  var formEncType: js.UndefOr[String] = js.native
  
  var formMethod: js.UndefOr[String] = js.native
  
  var formNoValidate: js.UndefOr[Boolean] = js.native
  
  var formTarget: js.UndefOr[String] = js.native
  
  /**
    * A function to call that will generate an id for each result in the
    * autocomplete's listbox. These ids are required for a11y as it'll be used
    * with the `aria-activedescendant` movement within the autocomplete.
    */
  var getResultId: js.UndefOr[js.Function2[/* id */ String, /* index */ Double, String]] = js.native
  
  /**
    * A function to call that will get a renderable label or children to display
    * for a result in the autocomplete's list of results. The default behavior
    * will be to return the result itself if it is a string, otherwise try to
    * return the `children` or `labelKey` attribute if it is an object.
    */
  var getResultLabel: js.UndefOr[
    js.Function3[/* data */ AutoCompleteData, /* labelKey */ String, /* query */ String, ReactNode]
  ] = js.native
  
  /**
    * A function to call that will extract a searchable value string from each
    * result. This **must** return a string and will prevent the autocomplete
    * from filtering data with the built in filter functions.
    */
  var getResultValue: js.UndefOr[js.Function2[/* datum */ AutoCompleteData, /* valueKey */ String, String]] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the result list labels should be updated so that each matching
    * letter is bolded. This only works when the data list is a list of strings,
    * or the `label` is a string and when the letters appear in order. This will
    * always be `false` if the `filter` prop is set to `"fuzzy"`.
    */
  var highlight: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional className to apply to the `<span>` surrounding the matched text
    * when the `highlight` prop is enabled.
    */
  var highlightClassName: js.UndefOr[String] = js.native
  
  /**
    * Boolean if the highlight functionality should no longer stop after the
    * first match and instead highlight all matches of the search string within
    * the label for an item.
    */
  var highlightReapeating: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional style to apply to the `<span>` surrounding the matched text
    * when the `highlight` prop is enabled.
    */
  var highlightStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * The id to use for the AutoComplete and is required for a11y to fulfill the
    * `combobox` role. This id will be passed directly to the `<input>` element
    * and prefixed for all the other id-required elements.
    */
  var id: String = js.native
  
  var initialX: js.UndefOr[Double] = js.native
  
  var initialY: js.UndefOr[Double] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var inlist: js.UndefOr[js.Any] = js.native
  
  var inputClassName: js.UndefOr[String] = js.native
  
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  
  var inputStyle: js.UndefOr[CSSProperties] = js.native
  
  var is: js.UndefOr[String] = js.native
  
  var isLeftAddon: js.UndefOr[Boolean] = js.native
  
  var isRightAddon: js.UndefOr[Boolean] = js.native
  
  var itemID: js.UndefOr[String] = js.native
  
  var itemProp: js.UndefOr[String] = js.native
  
  var itemRef: js.UndefOr[String] = js.native
  
  var itemScope: js.UndefOr[Boolean] = js.native
  
  var itemType: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[ReactNode] = js.native
  
  var labelClassName: js.UndefOr[String] = js.native
  
  /**
    * The key to use to extract a label from a result when the provided data list
    * is a list of objects.
    */
  var labelKey: js.UndefOr[String] = js.native
  
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var leftChildren: js.UndefOr[ReactNode] = js.native
  
  var list: js.UndefOr[String] = js.native
  
  /**
    * An optional className to also apply to the listbox element showing all the
    * matches.
    */
  var listboxClassName: js.UndefOr[String] = js.native
  
  /**
    * An optional style to also apply to the listbox element showing all the
    * matches.
    */
  var listboxStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * The sizing behavior for the listbox. It will default to have the same width
    * as the select button, but it is also possible to either have the
    * `min-width` be the width of the select button or just automatically
    * determine the width.
    *
    * The sizing behavior will always ensure that the left and right bounds of
    * the listbox appear within the viewport.
    */
  var listboxWidth: js.UndefOr[PositionWidth] = js.native
  
  var max: js.UndefOr[Double | String] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double | String] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  /**
    * An optional list of keys that should be omitted from your `data` item
    * before passing it to the suggestion `Option`. This is useful if you have
    * additional metadata in your data objects that should not be passed as DOM
    * attributes.
    *
    *
    * ```ts
    * const item = { __id: 9432432, name: "Item", value: "guid" }
    *
    * // don't want to pass `__id` to the Option
    * const omitKeys = ["__id"];
    *```
    */
  var omitKeys: js.UndefOr[js.Array[String]] = js.native
  
  var onAbort: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
  
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
  
  /**
    * @see AutoCompleteHandler
    */
  var onAutoComplete: js.UndefOr[AutoCompleteHandler] = js.native
  
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
  
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
  
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onDrag: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragExit: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragOver: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragStart: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDrop: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onEnded: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onError: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  
  var onInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  var onInvalid: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var onLoad: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
  
  var onPause: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onProgress: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onReset: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  var onScroll: js.UndefOr[UIEventHandler[HTMLInputElement]] = js.native
  
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onSelect: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onStalled: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onSubmit: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.native
  
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onWheel: js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.native
  
  var pattern: js.UndefOr[String] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * Boolean if the portal should be used.
    */
  var portal: js.UndefOr[Boolean] = js.native
  
  /**
    * @see {@link Portal#into}
    */
  var portalInto: js.UndefOr[PortalInto] = js.native
  
  /**
    * @see {@link Portal#intoId}
    */
  var portalIntoId: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var preventOverlap: js.UndefOr[Boolean] = js.native
  
  var property: js.UndefOr[String] = js.native
  
  var radioGroup: js.UndefOr[String] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var resource: js.UndefOr[String] = js.native
  
  var results: js.UndefOr[Double] = js.native
  
  var rightChildren: js.UndefOr[ReactNode] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var security: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var slot: js.UndefOr[String] = js.native
  
  var spellCheck: js.UndefOr[Booleanish] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var step: js.UndefOr[Double | String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var theme: js.UndefOr[FormTheme] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var transformOrigin: js.UndefOr[Boolean] = js.native
  
  var translate: js.UndefOr[yes | no] = js.native
  
  var typeof: js.UndefOr[String] = js.native
  
  var underlineDirection: js.UndefOr[FormUnderlineDirection] = js.native
  
  var unselectable: js.UndefOr[on | off] = js.native
  
  var value: js.UndefOr[String] = js.native
  
  /**
    * The key to use to extract a searchable value string from a result when the
    * provided data list is a list of objects.
    */
  var valueKey: js.UndefOr[String] = js.native
  
  var vhMargin: js.UndefOr[Double] = js.native
  
  var vocab: js.UndefOr[String] = js.native
  
  var vwMargin: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
  
  var xMargin: js.UndefOr[Double] = js.native
  
  var yMargin: js.UndefOr[Double] = js.native
}
object AutoCompleteProps {
  
  @scala.inline
  def apply(data: js.Array[AutoCompleteData], id: String): AutoCompleteProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteProps]
  }
  
  @scala.inline
  implicit class AutoCompletePropsOps[Self <: AutoCompleteProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataVarargs(value: AutoCompleteData*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[AutoCompleteData]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbout(value: String): Self = this.set("about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    
    @scala.inline
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    
    @scala.inline
    def setAfterResultsChildren(value: ReactNode): Self = this.set("afterResultsChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterResultsChildren: Self = this.set("afterResultsChildren", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setAnchor(value: PartialPositionAnchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", js.undefined)
    
    @scala.inline
    def `setAria-atomic`(value: Boolean): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", js.undefined)
    
    @scala.inline
    def `setAria-autocomplete`(value: none | `inline` | list | both): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-autocomplete`: Self = this.set("aria-autocomplete", js.undefined)
    
    @scala.inline
    def `setAria-busy`(value: Boolean): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-busy`: Self = this.set("aria-busy", js.undefined)
    
    @scala.inline
    def `setAria-checked`(value: Boolean | mixed): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", js.undefined)
    
    @scala.inline
    def `setAria-colcount`(value: Double): Self = this.set("aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colcount`: Self = this.set("aria-colcount", js.undefined)
    
    @scala.inline
    def `setAria-colindex`(value: Double): Self = this.set("aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colindex`: Self = this.set("aria-colindex", js.undefined)
    
    @scala.inline
    def `setAria-colspan`(value: Double): Self = this.set("aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colspan`: Self = this.set("aria-colspan", js.undefined)
    
    @scala.inline
    def `setAria-controls`(value: String): Self = this.set("aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-controls`: Self = this.set("aria-controls", js.undefined)
    
    @scala.inline
    def `setAria-current`(value: Boolean | page | step | location | date | time): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    
    @scala.inline
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    
    @scala.inline
    def `setAria-details`(value: String): Self = this.set("aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-details`: Self = this.set("aria-details", js.undefined)
    
    @scala.inline
    def `setAria-disabled`(value: Boolean): Self = this.set("aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-disabled`: Self = this.set("aria-disabled", js.undefined)
    
    @scala.inline
    def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = this.set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-dropeffect`: Self = this.set("aria-dropeffect", js.undefined)
    
    @scala.inline
    def `setAria-errormessage`(value: String): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    
    @scala.inline
    def `setAria-expanded`(value: Boolean): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-expanded`: Self = this.set("aria-expanded", js.undefined)
    
    @scala.inline
    def `setAria-flowto`(value: String): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", js.undefined)
    
    @scala.inline
    def `setAria-grabbed`(value: Boolean): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", js.undefined)
    
    @scala.inline
    def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", js.undefined)
    
    @scala.inline
    def `setAria-hidden`(value: Boolean): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", js.undefined)
    
    @scala.inline
    def `setAria-invalid`(value: Boolean | grammar | spelling): Self = this.set("aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-invalid`: Self = this.set("aria-invalid", js.undefined)
    
    @scala.inline
    def `setAria-keyshortcuts`(value: String): Self = this.set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-keyshortcuts`: Self = this.set("aria-keyshortcuts", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    
    @scala.inline
    def `setAria-level`(value: Double): Self = this.set("aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-level`: Self = this.set("aria-level", js.undefined)
    
    @scala.inline
    def `setAria-live`(value: off | assertive | polite): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", js.undefined)
    
    @scala.inline
    def `setAria-modal`(value: Boolean): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", js.undefined)
    
    @scala.inline
    def `setAria-multiline`(value: Boolean): Self = this.set("aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-multiline`: Self = this.set("aria-multiline", js.undefined)
    
    @scala.inline
    def `setAria-multiselectable`(value: Boolean): Self = this.set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-multiselectable`: Self = this.set("aria-multiselectable", js.undefined)
    
    @scala.inline
    def `setAria-orientation`(value: horizontal | vertical): Self = this.set("aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-orientation`: Self = this.set("aria-orientation", js.undefined)
    
    @scala.inline
    def `setAria-owns`(value: String): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-owns`: Self = this.set("aria-owns", js.undefined)
    
    @scala.inline
    def `setAria-placeholder`(value: String): Self = this.set("aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-placeholder`: Self = this.set("aria-placeholder", js.undefined)
    
    @scala.inline
    def `setAria-posinset`(value: Double): Self = this.set("aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-posinset`: Self = this.set("aria-posinset", js.undefined)
    
    @scala.inline
    def `setAria-pressed`(value: Boolean | mixed): Self = this.set("aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-pressed`: Self = this.set("aria-pressed", js.undefined)
    
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    
    @scala.inline
    def `setAria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): Self = this.set("aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-relevant`: Self = this.set("aria-relevant", js.undefined)
    
    @scala.inline
    def `setAria-required`(value: Boolean): Self = this.set("aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-required`: Self = this.set("aria-required", js.undefined)
    
    @scala.inline
    def `setAria-roledescription`(value: String): Self = this.set("aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-roledescription`: Self = this.set("aria-roledescription", js.undefined)
    
    @scala.inline
    def `setAria-rowcount`(value: Double): Self = this.set("aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowcount`: Self = this.set("aria-rowcount", js.undefined)
    
    @scala.inline
    def `setAria-rowindex`(value: Double): Self = this.set("aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowindex`: Self = this.set("aria-rowindex", js.undefined)
    
    @scala.inline
    def `setAria-rowspan`(value: Double): Self = this.set("aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowspan`: Self = this.set("aria-rowspan", js.undefined)
    
    @scala.inline
    def `setAria-selected`(value: Boolean): Self = this.set("aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-selected`: Self = this.set("aria-selected", js.undefined)
    
    @scala.inline
    def `setAria-setsize`(value: Double): Self = this.set("aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-setsize`: Self = this.set("aria-setsize", js.undefined)
    
    @scala.inline
    def `setAria-sort`(value: none | ascending | descending | other): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", js.undefined)
    
    @scala.inline
    def `setAria-valuemax`(value: Double): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuemax`: Self = this.set("aria-valuemax", js.undefined)
    
    @scala.inline
    def `setAria-valuemin`(value: Double): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuemin`: Self = this.set("aria-valuemin", js.undefined)
    
    @scala.inline
    def `setAria-valuenow`(value: Double): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuenow`: Self = this.set("aria-valuenow", js.undefined)
    
    @scala.inline
    def `setAria-valuetext`(value: String): Self = this.set("aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuetext`: Self = this.set("aria-valuetext", js.undefined)
    
    @scala.inline
    def setAutoCapitalize(value: String): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoComplete(value: AutoCompletion): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: String): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setAutoSave(value: String): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    
    @scala.inline
    def setBeforeResultsChildren(value: ReactNode): Self = this.set("beforeResultsChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeResultsChildren: Self = this.set("beforeResultsChildren", js.undefined)
    
    @scala.inline
    def setCapture(value: Boolean | String): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClearOnAutoComplete(value: Boolean): Self = this.set("clearOnAutoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearOnAutoComplete: Self = this.set("clearOnAutoComplete", js.undefined)
    
    @scala.inline
    def setCloseOnResize(value: Boolean): Self = this.set("closeOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnResize: Self = this.set("closeOnResize", js.undefined)
    
    @scala.inline
    def setCloseOnScroll(value: Boolean): Self = this.set("closeOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnScroll: Self = this.set("closeOnScroll", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setContainerProps(value: OmitHTMLAttributesHTMLDiv): Self = this.set("containerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerProps: Self = this.set("containerProps", js.undefined)
    
    @scala.inline
    def setContainerRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = this.set("containerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainerRef(value: Ref[HTMLDivElement]): Self = this.set("containerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerRef: Self = this.set("containerRef", js.undefined)
    
    @scala.inline
    def setContainerRefNull: Self = this.set("containerRef", null)
    
    @scala.inline
    def setContentEditable(value: Booleanish | inherit): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEditable: Self = this.set("contentEditable", js.undefined)
    
    @scala.inline
    def setContextMenu(value: String): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = this.set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDangerouslySetInnerHTML: Self = this.set("dangerouslySetInnerHTML", js.undefined)
    
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    
    @scala.inline
    def setDefaultChecked(value: Boolean): Self = this.set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultChecked: Self = this.set("defaultChecked", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDense(value: Boolean): Self = this.set("dense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDense: Self = this.set("dense", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setDisableShowOnFocus(value: Boolean): Self = this.set("disableShowOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableShowOnFocus: Self = this.set("disableShowOnFocus", js.undefined)
    
    @scala.inline
    def setDisableSwapping(value: Boolean): Self = this.set("disableSwapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSwapping: Self = this.set("disableSwapping", js.undefined)
    
    @scala.inline
    def setDisableVHBounds(value: Boolean): Self = this.set("disableVHBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableVHBounds: Self = this.set("disableVHBounds", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDraggable(value: Booleanish): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setEnterKeyHint(value: enter | done | go | next | previous | search | send): Self = this.set("enterKeyHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterKeyHint: Self = this.set("enterKeyHint", js.undefined)
    
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFilterFunction3(
      value: (/* query */ String, /* data */ js.Array[AutoCompleteData], /* options */ FilterFunctionOptions[js.Object]) => js.Array[AutoCompleteData]
    ): Self = this.set("filter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFilter(value: AutoCompleteFilterFunction[js.Object]): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFilterOnNoValue(value: Boolean): Self = this.set("filterOnNoValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterOnNoValue: Self = this.set("filterOnNoValue", js.undefined)
    
    @scala.inline
    def setFilterOptions(value: typings.reactMdAutocomplete.anon.FilterFunctionOptions): Self = this.set("filterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterOptions: Self = this.set("filterOptions", js.undefined)
    
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setFormAction(value: String): Self = this.set("formAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormAction: Self = this.set("formAction", js.undefined)
    
    @scala.inline
    def setFormEncType(value: String): Self = this.set("formEncType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormEncType: Self = this.set("formEncType", js.undefined)
    
    @scala.inline
    def setFormMethod(value: String): Self = this.set("formMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormMethod: Self = this.set("formMethod", js.undefined)
    
    @scala.inline
    def setFormNoValidate(value: Boolean): Self = this.set("formNoValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormNoValidate: Self = this.set("formNoValidate", js.undefined)
    
    @scala.inline
    def setFormTarget(value: String): Self = this.set("formTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormTarget: Self = this.set("formTarget", js.undefined)
    
    @scala.inline
    def setGetResultId(value: (/* id */ String, /* index */ Double) => String): Self = this.set("getResultId", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetResultId: Self = this.set("getResultId", js.undefined)
    
    @scala.inline
    def setGetResultLabel(value: (/* data */ AutoCompleteData, /* labelKey */ String, /* query */ String) => ReactNode): Self = this.set("getResultLabel", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGetResultLabel: Self = this.set("getResultLabel", js.undefined)
    
    @scala.inline
    def setGetResultValue(value: (/* datum */ AutoCompleteData, /* valueKey */ String) => String): Self = this.set("getResultValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetResultValue: Self = this.set("getResultValue", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHighlight(value: Boolean): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setHighlightClassName(value: String): Self = this.set("highlightClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightClassName: Self = this.set("highlightClassName", js.undefined)
    
    @scala.inline
    def setHighlightReapeating(value: Boolean): Self = this.set("highlightReapeating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightReapeating: Self = this.set("highlightReapeating", js.undefined)
    
    @scala.inline
    def setHighlightStyle(value: CSSProperties): Self = this.set("highlightStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightStyle: Self = this.set("highlightStyle", js.undefined)
    
    @scala.inline
    def setInitialX(value: Double): Self = this.set("initialX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialX: Self = this.set("initialX", js.undefined)
    
    @scala.inline
    def setInitialY(value: Double): Self = this.set("initialY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialY: Self = this.set("initialY", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setInlist(value: js.Any): Self = this.set("inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlist: Self = this.set("inlist", js.undefined)
    
    @scala.inline
    def setInputClassName(value: String): Self = this.set("inputClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputClassName: Self = this.set("inputClassName", js.undefined)
    
    @scala.inline
    def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    
    @scala.inline
    def setInputStyle(value: CSSProperties): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    
    @scala.inline
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    
    @scala.inline
    def setIsLeftAddon(value: Boolean): Self = this.set("isLeftAddon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLeftAddon: Self = this.set("isLeftAddon", js.undefined)
    
    @scala.inline
    def setIsRightAddon(value: Boolean): Self = this.set("isRightAddon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRightAddon: Self = this.set("isRightAddon", js.undefined)
    
    @scala.inline
    def setItemID(value: String): Self = this.set("itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemID: Self = this.set("itemID", js.undefined)
    
    @scala.inline
    def setItemProp(value: String): Self = this.set("itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemProp: Self = this.set("itemProp", js.undefined)
    
    @scala.inline
    def setItemRef(value: String): Self = this.set("itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemRef: Self = this.set("itemRef", js.undefined)
    
    @scala.inline
    def setItemScope(value: Boolean): Self = this.set("itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemScope: Self = this.set("itemScope", js.undefined)
    
    @scala.inline
    def setItemType(value: String): Self = this.set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelClassName(value: String): Self = this.set("labelClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelClassName: Self = this.set("labelClassName", js.undefined)
    
    @scala.inline
    def setLabelKey(value: String): Self = this.set("labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelKey: Self = this.set("labelKey", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: CSSProperties): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setLeftChildren(value: ReactNode): Self = this.set("leftChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftChildren: Self = this.set("leftChildren", js.undefined)
    
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setListboxClassName(value: String): Self = this.set("listboxClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListboxClassName: Self = this.set("listboxClassName", js.undefined)
    
    @scala.inline
    def setListboxStyle(value: CSSProperties): Self = this.set("listboxStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListboxStyle: Self = this.set("listboxStyle", js.undefined)
    
    @scala.inline
    def setListboxWidth(value: PositionWidth): Self = this.set("listboxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListboxWidth: Self = this.set("listboxWidth", js.undefined)
    
    @scala.inline
    def setMax(value: Double | String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMin(value: Double | String): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOmitKeysVarargs(value: String*): Self = this.set("omitKeys", js.Array(value :_*))
    
    @scala.inline
    def setOmitKeys(value: js.Array[String]): Self = this.set("omitKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmitKeys: Self = this.set("omitKeys", js.undefined)
    
    @scala.inline
    def setOnAbort(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: AnimationEvent[HTMLInputElement] => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationIteration(value: AnimationEvent[HTMLInputElement] => Unit): Self = this.set("onAnimationIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationIteration: Self = this.set("onAnimationIteration", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: AnimationEvent[HTMLInputElement] => Unit): Self = this.set("onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
    
    @scala.inline
    def setOnAutoComplete(value: /* result */ AutoCompleteResult => Unit): Self = this.set("onAutoComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAutoComplete: Self = this.set("onAutoComplete", js.undefined)
    
    @scala.inline
    def setOnAuxClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = this.set("onAuxClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAuxClick: Self = this.set("onAuxClick", js.undefined)
    
    @scala.inline
    def setOnBeforeInput(value: FormEvent[HTMLInputElement] => Unit): Self = this.set("onBeforeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeInput: Self = this.set("onBeforeInput", js.undefined)
    
    @scala.inline
    def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    
    @scala.inline
    def setOnCanPlayThrough(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnCompositionEnd(value: CompositionEvent[HTMLInputElement] => Unit): Self = this.set("onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCompositionEnd: Self = this.set("onCompositionEnd", js.undefined)
    
    @scala.inline
    def setOnCompositionStart(value: CompositionEvent[HTMLInputElement] => Unit): Self = this.set("onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCompositionStart: Self = this.set("onCompositionStart", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdate(value: CompositionEvent[HTMLInputElement] => Unit): Self = this.set("onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCompositionUpdate: Self = this.set("onCompositionUpdate", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    
    @scala.inline
    def setOnCopy(value: ClipboardEvent[HTMLInputElement] => Unit): Self = this.set("onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    
    @scala.inline
    def setOnCut(value: ClipboardEvent[HTMLInputElement] => Unit): Self = this.set("onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnDrag(value: DragEvent[HTMLInputElement] => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: DragEvent[HTMLInputElement] => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: DragEvent[HTMLInputElement] => Unit): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragExit(value: DragEvent[HTMLInputElement] => Unit): Self = this.set("onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: DragEvent[HTMLInputElement] => Unit): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: DragEvent[HTMLInputElement] => Unit): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: DragEvent[HTMLInputElement] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnDrop(value: DragEvent[HTMLInputElement] => Unit): Self = this.set("onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    
    @scala.inline
    def setOnEncrypted(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEncrypted: Self = this.set("onEncrypted", js.undefined)
    
    @scala.inline
    def setOnEnded(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    
    @scala.inline
    def setOnError(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnInput(value: FormEvent[HTMLInputElement] => Unit): Self = this.set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    
    @scala.inline
    def setOnInvalid(value: FormEvent[HTMLInputElement] => Unit): Self = this.set("onInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: KeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
    @scala.inline
    def setOnLoad(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadata(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = this.set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = this.set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    
    @scala.inline
    def setOnPaste(value: ClipboardEvent[HTMLInputElement] => Unit): Self = this.set("onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    
    @scala.inline
    def setOnPause(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    
    @scala.inline
    def setOnPointerCancel(value: PointerEvent[HTMLInputElement] => Unit): Self = this.set("onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    
    @scala.inline
    def setOnPointerDown(value: PointerEvent[HTMLInputElement] => Unit): Self = this.set("onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    
    @scala.inline
    def setOnPointerEnter(value: PointerEvent[HTMLInputElement] => Unit): Self = this.set("onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    
    @scala.inline
    def setOnPointerLeave(value: PointerEvent[HTMLInputElement] => Unit): Self = this.set("onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    
    @scala.inline
    def setOnPointerMove(value: PointerEvent[HTMLInputElement] => Unit): Self = this.set("onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    
    @scala.inline
    def setOnPointerOut(value: PointerEvent[HTMLInputElement] => Unit): Self = this.set("onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    
    @scala.inline
    def setOnPointerOver(value: PointerEvent[HTMLInputElement] => Unit): Self = this.set("onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    
    @scala.inline
    def setOnPointerUp(value: PointerEvent[HTMLInputElement] => Unit): Self = this.set("onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    
    @scala.inline
    def setOnProgress(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    
    @scala.inline
    def setOnReset(value: FormEvent[HTMLInputElement] => Unit): Self = this.set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    
    @scala.inline
    def setOnScroll(value: UIEvent[HTMLInputElement, NativeUIEvent] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    
    @scala.inline
    def setOnSelect(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOnStalled(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: FormEvent[HTMLInputElement] => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: TouchEvent[HTMLInputElement] => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: TouchEvent[HTMLInputElement] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: TouchEvent[HTMLInputElement] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: TouchEvent[HTMLInputElement] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: TransitionEvent[HTMLInputElement] => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = this.set("onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    
    @scala.inline
    def setOnWheel(value: WheelEvent[HTMLInputElement] => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPortal(value: Boolean): Self = this.set("portal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortal: Self = this.set("portal", js.undefined)
    
    @scala.inline
    def setPortalIntoFunction0(value: () => HTMLElement | Null): Self = this.set("portalInto", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPortalInto(value: PortalInto): Self = this.set("portalInto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalInto: Self = this.set("portalInto", js.undefined)
    
    @scala.inline
    def setPortalIntoNull: Self = this.set("portalInto", null)
    
    @scala.inline
    def setPortalIntoId(value: String): Self = this.set("portalIntoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalIntoId: Self = this.set("portalIntoId", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setPreventOverlap(value: Boolean): Self = this.set("preventOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventOverlap: Self = this.set("preventOverlap", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setRadioGroup(value: String): Self = this.set("radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioGroup: Self = this.set("radioGroup", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setRightChildren(value: ReactNode): Self = this.set("rightChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightChildren: Self = this.set("rightChildren", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setSecurity(value: String): Self = this.set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: Booleanish): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setStep(value: Double | String): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSuppressContentEditableWarning(value: Boolean): Self = this.set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressContentEditableWarning: Self = this.set("suppressContentEditableWarning", js.undefined)
    
    @scala.inline
    def setSuppressHydrationWarning(value: Boolean): Self = this.set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressHydrationWarning: Self = this.set("suppressHydrationWarning", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTheme(value: FormTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTransformOrigin(value: Boolean): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformOrigin: Self = this.set("transformOrigin", js.undefined)
    
    @scala.inline
    def setTranslate(value: yes | no): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    
    @scala.inline
    def setTypeof(value: String): Self = this.set("typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeof: Self = this.set("typeof", js.undefined)
    
    @scala.inline
    def setUnderlineDirection(value: FormUnderlineDirection): Self = this.set("underlineDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineDirection: Self = this.set("underlineDirection", js.undefined)
    
    @scala.inline
    def setUnselectable(value: on | off): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueKey: Self = this.set("valueKey", js.undefined)
    
    @scala.inline
    def setVhMargin(value: Double): Self = this.set("vhMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVhMargin: Self = this.set("vhMargin", js.undefined)
    
    @scala.inline
    def setVocab(value: String): Self = this.set("vocab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVocab: Self = this.set("vocab", js.undefined)
    
    @scala.inline
    def setVwMargin(value: Double): Self = this.set("vwMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVwMargin: Self = this.set("vwMargin", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setXMargin(value: Double): Self = this.set("xMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXMargin: Self = this.set("xMargin", js.undefined)
    
    @scala.inline
    def setYMargin(value: Double): Self = this.set("yMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYMargin: Self = this.set("yMargin", js.undefined)
  }
}
