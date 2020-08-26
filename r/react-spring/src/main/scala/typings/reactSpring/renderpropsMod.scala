package typings.reactSpring

import typings.react.mod.Component
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactType
import typings.reactSpring.reactSpringStrings.after
import typings.reactSpring.reactSpringStrings.children
import typings.reactSpring.reactSpringStrings.config
import typings.reactSpring.reactSpringStrings.delay
import typings.reactSpring.reactSpringStrings.enter
import typings.reactSpring.reactSpringStrings.force
import typings.reactSpring.reactSpringStrings.from
import typings.reactSpring.reactSpringStrings.immediate
import typings.reactSpring.reactSpringStrings.initial
import typings.reactSpring.reactSpringStrings.inject
import typings.reactSpring.reactSpringStrings.items
import typings.reactSpring.reactSpringStrings.keys
import typings.reactSpring.reactSpringStrings.leave
import typings.reactSpring.reactSpringStrings.native
import typings.reactSpring.reactSpringStrings.onDestroyed
import typings.reactSpring.reactSpringStrings.onFrame
import typings.reactSpring.reactSpringStrings.onRest
import typings.reactSpring.reactSpringStrings.onStart
import typings.reactSpring.reactSpringStrings.reset
import typings.reactSpring.reactSpringStrings.reverse
import typings.reactSpring.reactSpringStrings.to
import typings.reactSpring.reactSpringStrings.trail
import typings.reactSpring.reactSpringStrings.unique
import typings.reactSpring.reactSpringStrings.update
import typings.reactSpring.renderpropsUniversalMod.SpringConfig
import typings.reactSpring.renderpropsUniversalMod.SpringProps
import typings.reactSpring.renderpropsUniversalMod.TrailProps
import typings.reactSpring.renderpropsUniversalMod.TransitionProps
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spring/renderprops", JSImport.Namespace)
@js.native
object renderpropsMod extends js.Object {
  @js.native
  class Keyframes[S /* <: js.Object */, DS /* <: js.Object */] ()
    extends typings.reactSpring.renderpropsUniversalMod.Keyframes[S, DS]
  
  @js.native
  class Spring[DS /* <: js.Object */] ()
    extends Component[SpringProps[DS], js.Object, js.Any]
  
  @js.native
  class Trail[TItem, DS /* <: js.Object */] ()
    extends Component[TrailProps[TItem, DS], js.Object, js.Any]
  
  @js.native
  class Transition[TItem, TInit /* <: js.Object */, TFrom /* <: js.Object */, TEnter /* <: js.Object */, TLeave /* <: js.Object */, TUpdate /* <: js.Object */] ()
    extends Component[
          TransitionProps[TItem, TInit, TFrom, TEnter, TLeave, TUpdate, js.Object, js.Object], 
          js.Object, 
          js.Any
        ]
  
  def interpolate(parent: js.Array[Double], config: js.Function1[/* repeated */ Double, _]): js.Any = js.native
  /* static members */
  @js.native
  object Keyframes extends js.Object {
    def Spring[S /* <: js.Object */, DS /* <: js.Object */](states: js.Object): js.Function1[
        /* props */ js.Object, 
        typings.reactSpring.renderpropsUniversalMod.Keyframes[
          S | (Pick[
            SpringProps[DS], 
            Exclude[
              /* keyof react-spring.react-spring/renderprops-universal.SpringProps<DS> */ from | to | onRest | onFrame | children | inject | after | force | config | native | reset | immediate | delay | reverse | onStart, 
              to
            ]
          ]), 
          DS
        ]
      ] = js.native
    def Trail[S /* <: js.Object */, DS /* <: js.Object */](states: js.Object): js.Function1[
        /* props */ js.Object, 
        typings.reactSpring.renderpropsUniversalMod.Keyframes[
          S | (Pick[
            TrailProps[DS, js.Object], 
            Exclude[
              /* keyof react-spring.react-spring/renderprops-universal.TrailProps<DS, {}> */ from | to | items | keys | children | onRest | onFrame | inject | after | force | config | native | reset | immediate | delay | reverse | onStart, 
              to
            ]
          ]), 
          DS
        ]
      ] = js.native
    def Transition[S /* <: js.Object */, DS /* <: js.Object */](states: js.Object): js.Function1[
        /* props */ js.Object, 
        typings.reactSpring.renderpropsUniversalMod.Keyframes[
          S | (Pick[
            TransitionProps[S, DS, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object], 
            Exclude[
              /* keyof react-spring.react-spring/renderprops-universal.TransitionProps<DS, {}, {}, {}, {}, {}, {}, {}> */ config | initial | from | enter | leave | onRest | update | keys | items | children | onDestroyed | reset | trail | unique | native | reverse | onStart | immediate | delay, 
              to
            ]
          ]), 
          DS
        ]
      ] = js.native
    def create[S /* <: js.Object */, DS /* <: js.Object */](primitive: ComponentType[js.Object]): js.Function1[
        /* states */ js.Object, 
        js.Function1[
          /* props */ js.Object, 
          typings.reactSpring.renderpropsUniversalMod.Keyframes[S, DS]
        ]
      ] = js.native
  }
  
  @js.native
  object animated extends js.Object {
    var a: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.a]] = js.native
    var abbr: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.abbr]] = js.native
    var address: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.address]] = js.native
    var animate: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.animate]] = js.native
    var animateMotion: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.animateMotion]] = js.native
    var animateTransform: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.animateTransform]] = js.native
    var area: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.area]] = js.native
    var article: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.article]] = js.native
    var aside: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.aside]] = js.native
    var audio: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.audio]] = js.native
    var b: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.b]] = js.native
    var base: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.base]] = js.native
    var bdi: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.bdi]] = js.native
    var bdo: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.bdo]] = js.native
    var big: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.big]] = js.native
    var blockquote: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.blockquote]] = js.native
    var body: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.body]] = js.native
    var br: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.br]] = js.native
    var button: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.button]] = js.native
    var canvas: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.canvas]] = js.native
    var caption: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.caption]] = js.native
    var circle: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.circle]] = js.native
    var cite: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.cite]] = js.native
    var clipPath: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.clipPath]] = js.native
    var code: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.code]] = js.native
    var col: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.col]] = js.native
    var colgroup: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.colgroup]] = js.native
    var data: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.data]] = js.native
    var datalist: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.datalist]] = js.native
    var dd: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.dd]] = js.native
    var defs: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.defs]] = js.native
    var del: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.del]] = js.native
    var desc: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.desc]] = js.native
    var details: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.details]] = js.native
    var dfn: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.dfn]] = js.native
    var dialog: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.dialog]] = js.native
    var div: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.div]] = js.native
    var dl: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.dl]] = js.native
    var dt: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.dt]] = js.native
    var ellipse: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.ellipse]] = js.native
    var em: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.em]] = js.native
    var embed: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.embed]] = js.native
    var feBlend: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feBlend]] = js.native
    var feColorMatrix: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feColorMatrix]] = js.native
    var feComponentTransfer: ForwardRefExoticComponent[
        ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feComponentTransfer]
      ] = js.native
    var feComposite: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feComposite]] = js.native
    var feConvolveMatrix: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feConvolveMatrix]] = js.native
    var feDiffuseLighting: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feDiffuseLighting]] = js.native
    var feDisplacementMap: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feDisplacementMap]] = js.native
    var feDistantLight: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feDistantLight]] = js.native
    var feDropShadow: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feDropShadow]] = js.native
    var feFlood: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feFlood]] = js.native
    var feFuncA: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feFuncA]] = js.native
    var feFuncB: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feFuncB]] = js.native
    var feFuncG: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feFuncG]] = js.native
    var feFuncR: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feFuncR]] = js.native
    var feGaussianBlur: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feGaussianBlur]] = js.native
    var feImage: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feImage]] = js.native
    var feMerge: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feMerge]] = js.native
    var feMergeNode: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feMergeNode]] = js.native
    var feMorphology: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feMorphology]] = js.native
    var feOffset: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feOffset]] = js.native
    var fePointLight: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.fePointLight]] = js.native
    var feSpecularLighting: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feSpecularLighting]] = js.native
    var feSpotLight: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feSpotLight]] = js.native
    var feTile: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feTile]] = js.native
    var feTurbulence: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.feTurbulence]] = js.native
    var fieldset: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.fieldset]] = js.native
    var figcaption: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.figcaption]] = js.native
    var figure: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.figure]] = js.native
    var filter: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.filter]] = js.native
    var footer: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.footer]] = js.native
    var foreignObject: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.foreignObject]] = js.native
    var form: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.form]] = js.native
    var g: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.g]] = js.native
    var h1: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.h1]] = js.native
    var h2: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.h2]] = js.native
    var h3: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.h3]] = js.native
    var h4: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.h4]] = js.native
    var h5: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.h5]] = js.native
    var h6: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.h6]] = js.native
    var head: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.head]] = js.native
    var header: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.header]] = js.native
    var hgroup: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.hgroup]] = js.native
    var hr: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.hr]] = js.native
    var html: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.html]] = js.native
    var i: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.i]] = js.native
    var iframe: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.iframe]] = js.native
    var image: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.image]] = js.native
    var img: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.img]] = js.native
    var input: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.input]] = js.native
    var ins: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.ins]] = js.native
    var kbd: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.kbd]] = js.native
    var keygen: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.keygen]] = js.native
    var label: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.label]] = js.native
    var legend: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.legend]] = js.native
    var li: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.li]] = js.native
    var line: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.line]] = js.native
    var linearGradient: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.linearGradient]] = js.native
    var link: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.link]] = js.native
    var main: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.main]] = js.native
    var map: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.map]] = js.native
    var mark: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.mark]] = js.native
    var marker: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.marker]] = js.native
    var mask: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.mask]] = js.native
    var menu: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.menu]] = js.native
    var menuitem: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.menuitem]] = js.native
    var meta: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.meta]] = js.native
    var metadata: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.metadata]] = js.native
    var meter: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.meter]] = js.native
    var mpath: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.mpath]] = js.native
    var nav: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.nav]] = js.native
    var noindex: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.noindex]] = js.native
    var noscript: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.noscript]] = js.native
    var `object`: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.`object`]] = js.native
    var ol: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.ol]] = js.native
    var optgroup: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.optgroup]] = js.native
    var option: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.option]] = js.native
    var output: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.output]] = js.native
    var p: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.p]] = js.native
    var param: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.param]] = js.native
    var path: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.path]] = js.native
    var pattern: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.pattern]] = js.native
    var picture: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.picture]] = js.native
    var polygon: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.polygon]] = js.native
    var polyline: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.polyline]] = js.native
    var pre: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.pre]] = js.native
    var progress: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.progress]] = js.native
    var q: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.q]] = js.native
    var radialGradient: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.radialGradient]] = js.native
    var rect: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.rect]] = js.native
    var rp: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.rp]] = js.native
    var rt: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.rt]] = js.native
    var ruby: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.ruby]] = js.native
    var s: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.s]] = js.native
    var samp: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.samp]] = js.native
    var script: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.script]] = js.native
    var section: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.section]] = js.native
    var select: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.select]] = js.native
    var slot: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.slot]] = js.native
    var small: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.small]] = js.native
    var source: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.source]] = js.native
    var span: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.span]] = js.native
    var stop: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.stop]] = js.native
    var strong: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.strong]] = js.native
    var style: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.style]] = js.native
    var sub: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.sub]] = js.native
    var summary: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.summary]] = js.native
    var sup: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.sup]] = js.native
    var svg: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.svg]] = js.native
    var switch: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.switch]] = js.native
    var symbol: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.symbol]] = js.native
    var table: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.table]] = js.native
    var tbody: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.tbody]] = js.native
    var td: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.td]] = js.native
    var template: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.template]] = js.native
    var text: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.text]] = js.native
    var textPath: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.textPath]] = js.native
    var textarea: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.textarea]] = js.native
    var tfoot: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.tfoot]] = js.native
    var th: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.th]] = js.native
    var thead: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.thead]] = js.native
    var time: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.time]] = js.native
    var title: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.title]] = js.native
    var tr: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.tr]] = js.native
    var track: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.track]] = js.native
    var tspan: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.tspan]] = js.native
    var u: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.u]] = js.native
    var ul: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.ul]] = js.native
    var use: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.use]] = js.native
    var `var`: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.`var`]] = js.native
    var video: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.video]] = js.native
    var view: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.view]] = js.native
    var wbr: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.wbr]] = js.native
    var webview: ForwardRefExoticComponent[ComponentPropsWithRef[typings.reactSpring.reactSpringStrings.webview]] = js.native
    def apply[T /* <: ReactType[_] */](comp: T): ForwardRefExoticComponent[ComponentPropsWithRef[T]] = js.native
  }
  
  @js.native
  object config extends js.Object {
    /** default: { tension: 170, friction: 26 } */
    var default: SpringConfig = js.native
    /** gentle: { tension: 120, friction: 14 } */
    var gentle: SpringConfig = js.native
    /** molasses: { tension: 280, friction: 120 } */
    var molasses: SpringConfig = js.native
    /** slow: { tension: 280, friction: 60 } */
    var slow: SpringConfig = js.native
    /** stiff: { tension: 210, friction: 20 } */
    var stiff: SpringConfig = js.native
    /** wobbly: { tension: 180, friction: 12 } */
    var wobbly: SpringConfig = js.native
  }
  
}

