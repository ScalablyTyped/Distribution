package typings.progressbarJs.shapeMod

import typings.progressbarJs.mod.AnimationSupport
import typings.std.HTMLParagraphElement
import typings.std.SVGElement
import typings.std.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-empty-interface adds members from animation contract
@js.native
trait Shape extends AnimationSupport {
  
  def destroy(): Unit = js.native
  
  /**
    * Reference to SVG path which presents the actual progress bar.
    */
  val path: SVGPathElement = js.native
  
  def setText(newText: String): Unit = js.native
  
  /**
    * Reference to SVG element where progress bar is drawn.
    */
  val svg: SVGElement = js.native
  
  /**
    * Reference to p element which presents the text label for progress bar.
    * Returns `null` if text is not defined.
    */
  val text: HTMLParagraphElement | Null = js.native
  
  /**
    * Reference to SVG path which presents the trail of the progress bar.
    * Returns `null` if trail is not defined.
    */
  val trail: SVGPathElement | Null = js.native
}
