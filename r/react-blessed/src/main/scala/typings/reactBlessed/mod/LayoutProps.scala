package typings.reactBlessed.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// layout does not require prop 'layout' in Blessed.Widgets.LayoutOptions--make it optional
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends react-blessed.react-blessed.LayoutElement ? / * Inlined std.Partial<blessed.blessed.Widgets.LayoutOptions> * /
{  width :number | string | undefined,   children :std.Array<blessed.blessed.Widgets.Node> | undefined,   height :number | string | undefined,   border :blessed.blessed.Widgets.Border | 'line' | 'bg' | undefined,   valign :'top' | 'middle' | 'bottom' | undefined,   screen :blessed.blessed.Widgets.Screen | undefined,   fg :string | undefined,   layout :'inline' | 'inline-block' | 'grid' | undefined,   focused :blessed.blessed.Widgets.BlessedElement | undefined,   scrollable :boolean | undefined,   style :any | undefined,   underline :string | undefined,   shadow :boolean | undefined,   position :blessed.blessed.Widgets.Position | undefined,   renderer :(): void | undefined,   right :blessed.blessed.Widgets.Types.TPosition | undefined,   parent :blessed.blessed.Widgets.Node | undefined,   padding :number | blessed.blessed.Widgets.Padding | undefined,   focusable :boolean | undefined,   input :boolean | undefined,   clickable :boolean | undefined,   shrink :boolean | undefined,   bg :string | undefined,   content :string | undefined,   keyable :boolean | undefined,   left :blessed.blessed.Widgets.Types.TTopLeft | undefined,   bottom :blessed.blessed.Widgets.Types.TPosition | undefined,   ch :string | undefined,   hoverText :string | undefined,   name :string | undefined,   label :string | undefined,   tags :boolean | undefined,   hidden :boolean | undefined,   top :blessed.blessed.Widgets.Types.TTopLeft | undefined,   bold :string | undefined,   draggable :boolean | undefined,   align :'left' | 'center' | 'right' | undefined} : {}
  }}}
  */
@js.native
trait LayoutProps[T] extends StObject
