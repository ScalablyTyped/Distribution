package typings.reveal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Reveal")
  @js.native
  val Reveal: RevealStatic = js.native
  
  // Reveal plugins are globals since 4.0 (if not loaded through ES Modules): https://revealjs.com/plugins/
  @JSGlobal("RevealHighlight")
  @js.native
  val RevealHighlight: Plugin = js.native
  
  @JSGlobal("RevealMarkdown")
  @js.native
  val RevealMarkdown: Plugin = js.native
  
  @JSGlobal("RevealMath")
  @js.native
  val RevealMath: Plugin = js.native
  
  @JSGlobal("RevealNotes")
  @js.native
  val RevealNotes: Plugin = js.native
  
  @JSGlobal("RevealSearch")
  @js.native
  val RevealSearch: Plugin = js.native
  
  @JSGlobal("RevealZoom")
  @js.native
  val RevealZoom: Plugin = js.native
}
