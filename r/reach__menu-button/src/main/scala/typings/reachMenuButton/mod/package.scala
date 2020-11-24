package typings.reachMenuButton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type MenuLinkProps[T /* <: typings.reachMenuButton.mod.SupportedMenuLinkComponent */] = typings.reachMenuButton.mod.ResolvedMenuLinkProps[T] with typings.reachMenuButton.anon.As[T]
  
  type MenuListProps = (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement], 
    typings.std.HTMLDivElement
  ]) with typings.reachMenuButton.anon.Children
  
  type ResolvedMenuLinkComponent[T] = typings.react.mod.ComponentType[T] | T
  
  type ResolvedMenuLinkProps[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] */ js.Any)
  
  /* Rewritten from type alias, can be one of: 
    - js.Object
    - typings.reachMenuButton.reachMenuButtonStrings.a
    - typings.reachMenuButton.reachMenuButtonStrings.abbr
    - typings.reachMenuButton.reachMenuButtonStrings.address
    - typings.reachMenuButton.reachMenuButtonStrings.area
    - typings.reachMenuButton.reachMenuButtonStrings.article
    - typings.reachMenuButton.reachMenuButtonStrings.aside
    - typings.reachMenuButton.reachMenuButtonStrings.audio
    - typings.reachMenuButton.reachMenuButtonStrings.b
    - typings.reachMenuButton.reachMenuButtonStrings.base
    - typings.reachMenuButton.reachMenuButtonStrings.bdi
    - typings.reachMenuButton.reachMenuButtonStrings.bdo
    - typings.reachMenuButton.reachMenuButtonStrings.big
    - typings.reachMenuButton.reachMenuButtonStrings.blockquote
    - typings.reachMenuButton.reachMenuButtonStrings.body
    - typings.reachMenuButton.reachMenuButtonStrings.br
    - typings.reachMenuButton.reachMenuButtonStrings.button
    - typings.reachMenuButton.reachMenuButtonStrings.canvas
    - typings.reachMenuButton.reachMenuButtonStrings.caption
    - typings.reachMenuButton.reachMenuButtonStrings.cite
    - typings.reachMenuButton.reachMenuButtonStrings.code
    - typings.reachMenuButton.reachMenuButtonStrings.col
    - typings.reachMenuButton.reachMenuButtonStrings.colgroup
    - typings.reachMenuButton.reachMenuButtonStrings.data
    - typings.reachMenuButton.reachMenuButtonStrings.datalist
    - typings.reachMenuButton.reachMenuButtonStrings.dd
    - typings.reachMenuButton.reachMenuButtonStrings.del
    - typings.reachMenuButton.reachMenuButtonStrings.details
    - typings.reachMenuButton.reachMenuButtonStrings.dfn
    - typings.reachMenuButton.reachMenuButtonStrings.dialog
    - typings.reachMenuButton.reachMenuButtonStrings.div
    - typings.reachMenuButton.reachMenuButtonStrings.dl
    - typings.reachMenuButton.reachMenuButtonStrings.dt
    - typings.reachMenuButton.reachMenuButtonStrings.em
    - typings.reachMenuButton.reachMenuButtonStrings.embed
    - typings.reachMenuButton.reachMenuButtonStrings.fieldset
    - typings.reachMenuButton.reachMenuButtonStrings.figcaption
    - typings.reachMenuButton.reachMenuButtonStrings.figure
    - typings.reachMenuButton.reachMenuButtonStrings.footer
    - typings.reachMenuButton.reachMenuButtonStrings.form
    - typings.reachMenuButton.reachMenuButtonStrings.h1
    - typings.reachMenuButton.reachMenuButtonStrings.h2
    - typings.reachMenuButton.reachMenuButtonStrings.h3
    - typings.reachMenuButton.reachMenuButtonStrings.h4
    - typings.reachMenuButton.reachMenuButtonStrings.h5
    - typings.reachMenuButton.reachMenuButtonStrings.h6
    - typings.reachMenuButton.reachMenuButtonStrings.head
    - typings.reachMenuButton.reachMenuButtonStrings.header
    - typings.reachMenuButton.reachMenuButtonStrings.hgroup
    - typings.reachMenuButton.reachMenuButtonStrings.hr
    - typings.reachMenuButton.reachMenuButtonStrings.html
    - typings.reachMenuButton.reachMenuButtonStrings.i
    - typings.reachMenuButton.reachMenuButtonStrings.iframe
    - typings.reachMenuButton.reachMenuButtonStrings.img
    - typings.reachMenuButton.reachMenuButtonStrings.input
    - typings.reachMenuButton.reachMenuButtonStrings.ins
    - typings.reachMenuButton.reachMenuButtonStrings.kbd
    - typings.reachMenuButton.reachMenuButtonStrings.keygen
    - typings.reachMenuButton.reachMenuButtonStrings.label
    - typings.reachMenuButton.reachMenuButtonStrings.legend
    - typings.reachMenuButton.reachMenuButtonStrings.li
    - typings.reachMenuButton.reachMenuButtonStrings.link
    - typings.reachMenuButton.reachMenuButtonStrings.main
    - typings.reachMenuButton.reachMenuButtonStrings.map
    - typings.reachMenuButton.reachMenuButtonStrings.mark
    - typings.reachMenuButton.reachMenuButtonStrings.menu
    - typings.reachMenuButton.reachMenuButtonStrings.menuitem
    - typings.reachMenuButton.reachMenuButtonStrings.meta
    - typings.reachMenuButton.reachMenuButtonStrings.meter
    - typings.reachMenuButton.reachMenuButtonStrings.nav
    - typings.reachMenuButton.reachMenuButtonStrings.noindex
    - typings.reachMenuButton.reachMenuButtonStrings.noscript
    - typings.reachMenuButton.reachMenuButtonStrings.`object`
    - typings.reachMenuButton.reachMenuButtonStrings.ol
    - typings.reachMenuButton.reachMenuButtonStrings.optgroup
    - typings.reachMenuButton.reachMenuButtonStrings.option
    - typings.reachMenuButton.reachMenuButtonStrings.output
    - typings.reachMenuButton.reachMenuButtonStrings.p
    - typings.reachMenuButton.reachMenuButtonStrings.param
    - typings.reachMenuButton.reachMenuButtonStrings.picture
    - typings.reachMenuButton.reachMenuButtonStrings.pre
    - typings.reachMenuButton.reachMenuButtonStrings.progress
    - typings.reachMenuButton.reachMenuButtonStrings.q
    - typings.reachMenuButton.reachMenuButtonStrings.rp
    - typings.reachMenuButton.reachMenuButtonStrings.rt
    - typings.reachMenuButton.reachMenuButtonStrings.ruby
    - typings.reachMenuButton.reachMenuButtonStrings.s
    - typings.reachMenuButton.reachMenuButtonStrings.samp
    - typings.reachMenuButton.reachMenuButtonStrings.slot
    - typings.reachMenuButton.reachMenuButtonStrings.script
    - typings.reachMenuButton.reachMenuButtonStrings.section
    - typings.reachMenuButton.reachMenuButtonStrings.select
    - typings.reachMenuButton.reachMenuButtonStrings.small
    - typings.reachMenuButton.reachMenuButtonStrings.source
    - typings.reachMenuButton.reachMenuButtonStrings.span
    - typings.reachMenuButton.reachMenuButtonStrings.strong
    - typings.reachMenuButton.reachMenuButtonStrings.style
    - typings.reachMenuButton.reachMenuButtonStrings.sub
    - typings.reachMenuButton.reachMenuButtonStrings.summary
    - typings.reachMenuButton.reachMenuButtonStrings.sup
    - typings.reachMenuButton.reachMenuButtonStrings.table
    - typings.reachMenuButton.reachMenuButtonStrings.template
    - typings.reachMenuButton.reachMenuButtonStrings.tbody
    - typings.reachMenuButton.reachMenuButtonStrings.td
    - typings.reachMenuButton.reachMenuButtonStrings.textarea
    - typings.reachMenuButton.reachMenuButtonStrings.tfoot
    - typings.reachMenuButton.reachMenuButtonStrings.th
    - typings.reachMenuButton.reachMenuButtonStrings.thead
    - typings.reachMenuButton.reachMenuButtonStrings.time
    - typings.reachMenuButton.reachMenuButtonStrings.title
    - typings.reachMenuButton.reachMenuButtonStrings.tr
    - typings.reachMenuButton.reachMenuButtonStrings.track
    - typings.reachMenuButton.reachMenuButtonStrings.u
    - typings.reachMenuButton.reachMenuButtonStrings.ul
    - typings.reachMenuButton.reachMenuButtonStrings.`var`
    - typings.reachMenuButton.reachMenuButtonStrings.video
    - typings.reachMenuButton.reachMenuButtonStrings.wbr
    - typings.reachMenuButton.reachMenuButtonStrings.webview
    - typings.reachMenuButton.reachMenuButtonStrings.svg
    - typings.reachMenuButton.reachMenuButtonStrings.animate
    - typings.reachMenuButton.reachMenuButtonStrings.animateMotion
    - typings.reachMenuButton.reachMenuButtonStrings.animateTransform
    - typings.reachMenuButton.reachMenuButtonStrings.circle
    - typings.reachMenuButton.reachMenuButtonStrings.clipPath
    - typings.reachMenuButton.reachMenuButtonStrings.defs
    - typings.reachMenuButton.reachMenuButtonStrings.desc
    - typings.reachMenuButton.reachMenuButtonStrings.ellipse
    - typings.reachMenuButton.reachMenuButtonStrings.feBlend
    - typings.reachMenuButton.reachMenuButtonStrings.feColorMatrix
    - typings.reachMenuButton.reachMenuButtonStrings.feComponentTransfer
    - typings.reachMenuButton.reachMenuButtonStrings.feComposite
    - typings.reachMenuButton.reachMenuButtonStrings.feConvolveMatrix
    - typings.reachMenuButton.reachMenuButtonStrings.feDiffuseLighting
    - typings.reachMenuButton.reachMenuButtonStrings.feDisplacementMap
    - typings.reachMenuButton.reachMenuButtonStrings.feDistantLight
    - typings.reachMenuButton.reachMenuButtonStrings.feDropShadow
    - typings.reachMenuButton.reachMenuButtonStrings.feFlood
    - typings.reachMenuButton.reachMenuButtonStrings.feFuncA
    - typings.reachMenuButton.reachMenuButtonStrings.feFuncB
    - typings.reachMenuButton.reachMenuButtonStrings.feFuncG
    - typings.reachMenuButton.reachMenuButtonStrings.feFuncR
    - typings.reachMenuButton.reachMenuButtonStrings.feGaussianBlur
    - typings.reachMenuButton.reachMenuButtonStrings.feImage
    - typings.reachMenuButton.reachMenuButtonStrings.feMerge
    - typings.reachMenuButton.reachMenuButtonStrings.feMergeNode
    - typings.reachMenuButton.reachMenuButtonStrings.feMorphology
    - typings.reachMenuButton.reachMenuButtonStrings.feOffset
    - typings.reachMenuButton.reachMenuButtonStrings.fePointLight
    - typings.reachMenuButton.reachMenuButtonStrings.feSpecularLighting
    - typings.reachMenuButton.reachMenuButtonStrings.feSpotLight
    - typings.reachMenuButton.reachMenuButtonStrings.feTile
    - typings.reachMenuButton.reachMenuButtonStrings.feTurbulence
    - typings.reachMenuButton.reachMenuButtonStrings.filter
    - typings.reachMenuButton.reachMenuButtonStrings.foreignObject
    - typings.reachMenuButton.reachMenuButtonStrings.g
    - typings.reachMenuButton.reachMenuButtonStrings.image
    - typings.reachMenuButton.reachMenuButtonStrings.line
    - typings.reachMenuButton.reachMenuButtonStrings.linearGradient
    - typings.reachMenuButton.reachMenuButtonStrings.marker
    - typings.reachMenuButton.reachMenuButtonStrings.mask
    - typings.reachMenuButton.reachMenuButtonStrings.metadata
    - typings.reachMenuButton.reachMenuButtonStrings.mpath
    - typings.reachMenuButton.reachMenuButtonStrings.path
    - typings.reachMenuButton.reachMenuButtonStrings.pattern
    - typings.reachMenuButton.reachMenuButtonStrings.polygon
    - typings.reachMenuButton.reachMenuButtonStrings.polyline
    - typings.reachMenuButton.reachMenuButtonStrings.radialGradient
    - typings.reachMenuButton.reachMenuButtonStrings.rect
    - typings.reachMenuButton.reachMenuButtonStrings.stop
    - typings.reachMenuButton.reachMenuButtonStrings.switch
    - typings.reachMenuButton.reachMenuButtonStrings.symbol
    - typings.reachMenuButton.reachMenuButtonStrings.text
    - typings.reachMenuButton.reachMenuButtonStrings.textPath
    - typings.reachMenuButton.reachMenuButtonStrings.tspan
    - typings.reachMenuButton.reachMenuButtonStrings.use
    - typings.reachMenuButton.reachMenuButtonStrings.view
  */
  type SupportedMenuLinkComponent = typings.reachMenuButton.mod._SupportedMenuLinkComponent | js.Object
}
