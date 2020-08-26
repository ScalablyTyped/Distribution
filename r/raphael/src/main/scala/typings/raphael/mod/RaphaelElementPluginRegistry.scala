package typings.raphael.mod

import typings.raphael.anon.PartialRaphaelAttributes
import typings.raphael.anon.PartialRaphaelGlowSetting
import typings.raphael.raphaelStrings.SVG
import typings.raphael.raphaelStrings.VML
import typings.raphael.raphaelStrings.`arrow-end`
import typings.raphael.raphaelStrings.`clip-rect`
import typings.raphael.raphaelStrings.`fill-opacity`
import typings.raphael.raphaelStrings.`font-family`
import typings.raphael.raphaelStrings.`font-size`
import typings.raphael.raphaelStrings.`font-weight`
import typings.raphael.raphaelStrings.`stroke-dasharray`
import typings.raphael.raphaelStrings.`stroke-linecap`
import typings.raphael.raphaelStrings.`stroke-linejoin`
import typings.raphael.raphaelStrings.`stroke-miterlimit`
import typings.raphael.raphaelStrings.`stroke-opacity`
import typings.raphael.raphaelStrings.`stroke-width`
import typings.raphael.raphaelStrings.`text-anchor`
import typings.raphael.raphaelStrings.cursor
import typings.raphael.raphaelStrings.cx
import typings.raphael.raphaelStrings.cy
import typings.raphael.raphaelStrings.fill
import typings.raphael.raphaelStrings.font
import typings.raphael.raphaelStrings.height
import typings.raphael.raphaelStrings.href
import typings.raphael.raphaelStrings.opacity
import typings.raphael.raphaelStrings.path
import typings.raphael.raphaelStrings.r_
import typings.raphael.raphaelStrings.rx
import typings.raphael.raphaelStrings.ry
import typings.raphael.raphaelStrings.src
import typings.raphael.raphaelStrings.stroke
import typings.raphael.raphaelStrings.target
import typings.raphael.raphaelStrings.text
import typings.raphael.raphaelStrings.title
import typings.raphael.raphaelStrings.transform
import typings.raphael.raphaelStrings.width
import typings.raphael.raphaelStrings.x
import typings.raphael.raphaelStrings.y
import typings.std.MouseEvent
import typings.std.Parameters
import typings.std.ReturnType
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in keyof raphael.raphael.RaphaelElement<TTechnology, raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology]> ]: raphael.raphael.RaphaelElement<TTechnology, raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology]>[P] extends (args : any): any? raphael.raphael.RaphaelElementPluginMethod<TTechnology, std.Parameters<raphael.raphael.RaphaelElement<TTechnology, raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology]>[P]>, std.ReturnType<raphael.raphael.RaphaelElement<TTechnology, raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology]>[P]>> : never} */
@js.native
trait RaphaelElementPluginRegistry[TTechnology /* <: RaphaelTechnology */] extends js.Object {
  var animate: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function4[
        /* targetAttributes */ PartialRaphaelAttributes, 
        /* durationMilliseconds */ Double, 
        /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
        /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[this.type]], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function4[
        /* targetAttributes */ PartialRaphaelAttributes, 
        /* durationMilliseconds */ Double, 
        /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
        /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[this.type]], 
        this.type
      ]
    ]
  ] = js.native
  var animateWith: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function6[
        /* otherElement */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        /* otherAnimation */ RaphaelAnimation, 
        /* targetAttributes */ PartialRaphaelAttributes, 
        /* durationMilliseconds */ Double, 
        /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
        /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[this.type]], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function6[
        /* otherElement */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        /* otherAnimation */ RaphaelAnimation, 
        /* targetAttributes */ PartialRaphaelAttributes, 
        /* durationMilliseconds */ Double, 
        /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
        /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[this.type]], 
        this.type
      ]
    ]
  ] = js.native
  var attr: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function2[
        /* attributeName */ `arrow-end` | `clip-rect` | cursor | cx | cy | fill | `fill-opacity` | font | `font-family` | `font-size` | `font-weight` | height | href | opacity | path | r_ | rx | ry | src | stroke | `stroke-dasharray` | `stroke-linecap` | `stroke-linejoin` | `stroke-miterlimit` | `stroke-opacity` | `stroke-width` | target | text | `text-anchor` | title | transform | width | x | y, 
        /* attributeValue */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelAttributes['arrow-end' | 'clip-rect' | 'cursor' | 'cx' | 'cy' | 'fill' | 'fill-opacity' | 'font' | 'font-family' | 'font-size' | 'font-weight' | 'height' | 'href' | 'opacity' | 'path' | 'r' | 'rx' | 'ry' | 'src' | 'stroke' | 'stroke-dasharray' | 'stroke-linecap' | 'stroke-linejoin' | 'stroke-miterlimit' | 'stroke-opacity' | 'stroke-width' | 'target' | 'text' | 'text-anchor' | 'title' | 'transform' | 'width' | 'x' | 'y'] */ js.Any
        ], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function2[
        /* attributeName */ `arrow-end` | `clip-rect` | cursor | cx | cy | fill | `fill-opacity` | font | `font-family` | `font-size` | `font-weight` | height | href | opacity | path | r_ | rx | ry | src | stroke | `stroke-dasharray` | `stroke-linecap` | `stroke-linejoin` | `stroke-miterlimit` | `stroke-opacity` | `stroke-width` | target | text | `text-anchor` | title | transform | width | x | y, 
        /* attributeValue */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelAttributes['arrow-end' | 'clip-rect' | 'cursor' | 'cx' | 'cy' | 'fill' | 'fill-opacity' | 'font' | 'font-family' | 'font-size' | 'font-weight' | 'height' | 'href' | 'opacity' | 'path' | 'r' | 'rx' | 'ry' | 'src' | 'stroke' | 'stroke-dasharray' | 'stroke-linecap' | 'stroke-linejoin' | 'stroke-miterlimit' | 'stroke-opacity' | 'stroke-width' | 'target' | 'text' | 'text-anchor' | 'title' | 'transform' | 'width' | 'x' | 'y'] */ js.Any
        ], 
        this.type
      ]
    ]
  ] = js.native
  var click: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  @JSName("clone")
  var clone_FRaphaelElementPluginRegistry: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var data: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function1[/* key */ String, _]], 
    ReturnType[js.Function1[/* key */ String, _]]
  ] = js.native
  var dblclick: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var drag: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function6[
        /* onMoveHandler */ RaphaelDragOnMoveHandler[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* onStartHandler */ RaphaelDragOnStartHandler[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* onEndHandler */ RaphaelDragOnEndHandler[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* moveThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* startThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* endThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function6[
        /* onMoveHandler */ RaphaelDragOnMoveHandler[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* onStartHandler */ RaphaelDragOnStartHandler[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* onEndHandler */ RaphaelDragOnEndHandler[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* moveThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* startThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* endThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        this.type
      ]
    ]
  ] = js.native
  var getBBox: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
    ], 
    ReturnType[
      js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
    ]
  ] = js.native
  var glow: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
    ], 
    ReturnType[
      js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
    ]
  ] = js.native
  var hide: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var hover: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function4[
        /* onHoverInHandler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        /* onHoverOutHandler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        /* hoverInThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* hoverOutThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function4[
        /* onHoverInHandler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        /* onHoverOutHandler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        /* hoverInThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        /* hoverOutThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, this.type]], 
        this.type
      ]
    ]
  ] = js.native
  var id: RaphaelElementPluginMethod[TTechnology, Parameters[Double], ReturnType[Double]] = js.native
  var insertAfter: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* element */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* element */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        this.type
      ]
    ]
  ] = js.native
  var insertBefore: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* element */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* element */ RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ], 
        this.type
      ]
    ]
  ] = js.native
  var matrix: RaphaelElementPluginMethod[TTechnology, Parameters[RaphaelMatrix], ReturnType[RaphaelMatrix]] = js.native
  var mousedown: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var mousemove: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var mouseout: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var mouseover: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var mouseup: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var next: js.UndefOr[
    RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        (RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ]) | Null
      ], 
      ReturnType[
        (RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ]) | Null
      ]
    ]
  ] = js.native
  var node: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ], 
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ]
  ] = js.native
  var onDragOver: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* onDragOverHandler */ RaphaelDragOnOverHandler[TTechnology, RaphaelUnwrapElement[TTechnology, this.type]], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* onDragOverHandler */ RaphaelDragOnOverHandler[TTechnology, RaphaelUnwrapElement[TTechnology, this.type]], 
        this.type
      ]
    ]
  ] = js.native
  var paper: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[RaphaelPaper[TTechnology]], 
    ReturnType[RaphaelPaper[TTechnology]]
  ] = js.native
  var pause: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], this.type]], 
    ReturnType[js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], this.type]]
  ] = js.native
  var prev: js.UndefOr[
    RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        (RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ]) | Null
      ], 
      ReturnType[
        (RaphaelElement[
          TTechnology, 
          /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
        ]) | Null
      ]
    ]
  ] = js.native
  var raphael: js.UndefOr[
    RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.UndefOr[RaphaelStatic[SVG | VML]]], 
      ReturnType[js.UndefOr[RaphaelStatic[SVG | VML]]]
    ]
  ] = js.native
  var remove: RaphaelElementPluginMethod[TTechnology, Parameters[js.Function0[Unit]], ReturnType[js.Function0[Unit]]] = js.native
  var removeData: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function1[/* key */ js.UndefOr[String], this.type]], 
    ReturnType[js.Function1[/* key */ js.UndefOr[String], this.type]]
  ] = js.native
  var resume: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], this.type]], 
    ReturnType[js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], this.type]]
  ] = js.native
  var rotate: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function3[/* degrees */ Double, /* centerX */ Double, /* centerY */ Double, this.type]
    ], 
    ReturnType[
      js.Function3[/* degrees */ Double, /* centerX */ Double, /* centerY */ Double, this.type]
    ]
  ] = js.native
  var scale: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function4[
        /* scaleFactorX */ Double, 
        /* scaleFactorY */ Double, 
        /* centerX */ Double, 
        /* centerY */ Double, 
        this.type
      ]
    ], 
    ReturnType[
      js.Function4[
        /* scaleFactorX */ Double, 
        /* scaleFactorY */ Double, 
        /* centerX */ Double, 
        /* centerY */ Double, 
        this.type
      ]
    ]
  ] = js.native
  var setTime: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function2[/* animation */ RaphaelAnimation, /* value */ Double, this.type]], 
    ReturnType[js.Function2[/* animation */ RaphaelAnimation, /* value */ Double, this.type]]
  ] = js.native
  var show: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var status: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function0[js.Array[RaphaelAnimationStatus]]], 
    ReturnType[js.Function0[js.Array[RaphaelAnimationStatus]]]
  ] = js.native
  var stop: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function1[/* animation */ js.UndefOr[RaphaelAnimation], this.type]], 
    ReturnType[js.Function1[/* animation */ js.UndefOr[RaphaelAnimation], this.type]]
  ] = js.native
  var toBack: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var toFront: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var touchcancel: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ]
  ] = js.native
  var touchend: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ]
  ] = js.native
  var touchmove: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ]
  ] = js.native
  var touchstart: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ]
  ] = js.native
  var transform: RaphaelElementPluginMethod[TTechnology, Parameters[js.Function0[String]], ReturnType[js.Function0[String]]] = js.native
  var translate: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function2[/* deltaX */ Double, /* deltaY */ Double, this.type]], 
    ReturnType[js.Function2[/* deltaX */ Double, /* deltaY */ Double, this.type]]
  ] = js.native
  var `type`: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[RaphaelShapeType | String], 
    ReturnType[RaphaelShapeType | String]
  ] = js.native
  var unclick: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var undblclick: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var undrag: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[js.Function0[this.type]], 
    ReturnType[js.Function0[this.type]]
  ] = js.native
  var unhover: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function2[
        /* onHoverInHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
        /* onHoverOutHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function2[
        /* onHoverInHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
        /* onHoverOutHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var unmousedown: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var unmousemove: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var unmouseout: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var unmouseover: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var unmouseup: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], MouseEvent], 
        this.type
      ]
    ]
  ] = js.native
  var untouchcancel: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ]
  ] = js.native
  var untouchend: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ]
  ] = js.native
  var untouchmove: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ]
  ] = js.native
  var untouchstart: RaphaelElementPluginMethod[
    TTechnology, 
    Parameters[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ], 
    ReturnType[
      js.Function1[
        /* handler */ RaphaelBasicEventHandler[RaphaelUnwrapElement[TTechnology, this.type], TouchEvent], 
        this.type
      ]
    ]
  ] = js.native
}

object RaphaelElementPluginRegistry {
  @scala.inline
  def apply[/* <: typings.raphael.mod.RaphaelTechnology */ TTechnology](
    animate: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function4[
          /* targetAttributes */ PartialRaphaelAttributes, 
          /* durationMilliseconds */ Double, 
          /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
          /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelElementPluginRegistry[TTechnology]]], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function4[
          /* targetAttributes */ PartialRaphaelAttributes, 
          /* durationMilliseconds */ Double, 
          /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
          /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelElementPluginRegistry[TTechnology]]], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    animateWith: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function6[
          /* otherElement */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          /* otherAnimation */ RaphaelAnimation, 
          /* targetAttributes */ PartialRaphaelAttributes, 
          /* durationMilliseconds */ Double, 
          /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
          /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelElementPluginRegistry[TTechnology]]], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function6[
          /* otherElement */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          /* otherAnimation */ RaphaelAnimation, 
          /* targetAttributes */ PartialRaphaelAttributes, 
          /* durationMilliseconds */ Double, 
          /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
          /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelElementPluginRegistry[TTechnology]]], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    attr: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function2[
          /* attributeName */ `arrow-end` | `clip-rect` | cursor | cx | cy | fill | `fill-opacity` | font | `font-family` | `font-size` | `font-weight` | height | href | opacity | path | r_ | rx | ry | src | stroke | `stroke-dasharray` | `stroke-linecap` | `stroke-linejoin` | `stroke-miterlimit` | `stroke-opacity` | `stroke-width` | target | text | `text-anchor` | title | transform | width | x | y, 
          /* attributeValue */ js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelAttributes['arrow-end' | 'clip-rect' | 'cursor' | 'cx' | 'cy' | 'fill' | 'fill-opacity' | 'font' | 'font-family' | 'font-size' | 'font-weight' | 'height' | 'href' | 'opacity' | 'path' | 'r' | 'rx' | 'ry' | 'src' | 'stroke' | 'stroke-dasharray' | 'stroke-linecap' | 'stroke-linejoin' | 'stroke-miterlimit' | 'stroke-opacity' | 'stroke-width' | 'target' | 'text' | 'text-anchor' | 'title' | 'transform' | 'width' | 'x' | 'y'] */ js.Any
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function2[
          /* attributeName */ `arrow-end` | `clip-rect` | cursor | cx | cy | fill | `fill-opacity` | font | `font-family` | `font-size` | `font-weight` | height | href | opacity | path | r_ | rx | ry | src | stroke | `stroke-dasharray` | `stroke-linecap` | `stroke-linejoin` | `stroke-miterlimit` | `stroke-opacity` | `stroke-width` | target | text | `text-anchor` | title | transform | width | x | y, 
          /* attributeValue */ js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelAttributes['arrow-end' | 'clip-rect' | 'cursor' | 'cx' | 'cy' | 'fill' | 'fill-opacity' | 'font' | 'font-family' | 'font-size' | 'font-weight' | 'height' | 'href' | 'opacity' | 'path' | 'r' | 'rx' | 'ry' | 'src' | 'stroke' | 'stroke-dasharray' | 'stroke-linecap' | 'stroke-linejoin' | 'stroke-miterlimit' | 'stroke-opacity' | 'stroke-width' | 'target' | 'text' | 'text-anchor' | 'title' | 'transform' | 'width' | 'x' | 'y'] */ js.Any
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    click: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    clone: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
    ],
    data: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.Function1[/* key */ String, _]], 
      ReturnType[js.Function1[/* key */ String, _]]
    ],
    dblclick: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    drag: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function6[
          /* onMoveHandler */ RaphaelDragOnMoveHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* onStartHandler */ RaphaelDragOnStartHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* onEndHandler */ RaphaelDragOnEndHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* moveThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* startThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* endThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function6[
          /* onMoveHandler */ RaphaelDragOnMoveHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* onStartHandler */ RaphaelDragOnStartHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* onEndHandler */ RaphaelDragOnEndHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* moveThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* startThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* endThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    getBBox: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
      ], 
      ReturnType[
        js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
      ]
    ],
    glow: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
      ], 
      ReturnType[
        js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
      ]
    ],
    hide: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
    ],
    hover: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function4[
          /* onHoverInHandler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          /* onHoverOutHandler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          /* hoverInThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* hoverOutThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function4[
          /* onHoverInHandler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          /* onHoverOutHandler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          /* hoverInThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          /* hoverOutThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    id: RaphaelElementPluginMethod[TTechnology, Parameters[Double], ReturnType[Double]],
    insertAfter: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* element */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* element */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    insertBefore: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* element */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* element */ RaphaelElement[
            TTechnology, 
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    matrix: RaphaelElementPluginMethod[TTechnology, Parameters[RaphaelMatrix], ReturnType[RaphaelMatrix]],
    mousedown: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    mousemove: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    mouseout: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    mouseover: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    mouseup: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    node: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
      ], 
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
      ]
    ],
    onDragOver: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* onDragOverHandler */ RaphaelDragOnOverHandler[
            TTechnology, 
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* onDragOverHandler */ RaphaelDragOnOverHandler[
            TTechnology, 
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    paper: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[RaphaelPaper[TTechnology]], 
      ReturnType[RaphaelPaper[TTechnology]]
    ],
    pause: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelElementPluginRegistry[TTechnology]]
      ], 
      ReturnType[
        js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelElementPluginRegistry[TTechnology]]
      ]
    ],
    remove: RaphaelElementPluginMethod[TTechnology, Parameters[js.Function0[Unit]], ReturnType[js.Function0[Unit]]],
    removeData: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[/* key */ js.UndefOr[String], RaphaelElementPluginRegistry[TTechnology]]
      ], 
      ReturnType[
        js.Function1[/* key */ js.UndefOr[String], RaphaelElementPluginRegistry[TTechnology]]
      ]
    ],
    resume: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelElementPluginRegistry[TTechnology]]
      ], 
      ReturnType[
        js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelElementPluginRegistry[TTechnology]]
      ]
    ],
    rotate: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function3[
          /* degrees */ Double, 
          /* centerX */ Double, 
          /* centerY */ Double, 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function3[
          /* degrees */ Double, 
          /* centerX */ Double, 
          /* centerY */ Double, 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    scale: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function4[
          /* scaleFactorX */ Double, 
          /* scaleFactorY */ Double, 
          /* centerX */ Double, 
          /* centerY */ Double, 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function4[
          /* scaleFactorX */ Double, 
          /* scaleFactorY */ Double, 
          /* centerX */ Double, 
          /* centerY */ Double, 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    setTime: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function2[
          /* animation */ RaphaelAnimation, 
          /* value */ Double, 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function2[
          /* animation */ RaphaelAnimation, 
          /* value */ Double, 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    show: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
    ],
    status: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.Function0[js.Array[RaphaelAnimationStatus]]], 
      ReturnType[js.Function0[js.Array[RaphaelAnimationStatus]]]
    ],
    stop: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* animation */ js.UndefOr[RaphaelAnimation], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* animation */ js.UndefOr[RaphaelAnimation], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    toBack: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
    ],
    toFront: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
    ],
    touchcancel: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    touchend: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    touchmove: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    touchstart: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    transform: RaphaelElementPluginMethod[TTechnology, Parameters[js.Function0[String]], ReturnType[js.Function0[String]]],
    translate: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function2[/* deltaX */ Double, /* deltaY */ Double, RaphaelElementPluginRegistry[TTechnology]]
      ], 
      ReturnType[
        js.Function2[/* deltaX */ Double, /* deltaY */ Double, RaphaelElementPluginRegistry[TTechnology]]
      ]
    ],
    `type`: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[RaphaelShapeType | String], 
      ReturnType[RaphaelShapeType | String]
    ],
    unclick: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    undblclick: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    undrag: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
      ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
    ],
    unhover: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function2[
          /* onHoverInHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
          /* onHoverOutHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function2[
          /* onHoverInHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
          /* onHoverOutHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    unmousedown: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    unmousemove: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    unmouseout: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    unmouseover: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    unmouseup: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            MouseEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    untouchcancel: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    untouchend: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    untouchmove: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ],
    untouchstart: RaphaelElementPluginMethod[
      TTechnology, 
      Parameters[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ], 
      ReturnType[
        js.Function1[
          /* handler */ RaphaelBasicEventHandler[
            RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
            TouchEvent
          ], 
          RaphaelElementPluginRegistry[TTechnology]
        ]
      ]
    ]
  ): RaphaelElementPluginRegistry[TTechnology] = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], animateWith = animateWith.asInstanceOf[js.Any], attr = attr.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], clone = clone.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], getBBox = getBBox.asInstanceOf[js.Any], glow = glow.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insertAfter = insertAfter.asInstanceOf[js.Any], insertBefore = insertBefore.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], onDragOver = onDragOver.asInstanceOf[js.Any], paper = paper.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeData = removeData.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], setTime = setTime.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], toBack = toBack.asInstanceOf[js.Any], toFront = toFront.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any], unclick = unclick.asInstanceOf[js.Any], undblclick = undblclick.asInstanceOf[js.Any], undrag = undrag.asInstanceOf[js.Any], unhover = unhover.asInstanceOf[js.Any], unmousedown = unmousedown.asInstanceOf[js.Any], unmousemove = unmousemove.asInstanceOf[js.Any], unmouseout = unmouseout.asInstanceOf[js.Any], unmouseover = unmouseover.asInstanceOf[js.Any], unmouseup = unmouseup.asInstanceOf[js.Any], untouchcancel = untouchcancel.asInstanceOf[js.Any], untouchend = untouchend.asInstanceOf[js.Any], untouchmove = untouchmove.asInstanceOf[js.Any], untouchstart = untouchstart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelElementPluginRegistry[TTechnology]]
  }
  @scala.inline
  implicit class RaphaelElementPluginRegistryOps[Self <: RaphaelElementPluginRegistry[_], /* <: typings.raphael.mod.RaphaelTechnology */ TTechnology] (val x: Self with RaphaelElementPluginRegistry[TTechnology]) extends AnyVal {
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
    def setAnimate(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function4[
              /* targetAttributes */ PartialRaphaelAttributes, 
              /* durationMilliseconds */ Double, 
              /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
              /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelElementPluginRegistry[TTechnology]]], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function4[
              /* targetAttributes */ PartialRaphaelAttributes, 
              /* durationMilliseconds */ Double, 
              /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
              /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelElementPluginRegistry[TTechnology]]], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimateWith(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function6[
              /* otherElement */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              /* otherAnimation */ RaphaelAnimation, 
              /* targetAttributes */ PartialRaphaelAttributes, 
              /* durationMilliseconds */ Double, 
              /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
              /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelElementPluginRegistry[TTechnology]]], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function6[
              /* otherElement */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              /* otherAnimation */ RaphaelAnimation, 
              /* targetAttributes */ PartialRaphaelAttributes, 
              /* durationMilliseconds */ Double, 
              /* easing */ js.UndefOr[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula], 
              /* onAnimationComplete */ js.UndefOr[RaphaelOnAnimationCompleteHandler[RaphaelElementPluginRegistry[TTechnology]]], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("animateWith", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttr(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function2[
              /* attributeName */ `arrow-end` | `clip-rect` | cursor | cx | cy | fill | `fill-opacity` | font | `font-family` | `font-size` | `font-weight` | height | href | opacity | path | r_ | rx | ry | src | stroke | `stroke-dasharray` | `stroke-linecap` | `stroke-linejoin` | `stroke-miterlimit` | `stroke-opacity` | `stroke-width` | target | text | `text-anchor` | title | transform | width | typings.raphael.raphaelStrings.x | y, 
              /* attributeValue */ js.UndefOr[
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelAttributes['arrow-end' | 'clip-rect' | 'cursor' | 'cx' | 'cy' | 'fill' | 'fill-opacity' | 'font' | 'font-family' | 'font-size' | 'font-weight' | 'height' | 'href' | 'opacity' | 'path' | 'r' | 'rx' | 'ry' | 'src' | 'stroke' | 'stroke-dasharray' | 'stroke-linecap' | 'stroke-linejoin' | 'stroke-miterlimit' | 'stroke-opacity' | 'stroke-width' | 'target' | 'text' | 'text-anchor' | 'title' | 'transform' | 'width' | 'x' | 'y'] */ js.Any
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function2[
              /* attributeName */ `arrow-end` | `clip-rect` | cursor | cx | cy | fill | `fill-opacity` | font | `font-family` | `font-size` | `font-weight` | height | href | opacity | path | r_ | rx | ry | src | stroke | `stroke-dasharray` | `stroke-linecap` | `stroke-linejoin` | `stroke-miterlimit` | `stroke-opacity` | `stroke-width` | target | text | `text-anchor` | title | transform | width | typings.raphael.raphaelStrings.x | y, 
              /* attributeValue */ js.UndefOr[
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelAttributes['arrow-end' | 'clip-rect' | 'cursor' | 'cx' | 'cy' | 'fill' | 'fill-opacity' | 'font' | 'font-family' | 'font-size' | 'font-weight' | 'height' | 'href' | 'opacity' | 'path' | 'r' | 'rx' | 'ry' | 'src' | 'stroke' | 'stroke-dasharray' | 'stroke-linecap' | 'stroke-linejoin' | 'stroke-miterlimit' | 'stroke-opacity' | 'stroke-width' | 'target' | 'text' | 'text-anchor' | 'title' | 'transform' | 'width' | 'x' | 'y'] */ js.Any
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("attr", value.asInstanceOf[js.Any])
    @scala.inline
    def setClick(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setClone(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
        ]
    ): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.Function1[/* key */ String, _]], 
          ReturnType[js.Function1[/* key */ String, _]]
        ]
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrag(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function6[
              /* onMoveHandler */ RaphaelDragOnMoveHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* onStartHandler */ RaphaelDragOnStartHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* onEndHandler */ RaphaelDragOnEndHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* moveThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* startThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* endThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function6[
              /* onMoveHandler */ RaphaelDragOnMoveHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* onStartHandler */ RaphaelDragOnStartHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* onEndHandler */ RaphaelDragOnEndHandler[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* moveThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* startThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* endThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("drag", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetBBox(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
          ], 
          ReturnType[
            js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], RaphaelAxisAlignedBoundingBox]
          ]
        ]
    ): Self = this.set("getBBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlow(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
          ], 
          ReturnType[
            js.Function1[/* glow */ js.UndefOr[PartialRaphaelGlowSetting], RaphaelSet[TTechnology]]
          ]
        ]
    ): Self = this.set("glow", value.asInstanceOf[js.Any])
    @scala.inline
    def setHide(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
        ]
    ): Self = this.set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def setHover(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function4[
              /* onHoverInHandler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              /* onHoverOutHandler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              /* hoverInThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* hoverOutThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function4[
              /* onHoverInHandler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              /* onHoverOutHandler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              /* hoverInThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              /* hoverOutThisContext */ js.UndefOr[RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: RaphaelElementPluginMethod[TTechnology, Parameters[Double], ReturnType[Double]]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertAfter(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* element */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* element */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("insertAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertBefore(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* element */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* element */ RaphaelElement[
                TTechnology, 
                /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("insertBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatrix(
      value: RaphaelElementPluginMethod[TTechnology, Parameters[RaphaelMatrix], ReturnType[RaphaelMatrix]]
    ): Self = this.set("matrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousedown(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("mousedown", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousemove(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("mousemove", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseout(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("mouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseover(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("mouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseup(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("mouseup", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ], 
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
          ]
        ]
    ): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDragOver(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* onDragOverHandler */ RaphaelDragOnOverHandler[
                TTechnology, 
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* onDragOverHandler */ RaphaelDragOnOverHandler[
                TTechnology, 
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]]
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("onDragOver", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaper(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[RaphaelPaper[TTechnology]], 
          ReturnType[RaphaelPaper[TTechnology]]
        ]
    ): Self = this.set("paper", value.asInstanceOf[js.Any])
    @scala.inline
    def setPause(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelElementPluginRegistry[TTechnology]]
          ], 
          ReturnType[
            js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelElementPluginRegistry[TTechnology]]
          ]
        ]
    ): Self = this.set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(
      value: RaphaelElementPluginMethod[TTechnology, Parameters[js.Function0[Unit]], ReturnType[js.Function0[Unit]]]
    ): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveData(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* key */ js.UndefOr[String], RaphaelElementPluginRegistry[TTechnology]]
          ], 
          ReturnType[
            js.Function1[/* key */ js.UndefOr[String], RaphaelElementPluginRegistry[TTechnology]]
          ]
        ]
    ): Self = this.set("removeData", value.asInstanceOf[js.Any])
    @scala.inline
    def setResume(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelElementPluginRegistry[TTechnology]]
          ], 
          ReturnType[
            js.Function1[/* anim */ js.UndefOr[RaphaelAnimation], RaphaelElementPluginRegistry[TTechnology]]
          ]
        ]
    ): Self = this.set("resume", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotate(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function3[
              /* degrees */ Double, 
              /* centerX */ Double, 
              /* centerY */ Double, 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function3[
              /* degrees */ Double, 
              /* centerX */ Double, 
              /* centerY */ Double, 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function4[
              /* scaleFactorX */ Double, 
              /* scaleFactorY */ Double, 
              /* centerX */ Double, 
              /* centerY */ Double, 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function4[
              /* scaleFactorX */ Double, 
              /* scaleFactorY */ Double, 
              /* centerX */ Double, 
              /* centerY */ Double, 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetTime(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function2[
              /* animation */ RaphaelAnimation, 
              /* value */ Double, 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function2[
              /* animation */ RaphaelAnimation, 
              /* value */ Double, 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("setTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
        ]
    ): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.Function0[js.Array[RaphaelAnimationStatus]]], 
          ReturnType[js.Function0[js.Array[RaphaelAnimationStatus]]]
        ]
    ): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStop(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* animation */ js.UndefOr[RaphaelAnimation], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* animation */ js.UndefOr[RaphaelAnimation], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("stop", value.asInstanceOf[js.Any])
    @scala.inline
    def setToBack(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
        ]
    ): Self = this.set("toBack", value.asInstanceOf[js.Any])
    @scala.inline
    def setToFront(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
        ]
    ): Self = this.set("toFront", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransform(
      value: RaphaelElementPluginMethod[TTechnology, Parameters[js.Function0[String]], ReturnType[js.Function0[String]]]
    ): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslate(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function2[/* deltaX */ Double, /* deltaY */ Double, RaphaelElementPluginRegistry[TTechnology]]
          ], 
          ReturnType[
            js.Function2[/* deltaX */ Double, /* deltaY */ Double, RaphaelElementPluginRegistry[TTechnology]]
          ]
        ]
    ): Self = this.set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[RaphaelShapeType | String], 
          ReturnType[RaphaelShapeType | String]
        ]
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnclick(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("unclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setUndblclick(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("undblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setUndrag(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.Function0[RaphaelElementPluginRegistry[TTechnology]]], 
          ReturnType[js.Function0[RaphaelElementPluginRegistry[TTechnology]]]
        ]
    ): Self = this.set("undrag", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnhover(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function2[
              /* onHoverInHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
              /* onHoverOutHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function2[
              /* onHoverInHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
              /* onHoverOutHandler */ RaphaelBasicEventHandler[_, MouseEvent], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("unhover", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnmousedown(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("unmousedown", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnmousemove(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("unmousemove", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnmouseout(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("unmouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnmouseover(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("unmouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnmouseup(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                MouseEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("unmouseup", value.asInstanceOf[js.Any])
    @scala.inline
    def setUntouchcancel(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("untouchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setUntouchend(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("untouchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setUntouchmove(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("untouchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setUntouchstart(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ], 
          ReturnType[
            js.Function1[
              /* handler */ RaphaelBasicEventHandler[
                RaphaelUnwrapElement[TTechnology, RaphaelElementPluginRegistry[TTechnology]], 
                TouchEvent
              ], 
              RaphaelElementPluginRegistry[TTechnology]
            ]
          ]
        ]
    ): Self = this.set("untouchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            (RaphaelElement[
              TTechnology, 
              /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
            ]) | Null
          ], 
          ReturnType[
            (RaphaelElement[
              TTechnology, 
              /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
            ]) | Null
          ]
        ]
    ): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setPrev(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[
            (RaphaelElement[
              TTechnology, 
              /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
            ]) | Null
          ], 
          ReturnType[
            (RaphaelElement[
              TTechnology, 
              /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
            ]) | Null
          ]
        ]
    ): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
    @scala.inline
    def setRaphael(
      value: RaphaelElementPluginMethod[
          TTechnology, 
          Parameters[js.UndefOr[RaphaelStatic[SVG | VML]]], 
          ReturnType[js.UndefOr[RaphaelStatic[SVG | VML]]]
        ]
    ): Self = this.set("raphael", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaphael: Self = this.set("raphael", js.undefined)
  }
  
}

