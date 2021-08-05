package typings.storybookComponents

import typings.emotionStyledBase.anon.`0`
import typings.emotionStyledBase.helperMod.Omit
import typings.emotionStyledBase.helperMod.PropsOf
import typings.emotionStyledBase.mod.StyledComponent
import typings.react.HTMLWebViewElement
import typings.react.anon.Html
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.AreaHTMLAttributes
import typings.react.mod.AudioHTMLAttributes
import typings.react.mod.BaseHTMLAttributes
import typings.react.mod.BlockquoteHTMLAttributes
import typings.react.mod.Booleanish
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.CSSProperties
import typings.react.mod.CanvasHTMLAttributes
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.ColHTMLAttributes
import typings.react.mod.ColgroupHTMLAttributes
import typings.react.mod.ComponentType
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DataHTMLAttributes
import typings.react.mod.DelHTMLAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.DetailsHTMLAttributes
import typings.react.mod.DialogHTMLAttributes
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.EmbedHTMLAttributes
import typings.react.mod.FieldsetHTMLAttributes
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.FormHTMLAttributes
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.HtmlHTMLAttributes
import typings.react.mod.IframeHTMLAttributes
import typings.react.mod.ImgHTMLAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.InsHTMLAttributes
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.KeygenHTMLAttributes
import typings.react.mod.LabelHTMLAttributes
import typings.react.mod.LegacyRef
import typings.react.mod.LiHTMLAttributes
import typings.react.mod.LinkHTMLAttributes
import typings.react.mod.MapHTMLAttributes
import typings.react.mod.MenuHTMLAttributes
import typings.react.mod.MetaHTMLAttributes
import typings.react.mod.MeterHTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.ObjectHTMLAttributes
import typings.react.mod.OlHTMLAttributes
import typings.react.mod.OptgroupHTMLAttributes
import typings.react.mod.OptionHTMLAttributes
import typings.react.mod.OutputHTMLAttributes
import typings.react.mod.ParamHTMLAttributes
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ProgressHTMLAttributes
import typings.react.mod.PropsWithChildren
import typings.react.mod.QuoteHTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SVGProps
import typings.react.mod.ScriptHTMLAttributes
import typings.react.mod.SelectHTMLAttributes
import typings.react.mod.SlotHTMLAttributes
import typings.react.mod.SourceHTMLAttributes
import typings.react.mod.StyleHTMLAttributes
import typings.react.mod.SyntheticEvent
import typings.react.mod.TableHTMLAttributes
import typings.react.mod.TdHTMLAttributes
import typings.react.mod.TextareaHTMLAttributes
import typings.react.mod.ThHTMLAttributes
import typings.react.mod.TimeHTMLAttributes
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TrackHTMLAttributes
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.ValidationMap
import typings.react.mod.VideoHTMLAttributes
import typings.react.mod.WeakValidationMap
import typings.react.mod.WebViewHTMLAttributes
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.std.Event
import typings.std.HTMLAnchorElement
import typings.std.HTMLAreaElement
import typings.std.HTMLAudioElement
import typings.std.HTMLBRElement
import typings.std.HTMLBaseElement
import typings.std.HTMLBodyElement
import typings.std.HTMLButtonElement
import typings.std.HTMLCanvasElement
import typings.std.HTMLDListElement
import typings.std.HTMLDataElement
import typings.std.HTMLDataListElement
import typings.std.HTMLDialogElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLEmbedElement
import typings.std.HTMLFieldSetElement
import typings.std.HTMLFormElement
import typings.std.HTMLHRElement
import typings.std.HTMLHeadElement
import typings.std.HTMLHeadingElement
import typings.std.HTMLHtmlElement
import typings.std.HTMLIFrameElement
import typings.std.HTMLImageElement
import typings.std.HTMLInputElement
import typings.std.HTMLLIElement
import typings.std.HTMLLabelElement
import typings.std.HTMLLegendElement
import typings.std.HTMLLinkElement
import typings.std.HTMLMapElement
import typings.std.HTMLMetaElement
import typings.std.HTMLModElement
import typings.std.HTMLOListElement
import typings.std.HTMLObjectElement
import typings.std.HTMLOptGroupElement
import typings.std.HTMLOptionElement
import typings.std.HTMLParagraphElement
import typings.std.HTMLParamElement
import typings.std.HTMLPreElement
import typings.std.HTMLProgressElement
import typings.std.HTMLQuoteElement
import typings.std.HTMLScriptElement
import typings.std.HTMLSelectElement
import typings.std.HTMLSlotElement
import typings.std.HTMLSourceElement
import typings.std.HTMLSpanElement
import typings.std.HTMLStyleElement
import typings.std.HTMLTableColElement
import typings.std.HTMLTableDataCellElement
import typings.std.HTMLTableElement
import typings.std.HTMLTableHeaderCellElement
import typings.std.HTMLTableRowElement
import typings.std.HTMLTableSectionElement
import typings.std.HTMLTemplateElement
import typings.std.HTMLTextAreaElement
import typings.std.HTMLTitleElement
import typings.std.HTMLTrackElement
import typings.std.HTMLUListElement
import typings.std.HTMLVideoElement
import typings.std.Partial
import typings.std.SVGCircleElement
import typings.std.SVGClipPathElement
import typings.std.SVGDefsElement
import typings.std.SVGDescElement
import typings.std.SVGElement
import typings.std.SVGEllipseElement
import typings.std.SVGFEBlendElement
import typings.std.SVGFEColorMatrixElement
import typings.std.SVGFEComponentTransferElement
import typings.std.SVGFECompositeElement
import typings.std.SVGFEConvolveMatrixElement
import typings.std.SVGFEDiffuseLightingElement
import typings.std.SVGFEDisplacementMapElement
import typings.std.SVGFEDistantLightElement
import typings.std.SVGFEDropShadowElement
import typings.std.SVGFEFloodElement
import typings.std.SVGFEFuncAElement
import typings.std.SVGFEFuncBElement
import typings.std.SVGFEFuncGElement
import typings.std.SVGFEFuncRElement
import typings.std.SVGFEGaussianBlurElement
import typings.std.SVGFEImageElement
import typings.std.SVGFEMergeElement
import typings.std.SVGFEMergeNodeElement
import typings.std.SVGFEMorphologyElement
import typings.std.SVGFEOffsetElement
import typings.std.SVGFEPointLightElement
import typings.std.SVGFESpecularLightingElement
import typings.std.SVGFESpotLightElement
import typings.std.SVGFETileElement
import typings.std.SVGFETurbulenceElement
import typings.std.SVGFilterElement
import typings.std.SVGForeignObjectElement
import typings.std.SVGGElement
import typings.std.SVGImageElement
import typings.std.SVGLineElement
import typings.std.SVGLinearGradientElement
import typings.std.SVGMarkerElement
import typings.std.SVGMaskElement
import typings.std.SVGMetadataElement
import typings.std.SVGPathElement
import typings.std.SVGPatternElement
import typings.std.SVGPolygonElement
import typings.std.SVGPolylineElement
import typings.std.SVGRadialGradientElement
import typings.std.SVGRectElement
import typings.std.SVGSVGElement
import typings.std.SVGStopElement
import typings.std.SVGSwitchElement
import typings.std.SVGSymbolElement
import typings.std.SVGTSpanElement
import typings.std.SVGTextElement
import typings.std.SVGTextPathElement
import typings.std.SVGUseElement
import typings.std.SVGViewElement
import typings.storybookComponents.anon.PartialPickInputPropscolo
import typings.storybookComponents.anon.PartialPickSelectHTMLAttr
import typings.storybookComponents.anon.PickanycolortranslatehiddAbout
import typings.storybookComponents.anon.PropsWithChildrenPickInpu
import typings.storybookComponents.anon.PropsWithChildrenPickSeleAbout
import typings.storybookComponents.anon.WeakValidationMapPickInpu
import typings.storybookComponents.anon.WeakValidationMapPickSele
import typings.storybookComponents.storybookComponentsStrings.`additions removals`
import typings.storybookComponents.storybookComponentsStrings.`additions text`
import typings.storybookComponents.storybookComponentsStrings.`inline`
import typings.storybookComponents.storybookComponentsStrings.`object`
import typings.storybookComponents.storybookComponentsStrings.`removals additions`
import typings.storybookComponents.storybookComponentsStrings.`removals text`
import typings.storybookComponents.storybookComponentsStrings.`text additions`
import typings.storybookComponents.storybookComponentsStrings.`text removals`
import typings.storybookComponents.storybookComponentsStrings.`var`
import typings.storybookComponents.storybookComponentsStrings.a
import typings.storybookComponents.storybookComponentsStrings.abbr
import typings.storybookComponents.storybookComponentsStrings.additions
import typings.storybookComponents.storybookComponentsStrings.address
import typings.storybookComponents.storybookComponentsStrings.align
import typings.storybookComponents.storybookComponentsStrings.all
import typings.storybookComponents.storybookComponentsStrings.animate
import typings.storybookComponents.storybookComponentsStrings.animateMotion
import typings.storybookComponents.storybookComponentsStrings.animateTransform
import typings.storybookComponents.storybookComponentsStrings.area
import typings.storybookComponents.storybookComponentsStrings.article
import typings.storybookComponents.storybookComponentsStrings.ascending
import typings.storybookComponents.storybookComponentsStrings.aside
import typings.storybookComponents.storybookComponentsStrings.assertive
import typings.storybookComponents.storybookComponentsStrings.audio
import typings.storybookComponents.storybookComponentsStrings.b
import typings.storybookComponents.storybookComponentsStrings.base
import typings.storybookComponents.storybookComponentsStrings.bdi
import typings.storybookComponents.storybookComponentsStrings.bdo
import typings.storybookComponents.storybookComponentsStrings.big
import typings.storybookComponents.storybookComponentsStrings.blockquote
import typings.storybookComponents.storybookComponentsStrings.body
import typings.storybookComponents.storybookComponentsStrings.both
import typings.storybookComponents.storybookComponentsStrings.br
import typings.storybookComponents.storybookComponentsStrings.button
import typings.storybookComponents.storybookComponentsStrings.canvas
import typings.storybookComponents.storybookComponentsStrings.caption
import typings.storybookComponents.storybookComponentsStrings.circle
import typings.storybookComponents.storybookComponentsStrings.cite
import typings.storybookComponents.storybookComponentsStrings.clipPath
import typings.storybookComponents.storybookComponentsStrings.code
import typings.storybookComponents.storybookComponentsStrings.col
import typings.storybookComponents.storybookComponentsStrings.colgroup
import typings.storybookComponents.storybookComponentsStrings.copy
import typings.storybookComponents.storybookComponentsStrings.data
import typings.storybookComponents.storybookComponentsStrings.datalist
import typings.storybookComponents.storybookComponentsStrings.date
import typings.storybookComponents.storybookComponentsStrings.dd
import typings.storybookComponents.storybookComponentsStrings.decimal
import typings.storybookComponents.storybookComponentsStrings.defs
import typings.storybookComponents.storybookComponentsStrings.del
import typings.storybookComponents.storybookComponentsStrings.desc
import typings.storybookComponents.storybookComponentsStrings.descending
import typings.storybookComponents.storybookComponentsStrings.details
import typings.storybookComponents.storybookComponentsStrings.dfn
import typings.storybookComponents.storybookComponentsStrings.dialog
import typings.storybookComponents.storybookComponentsStrings.div
import typings.storybookComponents.storybookComponentsStrings.dl
import typings.storybookComponents.storybookComponentsStrings.dt
import typings.storybookComponents.storybookComponentsStrings.ellipse
import typings.storybookComponents.storybookComponentsStrings.em
import typings.storybookComponents.storybookComponentsStrings.email
import typings.storybookComponents.storybookComponentsStrings.embed
import typings.storybookComponents.storybookComponentsStrings.execute
import typings.storybookComponents.storybookComponentsStrings.feBlend
import typings.storybookComponents.storybookComponentsStrings.feColorMatrix
import typings.storybookComponents.storybookComponentsStrings.feComponentTransfer
import typings.storybookComponents.storybookComponentsStrings.feComposite
import typings.storybookComponents.storybookComponentsStrings.feConvolveMatrix
import typings.storybookComponents.storybookComponentsStrings.feDiffuseLighting
import typings.storybookComponents.storybookComponentsStrings.feDisplacementMap
import typings.storybookComponents.storybookComponentsStrings.feDistantLight
import typings.storybookComponents.storybookComponentsStrings.feDropShadow
import typings.storybookComponents.storybookComponentsStrings.feFlood
import typings.storybookComponents.storybookComponentsStrings.feFuncA
import typings.storybookComponents.storybookComponentsStrings.feFuncB
import typings.storybookComponents.storybookComponentsStrings.feFuncG
import typings.storybookComponents.storybookComponentsStrings.feFuncR
import typings.storybookComponents.storybookComponentsStrings.feGaussianBlur
import typings.storybookComponents.storybookComponentsStrings.feImage
import typings.storybookComponents.storybookComponentsStrings.feMerge
import typings.storybookComponents.storybookComponentsStrings.feMergeNode
import typings.storybookComponents.storybookComponentsStrings.feMorphology
import typings.storybookComponents.storybookComponentsStrings.feOffset
import typings.storybookComponents.storybookComponentsStrings.fePointLight
import typings.storybookComponents.storybookComponentsStrings.feSpecularLighting
import typings.storybookComponents.storybookComponentsStrings.feSpotLight
import typings.storybookComponents.storybookComponentsStrings.feTile
import typings.storybookComponents.storybookComponentsStrings.feTurbulence
import typings.storybookComponents.storybookComponentsStrings.fieldset
import typings.storybookComponents.storybookComponentsStrings.figcaption
import typings.storybookComponents.storybookComponentsStrings.figure
import typings.storybookComponents.storybookComponentsStrings.filter
import typings.storybookComponents.storybookComponentsStrings.footer
import typings.storybookComponents.storybookComponentsStrings.foreignObject
import typings.storybookComponents.storybookComponentsStrings.form
import typings.storybookComponents.storybookComponentsStrings.g
import typings.storybookComponents.storybookComponentsStrings.grammar
import typings.storybookComponents.storybookComponentsStrings.grid
import typings.storybookComponents.storybookComponentsStrings.h1
import typings.storybookComponents.storybookComponentsStrings.h2
import typings.storybookComponents.storybookComponentsStrings.h3
import typings.storybookComponents.storybookComponentsStrings.h4
import typings.storybookComponents.storybookComponentsStrings.h5
import typings.storybookComponents.storybookComponentsStrings.h6
import typings.storybookComponents.storybookComponentsStrings.head
import typings.storybookComponents.storybookComponentsStrings.header
import typings.storybookComponents.storybookComponentsStrings.height
import typings.storybookComponents.storybookComponentsStrings.hgroup
import typings.storybookComponents.storybookComponentsStrings.horizontal
import typings.storybookComponents.storybookComponentsStrings.hr
import typings.storybookComponents.storybookComponentsStrings.html
import typings.storybookComponents.storybookComponentsStrings.i
import typings.storybookComponents.storybookComponentsStrings.iframe
import typings.storybookComponents.storybookComponentsStrings.image
import typings.storybookComponents.storybookComponentsStrings.img
import typings.storybookComponents.storybookComponentsStrings.inherit
import typings.storybookComponents.storybookComponentsStrings.input
import typings.storybookComponents.storybookComponentsStrings.ins
import typings.storybookComponents.storybookComponentsStrings.kbd
import typings.storybookComponents.storybookComponentsStrings.keygen
import typings.storybookComponents.storybookComponentsStrings.label
import typings.storybookComponents.storybookComponentsStrings.legend
import typings.storybookComponents.storybookComponentsStrings.li
import typings.storybookComponents.storybookComponentsStrings.line
import typings.storybookComponents.storybookComponentsStrings.linearGradient
import typings.storybookComponents.storybookComponentsStrings.link
import typings.storybookComponents.storybookComponentsStrings.list
import typings.storybookComponents.storybookComponentsStrings.listbox
import typings.storybookComponents.storybookComponentsStrings.location
import typings.storybookComponents.storybookComponentsStrings.main
import typings.storybookComponents.storybookComponentsStrings.map
import typings.storybookComponents.storybookComponentsStrings.mark
import typings.storybookComponents.storybookComponentsStrings.marker
import typings.storybookComponents.storybookComponentsStrings.mask
import typings.storybookComponents.storybookComponentsStrings.menu
import typings.storybookComponents.storybookComponentsStrings.menuitem
import typings.storybookComponents.storybookComponentsStrings.meta
import typings.storybookComponents.storybookComponentsStrings.metadata
import typings.storybookComponents.storybookComponentsStrings.meter
import typings.storybookComponents.storybookComponentsStrings.mixed
import typings.storybookComponents.storybookComponentsStrings.move
import typings.storybookComponents.storybookComponentsStrings.mpath
import typings.storybookComponents.storybookComponentsStrings.nav
import typings.storybookComponents.storybookComponentsStrings.no
import typings.storybookComponents.storybookComponentsStrings.noindex
import typings.storybookComponents.storybookComponentsStrings.none
import typings.storybookComponents.storybookComponentsStrings.noscript
import typings.storybookComponents.storybookComponentsStrings.numeric
import typings.storybookComponents.storybookComponentsStrings.off
import typings.storybookComponents.storybookComponentsStrings.ol
import typings.storybookComponents.storybookComponentsStrings.on
import typings.storybookComponents.storybookComponentsStrings.optgroup
import typings.storybookComponents.storybookComponentsStrings.option
import typings.storybookComponents.storybookComponentsStrings.other
import typings.storybookComponents.storybookComponentsStrings.output
import typings.storybookComponents.storybookComponentsStrings.p
import typings.storybookComponents.storybookComponentsStrings.page
import typings.storybookComponents.storybookComponentsStrings.param
import typings.storybookComponents.storybookComponentsStrings.path
import typings.storybookComponents.storybookComponentsStrings.pattern
import typings.storybookComponents.storybookComponentsStrings.picture
import typings.storybookComponents.storybookComponentsStrings.polite
import typings.storybookComponents.storybookComponentsStrings.polygon
import typings.storybookComponents.storybookComponentsStrings.polyline
import typings.storybookComponents.storybookComponentsStrings.popup
import typings.storybookComponents.storybookComponentsStrings.pre
import typings.storybookComponents.storybookComponentsStrings.progress
import typings.storybookComponents.storybookComponentsStrings.q
import typings.storybookComponents.storybookComponentsStrings.radialGradient
import typings.storybookComponents.storybookComponentsStrings.rect
import typings.storybookComponents.storybookComponentsStrings.removals
import typings.storybookComponents.storybookComponentsStrings.rp
import typings.storybookComponents.storybookComponentsStrings.rt
import typings.storybookComponents.storybookComponentsStrings.ruby
import typings.storybookComponents.storybookComponentsStrings.s
import typings.storybookComponents.storybookComponentsStrings.samp
import typings.storybookComponents.storybookComponentsStrings.script
import typings.storybookComponents.storybookComponentsStrings.search
import typings.storybookComponents.storybookComponentsStrings.section
import typings.storybookComponents.storybookComponentsStrings.select
import typings.storybookComponents.storybookComponentsStrings.size
import typings.storybookComponents.storybookComponentsStrings.slot
import typings.storybookComponents.storybookComponentsStrings.small
import typings.storybookComponents.storybookComponentsStrings.source
import typings.storybookComponents.storybookComponentsStrings.span
import typings.storybookComponents.storybookComponentsStrings.spelling
import typings.storybookComponents.storybookComponentsStrings.step
import typings.storybookComponents.storybookComponentsStrings.stop
import typings.storybookComponents.storybookComponentsStrings.strong
import typings.storybookComponents.storybookComponentsStrings.style
import typings.storybookComponents.storybookComponentsStrings.sub
import typings.storybookComponents.storybookComponentsStrings.summary
import typings.storybookComponents.storybookComponentsStrings.sup
import typings.storybookComponents.storybookComponentsStrings.svg
import typings.storybookComponents.storybookComponentsStrings.switch
import typings.storybookComponents.storybookComponentsStrings.symbol
import typings.storybookComponents.storybookComponentsStrings.table
import typings.storybookComponents.storybookComponentsStrings.tbody
import typings.storybookComponents.storybookComponentsStrings.td
import typings.storybookComponents.storybookComponentsStrings.tel
import typings.storybookComponents.storybookComponentsStrings.template
import typings.storybookComponents.storybookComponentsStrings.text
import typings.storybookComponents.storybookComponentsStrings.textPath
import typings.storybookComponents.storybookComponentsStrings.textarea
import typings.storybookComponents.storybookComponentsStrings.tfoot
import typings.storybookComponents.storybookComponentsStrings.th
import typings.storybookComponents.storybookComponentsStrings.thead
import typings.storybookComponents.storybookComponentsStrings.theme
import typings.storybookComponents.storybookComponentsStrings.time
import typings.storybookComponents.storybookComponentsStrings.title
import typings.storybookComponents.storybookComponentsStrings.tr
import typings.storybookComponents.storybookComponentsStrings.track
import typings.storybookComponents.storybookComponentsStrings.tree
import typings.storybookComponents.storybookComponentsStrings.tspan
import typings.storybookComponents.storybookComponentsStrings.u
import typings.storybookComponents.storybookComponentsStrings.ul
import typings.storybookComponents.storybookComponentsStrings.url
import typings.storybookComponents.storybookComponentsStrings.use
import typings.storybookComponents.storybookComponentsStrings.valid
import typings.storybookComponents.storybookComponentsStrings.vertical
import typings.storybookComponents.storybookComponentsStrings.video
import typings.storybookComponents.storybookComponentsStrings.view
import typings.storybookComponents.storybookComponentsStrings.wbr
import typings.storybookComponents.storybookComponentsStrings.webview
import typings.storybookComponents.storybookComponentsStrings.yes
import typings.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("@storybook/components/dist/form/input/input", "Button")
  @js.native
  val Button: FunctionComponent[js.Any] = js.native
  
  /* Inlined @emotion/styled-base.@emotion/styled-base.StyledComponent<std.Pick<@storybook/components.@storybook/components/dist/form/input/input.InputProps, 'color' | 'content' | 'height' | 'translate' | 'width' | 'default' | 'hidden' | 'key' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'style' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'autoFocus' | 'disabled' | 'form' | 'formAction' | 'formEncType' | 'formMethod' | 'formNoValidate' | 'formTarget' | 'name' | 'type' | 'value' | 'start' | 'cite' | 'data' | 'label' | 'span' | 'summary' | 'pattern' | 'list' | 'step' | 'wrap' | 'href' | 'size' | 'open' | 'multiple' | 'cellPadding' | 'cellSpacing' | 'alt' | 'crossOrigin' | 'sizes' | 'src' | 'srcSet' | 'useMap' | 'reversed' | 'max' | 'media' | 'method' | 'min' | 'target' | 'download' | 'hrefLang' | 'rel' | 'htmlFor' | 'valid' | 'align' | 'accept' | 'acceptCharset' | 'action' | 'allowFullScreen' | 'allowTransparency' | 'as' | 'async' | 'autoComplete' | 'autoPlay' | 'capture' | 'charSet' | 'challenge' | 'checked' | 'classID' | 'cols' | 'colSpan' | 'controls' | 'coords' | 'dateTime' | 'defer' | 'encType' | 'frameBorder' | 'headers' | 'high' | 'httpEquiv' | 'integrity' | 'keyParams' | 'keyType' | 'kind' | 'loop' | 'low' | 'manifest' | 'marginHeight' | 'marginWidth' | 'maxLength' | 'mediaGroup' | 'minLength' | 'muted' | 'nonce' | 'noValidate' | 'optimum' | 'playsInline' | 'poster' | 'preload' | 'readOnly' | 'required' | 'rows' | 'rowSpan' | 'sandbox' | 'scope' | 'scoped' | 'scrolling' | 'seamless' | 'selected' | 'shape' | 'srcDoc' | 'srcLang' | 'wmode'> & react.react.RefAttributes<any>, @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps, @storybook/theming.@storybook/theming.Theme> & {  displayName :string} */
  object Input {
    
    inline def apply(props: PropsWithChildrenPickInpu): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: PropsWithChildrenPickInpu, context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("@storybook/components/dist/form/input/input", "Input")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/components/dist/form/input/input", "Input.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Input.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialPickInputPropscolo] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialPickInputPropscolo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Input.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Input.__emotion_styles")
    @js.native
    def emotionStyles: js.Any = js.native
    
    inline def emotionStyles_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__emotion_styles")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Input.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapPickInpu] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapPickInpu]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    inline def withComponent[Tag /* <: ComponentType[js.Any] */](tag: Tag): StyledComponent[PropsOf[Tag], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[PropsOf[Tag], InputStyleProps, Theme]]
    
    /**
      * @desc this method is type-unsafe
      */
    inline def withComponent_a(tag: a): StyledComponent[
        DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_abbr(tag: abbr): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_address(tag: address): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_animate(tag: animate): StyledComponent[SVGProps[SVGElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGElement], InputStyleProps, Theme]]
    
    inline def withComponent_animateMotion(tag: animateMotion): StyledComponent[SVGProps[SVGElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGElement], InputStyleProps, Theme]]
    
    inline def withComponent_animateTransform(tag: animateTransform): StyledComponent[SVGProps[SVGElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGElement], InputStyleProps, Theme]]
    
    inline def withComponent_area(tag: area): StyledComponent[
        DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_article(tag: article): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_aside(tag: aside): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_audio(tag: audio): StyledComponent[
        DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_b(tag: b): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_base(tag: base): StyledComponent[
        DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_bdi(tag: bdi): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_bdo(tag: bdo): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_big(tag: big): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_blockquote(tag: blockquote): StyledComponent[
        DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_body(tag: body): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_br(tag: br): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_button(tag: button): StyledComponent[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_canvas(tag: canvas): StyledComponent[
        DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_caption(tag: caption): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_circle(tag: circle): StyledComponent[SVGProps[SVGCircleElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGCircleElement], InputStyleProps, Theme]]
    
    inline def withComponent_cite(tag: cite): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_clipPath(tag: clipPath): StyledComponent[SVGProps[SVGClipPathElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGClipPathElement], InputStyleProps, Theme]]
    
    inline def withComponent_code(tag: code): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_col(tag: col): StyledComponent[
        DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_colgroup(tag: colgroup): StyledComponent[
        DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_data(tag: data): StyledComponent[
        DetailedHTMLProps[DataHTMLAttributes[HTMLDataElement], HTMLDataElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[DataHTMLAttributes[HTMLDataElement], HTMLDataElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_datalist(tag: datalist): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_dd(tag: dd): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_defs(tag: defs): StyledComponent[SVGProps[SVGDefsElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGDefsElement], InputStyleProps, Theme]]
    
    inline def withComponent_del(tag: del): StyledComponent[
        DetailedHTMLProps[DelHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[DelHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_desc(tag: desc): StyledComponent[SVGProps[SVGDescElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGDescElement], InputStyleProps, Theme]]
    
    inline def withComponent_details(tag: details): StyledComponent[
        DetailedHTMLProps[DetailsHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[DetailsHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_dfn(tag: dfn): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_dialog(tag: dialog): StyledComponent[
        DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_div(tag: div): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_dl(tag: dl): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_dt(tag: dt): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_ellipse(tag: ellipse): StyledComponent[SVGProps[SVGEllipseElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGEllipseElement], InputStyleProps, Theme]]
    
    inline def withComponent_em(tag: em): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_embed(tag: embed): StyledComponent[
        DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_feBlend(tag: feBlend): StyledComponent[SVGProps[SVGFEBlendElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEBlendElement], InputStyleProps, Theme]]
    
    inline def withComponent_feColorMatrix(tag: feColorMatrix): StyledComponent[SVGProps[SVGFEColorMatrixElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEColorMatrixElement], InputStyleProps, Theme]]
    
    inline def withComponent_feComponentTransfer(tag: feComponentTransfer): StyledComponent[SVGProps[SVGFEComponentTransferElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEComponentTransferElement], InputStyleProps, Theme]]
    
    inline def withComponent_feComposite(tag: feComposite): StyledComponent[SVGProps[SVGFECompositeElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFECompositeElement], InputStyleProps, Theme]]
    
    inline def withComponent_feConvolveMatrix(tag: feConvolveMatrix): StyledComponent[SVGProps[SVGFEConvolveMatrixElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEConvolveMatrixElement], InputStyleProps, Theme]]
    
    inline def withComponent_feDiffuseLighting(tag: feDiffuseLighting): StyledComponent[SVGProps[SVGFEDiffuseLightingElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEDiffuseLightingElement], InputStyleProps, Theme]]
    
    inline def withComponent_feDisplacementMap(tag: feDisplacementMap): StyledComponent[SVGProps[SVGFEDisplacementMapElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEDisplacementMapElement], InputStyleProps, Theme]]
    
    inline def withComponent_feDistantLight(tag: feDistantLight): StyledComponent[SVGProps[SVGFEDistantLightElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEDistantLightElement], InputStyleProps, Theme]]
    
    inline def withComponent_feDropShadow(tag: feDropShadow): StyledComponent[SVGProps[SVGFEDropShadowElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEDropShadowElement], InputStyleProps, Theme]]
    
    inline def withComponent_feFlood(tag: feFlood): StyledComponent[SVGProps[SVGFEFloodElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEFloodElement], InputStyleProps, Theme]]
    
    inline def withComponent_feFuncA(tag: feFuncA): StyledComponent[SVGProps[SVGFEFuncAElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEFuncAElement], InputStyleProps, Theme]]
    
    inline def withComponent_feFuncB(tag: feFuncB): StyledComponent[SVGProps[SVGFEFuncBElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEFuncBElement], InputStyleProps, Theme]]
    
    inline def withComponent_feFuncG(tag: feFuncG): StyledComponent[SVGProps[SVGFEFuncGElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEFuncGElement], InputStyleProps, Theme]]
    
    inline def withComponent_feFuncR(tag: feFuncR): StyledComponent[SVGProps[SVGFEFuncRElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEFuncRElement], InputStyleProps, Theme]]
    
    inline def withComponent_feGaussianBlur(tag: feGaussianBlur): StyledComponent[SVGProps[SVGFEGaussianBlurElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEGaussianBlurElement], InputStyleProps, Theme]]
    
    inline def withComponent_feImage(tag: feImage): StyledComponent[SVGProps[SVGFEImageElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEImageElement], InputStyleProps, Theme]]
    
    inline def withComponent_feMerge(tag: feMerge): StyledComponent[SVGProps[SVGFEMergeElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEMergeElement], InputStyleProps, Theme]]
    
    inline def withComponent_feMergeNode(tag: feMergeNode): StyledComponent[SVGProps[SVGFEMergeNodeElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEMergeNodeElement], InputStyleProps, Theme]]
    
    inline def withComponent_feMorphology(tag: feMorphology): StyledComponent[SVGProps[SVGFEMorphologyElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEMorphologyElement], InputStyleProps, Theme]]
    
    inline def withComponent_feOffset(tag: feOffset): StyledComponent[SVGProps[SVGFEOffsetElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEOffsetElement], InputStyleProps, Theme]]
    
    inline def withComponent_fePointLight(tag: fePointLight): StyledComponent[SVGProps[SVGFEPointLightElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEPointLightElement], InputStyleProps, Theme]]
    
    inline def withComponent_feSpecularLighting(tag: feSpecularLighting): StyledComponent[SVGProps[SVGFESpecularLightingElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFESpecularLightingElement], InputStyleProps, Theme]]
    
    inline def withComponent_feSpotLight(tag: feSpotLight): StyledComponent[SVGProps[SVGFESpotLightElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFESpotLightElement], InputStyleProps, Theme]]
    
    inline def withComponent_feTile(tag: feTile): StyledComponent[SVGProps[SVGFETileElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFETileElement], InputStyleProps, Theme]]
    
    inline def withComponent_feTurbulence(tag: feTurbulence): StyledComponent[SVGProps[SVGFETurbulenceElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFETurbulenceElement], InputStyleProps, Theme]]
    
    inline def withComponent_fieldset(tag: fieldset): StyledComponent[
        DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_figcaption(tag: figcaption): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_figure(tag: figure): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_filter(tag: filter): StyledComponent[SVGProps[SVGFilterElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFilterElement], InputStyleProps, Theme]]
    
    inline def withComponent_footer(tag: footer): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_foreignObject(tag: foreignObject): StyledComponent[SVGProps[SVGForeignObjectElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGForeignObjectElement], InputStyleProps, Theme]]
    
    inline def withComponent_form(tag: form): StyledComponent[
        DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_g(tag: g): StyledComponent[SVGProps[SVGGElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGGElement], InputStyleProps, Theme]]
    
    inline def withComponent_h1(tag: h1): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_h2(tag: h2): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_h3(tag: h3): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_h4(tag: h4): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_h5(tag: h5): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_h6(tag: h6): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_head(tag: head): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_header(tag: header): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_hgroup(tag: hgroup): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_hr(tag: hr): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_html(tag: html): StyledComponent[
        DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_i(tag: i): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_iframe(tag: iframe): StyledComponent[
        DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_image(tag: image): StyledComponent[SVGProps[SVGImageElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGImageElement], InputStyleProps, Theme]]
    
    inline def withComponent_img(tag: img): StyledComponent[
        DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_input(tag: input): StyledComponent[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_ins(tag: ins): StyledComponent[
        DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_kbd(tag: kbd): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_keygen(tag: keygen): StyledComponent[
        DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_label(tag: label): StyledComponent[
        DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_legend(tag: legend): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_li(tag: li): StyledComponent[
        DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_line(tag: line): StyledComponent[SVGProps[SVGLineElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGLineElement], InputStyleProps, Theme]]
    
    inline def withComponent_linearGradient(tag: linearGradient): StyledComponent[SVGProps[SVGLinearGradientElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGLinearGradientElement], InputStyleProps, Theme]]
    
    inline def withComponent_link(tag: link): StyledComponent[
        DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_main(tag: main): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_map(tag: map): StyledComponent[
        DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_mark(tag: mark): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_marker(tag: marker): StyledComponent[SVGProps[SVGMarkerElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGMarkerElement], InputStyleProps, Theme]]
    
    inline def withComponent_mask(tag: mask): StyledComponent[SVGProps[SVGMaskElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGMaskElement], InputStyleProps, Theme]]
    
    inline def withComponent_menu(tag: menu): StyledComponent[
        DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_menuitem(tag: menuitem): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_meta(tag: meta): StyledComponent[
        DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_metadata(tag: metadata): StyledComponent[SVGProps[SVGMetadataElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGMetadataElement], InputStyleProps, Theme]]
    
    inline def withComponent_meter(tag: meter): StyledComponent[
        DetailedHTMLProps[MeterHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[MeterHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_mpath(tag: mpath): StyledComponent[SVGProps[SVGElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGElement], InputStyleProps, Theme]]
    
    inline def withComponent_nav(tag: nav): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_noindex(tag: noindex): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_noscript(tag: noscript): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_object(tag: `object`): StyledComponent[
        DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_ol(tag: ol): StyledComponent[
        DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_optgroup(tag: optgroup): StyledComponent[
        DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_option(tag: option): StyledComponent[
        DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_output(tag: output): StyledComponent[
        DetailedHTMLProps[OutputHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[OutputHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_p(tag: p): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_param(tag: param): StyledComponent[
        DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_path(tag: path): StyledComponent[SVGProps[SVGPathElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGPathElement], InputStyleProps, Theme]]
    
    inline def withComponent_pattern(tag: pattern): StyledComponent[SVGProps[SVGPatternElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGPatternElement], InputStyleProps, Theme]]
    
    inline def withComponent_picture(tag: picture): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_polygon(tag: polygon): StyledComponent[SVGProps[SVGPolygonElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGPolygonElement], InputStyleProps, Theme]]
    
    inline def withComponent_polyline(tag: polyline): StyledComponent[SVGProps[SVGPolylineElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGPolylineElement], InputStyleProps, Theme]]
    
    inline def withComponent_pre(tag: pre): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_progress(tag: progress): StyledComponent[
        DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_q(tag: q): StyledComponent[
        DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_radialGradient(tag: radialGradient): StyledComponent[SVGProps[SVGRadialGradientElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGRadialGradientElement], InputStyleProps, Theme]]
    
    inline def withComponent_rect(tag: rect): StyledComponent[SVGProps[SVGRectElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGRectElement], InputStyleProps, Theme]]
    
    inline def withComponent_rp(tag: rp): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_rt(tag: rt): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_ruby(tag: ruby): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_s(tag: s): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_samp(tag: samp): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_script(tag: script): StyledComponent[
        DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_section(tag: section): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_select(tag: select): StyledComponent[
        DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_slot(tag: slot): StyledComponent[
        DetailedHTMLProps[SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_small(tag: small): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_source(tag: source): StyledComponent[
        DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_span(tag: span): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_stop(tag: stop): StyledComponent[SVGProps[SVGStopElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGStopElement], InputStyleProps, Theme]]
    
    inline def withComponent_strong(tag: strong): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_style(tag: style): StyledComponent[
        DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_sub(tag: sub): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_summary(tag: summary): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_sup(tag: sup): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_svg(tag: svg): StyledComponent[SVGProps[SVGSVGElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGSVGElement], InputStyleProps, Theme]]
    
    inline def withComponent_switch(tag: switch): StyledComponent[SVGProps[SVGSwitchElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGSwitchElement], InputStyleProps, Theme]]
    
    inline def withComponent_symbol(tag: symbol): StyledComponent[SVGProps[SVGSymbolElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGSymbolElement], InputStyleProps, Theme]]
    
    inline def withComponent_table(tag: table): StyledComponent[
        DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_tbody(tag: tbody): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_td(tag: td): StyledComponent[
        DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_template(tag: template): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_text(tag: text): StyledComponent[SVGProps[SVGTextElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGTextElement], InputStyleProps, Theme]]
    
    inline def withComponent_textPath(tag: textPath): StyledComponent[SVGProps[SVGTextPathElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGTextPathElement], InputStyleProps, Theme]]
    
    inline def withComponent_textarea(tag: textarea): StyledComponent[
        DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_tfoot(tag: tfoot): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_th(tag: th): StyledComponent[
        DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_thead(tag: thead): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_time(tag: time): StyledComponent[
        DetailedHTMLProps[TimeHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[TimeHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_title(tag: title): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_tr(tag: tr): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_track(tag: track): StyledComponent[
        DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_tspan(tag: tspan): StyledComponent[SVGProps[SVGTSpanElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGTSpanElement], InputStyleProps, Theme]]
    
    inline def withComponent_u(tag: u): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_ul(tag: ul): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_use(tag: use): StyledComponent[SVGProps[SVGUseElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGUseElement], InputStyleProps, Theme]]
    
    inline def withComponent_var(tag: `var`): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_video(tag: video): StyledComponent[
        DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
        InputStyleProps, 
        Theme
      ]]
    
    inline def withComponent_view(tag: view): StyledComponent[SVGProps[SVGViewElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGViewElement], InputStyleProps, Theme]]
    
    inline def withComponent_wbr(tag: wbr): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme]]
    
    inline def withComponent_webview(tag: webview): StyledComponent[
        DetailedHTMLProps[WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement], 
        InputStyleProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement], 
        InputStyleProps, 
        Theme
      ]]
  }
  
  /* Inlined @emotion/styled-base.@emotion/styled-base.StyledComponent<std.Pick<react.react.SelectHTMLAttributes<std.HTMLSelectElement>, 'color' | 'translate' | 'hidden' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'style' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'autoFocus' | 'disabled' | 'form' | 'name' | 'value' | 'multiple' | 'autoComplete' | 'required'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps & react.react.RefAttributes<any>, @storybook/components.@storybook/components/dist/form/input/input.SelectProps, @storybook/theming.@storybook/theming.Theme> & {  displayName :string} */
  object Select {
    
    inline def apply(props: PropsWithChildrenPickSeleAbout): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: PropsWithChildrenPickSeleAbout, context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("@storybook/components/dist/form/input/input", "Select")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/components/dist/form/input/input", "Select.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Select.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialPickSelectHTMLAttr] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialPickSelectHTMLAttr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Select.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Select.__emotion_styles")
    @js.native
    def emotionStyles: js.Any = js.native
    
    inline def emotionStyles_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__emotion_styles")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Select.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapPickSele] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapPickSele]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    inline def withComponent[Tag /* <: ComponentType[js.Any] */](tag: Tag): StyledComponent[PropsOf[Tag], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[PropsOf[Tag], SelectProps, Theme]]
    
    /**
      * @desc this method is type-unsafe
      */
    inline def withComponent_a(tag: a): StyledComponent[
        DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_abbr(tag: abbr): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_address(tag: address): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_animate(tag: animate): StyledComponent[SVGProps[SVGElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGElement], SelectProps, Theme]]
    
    inline def withComponent_animateMotion(tag: animateMotion): StyledComponent[SVGProps[SVGElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGElement], SelectProps, Theme]]
    
    inline def withComponent_animateTransform(tag: animateTransform): StyledComponent[SVGProps[SVGElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGElement], SelectProps, Theme]]
    
    inline def withComponent_area(tag: area): StyledComponent[
        DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_article(tag: article): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_aside(tag: aside): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_audio(tag: audio): StyledComponent[
        DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_b(tag: b): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_base(tag: base): StyledComponent[
        DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_bdi(tag: bdi): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_bdo(tag: bdo): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_big(tag: big): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_blockquote(tag: blockquote): StyledComponent[
        DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLElement], HTMLElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLElement], HTMLElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_body(tag: body): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_br(tag: br): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement], SelectProps, Theme]]
    
    inline def withComponent_button(tag: button): StyledComponent[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_canvas(tag: canvas): StyledComponent[
        DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_caption(tag: caption): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_circle(tag: circle): StyledComponent[SVGProps[SVGCircleElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGCircleElement], SelectProps, Theme]]
    
    inline def withComponent_cite(tag: cite): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_clipPath(tag: clipPath): StyledComponent[SVGProps[SVGClipPathElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGClipPathElement], SelectProps, Theme]]
    
    inline def withComponent_code(tag: code): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_col(tag: col): StyledComponent[
        DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_colgroup(tag: colgroup): StyledComponent[
        DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_data(tag: data): StyledComponent[
        DetailedHTMLProps[DataHTMLAttributes[HTMLDataElement], HTMLDataElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[DataHTMLAttributes[HTMLDataElement], HTMLDataElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_datalist(tag: datalist): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_dd(tag: dd): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_defs(tag: defs): StyledComponent[SVGProps[SVGDefsElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGDefsElement], SelectProps, Theme]]
    
    inline def withComponent_del(tag: del): StyledComponent[DetailedHTMLProps[DelHTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[DelHTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_desc(tag: desc): StyledComponent[SVGProps[SVGDescElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGDescElement], SelectProps, Theme]]
    
    inline def withComponent_details(tag: details): StyledComponent[
        DetailedHTMLProps[DetailsHTMLAttributes[HTMLElement], HTMLElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[DetailsHTMLAttributes[HTMLElement], HTMLElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_dfn(tag: dfn): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_dialog(tag: dialog): StyledComponent[
        DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_div(tag: div): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_dl(tag: dl): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_dt(tag: dt): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_ellipse(tag: ellipse): StyledComponent[SVGProps[SVGEllipseElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGEllipseElement], SelectProps, Theme]]
    
    inline def withComponent_em(tag: em): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_embed(tag: embed): StyledComponent[
        DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_feBlend(tag: feBlend): StyledComponent[SVGProps[SVGFEBlendElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEBlendElement], SelectProps, Theme]]
    
    inline def withComponent_feColorMatrix(tag: feColorMatrix): StyledComponent[SVGProps[SVGFEColorMatrixElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEColorMatrixElement], SelectProps, Theme]]
    
    inline def withComponent_feComponentTransfer(tag: feComponentTransfer): StyledComponent[SVGProps[SVGFEComponentTransferElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEComponentTransferElement], SelectProps, Theme]]
    
    inline def withComponent_feComposite(tag: feComposite): StyledComponent[SVGProps[SVGFECompositeElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFECompositeElement], SelectProps, Theme]]
    
    inline def withComponent_feConvolveMatrix(tag: feConvolveMatrix): StyledComponent[SVGProps[SVGFEConvolveMatrixElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEConvolveMatrixElement], SelectProps, Theme]]
    
    inline def withComponent_feDiffuseLighting(tag: feDiffuseLighting): StyledComponent[SVGProps[SVGFEDiffuseLightingElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEDiffuseLightingElement], SelectProps, Theme]]
    
    inline def withComponent_feDisplacementMap(tag: feDisplacementMap): StyledComponent[SVGProps[SVGFEDisplacementMapElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEDisplacementMapElement], SelectProps, Theme]]
    
    inline def withComponent_feDistantLight(tag: feDistantLight): StyledComponent[SVGProps[SVGFEDistantLightElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEDistantLightElement], SelectProps, Theme]]
    
    inline def withComponent_feDropShadow(tag: feDropShadow): StyledComponent[SVGProps[SVGFEDropShadowElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEDropShadowElement], SelectProps, Theme]]
    
    inline def withComponent_feFlood(tag: feFlood): StyledComponent[SVGProps[SVGFEFloodElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEFloodElement], SelectProps, Theme]]
    
    inline def withComponent_feFuncA(tag: feFuncA): StyledComponent[SVGProps[SVGFEFuncAElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEFuncAElement], SelectProps, Theme]]
    
    inline def withComponent_feFuncB(tag: feFuncB): StyledComponent[SVGProps[SVGFEFuncBElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEFuncBElement], SelectProps, Theme]]
    
    inline def withComponent_feFuncG(tag: feFuncG): StyledComponent[SVGProps[SVGFEFuncGElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEFuncGElement], SelectProps, Theme]]
    
    inline def withComponent_feFuncR(tag: feFuncR): StyledComponent[SVGProps[SVGFEFuncRElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEFuncRElement], SelectProps, Theme]]
    
    inline def withComponent_feGaussianBlur(tag: feGaussianBlur): StyledComponent[SVGProps[SVGFEGaussianBlurElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEGaussianBlurElement], SelectProps, Theme]]
    
    inline def withComponent_feImage(tag: feImage): StyledComponent[SVGProps[SVGFEImageElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEImageElement], SelectProps, Theme]]
    
    inline def withComponent_feMerge(tag: feMerge): StyledComponent[SVGProps[SVGFEMergeElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEMergeElement], SelectProps, Theme]]
    
    inline def withComponent_feMergeNode(tag: feMergeNode): StyledComponent[SVGProps[SVGFEMergeNodeElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEMergeNodeElement], SelectProps, Theme]]
    
    inline def withComponent_feMorphology(tag: feMorphology): StyledComponent[SVGProps[SVGFEMorphologyElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEMorphologyElement], SelectProps, Theme]]
    
    inline def withComponent_feOffset(tag: feOffset): StyledComponent[SVGProps[SVGFEOffsetElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEOffsetElement], SelectProps, Theme]]
    
    inline def withComponent_fePointLight(tag: fePointLight): StyledComponent[SVGProps[SVGFEPointLightElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEPointLightElement], SelectProps, Theme]]
    
    inline def withComponent_feSpecularLighting(tag: feSpecularLighting): StyledComponent[SVGProps[SVGFESpecularLightingElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFESpecularLightingElement], SelectProps, Theme]]
    
    inline def withComponent_feSpotLight(tag: feSpotLight): StyledComponent[SVGProps[SVGFESpotLightElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFESpotLightElement], SelectProps, Theme]]
    
    inline def withComponent_feTile(tag: feTile): StyledComponent[SVGProps[SVGFETileElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFETileElement], SelectProps, Theme]]
    
    inline def withComponent_feTurbulence(tag: feTurbulence): StyledComponent[SVGProps[SVGFETurbulenceElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFETurbulenceElement], SelectProps, Theme]]
    
    inline def withComponent_fieldset(tag: fieldset): StyledComponent[
        DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_figcaption(tag: figcaption): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_figure(tag: figure): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_filter(tag: filter): StyledComponent[SVGProps[SVGFilterElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFilterElement], SelectProps, Theme]]
    
    inline def withComponent_footer(tag: footer): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_foreignObject(tag: foreignObject): StyledComponent[SVGProps[SVGForeignObjectElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGForeignObjectElement], SelectProps, Theme]]
    
    inline def withComponent_form(tag: form): StyledComponent[
        DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_g(tag: g): StyledComponent[SVGProps[SVGGElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGGElement], SelectProps, Theme]]
    
    inline def withComponent_h1(tag: h1): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_h2(tag: h2): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_h3(tag: h3): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_h4(tag: h4): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_h5(tag: h5): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_h6(tag: h6): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_head(tag: head): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_header(tag: header): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_hgroup(tag: hgroup): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_hr(tag: hr): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement], SelectProps, Theme]]
    
    inline def withComponent_html(tag: html): StyledComponent[
        DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_i(tag: i): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_iframe(tag: iframe): StyledComponent[
        DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_image(tag: image): StyledComponent[SVGProps[SVGImageElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGImageElement], SelectProps, Theme]]
    
    inline def withComponent_img(tag: img): StyledComponent[
        DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_input(tag: input): StyledComponent[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_ins(tag: ins): StyledComponent[
        DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_kbd(tag: kbd): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_keygen(tag: keygen): StyledComponent[
        DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_label(tag: label): StyledComponent[
        DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_legend(tag: legend): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_li(tag: li): StyledComponent[
        DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_line(tag: line): StyledComponent[SVGProps[SVGLineElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGLineElement], SelectProps, Theme]]
    
    inline def withComponent_linearGradient(tag: linearGradient): StyledComponent[SVGProps[SVGLinearGradientElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGLinearGradientElement], SelectProps, Theme]]
    
    inline def withComponent_link(tag: link): StyledComponent[
        DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_main(tag: main): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_map(tag: map): StyledComponent[
        DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_mark(tag: mark): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_marker(tag: marker): StyledComponent[SVGProps[SVGMarkerElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGMarkerElement], SelectProps, Theme]]
    
    inline def withComponent_mask(tag: mask): StyledComponent[SVGProps[SVGMaskElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGMaskElement], SelectProps, Theme]]
    
    inline def withComponent_menu(tag: menu): StyledComponent[DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_menuitem(tag: menuitem): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_meta(tag: meta): StyledComponent[
        DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_metadata(tag: metadata): StyledComponent[SVGProps[SVGMetadataElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGMetadataElement], SelectProps, Theme]]
    
    inline def withComponent_meter(tag: meter): StyledComponent[DetailedHTMLProps[MeterHTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[MeterHTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_mpath(tag: mpath): StyledComponent[SVGProps[SVGElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGElement], SelectProps, Theme]]
    
    inline def withComponent_nav(tag: nav): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_noindex(tag: noindex): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_noscript(tag: noscript): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_object(tag: `object`): StyledComponent[
        DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_ol(tag: ol): StyledComponent[
        DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_optgroup(tag: optgroup): StyledComponent[
        DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_option(tag: option): StyledComponent[
        DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_output(tag: output): StyledComponent[
        DetailedHTMLProps[OutputHTMLAttributes[HTMLElement], HTMLElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[OutputHTMLAttributes[HTMLElement], HTMLElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_p(tag: p): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_param(tag: param): StyledComponent[
        DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_path(tag: path): StyledComponent[SVGProps[SVGPathElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGPathElement], SelectProps, Theme]]
    
    inline def withComponent_pattern(tag: pattern): StyledComponent[SVGProps[SVGPatternElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGPatternElement], SelectProps, Theme]]
    
    inline def withComponent_picture(tag: picture): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_polygon(tag: polygon): StyledComponent[SVGProps[SVGPolygonElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGPolygonElement], SelectProps, Theme]]
    
    inline def withComponent_polyline(tag: polyline): StyledComponent[SVGProps[SVGPolylineElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGPolylineElement], SelectProps, Theme]]
    
    inline def withComponent_pre(tag: pre): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_progress(tag: progress): StyledComponent[
        DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_q(tag: q): StyledComponent[
        DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_radialGradient(tag: radialGradient): StyledComponent[SVGProps[SVGRadialGradientElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGRadialGradientElement], SelectProps, Theme]]
    
    inline def withComponent_rect(tag: rect): StyledComponent[SVGProps[SVGRectElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGRectElement], SelectProps, Theme]]
    
    inline def withComponent_rp(tag: rp): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_rt(tag: rt): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_ruby(tag: ruby): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_s(tag: s): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_samp(tag: samp): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_script(tag: script): StyledComponent[
        DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_section(tag: section): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_select(tag: select): StyledComponent[
        DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_slot(tag: slot): StyledComponent[
        DetailedHTMLProps[SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_small(tag: small): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_source(tag: source): StyledComponent[
        DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_span(tag: span): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_stop(tag: stop): StyledComponent[SVGProps[SVGStopElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGStopElement], SelectProps, Theme]]
    
    inline def withComponent_strong(tag: strong): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_style(tag: style): StyledComponent[
        DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_sub(tag: sub): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_summary(tag: summary): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_sup(tag: sup): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_svg(tag: svg): StyledComponent[SVGProps[SVGSVGElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGSVGElement], SelectProps, Theme]]
    
    inline def withComponent_switch(tag: switch): StyledComponent[SVGProps[SVGSwitchElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGSwitchElement], SelectProps, Theme]]
    
    inline def withComponent_symbol(tag: symbol): StyledComponent[SVGProps[SVGSymbolElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGSymbolElement], SelectProps, Theme]]
    
    inline def withComponent_table(tag: table): StyledComponent[
        DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_tbody(tag: tbody): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_td(tag: td): StyledComponent[
        DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_template(tag: template): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_text(tag: text): StyledComponent[SVGProps[SVGTextElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGTextElement], SelectProps, Theme]]
    
    inline def withComponent_textPath(tag: textPath): StyledComponent[SVGProps[SVGTextPathElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGTextPathElement], SelectProps, Theme]]
    
    inline def withComponent_textarea(tag: textarea): StyledComponent[
        DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_tfoot(tag: tfoot): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_th(tag: th): StyledComponent[
        DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_thead(tag: thead): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_time(tag: time): StyledComponent[DetailedHTMLProps[TimeHTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[TimeHTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_title(tag: title): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_tr(tag: tr): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_track(tag: track): StyledComponent[
        DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_tspan(tag: tspan): StyledComponent[SVGProps[SVGTSpanElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGTSpanElement], SelectProps, Theme]]
    
    inline def withComponent_u(tag: u): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_ul(tag: ul): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_use(tag: use): StyledComponent[SVGProps[SVGUseElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGUseElement], SelectProps, Theme]]
    
    inline def withComponent_var(tag: `var`): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_video(tag: video): StyledComponent[
        DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
        SelectProps, 
        Theme
      ]]
    
    inline def withComponent_view(tag: view): StyledComponent[SVGProps[SVGViewElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGViewElement], SelectProps, Theme]]
    
    inline def withComponent_wbr(tag: wbr): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme]]
    
    inline def withComponent_webview(tag: webview): StyledComponent[
        DetailedHTMLProps[WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement], 
        SelectProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement], 
        SelectProps, 
        Theme
      ]]
  }
  
  /* Inlined @emotion/styled-base.@emotion/styled-base.StyledComponent<std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextareaAutosizeProps * / any, 'color' | 'translate' | 'hidden' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'style' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'autoFocus' | 'disabled' | 'form' | 'name' | 'value' | 'wrap' | 'autoComplete' | 'cols' | 'maxLength' | 'minLength' | 'readOnly' | 'required' | 'rows' | 'dirName' | 'maxRows' | 'minRows' | 'onHeightChange' | 'cacheMeasurements'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps & react.react.RefAttributes<any>, @storybook/components.@storybook/components/dist/form/input/input.TextareaProps, @storybook/theming.@storybook/theming.Theme> & {  displayName :string} */
  object Textarea {
    
    inline def apply(
      props: PropsWithChildren[PickanycolortranslatehiddAbout & (Omit[TextareaProps, theme]) & `0`[Theme]]
    ): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(
      props: PropsWithChildren[PickanycolortranslatehiddAbout & (Omit[TextareaProps, theme]) & `0`[Theme]],
      context: js.Any
    ): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("@storybook/components/dist/form/input/input", "Textarea")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[
        Partial[PickanycolortranslatehiddAbout & (Omit[TextareaProps, theme]) & `0`[Theme]]
      ] = js.native
    inline def defaultProps_=(
      x: js.UndefOr[
          Partial[PickanycolortranslatehiddAbout & (Omit[TextareaProps, theme]) & `0`[Theme]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.__emotion_styles")
    @js.native
    def emotionStyles: js.Any = js.native
    
    inline def emotionStyles_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__emotion_styles")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.propTypes")
    @js.native
    def propTypes: js.UndefOr[
        WeakValidationMap[PickanycolortranslatehiddAbout & (Omit[TextareaProps, theme]) & `0`[Theme]]
      ] = js.native
    inline def propTypes_=(
      x: js.UndefOr[
          WeakValidationMap[PickanycolortranslatehiddAbout & (Omit[TextareaProps, theme]) & `0`[Theme]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    inline def withComponent[Tag /* <: ComponentType[js.Any] */](tag: Tag): StyledComponent[PropsOf[Tag], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[PropsOf[Tag], TextareaProps, Theme]]
    
    /**
      * @desc this method is type-unsafe
      */
    inline def withComponent_a(tag: a): StyledComponent[
        DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_abbr(tag: abbr): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_address(tag: address): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_animate(tag: animate): StyledComponent[SVGProps[SVGElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGElement], TextareaProps, Theme]]
    
    inline def withComponent_animateMotion(tag: animateMotion): StyledComponent[SVGProps[SVGElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGElement], TextareaProps, Theme]]
    
    inline def withComponent_animateTransform(tag: animateTransform): StyledComponent[SVGProps[SVGElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGElement], TextareaProps, Theme]]
    
    inline def withComponent_area(tag: area): StyledComponent[
        DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_article(tag: article): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_aside(tag: aside): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_audio(tag: audio): StyledComponent[
        DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_b(tag: b): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_base(tag: base): StyledComponent[
        DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_bdi(tag: bdi): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_bdo(tag: bdo): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_big(tag: big): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_blockquote(tag: blockquote): StyledComponent[
        DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_body(tag: body): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_br(tag: br): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_button(tag: button): StyledComponent[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_canvas(tag: canvas): StyledComponent[
        DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_caption(tag: caption): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_circle(tag: circle): StyledComponent[SVGProps[SVGCircleElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGCircleElement], TextareaProps, Theme]]
    
    inline def withComponent_cite(tag: cite): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_clipPath(tag: clipPath): StyledComponent[SVGProps[SVGClipPathElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGClipPathElement], TextareaProps, Theme]]
    
    inline def withComponent_code(tag: code): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_col(tag: col): StyledComponent[
        DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_colgroup(tag: colgroup): StyledComponent[
        DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_data(tag: data): StyledComponent[
        DetailedHTMLProps[DataHTMLAttributes[HTMLDataElement], HTMLDataElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[DataHTMLAttributes[HTMLDataElement], HTMLDataElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_datalist(tag: datalist): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_dd(tag: dd): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_defs(tag: defs): StyledComponent[SVGProps[SVGDefsElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGDefsElement], TextareaProps, Theme]]
    
    inline def withComponent_del(tag: del): StyledComponent[DetailedHTMLProps[DelHTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[DelHTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_desc(tag: desc): StyledComponent[SVGProps[SVGDescElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGDescElement], TextareaProps, Theme]]
    
    inline def withComponent_details(tag: details): StyledComponent[
        DetailedHTMLProps[DetailsHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[DetailsHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_dfn(tag: dfn): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_dialog(tag: dialog): StyledComponent[
        DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_div(tag: div): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_dl(tag: dl): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_dt(tag: dt): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_ellipse(tag: ellipse): StyledComponent[SVGProps[SVGEllipseElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGEllipseElement], TextareaProps, Theme]]
    
    inline def withComponent_em(tag: em): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_embed(tag: embed): StyledComponent[
        DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_feBlend(tag: feBlend): StyledComponent[SVGProps[SVGFEBlendElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEBlendElement], TextareaProps, Theme]]
    
    inline def withComponent_feColorMatrix(tag: feColorMatrix): StyledComponent[SVGProps[SVGFEColorMatrixElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEColorMatrixElement], TextareaProps, Theme]]
    
    inline def withComponent_feComponentTransfer(tag: feComponentTransfer): StyledComponent[SVGProps[SVGFEComponentTransferElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEComponentTransferElement], TextareaProps, Theme]]
    
    inline def withComponent_feComposite(tag: feComposite): StyledComponent[SVGProps[SVGFECompositeElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFECompositeElement], TextareaProps, Theme]]
    
    inline def withComponent_feConvolveMatrix(tag: feConvolveMatrix): StyledComponent[SVGProps[SVGFEConvolveMatrixElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEConvolveMatrixElement], TextareaProps, Theme]]
    
    inline def withComponent_feDiffuseLighting(tag: feDiffuseLighting): StyledComponent[SVGProps[SVGFEDiffuseLightingElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEDiffuseLightingElement], TextareaProps, Theme]]
    
    inline def withComponent_feDisplacementMap(tag: feDisplacementMap): StyledComponent[SVGProps[SVGFEDisplacementMapElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEDisplacementMapElement], TextareaProps, Theme]]
    
    inline def withComponent_feDistantLight(tag: feDistantLight): StyledComponent[SVGProps[SVGFEDistantLightElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEDistantLightElement], TextareaProps, Theme]]
    
    inline def withComponent_feDropShadow(tag: feDropShadow): StyledComponent[SVGProps[SVGFEDropShadowElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEDropShadowElement], TextareaProps, Theme]]
    
    inline def withComponent_feFlood(tag: feFlood): StyledComponent[SVGProps[SVGFEFloodElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEFloodElement], TextareaProps, Theme]]
    
    inline def withComponent_feFuncA(tag: feFuncA): StyledComponent[SVGProps[SVGFEFuncAElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEFuncAElement], TextareaProps, Theme]]
    
    inline def withComponent_feFuncB(tag: feFuncB): StyledComponent[SVGProps[SVGFEFuncBElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEFuncBElement], TextareaProps, Theme]]
    
    inline def withComponent_feFuncG(tag: feFuncG): StyledComponent[SVGProps[SVGFEFuncGElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEFuncGElement], TextareaProps, Theme]]
    
    inline def withComponent_feFuncR(tag: feFuncR): StyledComponent[SVGProps[SVGFEFuncRElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEFuncRElement], TextareaProps, Theme]]
    
    inline def withComponent_feGaussianBlur(tag: feGaussianBlur): StyledComponent[SVGProps[SVGFEGaussianBlurElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEGaussianBlurElement], TextareaProps, Theme]]
    
    inline def withComponent_feImage(tag: feImage): StyledComponent[SVGProps[SVGFEImageElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEImageElement], TextareaProps, Theme]]
    
    inline def withComponent_feMerge(tag: feMerge): StyledComponent[SVGProps[SVGFEMergeElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEMergeElement], TextareaProps, Theme]]
    
    inline def withComponent_feMergeNode(tag: feMergeNode): StyledComponent[SVGProps[SVGFEMergeNodeElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEMergeNodeElement], TextareaProps, Theme]]
    
    inline def withComponent_feMorphology(tag: feMorphology): StyledComponent[SVGProps[SVGFEMorphologyElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEMorphologyElement], TextareaProps, Theme]]
    
    inline def withComponent_feOffset(tag: feOffset): StyledComponent[SVGProps[SVGFEOffsetElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEOffsetElement], TextareaProps, Theme]]
    
    inline def withComponent_fePointLight(tag: fePointLight): StyledComponent[SVGProps[SVGFEPointLightElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFEPointLightElement], TextareaProps, Theme]]
    
    inline def withComponent_feSpecularLighting(tag: feSpecularLighting): StyledComponent[SVGProps[SVGFESpecularLightingElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFESpecularLightingElement], TextareaProps, Theme]]
    
    inline def withComponent_feSpotLight(tag: feSpotLight): StyledComponent[SVGProps[SVGFESpotLightElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFESpotLightElement], TextareaProps, Theme]]
    
    inline def withComponent_feTile(tag: feTile): StyledComponent[SVGProps[SVGFETileElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFETileElement], TextareaProps, Theme]]
    
    inline def withComponent_feTurbulence(tag: feTurbulence): StyledComponent[SVGProps[SVGFETurbulenceElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFETurbulenceElement], TextareaProps, Theme]]
    
    inline def withComponent_fieldset(tag: fieldset): StyledComponent[
        DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_figcaption(tag: figcaption): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_figure(tag: figure): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_filter(tag: filter): StyledComponent[SVGProps[SVGFilterElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGFilterElement], TextareaProps, Theme]]
    
    inline def withComponent_footer(tag: footer): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_foreignObject(tag: foreignObject): StyledComponent[SVGProps[SVGForeignObjectElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGForeignObjectElement], TextareaProps, Theme]]
    
    inline def withComponent_form(tag: form): StyledComponent[
        DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_g(tag: g): StyledComponent[SVGProps[SVGGElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGGElement], TextareaProps, Theme]]
    
    inline def withComponent_h1(tag: h1): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_h2(tag: h2): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_h3(tag: h3): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_h4(tag: h4): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_h5(tag: h5): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_h6(tag: h6): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_head(tag: head): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_header(tag: header): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_hgroup(tag: hgroup): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_hr(tag: hr): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_html(tag: html): StyledComponent[
        DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_i(tag: i): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_iframe(tag: iframe): StyledComponent[
        DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_image(tag: image): StyledComponent[SVGProps[SVGImageElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGImageElement], TextareaProps, Theme]]
    
    inline def withComponent_img(tag: img): StyledComponent[
        DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_input(tag: input): StyledComponent[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_ins(tag: ins): StyledComponent[
        DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_kbd(tag: kbd): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_keygen(tag: keygen): StyledComponent[
        DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_label(tag: label): StyledComponent[
        DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_legend(tag: legend): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_li(tag: li): StyledComponent[
        DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_line(tag: line): StyledComponent[SVGProps[SVGLineElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGLineElement], TextareaProps, Theme]]
    
    inline def withComponent_linearGradient(tag: linearGradient): StyledComponent[SVGProps[SVGLinearGradientElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGLinearGradientElement], TextareaProps, Theme]]
    
    inline def withComponent_link(tag: link): StyledComponent[
        DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_main(tag: main): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_map(tag: map): StyledComponent[
        DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_mark(tag: mark): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_marker(tag: marker): StyledComponent[SVGProps[SVGMarkerElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGMarkerElement], TextareaProps, Theme]]
    
    inline def withComponent_mask(tag: mask): StyledComponent[SVGProps[SVGMaskElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGMaskElement], TextareaProps, Theme]]
    
    inline def withComponent_menu(tag: menu): StyledComponent[
        DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_menuitem(tag: menuitem): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_meta(tag: meta): StyledComponent[
        DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_metadata(tag: metadata): StyledComponent[SVGProps[SVGMetadataElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGMetadataElement], TextareaProps, Theme]]
    
    inline def withComponent_meter(tag: meter): StyledComponent[
        DetailedHTMLProps[MeterHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[MeterHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_mpath(tag: mpath): StyledComponent[SVGProps[SVGElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGElement], TextareaProps, Theme]]
    
    inline def withComponent_nav(tag: nav): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_noindex(tag: noindex): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_noscript(tag: noscript): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_object(tag: `object`): StyledComponent[
        DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_ol(tag: ol): StyledComponent[
        DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_optgroup(tag: optgroup): StyledComponent[
        DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_option(tag: option): StyledComponent[
        DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_output(tag: output): StyledComponent[
        DetailedHTMLProps[OutputHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[OutputHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_p(tag: p): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_param(tag: param): StyledComponent[
        DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_path(tag: path): StyledComponent[SVGProps[SVGPathElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGPathElement], TextareaProps, Theme]]
    
    inline def withComponent_pattern(tag: pattern): StyledComponent[SVGProps[SVGPatternElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGPatternElement], TextareaProps, Theme]]
    
    inline def withComponent_picture(tag: picture): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_polygon(tag: polygon): StyledComponent[SVGProps[SVGPolygonElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGPolygonElement], TextareaProps, Theme]]
    
    inline def withComponent_polyline(tag: polyline): StyledComponent[SVGProps[SVGPolylineElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGPolylineElement], TextareaProps, Theme]]
    
    inline def withComponent_pre(tag: pre): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_progress(tag: progress): StyledComponent[
        DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_q(tag: q): StyledComponent[
        DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_radialGradient(tag: radialGradient): StyledComponent[SVGProps[SVGRadialGradientElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGRadialGradientElement], TextareaProps, Theme]]
    
    inline def withComponent_rect(tag: rect): StyledComponent[SVGProps[SVGRectElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGRectElement], TextareaProps, Theme]]
    
    inline def withComponent_rp(tag: rp): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_rt(tag: rt): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_ruby(tag: ruby): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_s(tag: s): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_samp(tag: samp): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_script(tag: script): StyledComponent[
        DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_section(tag: section): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_select(tag: select): StyledComponent[
        DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_slot(tag: slot): StyledComponent[
        DetailedHTMLProps[SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_small(tag: small): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_source(tag: source): StyledComponent[
        DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_span(tag: span): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_stop(tag: stop): StyledComponent[SVGProps[SVGStopElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGStopElement], TextareaProps, Theme]]
    
    inline def withComponent_strong(tag: strong): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_style(tag: style): StyledComponent[
        DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_sub(tag: sub): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_summary(tag: summary): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_sup(tag: sup): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_svg(tag: svg): StyledComponent[SVGProps[SVGSVGElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGSVGElement], TextareaProps, Theme]]
    
    inline def withComponent_switch(tag: switch): StyledComponent[SVGProps[SVGSwitchElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGSwitchElement], TextareaProps, Theme]]
    
    inline def withComponent_symbol(tag: symbol): StyledComponent[SVGProps[SVGSymbolElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGSymbolElement], TextareaProps, Theme]]
    
    inline def withComponent_table(tag: table): StyledComponent[
        DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_tbody(tag: tbody): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_td(tag: td): StyledComponent[
        DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_template(tag: template): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_text(tag: text): StyledComponent[SVGProps[SVGTextElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGTextElement], TextareaProps, Theme]]
    
    inline def withComponent_textPath(tag: textPath): StyledComponent[SVGProps[SVGTextPathElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGTextPathElement], TextareaProps, Theme]]
    
    inline def withComponent_textarea(tag: textarea): StyledComponent[
        DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_tfoot(tag: tfoot): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_th(tag: th): StyledComponent[
        DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_thead(tag: thead): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_time(tag: time): StyledComponent[
        DetailedHTMLProps[TimeHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[TimeHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_title(tag: title): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_tr(tag: tr): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_track(tag: track): StyledComponent[
        DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_tspan(tag: tspan): StyledComponent[SVGProps[SVGTSpanElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGTSpanElement], TextareaProps, Theme]]
    
    inline def withComponent_u(tag: u): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_ul(tag: ul): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_use(tag: use): StyledComponent[SVGProps[SVGUseElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGUseElement], TextareaProps, Theme]]
    
    inline def withComponent_var(tag: `var`): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_video(tag: video): StyledComponent[
        DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
        TextareaProps, 
        Theme
      ]]
    
    inline def withComponent_view(tag: view): StyledComponent[SVGProps[SVGViewElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[SVGProps[SVGViewElement], TextareaProps, Theme]]
    
    inline def withComponent_wbr(tag: wbr): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme]]
    
    inline def withComponent_webview(tag: webview): StyledComponent[
        DetailedHTMLProps[WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement], 
        TextareaProps, 
        Theme
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[
        DetailedHTMLProps[WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement], 
        TextareaProps, 
        Theme
      ]]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookComponents.storybookComponentsStrings.end
    - typings.storybookComponents.storybookComponentsStrings.center
    - typings.storybookComponents.storybookComponentsStrings.start
  */
  trait Alignments extends StObject
  object Alignments {
    
    inline def center: typings.storybookComponents.storybookComponentsStrings.center = "center".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.center]
    
    inline def end: typings.storybookComponents.storybookComponentsStrings.end = "end".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.end]
    
    inline def start: typings.storybookComponents.storybookComponentsStrings.start = "start".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.start]
  }
  
  /* Inlined std.Omit<react.react.HTMLProps<std.HTMLInputElement>, keyof @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps */
  trait InputProps extends StObject {
    
    var default: js.UndefOr[Boolean] = js.undefined
    
    var about: js.UndefOr[String] = js.undefined
    
    var accept: js.UndefOr[String] = js.undefined
    
    var acceptCharset: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    var action: js.UndefOr[String] = js.undefined
    
    var align: js.UndefOr[Alignments] = js.undefined
    
    var allowFullScreen: js.UndefOr[Boolean] = js.undefined
    
    var allowTransparency: js.UndefOr[Boolean] = js.undefined
    
    var alt: js.UndefOr[String] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
    
    var `aria-busy`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    var `aria-modal`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var as: js.UndefOr[String] = js.undefined
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoPlay: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var capture: js.UndefOr[Boolean | String] = js.undefined
    
    var cellPadding: js.UndefOr[Double | String] = js.undefined
    
    var cellSpacing: js.UndefOr[Double | String] = js.undefined
    
    var challenge: js.UndefOr[String] = js.undefined
    
    var charSet: js.UndefOr[String] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var cite: js.UndefOr[String] = js.undefined
    
    var classID: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var controls: js.UndefOr[Boolean] = js.undefined
    
    var coords: js.UndefOr[String] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var data: js.UndefOr[String] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var dateTime: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var defer: js.UndefOr[Boolean] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var download: js.UndefOr[js.Any] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var encType: js.UndefOr[String] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    var formAction: js.UndefOr[String] = js.undefined
    
    var formEncType: js.UndefOr[String] = js.undefined
    
    var formMethod: js.UndefOr[String] = js.undefined
    
    var formNoValidate: js.UndefOr[Boolean] = js.undefined
    
    var formTarget: js.UndefOr[String] = js.undefined
    
    var frameBorder: js.UndefOr[Double | String] = js.undefined
    
    var headers: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var high: js.UndefOr[Double] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var hrefLang: js.UndefOr[String] = js.undefined
    
    var htmlFor: js.UndefOr[String] = js.undefined
    
    var httpEquiv: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[js.Any] = js.undefined
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var keyParams: js.UndefOr[String] = js.undefined
    
    var keyType: js.UndefOr[String] = js.undefined
    
    var kind: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var list: js.UndefOr[String] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var low: js.UndefOr[Double] = js.undefined
    
    var manifest: js.UndefOr[String] = js.undefined
    
    var marginHeight: js.UndefOr[Double] = js.undefined
    
    var marginWidth: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double | String] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var media: js.UndefOr[String] = js.undefined
    
    var mediaGroup: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var min: js.UndefOr[Double | String] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var noValidate: js.UndefOr[Boolean] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var optimum: js.UndefOr[Double] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var playsInline: js.UndefOr[Boolean] = js.undefined
    
    var poster: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var preload: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[HTMLInputElement]] = js.undefined
    
    var rel: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var reversed: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var sandbox: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var scoped: js.UndefOr[Boolean] = js.undefined
    
    var scrolling: js.UndefOr[String] = js.undefined
    
    var seamless: js.UndefOr[Boolean] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var shape: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Sizes] = js.undefined
    
    var sizes: js.UndefOr[String] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var span: js.UndefOr[Double] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var srcDoc: js.UndefOr[String] = js.undefined
    
    var srcLang: js.UndefOr[String] = js.undefined
    
    var srcSet: js.UndefOr[String] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
    
    var step: js.UndefOr[Double | String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var summary: js.UndefOr[String] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var useMap: js.UndefOr[String] = js.undefined
    
    var valid: js.UndefOr[ValidationStates] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
    
    var wmode: js.UndefOr[String] = js.undefined
    
    var wrap: js.UndefOr[String] = js.undefined
  }
  object InputProps {
    
    inline def apply(): InputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputProps]
    }
    
    extension [Self <: InputProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
      
      inline def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setAlign(value: Alignments): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
      
      inline def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
      
      inline def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
      
      inline def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setCapture(value: Boolean | String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
      
      inline def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
      
      inline def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
      
      inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
      
      inline def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
      
      inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
      
      inline def setClassID(value: String): Self = StObject.set(x, "classID", value.asInstanceOf[js.Any])
      
      inline def setClassIDUndefined: Self = StObject.set(x, "classID", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
      
      inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDownload(value: js.Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
      
      inline def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
      
      inline def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
      
      inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
      
      inline def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      inline def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
      
      inline def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyParams(value: String): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
      
      inline def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
      
      inline def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
      
      inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      inline def setMarginHeight(value: Double): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
      
      inline def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
      
      inline def setMarginWidth(value: Double): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
      
      inline def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
      
      inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
      
      inline def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
      
      inline def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOnAbort(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: UIEvent[HTMLInputElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOptimum(value: Double): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
      
      inline def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
      
      inline def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
      
      inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRef(value: LegacyRef[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
      
      inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
      
      inline def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      inline def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
      
      inline def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: Sizes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcDoc(value: String): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
      
      inline def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
      
      inline def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
      
      inline def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
      
      inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
      
      inline def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
      
      inline def setValid(value: ValidationStates): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
      
      inline def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
      
      inline def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait InputStyleProps extends StObject {
    
    var align: js.UndefOr[Alignments] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Sizes] = js.undefined
    
    var valid: js.UndefOr[ValidationStates] = js.undefined
  }
  object InputStyleProps {
    
    inline def apply(): InputStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputStyleProps]
    }
    
    extension [Self <: InputStyleProps](x: Self) {
      
      inline def setAlign(value: Alignments): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSize(value: Sizes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValid(value: ValidationStates): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
  
  /* Inlined std.Omit<react.react.SelectHTMLAttributes<std.HTMLSelectElement>, keyof @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps */
  trait SelectProps extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    var align: js.UndefOr[Alignments] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
    
    var `aria-busy`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    var `aria-modal`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[js.Any] = js.undefined
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLSelectElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLSelectElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLSelectElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLSelectElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLSelectElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLSelectElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLSelectElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLSelectElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLSelectElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLSelectElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLSelectElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLSelectElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLSelectElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLSelectElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLSelectElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLSelectElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLSelectElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLSelectElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLSelectElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLSelectElement]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Sizes] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var valid: js.UndefOr[ValidationStates] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
  }
  object SelectProps {
    
    inline def apply(): SelectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectProps]
    }
    
    extension [Self <: SelectProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAlign(value: Alignments): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnAbort(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[HTMLSelectElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: UIEvent[HTMLSelectElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSize(value: Sizes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setValid(value: ValidationStates): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookComponents.storybookComponentsStrings.`100Percentsign`
    - typings.storybookComponents.storybookComponentsStrings.flex
    - typings.storybookComponents.storybookComponentsStrings.auto
  */
  trait Sizes extends StObject
  object Sizes {
    
    inline def `100Percentsign`: typings.storybookComponents.storybookComponentsStrings.`100Percentsign` = "100%".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.`100Percentsign`]
    
    inline def auto: typings.storybookComponents.storybookComponentsStrings.auto = "auto".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.auto]
    
    inline def flex: typings.storybookComponents.storybookComponentsStrings.flex = "flex".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.flex]
  }
  
  type TextareaProps = (typings.std.Omit[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextareaAutosizeProps */ js.Any, 
    size | align | valid | height
  ]) & InputStyleProps
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookComponents.storybookComponentsStrings.valid
    - typings.storybookComponents.storybookComponentsStrings.error
    - typings.storybookComponents.storybookComponentsStrings.warn
  */
  trait ValidationStates extends StObject
  object ValidationStates {
    
    inline def error: typings.storybookComponents.storybookComponentsStrings.error = "error".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.error]
    
    inline def valid: typings.storybookComponents.storybookComponentsStrings.valid = "valid".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.valid]
    
    inline def warn: typings.storybookComponents.storybookComponentsStrings.warn = "warn".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.warn]
  }
}
